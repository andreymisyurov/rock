package com.example.rock

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserListAdapter(private val userlist: List<UserListClass>) : RecyclerView.Adapter<UserListHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return UserListHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserListHolder, position: Int) {
        val userName = userlist[position]
        holder.bind(userName as UserListClass.UserApplication)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }
}