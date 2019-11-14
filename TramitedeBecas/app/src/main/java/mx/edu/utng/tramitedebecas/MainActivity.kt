package mx.edu.utng.tramitedebecas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textview_result as textview_result1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnTramite(view: View){

        var edad = this.Edad.text.toString()

        //var BecaBuena = this.BecaMuyBuena.text.toString()
        //var BecaMuyBuena = this.BecaMuyBuena.text.toString()
        //var Becaexcelente = this.Becaexcelente.text.toString()

        var Promedioo =this.Promedio.text.toString()
        var IngresoFamiliar = this.IngresoFamiliar.text.toString()
        var NumeroHermano = this.NumeroHermanos.text.toString()

        //var OpcionesBeca = this.OpcionesBeca.checkedRadioButtonId


        //if (edad >= 16.toString() && edad <= 45.toString()) {
            if (BecaBuena.isChecked) {
                if (edad >= 16.toString() && edad <= 45.toString()) {
                    if (Promedioo >= 80.toString() && Promedioo <= 85.toString()) {
                        if (IngresoFamiliar <= 7000.toString()) {
                            this.textview_result1.text = "Su beca ha sido aceptada correctamente "
                        } else {
                            this.textview_result1.text = "El ingreso no es el correcto"
                        }
                    } else {
                        this.textview_result1.text = "El promedio no es el adecuado para esta beca"
                    }
                } else {
                    this.textview_result1.text = "La edad es incorrecta"
                }
            }

                if (BecaMuyBuena.isChecked) {
                    if (edad >= 16.toString() && edad <= 45.toString()) {
                        if (Promedioo >= 86.toString() && Promedioo <= 95.toString()) {
                            if (IngresoFamiliar <= 7000.toString()) {
                                this.textview_result1.text =
                                    "Su beca ha sido aceptada correctamente "

                            } else {
                                this.textview_result1.text = "El ingreso no es el correcto"
                            }

                        } else {
                            this.textview_result1.text =
                                "El promedio no es el adecuado para esta beca"
                        }
                    } else {
                        this.textview_result1.text = "La edad es incorrecta"
                    }
                }

            if (Becaexcelente.isChecked) {
                if (edad >= 16.toString() && edad <= 45.toString()) {
                    if (Promedioo >= 96.toString() && Promedioo <= 99.toString()) {
                        if (IngresoFamiliar <= 7000.toString()) {
                            if (NumeroHermano >= 2.toString()) {
                                this.textview_result1.text =
                                    "Su beca ha sido aceptada correctamente "
                            } else {
                                this.textview_result1.text =
                                    "El numero de hermanos no es el correcto"
                            }
                        } else {
                            this.textview_result1.text = "El ingreso no es el correcto"
                        }
                    } else {
                        this.textview_result1.text = "El promedio no es el adecuado para esta beca"
                    }
                } else {
                    this.textview_result1.text = "La edad es incorrecta"
                }
            }

        //}else{
          // this.textview_result1.text = "La edad es incorrecta"
      // }
    }
}
