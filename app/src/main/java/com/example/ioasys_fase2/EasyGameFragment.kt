package com.example.ioasys_fase2

import android.content.DialogInterface
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.util.*

class EasyGameFragment : Fragment() {

    private lateinit var easyLevelTitle: AppCompatTextView
    private lateinit var easyLevelSubtitle: AppCompatTextView

    private lateinit var line1column1Easy: AppCompatImageView
    private lateinit var line1column2Easy: AppCompatImageView
    private lateinit var line1column3Easy: AppCompatImageView
    private lateinit var line2column1Easy: AppCompatImageView
    private lateinit var line2column2Easy: AppCompatImageView
    private lateinit var line2column3Easy: AppCompatImageView
    private lateinit var line3column1Easy: AppCompatImageView
    private lateinit var line3column2Easy: AppCompatImageView
    private lateinit var line3column3Easy: AppCompatImageView
    private lateinit var line4column1Easy: AppCompatImageView
    private lateinit var line4column2Easy: AppCompatImageView
    private lateinit var line4column3Easy: AppCompatImageView

    // ALEATORIZAR VALORES E DEPOIS INSERIR NO ARRAY PARA ALEATORIZAR AS CARTAS NO JOGO
    // ALEATORIZAR SEMPRE QUE INICIAR ESSA FRAGMENT
    private var cardsArray = arrayOf(205, 203, 106, 103, 101, 105, 104, 202, 201, 102, 206, 204)

    private var img101: Int = 0
    private var img102: Int = 0
    private var img103: Int = 0
    private var img104: Int = 0
    private var img105: Int = 0
    private var img106: Int = 0
    private var img201: Int = 0
    private var img202: Int = 0
    private var img203: Int = 0
    private var img204: Int = 0
    private var img205: Int = 0
    private var img206: Int = 0
    private var firstCard: Int = 0
    private var secondCard: Int = 0
    private var clickedFirst: Int = 0
    private var clickedSecond: Int = 0
    private var cardNumber: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_easy_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        easyLevelTitle = view.findViewById(R.id.easyLevelTitle)
        easyLevelSubtitle = view.findViewById(R.id.easyLevelSubtitle)

        easyLevelSubtitle.setOnClickListener {
            val alertDialog = AlertDialog.Builder(requireContext())
            val dialogView = layoutInflater.inflate(R.layout.fragment_how_to_play, null)
            alertDialog.setView(dialogView)
                .setCancelable(false)
                .setPositiveButton("OK", { dialogInterface: DialogInterface, i: Int -> })
                .show()
        }
//        easyLevelTitle.setOnClickListener {
//
//        }

        line1column1Easy = view.findViewById(R.id.line1column1Easy)
        line1column2Easy = view.findViewById(R.id.line1column2Easy)
        line1column3Easy = view.findViewById(R.id.line1column3Easy)
        line2column1Easy = view.findViewById(R.id.line2column1Easy)
        line2column2Easy = view.findViewById(R.id.line2column2Easy)
        line2column3Easy = view.findViewById(R.id.line2column3Easy)
        line3column1Easy = view.findViewById(R.id.line3column1Easy)
        line3column2Easy = view.findViewById(R.id.line3column2Easy)
        line3column3Easy = view.findViewById(R.id.line3column3Easy)
        line4column1Easy = view.findViewById(R.id.line4column1Easy)
        line4column2Easy = view.findViewById(R.id.line4column2Easy)
        line4column3Easy = view.findViewById(R.id.line4column3Easy)

        line1column1Easy.tag = "0"
        line1column2Easy.tag = "1"
        line1column3Easy.tag = "2"
        line2column1Easy.tag = "3"
        line2column2Easy.tag = "4"
        line2column3Easy.tag = "5"
        line3column1Easy.tag = "6"
        line3column2Easy.tag = "7"
        line3column3Easy.tag = "8"
        line4column1Easy.tag = "9"
        line4column2Easy.tag = "10"
        line4column3Easy.tag = "11"

