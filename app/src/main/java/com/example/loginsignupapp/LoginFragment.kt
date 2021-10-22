package com.example.loginsignupapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_log_in_and_sign_up.*
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), "Hello world", Toast.LENGTH_SHORT).show()


        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val txViewSignup = view.findViewById<View>(R.id.tv_signup)

        txViewSignup.setOnClickListener {

            val signUpFragment = SignUpFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.myFrameLayout, signUpFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        }

        val btnlogin = view.findViewById<View>(R.id.btn_logIn)
        btnlogin.setOnClickListener {
            startActivity(Intent(getActivity(), MainActivity::class.java))
        }

        return view
    }

}