package com.example.iab_odev6

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.iab_odev6.databinding.CicekCardTasarim2Binding
import com.example.iab_odev6.databinding.CicekCardTasarimBinding

class CiceklerAdapter2(var mContext: Context, var ciceklerListesi2:List<Cicekler>)
    : RecyclerView.Adapter<CiceklerAdapter2.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: CicekCardTasarim2Binding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: CicekCardTasarim2Binding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = CicekCardTasarim2Binding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val cicek = ciceklerListesi2.get(position)
        val t = holder.tasarim

        t.imageViewCicekList.setImageResource(mContext.resources.getIdentifier(cicek.cicek_resim_adi,"drawable",mContext.packageName))
        t.textViewCicekList.text = cicek.cicek_ad
        /* t.cardCicekView.setOnClickListener{
             val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
             Navigation.findNavController(it).navigate(gecis)
         }*/

    }

    override fun getItemCount(): Int {
        return ciceklerListesi2.size
    }
}