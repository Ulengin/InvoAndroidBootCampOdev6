package com.example.iab_odev6

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.iab_odev6.databinding.CicekCardTasarimBinding
import com.google.android.material.snackbar.Snackbar

class CiceklerAdapter(var mContext: Context, var ciceklerListesi:List<Cicekler>)
    : RecyclerView.Adapter<CiceklerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CicekCardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CicekCardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = CicekCardTasarimBinding.inflate(from(mContext), parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val cicek = ciceklerListesi.get(position)
        val t = holder.tasarim

        t.imageViewCicek.setImageResource(mContext.resources.getIdentifier(cicek.cicek_resim_adi,"drawable",mContext.packageName))
        t.textViewCicekAdi.text = cicek.cicek_ad
       /* t.cardCicekView.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }*/

    }

    override fun getItemCount(): Int {
        return ciceklerListesi.size
    }
}