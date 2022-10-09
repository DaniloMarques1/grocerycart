package com.danilo.grocerycart.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.danilo.grocerycart.R
import com.danilo.grocerycart.databinding.FragmentCreateGroceryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateGroceryFragment : Fragment() {
    private lateinit var binding: FragmentCreateGroceryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCreateGroceryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = getString(R.string.create_list)

    }
}