package com.example.contact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tampilMyFriendFragment()

    }

    private fun gantifragment(fragmentManager: FragmentManager, fragment: Fragment,frameId:Int){
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId,fragment)
        transaction.commit()
    }

    fun tampilMyFriendFragment(){
        gantifragment(supportFragmentManager, MyFriendFragment.newInstance(),R.id.frameLayout)
    }

    fun tampilAddFriendFragment (){
        gantifragment(supportFragmentManager, AddFriendFragment.newInstance(),R.id.frameLayout)
    }


}



