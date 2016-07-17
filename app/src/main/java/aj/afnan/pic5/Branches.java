package aj.afnan.pic5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Branches extends AppCompatActivity {
    private WebView Branches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);
        setTitle("الفروع");
       //-----------------------
        Branches = (WebView) findViewById(R.id.webViewBranches);
        WebSettings WebSettingsForBranches= Branches.getSettings();
        WebSettingsForBranches.setJavaScriptEnabled(true);
        Branches.loadUrl("http://www.tvtc.gov.sa/Arabic/Departments/Departments/pt/AboutDepartment/Pages/Outemployeetel.aspx");
        Branches.setWebViewClient(new WebViewClient());

       WebSettingsForBranches.setLoadWithOverviewMode(true);
      WebSettingsForBranches.setUseWideViewPort(true);
     // WebSettingsForBranches.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
     // Branches.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
      // Branches.setScrollbarFadingEnabled(true);
      // Branches.setInitialScale(1);
     //  WebSettingsForBranches.setDefaultZoom(WebSettings.ZoomDensity.FAR);
        //---------------------------
        WebSettingsForBranches.setBuiltInZoomControls(true);
        WebSettingsForBranches.setDisplayZoomControls(false);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(Branches.canGoBack()){
            Branches.goBack();

        }else
            super.onBackPressed();
    }
}
