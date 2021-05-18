package com.raywenderlich.android.detektsampleapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_synthetic_rule.*

class SyntheticRuleActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_synthetic_rule)
        updateTextView()
    }

    private fun updateTextView(){
        tvSyntheticTest.text = applicationContext.getString(R.string.text_synthetic_import_desc)
    }
}