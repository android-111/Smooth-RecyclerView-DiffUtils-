package com.example.smoothrecyclerview

import java.text.FieldPosition

interface UserItemCallback {
    fun onItemClick(usersModel: UsersModel, position: Int)
}