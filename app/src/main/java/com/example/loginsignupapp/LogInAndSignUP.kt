package com.example.loginsignupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in_and_sign_up.*
import kotlinx.android.synthetic.main.fragment_login.*

class LogInAndSignUP : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_and_sign_up)

       val logInFragment  = LoginFragment()
        supportFragmentManager.beginTransaction().replace(R.id.myFrameLayout, logInFragment).commit()




    }

//    override fun passDataCom(editTextMessage: String) {
//        val bundle = Bundle()
//        bundle.putString("message", editTextMessage)
//
//        val transaction = supportFragmentManager.beginTransaction()
//        val signUpFragment = SignUpFragment()
//        signUpFragment.arguments = bundle
//
//        transaction.replace(R.id.myFrameLayout, signUpFragment)
//        transaction.commit()
//    }










}