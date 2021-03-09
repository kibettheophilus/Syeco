package ke.co.topup.syeco.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ke.co.topup.syeco.R
import ke.co.topup.syeco.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    _binding = FragmentRegisterBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view

        binding.tvLogin.setOnClickListener {

        }
    }
}