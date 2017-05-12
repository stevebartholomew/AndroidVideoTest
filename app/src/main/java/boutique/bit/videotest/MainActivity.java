package boutique.bit.videotest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final WebView webView = (WebView)
            findViewById(R.id.webview);

    webView.setWebChromeClient(new VideoTestChromeClient(this, webView));

    webView.loadUrl("file:///android_asset/index.html");
  }
}