        frontOfCardsResources()

        Arrays.asList(cardsArray).shuffle()

        line1column1Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column1Easy.tag as String)
            doStuff(line1column1Easy, theCard)
        }
        line1column2Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column2Easy.tag as String)
            doStuff(line1column2Easy, theCard)
        }
        line1column3Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column3Easy.tag as String)
//            val theCard: Int = view.tag as String.toInt()
            doStuff(line1column3Easy, theCard)
        }
        line2column1Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column1Easy.tag as String)
            doStuff(line2column1Easy, theCard)
        }
        line2column2Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column2Easy.tag as String)
            doStuff(line2column2Easy, theCard)
        }
        line2column3Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column3Easy.tag as String)
            doStuff(line2column3Easy, theCard)
        }
        line3column1Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column1Easy.tag as String)
            doStuff(line3column1Easy, theCard)
        }
        line3column2Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column2Easy.tag as String)
            doStuff(line3column2Easy, theCard)
        }
        line3column3Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column3Easy.tag as String)
            doStuff(line3column3Easy, theCard)
        }
        line4column1Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column1Easy.tag as String)
            doStuff(line4column1Easy, theCard)
        }
        line4column2Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column2Easy.tag as String)
            doStuff(line4column2Easy, theCard)
        }
        line4column3Easy.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column3Easy.tag as String)
            doStuff(line4column3Easy, theCard)
        }
    }

    private fun doStuff(appCompatImageView: AppCompatImageView, card: Int) {
        if (cardsArray[card] == 101) {
            appCompatImageView.setImageResource(img101)
        } else if (cardsArray[card] == 102) {
            appCompatImageView.setImageResource(img102)
        } else if (cardsArray[card] == 103) {
            appCompatImageView.setImageResource(img103)
        } else if (cardsArray[card] == 104) {
            appCompatImageView.setImageResource(img104)
        } else if (cardsArray[card] == 105) {
            appCompatImageView.setImageResource(img105)
        } else if (cardsArray[card] == 106) {
            appCompatImageView.setImageResource(img106)
        } else if (cardsArray[card] == 201) {
            appCompatImageView.setImageResource(img201)
        } else if (cardsArray[card] == 202) {
            appCompatImageView.setImageResource(img202)
        } else if (cardsArray[card] == 203) {
            appCompatImageView.setImageResource(img203)
        } else if (cardsArray[card] == 204) {
            appCompatImageView.setImageResource(img204)
        } else if (cardsArray[card] == 205) {
            appCompatImageView.setImageResource(img205)
        } else if (cardsArray[card] == 206) {
            appCompatImageView.setImageResource(img206)
        }

        if (cardNumber == 1) {
            firstCard = cardsArray[card]
            if (firstCard > 200)
                firstCard -= 100
            cardNumber = 2
            clickedFirst = card
            appCompatImageView.setEnabled(false)
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card]
            if (secondCard > 200)
                secondCard -= 100
            cardNumber = 1
            clickedSecond = card

            line1column1Easy.setEnabled(false)
            line1column2Easy.setEnabled(false)
            line1column3Easy.setEnabled(false)
            line2column1Easy.setEnabled(false)
            line2column2Easy.setEnabled(false)
            line2column3Easy.setEnabled(false)
            line3column1Easy.setEnabled(false)
            line3column2Easy.setEnabled(false)
            line3column3Easy.setEnabled(false)
            line4column1Easy.setEnabled(false)
            line4column2Easy.setEnabled(false)
            line4column3Easy.setEnabled(false)

            val handler = Handler()
            handler.postDelayed({ calculate() }, 1000)
        }
    }

    private fun calculate() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                line1column1Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 1) {
                line1column2Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 2) {
                line1column3Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 3) {
                line2column1Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 4) {
                line2column2Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 5) {
                line2column3Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 6) {
                line3column1Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 7) {
                line3column2Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 8) {
                line3column3Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 9) {
                line4column1Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 10) {
                line4column2Easy.visibility = View.INVISIBLE
            } else if (clickedFirst == 11) {
                line4column3Easy.visibility = View.INVISIBLE
            }

            if (clickedSecond == 0) {
                line1column1Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 1) {
                line1column2Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 2) {
                line1column3Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 3) {
                line2column1Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 4) {
                line2column2Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 5) {
                line2column3Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 6) {
                line3column1Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 7) {
                line3column2Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 8) {
                line3column3Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 9) {
                line4column1Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 10) {
                line4column2Easy.visibility = View.INVISIBLE
            } else if (clickedSecond == 11) {
                line4column3Easy.visibility = View.INVISIBLE
            }
        } else {
            line1column1Easy.setImageResource(R.drawable.background_cards)
            line1column2Easy.setImageResource(R.drawable.background_cards)
            line1column3Easy.setImageResource(R.drawable.background_cards)
            line2column1Easy.setImageResource(R.drawable.background_cards)
            line2column2Easy.setImageResource(R.drawable.background_cards)
            line2column3Easy.setImageResource(R.drawable.background_cards)
            line3column1Easy.setImageResource(R.drawable.background_cards)
            line3column2Easy.setImageResource(R.drawable.background_cards)
            line3column3Easy.setImageResource(R.drawable.background_cards)
            line4column1Easy.setImageResource(R.drawable.background_cards)
            line4column2Easy.setImageResource(R.drawable.background_cards)
            line4column3Easy.setImageResource(R.drawable.background_cards)
        }

        line1column1Easy.setEnabled(true)
        line1column2Easy.setEnabled(true)
        line1column3Easy.setEnabled(true)
        line2column1Easy.setEnabled(true)
        line2column2Easy.setEnabled(true)
        line2column3Easy.setEnabled(true)
        line3column1Easy.setEnabled(true)
        line3column2Easy.setEnabled(true)
        line3column3Easy.setEnabled(true)
        line4column1Easy.setEnabled(true)
        line4column2Easy.setEnabled(true)
        line4column3Easy.setEnabled(true)

        checkEnd()
    }

    private fun checkEnd() {
        if (line1column1Easy.visibility == View.INVISIBLE &&
            line1column2Easy.visibility == View.INVISIBLE &&
            line1column3Easy.visibility == View.INVISIBLE &&
            line2column1Easy.visibility == View.INVISIBLE &&
            line2column2Easy.visibility == View.INVISIBLE &&
            line2column3Easy.visibility == View.INVISIBLE &&
            line3column1Easy.visibility == View.INVISIBLE &&
            line3column2Easy.visibility == View.INVISIBLE &&
            line3column3Easy.visibility == View.INVISIBLE &&
            line4column1Easy.visibility == View.INVISIBLE &&
            line4column2Easy.visibility == View.INVISIBLE &&
            line4column3Easy.visibility == View.INVISIBLE) {

            val alertDialog = AlertDialog.Builder(requireContext())
            val dialogView = layoutInflater.inflate(R.layout.fragment_congrats, null)
                alertDialog.setView(dialogView)
                .setCancelable(false)
                .setPositiveButton("OK", { dialogInterface: DialogInterface, i: Int -> })
                .show()
            navigateToSelectLevel()
        }
    }

    private fun frontOfCardsResources() {           // fazer funcao para aleatoriezar essas posicoes
        img101 = R.drawable.agender
        img102 = R.drawable.androgyne
        img103 = R.drawable.deminonbinary
        img104 = R.drawable.gender_neutral
        img105 = R.drawable.genderfluid
        img106 = R.drawable.genderqueer

        img201 = R.drawable.agender
        img202 = R.drawable.androgyne
        img203 = R.drawable.deminonbinary
        img204 = R.drawable.gender_neutral
        img205 = R.drawable.genderfluid
        img206 = R.drawable.genderqueer
    }

    private fun navigateToSelectLevel() {
        findNavController().navigate(R.id.action_easyGameFragment_to_selectLevelFragment)
    }

}