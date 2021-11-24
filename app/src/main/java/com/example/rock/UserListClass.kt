package com.example.rock

sealed class UserListClass {

   open class UserApplication (
        open val firstUserName: String,
        open val secondUserName: String,
        open val cityUser: String
        ): UserListClass()
}