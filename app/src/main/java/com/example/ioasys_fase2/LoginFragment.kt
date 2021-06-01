package com.example.ioasys_fase2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    private lateinit var enterButton: AppCompatButton
    private lateinit var username: AppCompatEditText
//    private lateinit var name: String
//    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        communicator = activity as Communicator
        enterButton = view.findViewById(R.id.enterButton)
        username = view.findViewById(R.id.username)
//        name = username.text.toString()
        enterButton.setOnClickListener { navigateToMenu() }
//        communicator.passDataLoginToMenu(name)
    }

    private fun navigateToMenu() {
        findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
    }

}