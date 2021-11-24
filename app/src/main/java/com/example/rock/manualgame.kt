package com.example.rock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


class manualgame : AppCompatActivity() {
    private lateinit var bottomMenu: BottomNavigationView
    lateinit var recyclerViewUnit: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manualgame)

        bottomMenu = findViewById(R.id.bottom_menu)
        bottomMenu.setOnItemSelectedListener {item ->
            when(item.itemId) {
                R.id.about_creator -> {
                    val fragmentAboutCreator = AboutCreator ()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container_for_menu, fragmentAboutCreator)
                        .commit()
                }
                R.id.user_list_menu -> {
                    val fragmentUserListMenu = UserList ()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container_for_menu, fragmentUserListMenu)
                        .commit()
                }


            }


            false
        }

        val userListInfo: List<UserListClass> = listOf(
            UserListClass.UserApplication("Марина", "Петрова", "г.Владимир"),
            UserListClass.UserApplication("Евгений", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Ирина", "Иванова", "г.Барнаул"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Ярославль"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Москва"),
            UserListClass.UserApplication("Татьяна", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Марина", "Иванова", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Барнаул"),
            UserListClass.UserApplication("Татьяна", "Иванова", "г.Ярославль"),
            UserListClass.UserApplication("Ирина", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Константин", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Барнаул"),
            UserListClass.UserApplication("Марина", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Татьяна", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Владимир"),
            UserListClass.UserApplication("Ирина", "Петрова", "г.Барнаул"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Ярославль"),
            UserListClass.UserApplication("Марина", "Петрова", "г.Владимир"),
            UserListClass.UserApplication("Евгений", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Ирина", "Иванова", "г.Барнаул"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Ярославль"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Москва"),
            UserListClass.UserApplication("Татьяна", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Марина", "Иванова", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Барнаул"),
            UserListClass.UserApplication("Татьяна", "Иванова", "г.Ярославль"),
            UserListClass.UserApplication("Ирина", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Константин", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Барнаул"),
            UserListClass.UserApplication("Марина", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Татьяна", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Владимир"),
            UserListClass.UserApplication("Ирина", "Петрова", "г.Барнаул"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Ярославль"),
            UserListClass.UserApplication("Марина", "Петрова", "г.Владимир"),
            UserListClass.UserApplication("Евгений", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Ирина", "Иванова", "г.Барнаул"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Ярославль"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Москва"),
            UserListClass.UserApplication("Татьяна", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Марина", "Иванова", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Барнаул"),
            UserListClass.UserApplication("Татьяна", "Иванова", "г.Ярославль"),
            UserListClass.UserApplication("Ирина", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Константин", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Барнаул"),
            UserListClass.UserApplication("Марина", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Татьяна", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Владимир"),
            UserListClass.UserApplication("Ирина", "Петрова", "г.Барнаул"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Ярославль"),
            UserListClass.UserApplication("Марина", "Петрова", "г.Владимир"),
            UserListClass.UserApplication("Евгений", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Ирина", "Иванова", "г.Барнаул"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Ярославль"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Москва"),
            UserListClass.UserApplication("Татьяна", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Марина", "Иванова", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Константин", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Барнаул"),
            UserListClass.UserApplication("Татьяна", "Иванова", "г.Ярославль"),
            UserListClass.UserApplication("Ирина", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Константин", "Сидоров", "г.Владимир"),
            UserListClass.UserApplication("Иван", "Абаджева", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Барнаул"),
            UserListClass.UserApplication("Марина", "Петрова", "г.Ростов-на-Дону"),
            UserListClass.UserApplication("Татьяна", "Абаджева", "г.Санкт-Петербург"),
            UserListClass.UserApplication("Иван", "Сидоров", "г.Москва"),
            UserListClass.UserApplication("Евгений", "Иванов", "г.Владимир"),
            UserListClass.UserApplication("Ирина", "Петрова", "г.Барнаул"),
            UserListClass.UserApplication("Евгений", "Абаджева", "г.Ярославль")
        )

        recyclerViewUnit = findViewById(R.id.recycler_view_user_list)
        recyclerViewUnit.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewUnit.adapter = UserListAdapter(userListInfo)

        val backbutton: Button = findViewById(R.id.backbutton)
        val intentback = Intent(this, MainActivity::class.java)
        backbutton.setOnClickListener{
            startActivity(intentback)
        }
    }
}