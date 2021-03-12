package ke.co.topup.syeco.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import ke.co.topup.syeco.R
import ke.co.topup.syeco.databinding.ActivityLoginBinding
import ke.co.topup.syeco.ui.home.HomeActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.loginBtn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
//            if (binding.emailLogin.text?.trim().toString().isNotEmpty() ||
//                binding.passwordLogin.text?.trim().toString().isNotEmpty()
//            ) {
//
//            }else{
//                Toast.makeText(this, "Input required", Toast.LENGTH_SHORT).show()
//            }
        }

        binding.tvRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}