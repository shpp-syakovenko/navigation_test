package com.example.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigation.R
import com.example.navigation.databinding.FragmentOneBinding
import com.example.navigation.databinding.FragmentTwoBinding

class FragmentTwo: Fragment() {

    val args by navArgs<FragmentTwoArgs>()
    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentTwoBinding.inflate(inflater).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "${args.key1}, ${args.key2}", Toast.LENGTH_SHORT).show()
        binding.buttonTwoNext.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.fragmentThree))
    }
}