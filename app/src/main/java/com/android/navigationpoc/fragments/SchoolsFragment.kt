package com.android.navigationpoc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.navigationpoc.R
import kotlinx.android.synthetic.main.fragment_schools.*

class SchoolsFragment:Fragment() {

    private val title by lazy { arguments?.getString("title")?:"" }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_schools, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvSchoolTitle.text = title
    }
}