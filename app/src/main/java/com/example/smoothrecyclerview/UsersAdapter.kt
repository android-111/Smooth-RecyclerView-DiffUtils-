package com.example.smoothrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smoothrecyclerview.databinding.UserRvDesignBinding

class UsersAdapter(private val callback: UserItemCallback, private val context: Context) : ListAdapter<UsersModel, UsersAdapter.UserViewHolder>(DiffUsersCallback) {


    class UserViewHolder(private var binding: UserRvDesignBinding, callback: UserItemCallback):RecyclerView.ViewHolder(binding.root){
        fun setData(usersModel: UsersModel){
            binding.apply {
                id.text = usersModel.id.toString()
                name.text = usersModel.name
                age.text = usersModel.age
                contact.text = usersModel.contact
                Glide.with(itemView.context).load(usersModel.img).into(imageView);

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = UserRvDesignBinding.inflate(LayoutInflater.from(context),parent,false)
        return UserViewHolder(view,callback)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.setData(currentItem)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}
