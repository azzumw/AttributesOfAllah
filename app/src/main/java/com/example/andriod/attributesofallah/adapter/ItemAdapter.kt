package com.example.andriod.attributesofallah.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.andriod.attributesofallah.NameListFragmentDirections
import com.example.andriod.attributesofallah.R
import com.example.andriod.attributesofallah.data.DataSource

class ItemAdapter(private val context: Context) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private val myData = DataSource().loadAttributes()
    private val numbers = (1..myData.size).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayoutInflater = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item,
            parent,
            false
        )

        return ItemViewHolder(adapterLayoutInflater)
    }

    override fun getItemCount(): Int {

        return myData.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = myData[position]

        holder.englishTextView.text = context.getString(item.english)
        holder.transliterationtextView.text = context.getString(item.transliteration)
        holder.arabictextView.text = context.getString(item.arabic)
        holder.numberText.text = numbers[position].toString()

        holder.itemView.setOnClickListener {
            val action = NameListFragmentDirections.actionNameListFragmentToNameDetailFragment(item,context.getString(item.english))
            holder.itemView.findNavController().navigate(action)
        }

        holder.itemView.setOnLongClickListener {

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND_MULTIPLE
                putExtra(
                    Intent.EXTRA_TEXT,
                    "${context.getString(item.arabic)}\n ${context.getString(item.transliteration)}\n${
                        context.getString(
                            item.english
                        )
                    }"
                )

                // (Optional) Here we're setting the title of the content
                putExtra(
                    Intent.EXTRA_TITLE,
                    "Sharing Name of Allah: ${context.getString(item.transliteration)}"
                )

                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Share")
            startActivity(context, shareIntent, null)

            true
        }

    }

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val englishTextView: TextView = view.findViewById(R.id.englishtextView)
        val transliterationtextView: TextView = view.findViewById(R.id.translitration)
        val arabictextView: TextView = view.findViewById(R.id.arabictextView)
        val numberText: TextView = view.findViewById(R.id.numberTextView)

    }
}


