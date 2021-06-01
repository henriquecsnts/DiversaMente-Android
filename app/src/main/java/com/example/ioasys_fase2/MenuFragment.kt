package com.example.ioasys_fase2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MenuFragment : Fragment() {

    private lateinit var playButtonMenu: AppCompatButton
    private lateinit var glossaryButton: AppCompatButton
    private lateinit var newsButton: AppCompatButton
    private lateinit var aboutTheIdeaText: AppCompatTextView
    private lateinit var exitGame: AppCompatTextView
    private var username: String? = ""
    private lateinit var welcomeText: AppCompatTextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        username = arguments?.getString("username")

        playButtonMenu = view.findViewById(R.id.playButtonMenu)
        glossaryButton = view.findViewById(R.id.glossaryButton)
        newsButton = view.findViewById(R.id.newsButton)
        aboutTheIdeaText = view.findViewById(R.id.aboutTheIdeaText)
        exitGame = view.findViewById(R.id.exitGame)

        playButtonMenu.setOnClickListener { navigateToSelectLevel() }
        glossaryButton.setOnClickListener { navigateToGlossary() }
        aboutTheIdeaText.setOnClickListener { navigateToAboutTheIdea() }
        exitGame.setOnClickListener { navigateToLogin() }

    }

    private fun navigateToSelectLevel(){
        findNavController().navigate(R.id.action_menuFragment_to_selectLevelFragment)
    }

    private fun navigateToGlossary(){
        findNavController().navigate(R.id.action_menuFragment_to_glossaryFragment)
    }

    private fun navigateToAboutTheIdea(){
        findNavController().navigate(R.id.action_menuFragment_to_aboutTheIdeaFragment)
    }

    private fun navigateToLogin(){
        findNavController().navigate(R.id.action_menuFragment_to_loginFragment)
    }

}