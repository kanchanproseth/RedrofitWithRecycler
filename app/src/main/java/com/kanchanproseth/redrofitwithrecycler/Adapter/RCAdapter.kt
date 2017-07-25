package com.kanchanproseth.redrofitwithrecycler.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kanchanproseth.redrofitwithrecycler.Data.GitHubRepo
import com.kanchanproseth.redrofitwithrecycler.R
import kotlinx.android.synthetic.main.row_layout.*

/**
 * Created by kanchanproseth on 7/25/17.
 */
// Provide a suitable constructor (depends on the kind of dataset)
class MyAdapter(private val values: List<GitHubRepo>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    inner class ViewHolder(var layout: View) : RecyclerView.ViewHolder(layout) {
        // each data item is just a string in this case

        var txtResponse: TextView = layout.findViewById(R.id.DataResponse)

    }

//    fun add(position: Int, item: String) {
//        values.add(position, item)
//        notifyItemInserted(position)
//    }
//
//    fun remove(position: Int) {
//        values.removeAt(position)
//        notifyItemRemoved(position)
//    }
    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.ViewHolder {
        // create a new view
        val inflater = LayoutInflater.from(

                parent.context)

        val v = inflater.inflate(R.layout.row_layout, parent, false)

        // set the view's size, margins, paddings and layout parameters

        val vh = ViewHolder(v)

        return vh
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val result = values[position]
        holder.txtResponse.text = result.toString()
//        holder.txtHeader.setOnClickListener { remove(position) }

//        holder.txtFooter.text = "Footer: " + name
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return values.size
    }

}