package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    private var _binding: FragmentTitleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    // Access views from binding not _binding
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTitleBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.playButton.setOnClickListener {
            Toast.makeText(context, "good", Toast.LENGTH_SHORT).show()

            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)

        }



        return view
    }


    // to prevent memory leaks
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }


}
