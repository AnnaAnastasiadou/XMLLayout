package com.example.xmllayout.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.xmllayout.model.User
import androidx.recyclerview.widget.RecyclerView
import com.example.xmllayout.R

class UserAdapter(private val userList: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameText: TextView = itemView.findViewById(R.id.name)
        val emailText: TextView = itemView.findViewById(R.id.email)
    }

    // creation of a row
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        // inflate: turn into a kotlin object you can interact with
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    // put real data into the views
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentUser = userList[position]
        holder.nameText.text = currentUser.name
        holder.emailText.text = currentUser.email
    }

    // return the size of the user list
    override fun getItemCount(): Int {
        return userList.size
    }

}