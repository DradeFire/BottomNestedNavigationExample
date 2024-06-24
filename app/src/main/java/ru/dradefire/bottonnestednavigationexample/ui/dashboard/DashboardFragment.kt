package ru.dradefire.bottonnestednavigationexample.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ru.dradefire.bottonnestednavigationexample.R
import ru.dradefire.bottonnestednavigationexample.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        view.findViewById<Button>(R.id.bt_dash).setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_dashboardFragment2)
        }

        return view
    }
}