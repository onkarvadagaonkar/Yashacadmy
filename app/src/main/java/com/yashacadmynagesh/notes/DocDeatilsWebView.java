package com.yashacadmynagesh.notes;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yashacadmynagesh.R;

public class DocDeatilsWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_doc_deatils_web_view);

                getSupportActionBar().setHomeButtonEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setTitle("Doc Notes");



        WebView urlWebView = (WebView)findViewById(R.id.webView);
       // urlWebView.setWebViewClient(new AppWebViewClients());
        urlWebView.getSettings().setJavaScriptEnabled(true);
        urlWebView.getSettings().setUseWideViewPort(true);
        urlWebView.loadUrl("http://docs.google.com/gview?embedded=true&url=http://galaxy.biyanitechnologies.com/InstituteData/1153/AssignmentsFormate/1616ramrakhsa.pdf");
       urlWebView.setWebViewClient(new WEBCLIENT("http://docs.google.com/gview?embedded=true&url=http://galaxy.biyanitechnologies.com/InstituteData/1153/AssignmentsFormate/1616ramrakhsa.pdf"));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }



    boolean loadingFinished,redirect;
    class WEBCLIENT extends WebViewClient {
        String ur;
        ProgressDialog pd = new ProgressDialog(DocDeatilsWebView.this);

        public WEBCLIENT(String ur) {
            // TODO Auto-generated constructor stub

            pd.setMessage("Loading");
            pd.show();
            this.ur = ur;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String urlNewString) {
            if (!loadingFinished) {
                redirect = true;
            }

            loadingFinished = false;
            view.loadUrl(urlNewString);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap facIcon) {
            loadingFinished = false;
            //SHOW LOADING IF IT ISNT ALREADY VISIBLE
            if (!pd.isShowing())
                pd.show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {

            if (!redirect) {
                loadingFinished = true;
            }

            if (loadingFinished && !redirect) {
                //HIDE LOADING IT HAS FINISHED

                storeToDB(ur);
                pd.dismiss();

            } else {
                redirect = false;
            }

        }

        private void storeToDB(String ur2) {
            // TODO Auto-generated method stub
            try {

            } catch (Exception e) {
            }
        }

    }
}
