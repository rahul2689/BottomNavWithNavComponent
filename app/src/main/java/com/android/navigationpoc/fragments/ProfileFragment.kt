package com.android.navigationpoc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.navigationpoc.R
import com.android.navigationpoc.constants.AppConstants
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    private val title by lazy { arguments?.getString(AppConstants.TITLE) ?: "" }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvProfileTitle.text = title
        btnUserDetails.setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.openNotificationDetailsAction)
        }
    }
}