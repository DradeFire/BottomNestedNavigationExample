package ru.dradefire.bottonnestednavigationexample.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.dradefire.bottonnestednavigationexample.R
import ru.dradefire.bottonnestednavigationexample.databinding.FragmentDashboard2Binding

class DashboardFragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard2, container, false)
    }
}