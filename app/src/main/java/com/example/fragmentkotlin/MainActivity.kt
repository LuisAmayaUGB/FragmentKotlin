package com.example.fragmentkotlin

  import android.graphics.Insets.add
  import android.os.Bundle
  import androidx.appcompat.app.AppCompatActivity
  import androidx.core.graphics.Insets.add
  import androidx.core.view.OneShotPreDrawListener.add
  import androidx.fragment.app.Fragment
  import androidx.fragment.app.FragmentTransaction
  import kotlinx.android.synthetic.main.activity_main.*
  import kotlinx.android.synthetic.main.fragment_one.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var fragmentOne: Fragment_one
        var fragmentTwo: Fragment_two

        
        texto.setOnClickListener {

            val mFragmentManager = supportFragmentManager
            val mFragmentTransaction = mFragmentManager.beginTransaction()
            val mFragment = Fragment_one()
            val mBundle = Bundle()
            mBundle.putString("mText","luis@luis")
            mFragment.arguments = mBundle
            mFragmentTransaction.add(R.id.frameLayout, mFragment).commit()


        }
        
        
        

        btn1.setOnClickListener {
            replaceFragment(Fragment_one())


            
            
        }

        btn2.setOnClickListener {
            replaceFragment(Fragment_two())
        }


    }



    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }






}