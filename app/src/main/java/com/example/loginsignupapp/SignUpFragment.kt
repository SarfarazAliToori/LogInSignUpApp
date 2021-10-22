package com.example.loginsignupapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.math.sign

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_sign_up, container, false)

        val tv_login = view.findViewById<View>(R.id.tv_login)

        tv_login.setOnClickListener {
            val loginFragment = LoginFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.myFrameLayout, loginFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        val signUp = view.findViewById<View>(R.id.btn_signUP)
        signUp.setOnClickListener {
            startActivity(Intent(getActivity(), MainActivity::class.java))
        }

        return view

    }


}