package com.example.ioasys_fase2

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
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

class HardGameFragment : Fragment() {

    private lateinit var HardLevelTitle: AppCompatTextView
    private lateinit var HardLevelSubtitle: AppCompatTextView

    private lateinit var line1column1Hard: AppCompatImageView
    private lateinit var line1column2Hard: AppCompatImageView
    private lateinit var line1column3Hard: AppCompatImageView
    private lateinit var line1column4Hard: AppCompatImageView
    private lateinit var line1column5Hard: AppCompatImageView
    private lateinit var line1column6Hard: AppCompatImageView

    private lateinit var line2column1Hard: AppCompatImageView
    private lateinit var line2column2Hard: AppCompatImageView
    private lateinit var line2column3Hard: AppCompatImageView
    private lateinit var line2column4Hard: AppCompatImageView
    private lateinit var line2column5Hard: AppCompatImageView
    private lateinit var line2column6Hard: AppCompatImageView

    private lateinit var line3column1Hard: AppCompatImageView
    private lateinit var line3column2Hard: AppCompatImageView
    private lateinit var line3column3Hard: AppCompatImageView
    private lateinit var line3column4Hard: AppCompatImageView
    private lateinit var line3column5Hard: AppCompatImageView
    private lateinit var line3column6Hard: AppCompatImageView

    private lateinit var line4column1Hard: AppCompatImageView
    private lateinit var line4column2Hard: AppCompatImageView
    private lateinit var line4column3Hard: AppCompatImageView
    private lateinit var line4column4Hard: AppCompatImageView
    private lateinit var line4column5Hard: AppCompatImageView
    private lateinit var line4column6Hard: AppCompatImageView

    private lateinit var line5column1Hard: AppCompatImageView
    private lateinit var line5column2Hard: AppCompatImageView
    private lateinit var line5column3Hard: AppCompatImageView
    private lateinit var line5column4Hard: AppCompatImageView
    private lateinit var line5column5Hard: AppCompatImageView
    private lateinit var line5column6Hard: AppCompatImageView

    private lateinit var line6column1Hard: AppCompatImageView
    private lateinit var line6column2Hard: AppCompatImageView
    private lateinit var line6column3Hard: AppCompatImageView
    private lateinit var line6column4Hard: AppCompatImageView
    private lateinit var line6column5Hard: AppCompatImageView
    private lateinit var line6column6Hard: AppCompatImageView

    private lateinit var line7column1Hard: AppCompatImageView
    private lateinit var line7column2Hard: AppCompatImageView
    private lateinit var line7column3Hard: AppCompatImageView
    private lateinit var line7column4Hard: AppCompatImageView
    private lateinit var line7column5Hard: AppCompatImageView
    private lateinit var line7column6Hard: AppCompatImageView

    private lateinit var line8column1Hard: AppCompatImageView
    private lateinit var line8column2Hard: AppCompatImageView
    private lateinit var line8column3Hard: AppCompatImageView
    private lateinit var line8column4Hard: AppCompatImageView
    private lateinit var line8column5Hard: AppCompatImageView
    private lateinit var line8column6Hard: AppCompatImageView

