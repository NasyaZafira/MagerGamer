package com.mager.gamer.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mager.gamer.R
import com.mager.gamer.databinding.FragmentOrangBinding


private const val ARG_PARAM1 = "param1"

class OrangFragment : Fragment() {
    private var param1: String? = null
    private var _binding: FragmentOrangBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOrangBinding.inflate(inflater, container,false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            OrangFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
}