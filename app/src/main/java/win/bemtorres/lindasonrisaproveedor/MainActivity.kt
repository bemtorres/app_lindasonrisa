package win.bemtorres.lindasonrisaproveedor

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        comenzar_animaciones()


    }
    fun comenzar_animaciones(){
        val animacion = AnimationUtils.loadAnimation(this,R.anim.lefttoright)

        imgLogo.startAnimation(animacion!!)
        textUsuario.startAnimation(animacion!!)
        txtUsername.startAnimation(animacion!!)
        textPass.startAnimation(animacion!!)
        txtPassword.startAnimation(animacion!!)
        btnIngresar.startAnimation(animacion!!)
    }
}
