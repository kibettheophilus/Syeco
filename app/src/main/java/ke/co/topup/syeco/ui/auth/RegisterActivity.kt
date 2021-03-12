package ke.co.topup.syeco.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import ke.co.topup.syeco.R
import ke.co.topup.syeco.databinding.ActivityRegisterBinding
import ke.co.topup.syeco.ui.home.HomeActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        auth = FirebaseAuth.getInstance()

        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
//            if (binding.emailResgister.text?.trim().toString().isNotEmpty() ||
//                binding.passwordRegister.text?.trim().toString().isNotEmpty()
//            ) {
//
//                createUser(
//                    binding.emailResgister.text?.trim().toString(),
//                    binding.passwordRegister.text?.trim().toString()
//                )
//            } else {
//                Toast.makeText(this, "Input required", Toast.LENGTH_SHORT).show()
//            }
        }
    }
//    fun createUser(email:String, password:String){
//        auth.createUserWithEmailAndPassword(email, password)
//            .addOnCompleteListener(this){ task ->
//                if(task.isSuccessful){
//                    val intent = Intent(this, LoginActivity::class.java)
//                    startActivity(intent)
//                }else{
//                   // Toast.makeText(this, "Please try again", Toast.LENGTH_SHORT).show()
//                }
//            }
//    }
}