package com.example.my_dsu.ui.favourites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.my_dsu.databinding.FragmentFavouriteBinding
import com.example.my_dsu.databinding.FragmentHomeBinding
import com.example.my_dsu.ui.home.HomeViewModel

class FavouriteFragment : Fragment() {


    private var _binding : FragmentFavouriteBinding? = null

    private val binding get() = _binding!!
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val favouriteViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        return super.onCreateView(inflater, container, savedInstanceState)

        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFavourites
        favouriteViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}