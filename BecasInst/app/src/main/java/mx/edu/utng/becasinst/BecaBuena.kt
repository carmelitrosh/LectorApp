package mx.edu.utng.becasinst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_beca_buena.*
import kotlinx.android.synthetic.main.activity_beca_buena.*

class BecaBuena : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beca_buena)

        btnRegresar.setOnClickListener {
            finish()
        }
    }

    fun aceptarValidar(view: View) {



        var edadBuena = this.edadAlu.text.toString()
        var promBuena = this.PromAlu.text.toString()
        var ingBuena =this.IngreAlu.text.toString()
        // var hermBuea = this.numHerm.text.toString()
        var folBuena = this.IdAlu.text.toString()




        if (edadBuena > 15.toString() && edadBuena < 46.toString()) {
            if (promBuena >= 80.toString() && promBuena <= 85.toString()) {
                if (ingBuena >= 0.toString() && ingBuena <= 7000.toString()) {
                    if (folBuena.equals("12345",true)) {


                        this.textview_result.text = "Su beca ha sido aceptada correctamente "

                    } else {

                        this.textview_result.text = "Su beca a sido bloqueado revise sus datos"

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
