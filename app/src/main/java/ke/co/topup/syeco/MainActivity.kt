package ke.co.topup.syeco

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ke.co.topup.syeco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//         binding.loginBtn.setOnClickListener {
//        Log.e("Action", "Clicked")
//    }

        //supportActionBar?.hide()
    }
}



