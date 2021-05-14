package com.raywenderlich.android.detektsampleapp

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.raywenderlich.android.detektsampleapp.databinding.ActivityRulesWebViewBinding

class RulesWebViewActivity: AppCompatActivity() {
    private lateinit var binding: ActivityRulesWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRulesWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rulesUrl = intent.getStringExtra("rulesUrl")

        val webView: WebView = binding.webView
        rulesUrl?.let { webView.loadUrl(it) }
    }
}