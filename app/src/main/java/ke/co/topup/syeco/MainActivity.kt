package ke.co.topup.syeco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import ke.co.topup.syeco.databinding.ActivityMainBinding
import ke.co.topup.syeco.ui.home.HomeActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //supportActionBar?.hide()

//        Handler(Looper.getMainLooper()).postDelayed({
//            val intent = Intent(this@MainActivity, HomeActivity::class.java)
//            startActivity(intent)
//            finish()
//        }, 3000)
    }
}


