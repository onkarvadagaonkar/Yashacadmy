package com.yasha.academy.utilities.serverutilities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;

import com.yasha.academy.utilities.DownloadUtility;


/**
 * Created by bt on 12/09/2016.
 */
public class AsyncUtilityWithNotify extends AsyncTask<Void,Void,String>
{
        DownloadUtility objDownloadUtility;
        ConnectServer connectServer;
        Context context;
        boolean isPost;
        int requestCode;
        String url,paylod;
        ProgressDialog pd;
        ResponseBody responseBody;
        boolean autoCanclable=true;

        public void setAutoCancleable(boolean autoCanclable)
        {
             this.autoCanclable=autoCanclable;
        }

       public AsyncUtilityWithNotify(Context context,boolean isPost,String url,String paylod,
        int requestCode,DownloadUtility objDownloadUtility)
        {
        this.context=context;
        this.url=url;
        this.isPost=isPost;
        this.paylod=paylod;
        connectServer=new ConnectServer();
        this.objDownloadUtility=objDownloadUtility;
        this.requestCode=requestCode;
        }

@Override
protected void onPreExecute() {
        super.onPreExecute();
        pd=new ProgressDialog(context);
        pd.setMessage("Loading...");
        pd.setCanceledOnTouchOutside(autoCanclable);

        pd.show();

        pd.setOnCancelListener(new DialogInterface.OnCancelListener() {
@Override
public void onCancel(DialogInterface dialog) {
        try {
            AsyncUtilityWithNotify.this.cancel(true);
        connectServer.closeConnection();
        }
        catch (Exception e){}
        }
        });
        }

@Override
protected String doInBackground(Void... params)
        {

        String str="";
        if(isPost)
        {
        try
        {
        responseBody= connectServer.performPostCallJson(url, paylod);
        // if(responseBody!=null)
        // str=responseBody.getResponseString();
        }
        catch (Exception e){}
        }
        else
        {
        try {
        responseBody= connectServer.getData(url);
        } catch (Exception e)
        {
        e.printStackTrace();
        }
        }
        return null;
        }

        @Override
        protected void onPostExecute(String s)
        {
        super.onPostExecute(s);
        pd.dismiss();
        objDownloadUtility.onComplete(responseBody.getResponseString(),requestCode,responseBody.responseCode);
        }
}
