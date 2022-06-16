package com.team1.issuetracker.ui.main.label

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import com.team1.issuetracker.R
import com.team1.issuetracker.databinding.FragmentAddLabelBinding

class AddLabelFragment: Fragment() {

    private lateinit var binding: FragmentAddLabelBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddLabelBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.save_appbar_menu, menu)
        val spannable = SpannableString(menu.getItem(0).title)
        spannable.setSpan(ForegroundColorSpan(Color.WHITE), 0, spannable.length, 0)
        menu.getItem(0).title = spannable
        Log.d("TAG", "${menu.getItem(0).title}")
        super.onCreateOptionsMenu(menu, inflater)
    }
}