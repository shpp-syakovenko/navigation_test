package com.example.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.navigation.R


class FragmentFive:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_five, container,false)
        val valueString = arguments?.getString("keyValue")
        val valueInt = arguments?.getInt("keyInt")

        Toast.makeText(context, "$valueString, $valueInt", Toast.LENGTH_SHORT).show()
        return rootView
    }
}