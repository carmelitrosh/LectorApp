package mx.edu.utng.becasinst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_beca_exelente.*
import kotlinx.android.synthetic.main.activity_beca_exelente.IdAlu
import kotlinx.android.synthetic.main.activity_beca_exelente.IngreAlu
import kotlinx.android.synthetic.main.activity_beca_exelente.PromAlu
import kotlinx.android.synthetic.main.activity_beca_exelente.edadAlu
import kotlinx.android.synthetic.main.activity_beca_exelente.numHerm
import kotlinx.android.synthetic.main.activity_beca_exelente.textview_result
import kotlinx.android.synthetic.main.activity_beca_muy_buena.*

class BecaExelente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beca_exelente)

        btnRegresarEx.setOnClickListener {
            finish()
        }

    }

    fun aceptarValidarex(view: View) {



        var edadBuena = this.edadAlu.text.toString()
        var promBuena = this.PromAlu.text.toString()
        var ingBuena =this.IngreAlu.text.toString()
        var hermBuea = this.numHerm.text.toString()
        var folBuena = this.IdAlu.text.toString()




        if (edadBuena > 15.toString() && edadBuena < 46.toString()) {
            if (promBuena >= 96.toString() && promBuena <= 100.toString()) {
                if (ingBuena >= 0.toString() && ingBuena <= 7000.toString() && hermBuea > 1.toString() && hermBuea<= 15.toString()) {
                    if (folBuena.equals("12345",true)) {


                        this.textview_result.text = "Su beca ha sido aceptada correctamente "

                    } else {

                        this.textview_result.text = "Su beca ha sido bloqueado revise sus datos"

                    }

                } else {

                    this.textview_result.text = "Su solicitud no ha sido procesada correctamente"


                }

            } else {

                this.textview_result.text = "Su solicitud no ha sido procesada correctamente"

            }

        } else {
            this.textview_result.text = "Su solicitud no ha sido procesada correctamente"

        }


    }

}
