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

class MediumGameFragment : Fragment() {

    private lateinit var MediumLevelTitle: AppCompatTextView
    private lateinit var MediumLevelSubtitle: AppCompatTextView

    private lateinit var line1column1Medium: AppCompatImageView
    private lateinit var line1column2Medium: AppCompatImageView
    private lateinit var line1column3Medium: AppCompatImageView
    private lateinit var line1column4Medium: AppCompatImageView

    private lateinit var line2column1Medium: AppCompatImageView
    private lateinit var line2column2Medium: AppCompatImageView
    private lateinit var line2column3Medium: AppCompatImageView
    private lateinit var line2column4Medium: AppCompatImageView

    private lateinit var line3column1Medium: AppCompatImageView
    private lateinit var line3column2Medium: AppCompatImageView
    private lateinit var line3column3Medium: AppCompatImageView
    private lateinit var line3column4Medium: AppCompatImageView

    private lateinit var line4column1Medium: AppCompatImageView
    private lateinit var line4column2Medium: AppCompatImageView
    private lateinit var line4column3Medium: AppCompatImageView
    private lateinit var line4column4Medium: AppCompatImageView

    private lateinit var line5column1Medium: AppCompatImageView
    private lateinit var line5column2Medium: AppCompatImageView
    private lateinit var line5column3Medium: AppCompatImageView
    private lateinit var line5column4Medium: AppCompatImageView

    private lateinit var line6column1Medium: AppCompatImageView
    private lateinit var line6column2Medium: AppCompatImageView
    private lateinit var line6column3Medium: AppCompatImageView
    private lateinit var line6column4Medium: AppCompatImageView

    private var cardsArray = arrayOf(206, 112, 106, 102, 209, 203, 202, 204, 201, 111, 110, 205, 108, 207, 211, 101, 105, 210, 107, 104, 208, 108, 103, 212)

