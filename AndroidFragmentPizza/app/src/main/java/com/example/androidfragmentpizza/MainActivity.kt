package com.example.androidfragmentpizza

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.example.androidfragmentpizza.fragments.PizzaDetailFragment
import com.example.androidfragmentpizza.fragments.PizzaMenuFragment

class MainActivity : AppCompatActivity(), PizzaMenuFragment.OnItemSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) {
            val pizzaMenuFragment  : PizzaMenuFragment = PizzaMenuFragment()

            val fragmentTransaction : FragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.frame_one, pizzaMenuFragment)
            fragmentTransaction.commit()
        }

        if( resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val pizzaMenuFragment  : PizzaMenuFragment = PizzaMenuFragment()
            val pizzaDetailFragment  : PizzaDetailFragment = PizzaDetailFragment()

            val arguments : Bundle = Bundle()
            arguments.putInt("position", 0)
            pizzaDetailFragment.arguments = arguments

            val fragmentTransaction : FragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_one, pizzaMenuFragment)
            fragmentTransaction.add(R.id.frame_two, pizzaDetailFragment)
            fragmentTransaction.commit()
        }
    }

    override fun onPizzaItemSelected(position: Int) {
        val pizzaDetailFragment : PizzaDetailFragment = PizzaDetailFragment()

        val arguments : Bundle = Bundle()
        arguments.putInt("position", position)
        pizzaDetailFragment.arguments = arguments

        if ( resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            val fragmentTransaction : FragmentTransaction =supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_two, pizzaDetailFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        else {
            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_one, pizzaDetailFragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

    }
}