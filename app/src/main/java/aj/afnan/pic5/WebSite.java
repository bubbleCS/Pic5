package aj.afnan.pic5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSite extends AppCompatActivity {

    private WebView WebSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_site);
        setTitle("موقع الويب");

        WebSite = (WebView) findViewById(R.id.webViewWebSite);
        WebSettings WebSettingsForWebSite= WebSite.getSettings();
        WebSettingsForWebSite.setJavaScriptEnabled(true);
        WebSite.loadUrl("http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/Pages/default.aspx");
        WebSite.setWebViewClient(new WebViewClient());

        WebSettingsForWebSite.setLoadWithOverviewMode(true);
        WebSettingsForWebSite.setUseWideViewPort(true);
        WebSettingsForWebSite.setBuiltInZoomControls(true);
        WebSettingsForWebSite.setDisplayZoomControls(false);
        WebSite.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    WebView webView = (WebView) v;

                    switch (keyCode) {
                        case KeyEvent.KEYCODE_BACK:
                            if (webView.canGoBack()) {
                                webView.goBack();
                                return true;
                            }
                            break;
                    }
                }

                return false;
            }
        });


    }
}
