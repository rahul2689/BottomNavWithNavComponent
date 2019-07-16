package com.android.navigationpoc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.navigationpoc.R
import com.android.navigationpoc.constants.AppConstants
import kotlinx.android.synthetic.main.fragment_profile_details.*

class ProfileDetailsFragment : Fragment() {

    private val title by lazy(LazyThreadSafetyMode.NONE) {
        arguments?.getString(AppConstants.TITLE) ?: ""
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvProfileTitle.text = title
    }
}