    private var img101: Int = 0
    private var img102: Int = 0
    private var img103: Int = 0
    private var img104: Int = 0
    private var img105: Int = 0
    private var img106: Int = 0
    private var img107: Int = 0
    private var img108: Int = 0
    private var img109: Int = 0
    private var img110: Int = 0
    private var img111: Int = 0
    private var img112: Int = 0
    private var img201: Int = 0
    private var img202: Int = 0
    private var img203: Int = 0
    private var img204: Int = 0
    private var img205: Int = 0
    private var img206: Int = 0
    private var img207: Int = 0
    private var img208: Int = 0
    private var img209: Int = 0
    private var img210: Int = 0
    private var img211: Int = 0
    private var img212: Int = 0
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
        return inflater.inflate(R.layout.fragment_medium_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MediumLevelTitle = view.findViewById(R.id.mediumLevelTitle)
        MediumLevelSubtitle = view.findViewById(R.id.mediumLevelSubtitle)

        MediumLevelSubtitle.setOnClickListener {
            val alertDialog = AlertDialog.Builder(requireContext())
            val dialogView = layoutInflater.inflate(R.layout.fragment_how_to_play, null)
            alertDialog.setView(dialogView)
                .setCancelable(false)
                .setPositiveButton("OK", { dialogInterface: DialogInterface, i: Int -> })
                .show()
        }
//        MediumLevelTitle.setOnClickListener {
//
//        }

        line1column1Medium = view.findViewById(R.id.line1column1Medium)
        line1column2Medium = view.findViewById(R.id.line1column2Medium)
        line1column3Medium = view.findViewById(R.id.line1column3Medium)
        line1column4Medium = view.findViewById(R.id.line1column4Medium)

        line2column1Medium = view.findViewById(R.id.line2column1Medium)
        line2column2Medium = view.findViewById(R.id.line2column2Medium)
        line2column3Medium = view.findViewById(R.id.line2column3Medium)
        line2column4Medium = view.findViewById(R.id.line2column4Medium)

        line3column1Medium = view.findViewById(R.id.line3column1Medium)
        line3column2Medium = view.findViewById(R.id.line3column2Medium)
        line3column3Medium = view.findViewById(R.id.line3column3Medium)
        line3column4Medium = view.findViewById(R.id.line3column4Medium)

        line4column1Medium = view.findViewById(R.id.line4column1Medium)
        line4column2Medium = view.findViewById(R.id.line4column2Medium)
        line4column3Medium = view.findViewById(R.id.line4column3Medium)
        line4column4Medium = view.findViewById(R.id.line4column4Medium)

        line5column1Medium = view.findViewById(R.id.line5column1Medium)
        line5column2Medium = view.findViewById(R.id.line5column2Medium)
        line5column3Medium = view.findViewById(R.id.line5column3Medium)
        line5column4Medium = view.findViewById(R.id.line5column4Medium)

        line6column1Medium = view.findViewById(R.id.line6column1Medium)
        line6column2Medium = view.findViewById(R.id.line6column2Medium)
        line6column3Medium = view.findViewById(R.id.line6column3Medium)
        line6column4Medium = view.findViewById(R.id.line6column4Medium)


        line1column1Medium.tag = "0"
        line1column2Medium.tag = "1"
        line1column3Medium.tag = "2"
        line1column4Medium.tag = "3"

        line2column1Medium.tag = "4"
        line2column2Medium.tag = "5"
        line2column3Medium.tag = "6"
        line2column4Medium.tag = "7"

        line3column1Medium.tag = "8"
        line3column2Medium.tag = "9"
        line3column3Medium.tag = "10"
        line3column4Medium.tag = "11"

        line4column1Medium.tag = "12"
        line4column2Medium.tag = "13"
        line4column3Medium.tag = "14"
        line4column4Medium.tag = "15"

        line5column1Medium.tag = "16"
        line5column2Medium.tag = "17"
        line5column3Medium.tag = "18"
        line5column4Medium.tag = "19"

        line6column1Medium.tag = "20"
        line6column2Medium.tag = "21"
        line6column3Medium.tag = "22"
        line6column4Medium.tag = "23"

        frontOfCardsResources()

        Arrays.asList(cardsArray).shuffle()

        line1column1Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column1Medium.tag as String)
            doStuff(line1column1Medium, theCard)
        }
        line1column2Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column2Medium.tag as String)
            doStuff(line1column2Medium, theCard)
        }
        line1column3Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column3Medium.tag as String)
            doStuff(line1column3Medium, theCard)
        }
        line1column4Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column4Medium.tag as String)
            doStuff(line1column4Medium, theCard)
        }

        line2column1Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column1Medium.tag as String)
            doStuff(line2column1Medium, theCard)
        }
        line2column2Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column2Medium.tag as String)
            doStuff(line2column2Medium, theCard)
        }
        line2column3Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column3Medium.tag as String)
            doStuff(line2column3Medium, theCard)
        }
        line2column4Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column4Medium.tag as String)
            doStuff(line2column4Medium, theCard)
        }

        line3column1Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column1Medium.tag as String)
            doStuff(line3column1Medium, theCard)
        }
        line3column2Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column2Medium.tag as String)
            doStuff(line3column2Medium, theCard)
        }
        line3column3Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column3Medium.tag as String)
            doStuff(line3column3Medium, theCard)
        }
        line3column4Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column4Medium.tag as String)
            doStuff(line3column4Medium, theCard)
        }

        line4column1Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column1Medium.tag as String)
            doStuff(line4column1Medium, theCard)
        }
        line4column2Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column2Medium.tag as String)
            doStuff(line4column2Medium, theCard)
        }
        line4column3Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column3Medium.tag as String)
            doStuff(line4column3Medium, theCard)
        }
        line4column4Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column4Medium.tag as String)
            doStuff(line4column4Medium, theCard)
        }

        line5column1Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column1Medium.tag as String)
            doStuff(line5column1Medium, theCard)
        }
        line5column2Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column2Medium.tag as String)
            doStuff(line5column2Medium, theCard)
        }
        line5column3Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column3Medium.tag as String)
            doStuff(line5column3Medium, theCard)
        }
        line5column4Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column4Medium.tag as String)
            doStuff(line5column4Medium, theCard)
        }

        line6column1Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column1Medium.tag as String)
            doStuff(line6column1Medium, theCard)
        }
        line6column2Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column2Medium.tag as String)
            doStuff(line6column2Medium, theCard)
        }
        line6column3Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column3Medium.tag as String)
            doStuff(line6column3Medium, theCard)
        }
        line6column4Medium.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column4Medium.tag as String)
            doStuff(line6column4Medium, theCard)
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
        } else if (cardsArray[card] == 107) {
            appCompatImageView.setImageResource(img107)
        } else if (cardsArray[card] == 108) {
            appCompatImageView.setImageResource(img108)
        } else if (cardsArray[card] == 109) {
            appCompatImageView.setImageResource(img109)
        } else if (cardsArray[card] == 110) {
            appCompatImageView.setImageResource(img110)
        } else if (cardsArray[card] == 111) {
            appCompatImageView.setImageResource(img111)
        } else if (cardsArray[card] == 112) {
            appCompatImageView.setImageResource(img112)
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
        } else if (cardsArray[card] == 207) {
            appCompatImageView.setImageResource(img207)
        } else if (cardsArray[card] == 208) {
            appCompatImageView.setImageResource(img208)
        } else if (cardsArray[card] == 209) {
            appCompatImageView.setImageResource(img209)
        } else if (cardsArray[card] == 210) {
            appCompatImageView.setImageResource(img210)
        } else if (cardsArray[card] == 211) {
            appCompatImageView.setImageResource(img211)
        } else if (cardsArray[card] == 212) {
            appCompatImageView.setImageResource(img212)
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

            line1column1Medium.setEnabled(false)
            line1column2Medium.setEnabled(false)
            line1column3Medium.setEnabled(false)
            line1column4Medium.setEnabled(false)

            line2column1Medium.setEnabled(false)
            line2column2Medium.setEnabled(false)
            line2column3Medium.setEnabled(false)
            line2column4Medium.setEnabled(false)

            line3column1Medium.setEnabled(false)
            line3column2Medium.setEnabled(false)
            line3column3Medium.setEnabled(false)
            line3column4Medium.setEnabled(false)

            line4column1Medium.setEnabled(false)
            line4column2Medium.setEnabled(false)
            line4column3Medium.setEnabled(false)
            line4column4Medium.setEnabled(false)

            line5column1Medium.setEnabled(false)
            line5column2Medium.setEnabled(false)
            line5column3Medium.setEnabled(false)
            line5column4Medium.setEnabled(false)

            line6column1Medium.setEnabled(false)
            line6column2Medium.setEnabled(false)
            line6column3Medium.setEnabled(false)
            line6column4Medium.setEnabled(false)

            val handler = Handler()
            handler.postDelayed({ calculate() }, 1000)
        }
    }

    private fun calculate() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                line1column1Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 1) {
                line1column2Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 2) {
                line1column3Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 3) {
                line1column4Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 4) {
                line2column1Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 5) {
                line2column2Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 6) {
                line2column3Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 7) {
                line2column4Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 8) {
                line3column1Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 9) {
                line3column2Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 10) {
                line3column3Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 11) {
                line3column4Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 12) {
                line4column1Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 13) {
                line4column2Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 14) {
                line4column3Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 15) {
                line4column4Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 16) {
                line5column1Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 17) {
                line5column2Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 18) {
                line5column3Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 19) {
                line5column4Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 20) {
                line6column1Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 21) {
                line6column2Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 22) {
                line6column3Medium.visibility = View.INVISIBLE
            } else if (clickedFirst == 23) {
                line6column4Medium.visibility = View.INVISIBLE
            }

            if (clickedSecond == 0) {
                line1column1Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 1) {
                line1column2Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 2) {
                line1column3Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 3) {
                line1column4Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 4) {
                line2column1Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 5) {
                line2column2Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 6) {
                line2column3Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 7) {
                line2column4Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 8) {
                line3column1Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 9) {
                line3column2Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 10) {
                line3column3Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 11) {
                line3column4Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 12) {
                line4column1Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 13) {
                line4column2Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 14) {
                line4column3Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 15) {
                line4column4Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 16) {
                line5column1Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 17) {
                line5column2Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 18) {
                line5column3Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 19) {
                line5column4Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 20) {
                line6column1Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 21) {
                line6column2Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 22) {
                line6column3Medium.visibility = View.INVISIBLE
            } else if (clickedSecond == 23) {
                line6column4Medium.visibility = View.INVISIBLE
            }

        } else {
            line1column1Medium.setImageResource(R.drawable.background_cards)
            line1column2Medium.setImageResource(R.drawable.background_cards)
            line1column3Medium.setImageResource(R.drawable.background_cards)
            line1column4Medium.setImageResource(R.drawable.background_cards)

            line2column1Medium.setImageResource(R.drawable.background_cards)
            line2column2Medium.setImageResource(R.drawable.background_cards)
            line2column3Medium.setImageResource(R.drawable.background_cards)
            line2column4Medium.setImageResource(R.drawable.background_cards)

            line3column1Medium.setImageResource(R.drawable.background_cards)
            line3column2Medium.setImageResource(R.drawable.background_cards)
            line3column3Medium.setImageResource(R.drawable.background_cards)
            line3column4Medium.setImageResource(R.drawable.background_cards)

            line4column1Medium.setImageResource(R.drawable.background_cards)
            line4column2Medium.setImageResource(R.drawable.background_cards)
            line4column3Medium.setImageResource(R.drawable.background_cards)
            line4column4Medium.setImageResource(R.drawable.background_cards)

            line5column1Medium.setImageResource(R.drawable.background_cards)
            line5column2Medium.setImageResource(R.drawable.background_cards)
            line5column3Medium.setImageResource(R.drawable.background_cards)
            line5column4Medium.setImageResource(R.drawable.background_cards)

            line6column1Medium.setImageResource(R.drawable.background_cards)
            line6column2Medium.setImageResource(R.drawable.background_cards)
            line6column3Medium.setImageResource(R.drawable.background_cards)
            line6column4Medium.setImageResource(R.drawable.background_cards)

        }

        line1column1Medium.setEnabled(true)
        line1column2Medium.setEnabled(true)
        line1column3Medium.setEnabled(true)
        line1column4Medium.setEnabled(true)

        line2column1Medium.setEnabled(true)
        line2column2Medium.setEnabled(true)
        line2column3Medium.setEnabled(true)
        line2column4Medium.setEnabled(true)

        line3column1Medium.setEnabled(true)
        line3column2Medium.setEnabled(true)
        line3column3Medium.setEnabled(true)
        line3column4Medium.setEnabled(true)

        line4column1Medium.setEnabled(true)
        line4column2Medium.setEnabled(true)
        line4column3Medium.setEnabled(true)
        line4column4Medium.setEnabled(true)

        line5column1Medium.setEnabled(true)
        line5column2Medium.setEnabled(true)
        line5column3Medium.setEnabled(true)
        line5column4Medium.setEnabled(true)

        line6column1Medium.setEnabled(true)
        line6column2Medium.setEnabled(true)
        line6column3Medium.setEnabled(true)
        line6column4Medium.setEnabled(true)

        checkEnd()
    }

    private fun checkEnd() {
        if (line1column1Medium.visibility == View.INVISIBLE &&
            line1column2Medium.visibility == View.INVISIBLE &&
            line1column3Medium.visibility == View.INVISIBLE &&
            line1column4Medium.visibility == View.INVISIBLE &&

            line2column1Medium.visibility == View.INVISIBLE &&
            line2column2Medium.visibility == View.INVISIBLE &&
            line2column3Medium.visibility == View.INVISIBLE &&
            line2column4Medium.visibility == View.INVISIBLE &&

            line3column1Medium.visibility == View.INVISIBLE &&
            line3column2Medium.visibility == View.INVISIBLE &&
            line3column3Medium.visibility == View.INVISIBLE &&
            line3column4Medium.visibility == View.INVISIBLE &&

            line4column1Medium.visibility == View.INVISIBLE &&
            line4column2Medium.visibility == View.INVISIBLE &&
            line4column3Medium.visibility == View.INVISIBLE &&
            line4column4Medium.visibility == View.INVISIBLE &&

            line5column1Medium.visibility == View.INVISIBLE &&
            line5column2Medium.visibility == View.INVISIBLE &&
            line5column3Medium.visibility == View.INVISIBLE &&
            line5column4Medium.visibility == View.INVISIBLE &&

            line6column1Medium.visibility == View.INVISIBLE &&
            line6column2Medium.visibility == View.INVISIBLE &&
            line6column3Medium.visibility == View.INVISIBLE &&
            line6column4Medium.visibility == View.INVISIBLE ) {

            val alertDialog = AlertDialog.Builder(requireContext())
            val dialogView = layoutInflater.inflate(R.layout.fragment_congrats, null)
            alertDialog.setView(dialogView)
                .setCancelable(false)
                .setPositiveButton("OK", { dialogInterface: DialogInterface, i: Int -> })
                .show()
            navigateToSelectLevel()
        }
    }

    private fun frontOfCardsResources() {
        img101 = R.drawable.intergender
        img102 = R.drawable.kingender
        img103 = R.drawable.neurogender
        img104 = R.drawable.nonbinary
        img105 = R.drawable.nonbinary_boy
        img106 = R.drawable.nonbinary_girl
        img107 = R.drawable.trans_man
        img108 = R.drawable.trans_woman
        img109 = R.drawable.transneutral
        img110 = R.drawable.intergender
        img111 = R.drawable.kingender
        img112 = R.drawable.neurogender

        img201 = R.drawable.intergender
        img202 = R.drawable.kingender
        img203 = R.drawable.neurogender
        img204 = R.drawable.nonbinary
        img205 = R.drawable.nonbinary_boy
        img206 = R.drawable.nonbinary_girl
        img207 = R.drawable.trans_man
        img208 = R.drawable.trans_woman
        img209 = R.drawable.transneutral
        img210 = R.drawable.intergender
        img211 = R.drawable.kingender
        img212 = R.drawable.neurogender

    }

    private fun navigateToSelectLevel() {
        findNavController().navigate(R.id.action_mediumGameFragment_to_selectLevelFragment)
    }
}