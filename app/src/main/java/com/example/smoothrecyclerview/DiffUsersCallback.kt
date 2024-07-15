package com.example.smoothrecyclerview

import androidx.recyclerview.widget.DiffUtil

object DiffUsersCallback : DiffUtil.ItemCallback<UsersModel>() {
    override fun areItemsTheSame(oldItem: UsersModel, newItem: UsersModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: UsersModel, newItem: UsersModel): Boolean {
        return oldItem.name == newItem.name &&
                oldItem.age == newItem.age &&
                oldItem.contact == newItem.contact &&
                oldItem.img == newItem.img
    }
}