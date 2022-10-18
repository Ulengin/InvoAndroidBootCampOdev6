package com.example.iab_odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.iab_odev6.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
    private lateinit var tasarim : FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.toolbarAnasayfa.title="Çiceksepeti"
        var ciceklerListesi = ArrayList<Cicekler>()
        var f1 = Cicekler("Gönderim Amacı","gonderimamaci")
        var f2 = Cicekler("Saksı Çicekleri","saksicicekleri")
        var f3 = Cicekler("Çicek Buketleri","cicekbuketleri")
        var f4 = Cicekler("Güller","guller")
        var f5 = Cicekler("Tasarım Çiçekleri","tasarimcicekleri")
        var f6 = Cicekler("Orkide","orkide")
        var f7 = Cicekler("Yenilebilir Çicek","yenilebilircicekler")
        var f8 = Cicekler("Tümünü Görüntüle","tumunugoruntule")
        ciceklerListesi.add(f1)
        ciceklerListesi.add(f2)
        ciceklerListesi.add(f3)
        ciceklerListesi.add(f4)
        ciceklerListesi.add(f5)
        ciceklerListesi.add(f6)
        ciceklerListesi.add(f7)
        ciceklerListesi.add(f8)

        var ciceklerListesi2 = ArrayList<Cicekler>()
        var f11 = Cicekler("Doğum Günü Çiçekleri","dogumgunucicekleri")
        var f22 = Cicekler("Güller","gullerliste")
        ciceklerListesi2.add(f11)
        ciceklerListesi2.add(f22)


        tasarim.rv.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)
        tasarim.rv2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val adapter = CiceklerAdapter(requireContext(),ciceklerListesi)
        val adapter2 = CiceklerAdapter2(requireContext(),ciceklerListesi2)

        tasarim.rv.adapter = adapter
        tasarim.rv2.adapter = adapter2
        return tasarim.root
    }

}