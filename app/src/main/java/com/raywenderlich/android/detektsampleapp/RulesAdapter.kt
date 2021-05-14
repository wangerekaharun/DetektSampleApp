package com.raywenderlich.android.detektsampleapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.android.detektsampleapp.databinding.RuleListItemBinding

typealias OnRuleClick = (RulesModel) -> Unit

class RulesAdapter(private val onRuleClick: OnRuleClick): ListAdapter<RulesModel, RulesAdapter.RulesViewHolder>(RulesDiffUtil) {

    class RulesViewHolder(private val binding: RuleListItemBinding, private val onRuleClick: OnRuleClick): RecyclerView.ViewHolder(binding.root){

        fun bind(rulesModel: RulesModel){
            binding.tvRuleTitle.text = rulesModel.name
            binding.tvRuleDesc.text = rulesModel.description
            binding.root.setOnClickListener {
                onRuleClick(rulesModel)
            }
        }
    }

    object RulesDiffUtil: DiffUtil.ItemCallback<RulesModel>(){
        override fun areItemsTheSame(oldItem: RulesModel, newItem: RulesModel): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: RulesModel, newItem: RulesModel): Boolean {
            return oldItem.name == newItem.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RulesViewHolder {
        return  RulesViewHolder(RuleListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent,false
            ),
            onRuleClick
        )
    }

    override fun onBindViewHolder(holder: RulesViewHolder, position: Int) {
       holder.bind(getItem(position))
    }

}