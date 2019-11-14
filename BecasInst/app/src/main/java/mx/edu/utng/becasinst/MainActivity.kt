package mx.edu.utng.becasinst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnBecaBuena.setOnClickListener{
            val intento = Intent(this,  BecaBuena::class.java)
            startActivity(intento)
        }

        btnBecaMuyBuena.setOnClickListener{
            val intento2 = Intent(this, BecaMuyBuena::class.java)
            startActivity(intento2)
        }

        btnBecaExelente.setOnClickListener{
            val intento3 = Intent(this, BecaExelente ::class.java)
            startActivity(intento3)
        }

        btnSalir.setOnClickListener{
            System.exit(0)
        }

    }


    }









