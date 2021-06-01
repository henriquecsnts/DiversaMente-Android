package com.example.ioasys_fase2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.Group
import androidx.navigation.fragment.findNavController

class SelectLevelFragment : Fragment() {

    private lateinit var easyLevelButton: AppCompatButton
    private lateinit var mediumLevelButton: AppCompatButton
    private lateinit var hardLevelButton: AppCompatButton

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_select_level, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        easyLevelButton = view.findViewById(R.id.easyLevelButton)
        mediumLevelButton = view.findViewById(R.id.mediumLevelButton)
        hardLevelButton = view.findViewById(R.id.hardLevelButton)

        easyLevelButton.setOnClickListener { navigateToEasyLevel() }
        mediumLevelButton.setOnClickListener { navigateToMediumLevel() }
        hardLevelButton.setOnClickListener { navigateToHardLevel() }
    }

    private fun navigateToEasyLevel(){
        findNavController().navigate(R.id.action_selectLevelFragment_to_easyGameFragment)
    }

    private fun navigateToMediumLevel(){
        findNavController().navigate(R.id.action_selectLevelFragment_to_mediumGameFragment)
    }

    private fun navigateToHardLevel(){
        findNavController().navigate(R.id.action_selectLevelFragment_to_hardGameFragment)
    }

}
