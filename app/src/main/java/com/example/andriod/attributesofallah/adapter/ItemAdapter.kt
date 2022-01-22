package com.example.andriod.attributesofallah.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.andriod.attributesofallah.R
import com.example.andriod.attributesofallah.data.DataSource

class ItemAdapter(private val context: Context): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

//     private val  context = context

    private val mainRecipeCustomOnClickHandler: MainRecipeCustomOnClickHandler? = null

    interface MainRecipeCustomOnClickHandler {
        fun onClickHandler()
    }


    val myData = DataSource().loadAttributes(context)
    val numbers = (1..myData.size).toList()

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
        holder.englishTextView.text = item.english
        holder.transliterationtextView.text = item.transliteration
        holder.arabictextView.text = item.arabic
        holder.numberText.text = numbers[position].toString()
        holder.itemView.setOnClickListener {

        }
        holder.itemView.setOnLongClickListener {

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND_MULTIPLE
                putExtra(
                    Intent.EXTRA_TEXT,
                    "${item.arabic}\n ${item.transliteration}\n${item.english}"
                )

                // (Optional) Here we're setting the title of the content
                putExtra(Intent.EXTRA_TITLE, "Sharing Name of Allah: ${item.transliteration}")

                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "NO")
            startActivity(context, shareIntent, null)

            true
        }

    }

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view),View.OnClickListener {
        val englishTextView :TextView= view.findViewById(R.id.englishtextView)
        val transliterationtextView: TextView = view.findViewById(R.id.translitration)
        val arabictextView: TextView = view.findViewById(R.id.arabictextView)
        val numberText : TextView = view.findViewById(R.id.numberTextView)

        override fun onClick(p0: View?) {

        }
    }
}


