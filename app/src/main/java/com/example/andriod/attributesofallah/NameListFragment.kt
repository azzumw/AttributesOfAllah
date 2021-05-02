package com.example.andriod.attributesofallah

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.andriod.attributesofallah.adapter.ItemAdapter
import com.example.andriod.attributesofallah.databinding.FragmentNameListBinding


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class NameListFragment : Fragment() {
    //step 1 - implement view binding. Get a nullable reference to Fragment
    /*
  * Why make it nullable? Because you can't inflate the layout until onCreateView() is called.
  * */
    private var _binding : FragmentNameListBinding? = null

    //Here, get() means this property is "get-only". That means you can get the value,
    // but once assigned (as it is here), you can't assign it to something else.

    private val binding get() = _binding!!

    //Step 3
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*Report that this fragment would like to participate in populating the options menu by
        receiving a call to onCreateOptionsMenu(Menu, MenuInflater) and related methods.
        */
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //Step 2:
        _binding = FragmentNameListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this.requireContext())

        recyclerView.addItemDecoration(
            DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //Step 4: reset the _binding property to null, as the view no longer exists.
        _binding = null
    }
}