    private var cardsArray = arrayOf(105, 208, 110, 124, 213, 104, 212, 205, 222, 114, 123, 207, 215, 216, 106, 202, 109, 204, 108, 220, 101, 217, 119, 118, 206, 107, 102, 111, 210, 223, 122, 120, 201, 224, 203, 221, 209, 121, 219, 117, 116, 113, 112, 103, 218, 214, 215, 211)

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
    private var img113: Int = 0
    private var img114: Int = 0
    private var img115: Int = 0
    private var img116: Int = 0
    private var img117: Int = 0
    private var img118: Int = 0
    private var img119: Int = 0
    private var img120: Int = 0
    private var img121: Int = 0
    private var img122: Int = 0
    private var img123: Int = 0
    private var img124: Int = 0

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
    private var img213: Int = 0
    private var img214: Int = 0
    private var img215: Int = 0
    private var img216: Int = 0
    private var img217: Int = 0
    private var img218: Int = 0
    private var img219: Int = 0
    private var img220: Int = 0
    private var img221: Int = 0
    private var img222: Int = 0
    private var img223: Int = 0
    private var img224: Int = 0
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
        return inflater.inflate(R.layout.fragment_hard_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        HardLevelTitle = view.findViewById(R.id.hardLevelTitle)
        HardLevelSubtitle = view.findViewById(R.id.hardLevelSubtitle)

        HardLevelSubtitle.setOnClickListener {
            val alertDialog = AlertDialog.Builder(requireContext())
            val dialogView = layoutInflater.inflate(R.layout.fragment_how_to_play, null)
            alertDialog.setView(dialogView)
                .setCancelable(false)
                .setPositiveButton("OK", { dialogInterface: DialogInterface, i: Int -> })
                .show()
        }
//        HardLevelTitle.setOnClickListener {
//
//        }

        line1column1Hard = view.findViewById(R.id.line1column1Hard)
        line1column2Hard = view.findViewById(R.id.line1column2Hard)
        line1column3Hard = view.findViewById(R.id.line1column3Hard)
        line1column4Hard = view.findViewById(R.id.line1column4Hard)
        line1column5Hard = view.findViewById(R.id.line1column5Hard)
        line1column6Hard = view.findViewById(R.id.line1column6Hard)

        line2column1Hard = view.findViewById(R.id.line2column1Hard)
        line2column2Hard = view.findViewById(R.id.line2column2Hard)
        line2column3Hard = view.findViewById(R.id.line2column3Hard)
        line2column4Hard = view.findViewById(R.id.line2column4Hard)
        line2column5Hard = view.findViewById(R.id.line2column5Hard)
        line2column6Hard = view.findViewById(R.id.line2column6Hard)

        line3column1Hard = view.findViewById(R.id.line3column1Hard)
        line3column2Hard = view.findViewById(R.id.line3column2Hard)
        line3column3Hard = view.findViewById(R.id.line3column3Hard)
        line3column4Hard = view.findViewById(R.id.line3column4Hard)
        line3column5Hard = view.findViewById(R.id.line3column5Hard)
        line3column6Hard = view.findViewById(R.id.line3column6Hard)

        line4column1Hard = view.findViewById(R.id.line4column1Hard)
        line4column2Hard = view.findViewById(R.id.line4column2Hard)
        line4column3Hard = view.findViewById(R.id.line4column3Hard)
        line4column4Hard = view.findViewById(R.id.line4column4Hard)
        line4column5Hard = view.findViewById(R.id.line4column5Hard)
        line4column6Hard = view.findViewById(R.id.line4column6Hard)

        line5column1Hard = view.findViewById(R.id.line5column1Hard)
        line5column2Hard = view.findViewById(R.id.line5column2Hard)
        line5column3Hard = view.findViewById(R.id.line5column3Hard)
        line5column4Hard = view.findViewById(R.id.line5column4Hard)
        line5column5Hard = view.findViewById(R.id.line5column5Hard)
        line5column6Hard = view.findViewById(R.id.line5column6Hard)

        line6column1Hard = view.findViewById(R.id.line6column1Hard)
        line6column2Hard = view.findViewById(R.id.line6column2Hard)
        line6column3Hard = view.findViewById(R.id.line6column3Hard)
        line6column4Hard = view.findViewById(R.id.line6column4Hard)
        line6column5Hard = view.findViewById(R.id.line6column5Hard)
        line6column6Hard = view.findViewById(R.id.line6column6Hard)

        line7column1Hard = view.findViewById(R.id.line7column1Hard)
        line7column2Hard = view.findViewById(R.id.line7column2Hard)
        line7column3Hard = view.findViewById(R.id.line7column3Hard)
        line7column4Hard = view.findViewById(R.id.line7column4Hard)
        line7column5Hard = view.findViewById(R.id.line7column5Hard)
        line7column6Hard = view.findViewById(R.id.line7column6Hard)

        line8column1Hard = view.findViewById(R.id.line8column1Hard)
        line8column2Hard = view.findViewById(R.id.line8column2Hard)
        line8column3Hard = view.findViewById(R.id.line8column3Hard)
        line8column4Hard = view.findViewById(R.id.line8column4Hard)
        line8column5Hard = view.findViewById(R.id.line8column5Hard)
        line8column6Hard = view.findViewById(R.id.line8column6Hard)

        line1column1Hard.tag = "0"
        line1column2Hard.tag = "1"
        line1column3Hard.tag = "2"
        line1column4Hard.tag = "3"
        line1column5Hard.tag = "4"
        line1column6Hard.tag = "5"

        line2column1Hard.tag = "6"
        line2column2Hard.tag = "7"
        line2column3Hard.tag = "8"
        line2column4Hard.tag = "9"
        line2column5Hard.tag = "10"
        line2column6Hard.tag = "11"

        line3column1Hard.tag = "12"
        line3column2Hard.tag = "13"
        line3column3Hard.tag = "14"
        line3column4Hard.tag = "15"
        line3column5Hard.tag = "16"
        line3column6Hard.tag = "17"

        line4column1Hard.tag = "18"
        line4column2Hard.tag = "19"
        line4column3Hard.tag = "20"
        line4column4Hard.tag = "21"
        line4column5Hard.tag = "22"
        line4column6Hard.tag = "23"

        line5column1Hard.tag = "24"
        line5column2Hard.tag = "25"
        line5column3Hard.tag = "26"
        line5column4Hard.tag = "27"
        line5column5Hard.tag = "28"
        line5column6Hard.tag = "29"

        line6column1Hard.tag = "30"
        line6column2Hard.tag = "31"
        line6column3Hard.tag = "32"
        line6column4Hard.tag = "33"
        line6column5Hard.tag = "34"
        line6column6Hard.tag = "35"

        line7column1Hard.tag = "36"
        line7column2Hard.tag = "37"
        line7column3Hard.tag = "38"
        line7column4Hard.tag = "39"
        line7column5Hard.tag = "40"
        line7column6Hard.tag = "41"

        line8column1Hard.tag = "42"
        line8column2Hard.tag = "43"
        line8column3Hard.tag = "44"
        line8column4Hard.tag = "45"
        line8column5Hard.tag = "46"
        line8column6Hard.tag = "47"

        frontOfCardsResources()

        Arrays.asList(cardsArray).shuffle()

        line1column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column1Hard.tag as String)
            doStuff(line1column1Hard, theCard)
        }
        line1column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column2Hard.tag as String)
            doStuff(line1column2Hard, theCard)
        }
        line1column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column3Hard.tag as String)
            doStuff(line1column3Hard, theCard)
        }
        line1column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column4Hard.tag as String)
            doStuff(line1column4Hard, theCard)
        }
        line1column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column5Hard.tag as String)
            doStuff(line1column5Hard, theCard)
        }
        line1column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line1column6Hard.tag as String)
            doStuff(line1column6Hard, theCard)
        }

        line2column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column1Hard.tag as String)
            doStuff(line2column1Hard, theCard)
        }
        line2column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column2Hard.tag as String)
            doStuff(line2column2Hard, theCard)
        }
        line2column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column3Hard.tag as String)
            doStuff(line2column3Hard, theCard)
        }
        line2column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column4Hard.tag as String)
            doStuff(line2column4Hard, theCard)
        }
        line2column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column5Hard.tag as String)
            doStuff(line2column5Hard, theCard)
        }
        line2column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line2column6Hard.tag as String)
            doStuff(line2column6Hard, theCard)
        }

        line3column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column1Hard.tag as String)
            doStuff(line3column1Hard, theCard)
        }
        line3column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column2Hard.tag as String)
            doStuff(line3column2Hard, theCard)
        }
        line3column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column3Hard.tag as String)
            doStuff(line3column3Hard, theCard)
        }
        line3column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column4Hard.tag as String)
            doStuff(line3column4Hard, theCard)
        }
        line3column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column5Hard.tag as String)
            doStuff(line3column5Hard, theCard)
        }
        line3column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line3column6Hard.tag as String)
            doStuff(line3column6Hard, theCard)
        }

        line4column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column1Hard.tag as String)
            doStuff(line4column1Hard, theCard)
        }
        line4column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column2Hard.tag as String)
            doStuff(line4column2Hard, theCard)
        }
        line4column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column3Hard.tag as String)
            doStuff(line4column3Hard, theCard)
        }
        line4column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column4Hard.tag as String)
            doStuff(line4column4Hard, theCard)
        }
        line4column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column5Hard.tag as String)
            doStuff(line4column5Hard, theCard)
        }
        line4column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line4column6Hard.tag as String)
            doStuff(line4column6Hard, theCard)
        }

        line5column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column1Hard.tag as String)
            doStuff(line5column1Hard, theCard)
        }
        line5column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column2Hard.tag as String)
            doStuff(line5column2Hard, theCard)
        }
        line5column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column3Hard.tag as String)
            doStuff(line5column3Hard, theCard)
        }
        line5column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column4Hard.tag as String)
            doStuff(line5column4Hard, theCard)
        }
        line5column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column5Hard.tag as String)
            doStuff(line5column5Hard, theCard)
        }
        line5column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line5column6Hard.tag as String)
            doStuff(line5column6Hard, theCard)
        }

        line6column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column1Hard.tag as String)
            doStuff(line6column1Hard, theCard)
        }
        line6column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column2Hard.tag as String)
            doStuff(line6column2Hard, theCard)
        }
        line6column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column3Hard.tag as String)
            doStuff(line6column3Hard, theCard)
        }
        line6column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column4Hard.tag as String)
            doStuff(line6column4Hard, theCard)
        }
        line6column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column5Hard.tag as String)
            doStuff(line6column5Hard, theCard)
        }
        line6column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line6column6Hard.tag as String)
            doStuff(line6column6Hard, theCard)
        }

        line7column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line7column1Hard.tag as String)
            doStuff(line7column1Hard, theCard)
        }
        line7column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line7column2Hard.tag as String)
            doStuff(line7column2Hard, theCard)
        }
        line7column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line7column3Hard.tag as String)
            doStuff(line7column3Hard, theCard)
        }
        line7column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line7column4Hard.tag as String)
            doStuff(line7column4Hard, theCard)
        }
        line7column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line7column5Hard.tag as String)
            doStuff(line7column5Hard, theCard)
        }
        line7column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line7column6Hard.tag as String)
            doStuff(line7column6Hard, theCard)
        }

        line8column1Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line8column1Hard.tag as String)
            doStuff(line8column1Hard, theCard)
        }
        line8column2Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line8column2Hard.tag as String)
            doStuff(line8column2Hard, theCard)
        }
        line8column3Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line8column3Hard.tag as String)
            doStuff(line8column3Hard, theCard)
        }
        line8column4Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line8column4Hard.tag as String)
            doStuff(line8column4Hard, theCard)
        }
        line8column5Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line8column5Hard.tag as String)
            doStuff(line8column5Hard, theCard)
        }
        line8column6Hard.setOnClickListener {
            val theCard: Int = Integer.parseInt(line8column6Hard.tag as String)
            doStuff(line8column6Hard, theCard)
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
        } else if (cardsArray[card] == 113) {
            appCompatImageView.setImageResource(img102)
        } else if (cardsArray[card] == 114) {
            appCompatImageView.setImageResource(img103)
        } else if (cardsArray[card] == 115) {
            appCompatImageView.setImageResource(img104)
        } else if (cardsArray[card] == 116) {
            appCompatImageView.setImageResource(img105)
        } else if (cardsArray[card] == 117) {
            appCompatImageView.setImageResource(img106)
        } else if (cardsArray[card] == 118) {
            appCompatImageView.setImageResource(img107)
        } else if (cardsArray[card] == 119) {
            appCompatImageView.setImageResource(img108)
        } else if (cardsArray[card] == 120) {
            appCompatImageView.setImageResource(img109)
        } else if (cardsArray[card] == 121) {
            appCompatImageView.setImageResource(img110)
        } else if (cardsArray[card] == 122) {
            appCompatImageView.setImageResource(img111)
        } else if (cardsArray[card] == 123) {
            appCompatImageView.setImageResource(img112)
        } else if (cardsArray[card] == 124) {
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
        } else if (cardsArray[card] == 213) {
            appCompatImageView.setImageResource(img112)
        } else if (cardsArray[card] == 214) {
            appCompatImageView.setImageResource(img201)
        } else if (cardsArray[card] == 215) {
            appCompatImageView.setImageResource(img202)
        } else if (cardsArray[card] == 216) {
            appCompatImageView.setImageResource(img203)
        } else if (cardsArray[card] == 217) {
            appCompatImageView.setImageResource(img204)
        } else if (cardsArray[card] == 218) {
            appCompatImageView.setImageResource(img205)
        } else if (cardsArray[card] == 219) {
            appCompatImageView.setImageResource(img206)
        } else if (cardsArray[card] == 220) {
            appCompatImageView.setImageResource(img207)
        } else if (cardsArray[card] == 221) {
            appCompatImageView.setImageResource(img208)
        } else if (cardsArray[card] == 222) {
            appCompatImageView.setImageResource(img209)
        } else if (cardsArray[card] == 223) {
            appCompatImageView.setImageResource(img210)
        } else if (cardsArray[card] == 224) {
            appCompatImageView.setImageResource(img211)
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

            line1column1Hard.setEnabled(false)
            line1column2Hard.setEnabled(false)
            line1column3Hard.setEnabled(false)
            line1column4Hard.setEnabled(false)
            line1column5Hard.setEnabled(false)
            line1column6Hard.setEnabled(false)

            line2column1Hard.setEnabled(false)
            line2column2Hard.setEnabled(false)
            line2column3Hard.setEnabled(false)
            line2column4Hard.setEnabled(false)
            line2column5Hard.setEnabled(false)
            line2column6Hard.setEnabled(false)

            line3column1Hard.setEnabled(false)
            line3column2Hard.setEnabled(false)
            line3column3Hard.setEnabled(false)
            line3column4Hard.setEnabled(false)
            line3column5Hard.setEnabled(false)
            line3column6Hard.setEnabled(false)

            line4column1Hard.setEnabled(false)
            line4column2Hard.setEnabled(false)
            line4column3Hard.setEnabled(false)
            line4column4Hard.setEnabled(false)
            line4column5Hard.setEnabled(false)
            line4column6Hard.setEnabled(false)

            line5column1Hard.setEnabled(false)
            line5column2Hard.setEnabled(false)
            line5column3Hard.setEnabled(false)
            line5column4Hard.setEnabled(false)
            line5column5Hard.setEnabled(false)
            line5column6Hard.setEnabled(false)

            line6column1Hard.setEnabled(false)
            line6column2Hard.setEnabled(false)
            line6column3Hard.setEnabled(false)
            line6column4Hard.setEnabled(false)
            line6column5Hard.setEnabled(false)
            line6column6Hard.setEnabled(false)

            line7column1Hard.setEnabled(false)
            line7column2Hard.setEnabled(false)
            line7column3Hard.setEnabled(false)
            line7column4Hard.setEnabled(false)
            line7column5Hard.setEnabled(false)
            line7column6Hard.setEnabled(false)

            line8column1Hard.setEnabled(false)
            line8column2Hard.setEnabled(false)
            line8column3Hard.setEnabled(false)
            line8column4Hard.setEnabled(false)
            line8column5Hard.setEnabled(false)
            line8column6Hard.setEnabled(false)

            val handler = Handler()
            handler.postDelayed({ calculate() }, 1000)
        }
    }

    private fun calculate() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                line1column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 1) {
                line1column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 2) {
                line1column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 3) {
                line1column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 4) {
                line1column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 5) {
                line1column6Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 6) {
                line2column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 7) {
                line2column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 8) {
                line2column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 9) {
                line2column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 10) {
                line2column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 11) {
                line2column6Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 12) {
                line3column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 13) {
                line3column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 14) {
                line3column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 15) {
                line3column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 16) {
                line3column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 17) {
                line3column6Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 18) {
                line4column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 19) {
                line4column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 20) {
                line4column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 21) {
                line4column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 22) {
                line4column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 23) {
                line4column6Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 24) {
                line5column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 25) {
                line5column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 26) {
                line5column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 27) {
                line5column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 28) {
                line5column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 29) {
                line5column6Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 30) {
                line6column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 31) {
                line6column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 32) {
                line6column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 33) {
                line6column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 34) {
                line6column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 35) {
                line6column6Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 36) {
                line7column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 37) {
                line7column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 38) {
                line7column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 39) {
                line7column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 40) {
                line7column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 41) {
                line7column6Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 42) {
                line8column1Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 43) {
                line8column2Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 44) {
                line8column3Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 45) {
                line8column4Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 46) {
                line8column5Hard.visibility = View.INVISIBLE
            } else if (clickedFirst == 47) {
                line8column6Hard.visibility = View.INVISIBLE
            }

            if (clickedSecond == 0) {
                line1column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 1) {
                line1column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 2) {
                line1column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 3) {
                line1column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 4) {
                line1column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 5) {
                line1column6Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 6) {
                line2column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 7) {
                line2column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 8) {
                line2column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 9) {
                line2column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 10) {
                line2column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 11) {
                line2column6Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 12) {
                line3column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 13) {
                line3column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 14) {
                line3column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 15) {
                line3column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 16) {
                line3column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 17) {
                line3column6Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 18) {
                line4column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 19) {
                line4column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 20) {
                line4column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 21) {
                line4column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 22) {
                line4column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 23) {
                line4column6Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 24) {
                line5column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 25) {
                line5column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 26) {
                line5column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 27) {
                line5column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 28) {
                line5column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 29) {
                line5column6Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 30) {
                line6column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 31) {
                line6column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 32) {
                line6column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 33) {
                line6column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 34) {
                line6column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 35) {
                line6column6Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 36) {
                line7column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 37) {
                line7column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 38) {
                line7column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 39) {
                line7column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 40) {
                line7column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 41) {
                line7column6Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 42) {
                line8column1Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 43) {
                line8column2Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 44) {
                line8column3Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 45) {
                line8column4Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 46) {
                line8column5Hard.visibility = View.INVISIBLE
            } else if (clickedSecond == 47) {
                line8column6Hard.visibility = View.INVISIBLE
            }

        } else {
            line1column1Hard.setImageResource(R.drawable.background_cards)
            line1column2Hard.setImageResource(R.drawable.background_cards)
            line1column3Hard.setImageResource(R.drawable.background_cards)
            line1column4Hard.setImageResource(R.drawable.background_cards)
            line1column5Hard.setImageResource(R.drawable.background_cards)
            line1column6Hard.setImageResource(R.drawable.background_cards)

            line2column1Hard.setImageResource(R.drawable.background_cards)
            line2column2Hard.setImageResource(R.drawable.background_cards)
            line2column3Hard.setImageResource(R.drawable.background_cards)
            line2column4Hard.setImageResource(R.drawable.background_cards)
            line2column5Hard.setImageResource(R.drawable.background_cards)
            line2column6Hard.setImageResource(R.drawable.background_cards)

            line3column1Hard.setImageResource(R.drawable.background_cards)
            line3column2Hard.setImageResource(R.drawable.background_cards)
            line3column3Hard.setImageResource(R.drawable.background_cards)
            line3column4Hard.setImageResource(R.drawable.background_cards)
            line3column5Hard.setImageResource(R.drawable.background_cards)
            line3column6Hard.setImageResource(R.drawable.background_cards)

            line4column1Hard.setImageResource(R.drawable.background_cards)
            line4column2Hard.setImageResource(R.drawable.background_cards)
            line4column3Hard.setImageResource(R.drawable.background_cards)
            line4column4Hard.setImageResource(R.drawable.background_cards)
            line4column5Hard.setImageResource(R.drawable.background_cards)
            line4column6Hard.setImageResource(R.drawable.background_cards)

            line5column1Hard.setImageResource(R.drawable.background_cards)
            line5column2Hard.setImageResource(R.drawable.background_cards)
            line5column3Hard.setImageResource(R.drawable.background_cards)
            line5column4Hard.setImageResource(R.drawable.background_cards)
            line5column5Hard.setImageResource(R.drawable.background_cards)
            line5column6Hard.setImageResource(R.drawable.background_cards)

            line6column1Hard.setImageResource(R.drawable.background_cards)
            line6column2Hard.setImageResource(R.drawable.background_cards)
            line6column3Hard.setImageResource(R.drawable.background_cards)
            line6column4Hard.setImageResource(R.drawable.background_cards)
            line6column5Hard.setImageResource(R.drawable.background_cards)
            line6column6Hard.setImageResource(R.drawable.background_cards)

            line7column1Hard.setImageResource(R.drawable.background_cards)
            line7column2Hard.setImageResource(R.drawable.background_cards)
            line7column3Hard.setImageResource(R.drawable.background_cards)
            line7column4Hard.setImageResource(R.drawable.background_cards)
            line7column5Hard.setImageResource(R.drawable.background_cards)
            line7column6Hard.setImageResource(R.drawable.background_cards)

            line8column1Hard.setImageResource(R.drawable.background_cards)
            line8column2Hard.setImageResource(R.drawable.background_cards)
            line8column3Hard.setImageResource(R.drawable.background_cards)
            line8column4Hard.setImageResource(R.drawable.background_cards)
            line8column5Hard.setImageResource(R.drawable.background_cards)
            line8column6Hard.setImageResource(R.drawable.background_cards)

        }

        line1column1Hard.setEnabled(true)
        line1column2Hard.setEnabled(true)
        line1column3Hard.setEnabled(true)
        line1column4Hard.setEnabled(true)
        line1column5Hard.setEnabled(true)
        line1column6Hard.setEnabled(true)

        line2column1Hard.setEnabled(true)
        line2column2Hard.setEnabled(true)
        line2column3Hard.setEnabled(true)
        line2column4Hard.setEnabled(true)
        line2column5Hard.setEnabled(true)
        line2column6Hard.setEnabled(true)

        line3column1Hard.setEnabled(true)
        line3column2Hard.setEnabled(true)
        line3column3Hard.setEnabled(true)
        line3column4Hard.setEnabled(true)
        line3column5Hard.setEnabled(true)
        line3column6Hard.setEnabled(true)

        line4column1Hard.setEnabled(true)
        line4column2Hard.setEnabled(true)
        line4column3Hard.setEnabled(true)
        line4column4Hard.setEnabled(true)
        line4column5Hard.setEnabled(true)
        line4column6Hard.setEnabled(true)

        line5column1Hard.setEnabled(true)
        line5column2Hard.setEnabled(true)
        line5column3Hard.setEnabled(true)
        line5column4Hard.setEnabled(true)
        line5column5Hard.setEnabled(true)
        line5column6Hard.setEnabled(true)

        line6column1Hard.setEnabled(true)
        line6column2Hard.setEnabled(true)
        line6column3Hard.setEnabled(true)
        line6column4Hard.setEnabled(true)
        line6column5Hard.setEnabled(true)
        line6column6Hard.setEnabled(true)

        line7column1Hard.setEnabled(true)
        line7column2Hard.setEnabled(true)
        line7column3Hard.setEnabled(true)
        line7column4Hard.setEnabled(true)
        line7column5Hard.setEnabled(true)
        line7column6Hard.setEnabled(true)

        line8column1Hard.setEnabled(true)
        line8column2Hard.setEnabled(true)
        line8column3Hard.setEnabled(true)
        line8column4Hard.setEnabled(true)
        line8column5Hard.setEnabled(true)
        line8column6Hard.setEnabled(true)

        checkEnd()
    }

    private fun checkEnd() {
        if (line1column1Hard.visibility == View.INVISIBLE &&
            line1column2Hard.visibility == View.INVISIBLE &&
            line1column3Hard.visibility == View.INVISIBLE &&
            line1column4Hard.visibility == View.INVISIBLE &&
            line1column5Hard.visibility == View.INVISIBLE &&
            line1column6Hard.visibility == View.INVISIBLE &&

            line2column1Hard.visibility == View.INVISIBLE &&
            line2column2Hard.visibility == View.INVISIBLE &&
            line2column3Hard.visibility == View.INVISIBLE &&
            line2column4Hard.visibility == View.INVISIBLE &&
            line2column5Hard.visibility == View.INVISIBLE &&
            line2column6Hard.visibility == View.INVISIBLE &&

            line3column1Hard.visibility == View.INVISIBLE &&
            line3column2Hard.visibility == View.INVISIBLE &&
            line3column3Hard.visibility == View.INVISIBLE &&
            line3column4Hard.visibility == View.INVISIBLE &&
            line3column5Hard.visibility == View.INVISIBLE &&
            line3column6Hard.visibility == View.INVISIBLE &&

            line4column1Hard.visibility == View.INVISIBLE &&
            line4column2Hard.visibility == View.INVISIBLE &&
            line4column3Hard.visibility == View.INVISIBLE &&
            line4column4Hard.visibility == View.INVISIBLE &&
            line4column5Hard.visibility == View.INVISIBLE &&
            line4column6Hard.visibility == View.INVISIBLE &&

            line5column1Hard.visibility == View.INVISIBLE &&
            line5column2Hard.visibility == View.INVISIBLE &&
            line5column3Hard.visibility == View.INVISIBLE &&
            line5column4Hard.visibility == View.INVISIBLE &&
            line5column5Hard.visibility == View.INVISIBLE &&
            line5column6Hard.visibility == View.INVISIBLE &&

            line6column1Hard.visibility == View.INVISIBLE &&
            line6column2Hard.visibility == View.INVISIBLE &&
            line6column3Hard.visibility == View.INVISIBLE &&
            line6column4Hard.visibility == View.INVISIBLE &&
            line6column5Hard.visibility == View.INVISIBLE &&
            line6column6Hard.visibility == View.INVISIBLE &&

            line7column1Hard.visibility == View.INVISIBLE &&
            line7column2Hard.visibility == View.INVISIBLE &&
            line7column3Hard.visibility == View.INVISIBLE &&
            line7column4Hard.visibility == View.INVISIBLE &&
            line7column5Hard.visibility == View.INVISIBLE &&
            line7column6Hard.visibility == View.INVISIBLE &&

            line8column1Hard.visibility == View.INVISIBLE &&
            line8column2Hard.visibility == View.INVISIBLE &&
            line8column3Hard.visibility == View.INVISIBLE &&
            line8column4Hard.visibility == View.INVISIBLE &&
            line8column5Hard.visibility == View.INVISIBLE &&
            line8column6Hard.visibility == View.INVISIBLE ) {

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
        img101 = R.drawable.agender
        img102 = R.drawable.androgyne
        img103 = R.drawable.deminonbinary
        img104 = R.drawable.gender_neutral
        img105 = R.drawable.genderfluid
        img106 = R.drawable.genderqueer
        img107 = R.drawable.intergender
        img108 = R.drawable.kingender
        img109 = R.drawable.neurogender
        img110 = R.drawable.nonbinary
        img111 = R.drawable.nonbinary_boy
        img112 = R.drawable.nonbinary_girl
        img113 = R.drawable.trans_man
        img114 = R.drawable.trans_woman
        img115 = R.drawable.transneutral
        img116 = R.drawable.agender
        img117 = R.drawable.androgyne
        img118 = R.drawable.deminonbinary
        img119 = R.drawable.gender_neutral
        img120 = R.drawable.genderfluid
        img121 = R.drawable.genderqueer
        img122 = R.drawable.intergender
        img123 = R.drawable.kingender
        img124 = R.drawable.neurogender

        img201 = R.drawable.agender
        img202 = R.drawable.androgyne
        img203 = R.drawable.deminonbinary
        img204 = R.drawable.gender_neutral
        img205 = R.drawable.genderfluid
        img206 = R.drawable.genderqueer
        img207 = R.drawable.intergender
        img208 = R.drawable.kingender
        img209 = R.drawable.neurogender
        img210 = R.drawable.nonbinary
        img211 = R.drawable.nonbinary_boy
        img212 = R.drawable.nonbinary_girl
        img213 = R.drawable.trans_man
        img214 = R.drawable.trans_woman
        img215 = R.drawable.transneutral
        img216 = R.drawable.agender
        img217 = R.drawable.androgyne
        img218 = R.drawable.deminonbinary
        img219 = R.drawable.gender_neutral
        img220 = R.drawable.genderfluid
        img221 = R.drawable.genderqueer
        img222 = R.drawable.intergender
        img223 = R.drawable.kingender
        img224 = R.drawable.neurogender

    }

    private fun navigateToSelectLevel() {
        findNavController().navigate(R.id.action_hardGameFragment_to_selectLevelFragment)
    }

}