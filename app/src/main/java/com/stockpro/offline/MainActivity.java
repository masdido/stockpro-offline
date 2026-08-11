package com.stockpro.offline;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        WebView w=findViewById(R.id.webview);
        w.setWebViewClient(new WebViewClient());
        WebSettings s=w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setAllowFileAccess(true);
        w.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() {
        WebView w=findViewById(R.id.webview);
        if(w.canGoBack()) w.goBack(); else super.onBackPressed();
    }
}
