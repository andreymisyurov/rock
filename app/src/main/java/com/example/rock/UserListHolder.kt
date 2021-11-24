package com.example.rock

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    fun bind(userName: UserListClass.UserApplication) {
        val nameUserFirst: TextView = itemView.findViewById(R.id.name_user_first)
        val nameUserSecond: TextView = itemView.findViewById(R.id.name_user_second)
        val cityUser: TextView = itemView.findViewById(R.id.city_user)
        nameUserFirst.text = userName.firstUserName
        nameUserSecond.text = userName.secondUserName
        cityUser.text = userName.cityUser

    }


}