package com.yasha.academy.utilities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import java.io.File;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by bt18 on 08/08/2016.
 */
public class CommonUtilities
{
    public final static String URL="http://192.168.73.128/parkermobile/";

   //   public final static String URL= "http://biyanitechnologies.com/parkerservices/";

    public static int Height=700;
    public static int Width=525;


    public final static String RESPONCE_OK="Success";

    public static long getCurrentTime()
    {
        Calendar calendar=Calendar.getInstance();
        return calendar.getTimeInMillis();
    }


    public static void setHeightWidth(int val)
    {
            Height= (int) (val*8.7);
            Width= (int) (val*6.5);
    }

    public static long parseDate(String strDate)
    {
        try {

            return Long.valueOf(strDate.replace("/Date(", "").replace(")/", ""));
        }
        catch (Exception e)
        {

        }
        return 0;
    }

    public static void hideatInItInputBoard(Activity context)
    {
        context.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public static void hideSoftKeyBord(Activity context) {
        InputMethodManager inputManager = (InputMethodManager)
                context.getSystemService(Context.INPUT_METHOD_SERVICE);

        // check if no view has focus:
        View v = context.getCurrentFocus();
        if (v == null)
            return;


        inputManager.hideSoftInputFromWindow(v.getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }

    public static String getPath(Context context, Uri uri) throws URISyntaxException
    {
        if ("content".equalsIgnoreCase(uri.getScheme()))
        {
            String[] projection = { "_data" };
            Cursor cursor = null;
            try
            {
                cursor = context.getContentResolver().query(uri, projection, null, null, null);
                int column_index = cursor.getColumnIndexOrThrow("_data");
                if (cursor.moveToFirst()) {
                    return cursor.getString(column_index);
                }
            } catch (Exception e) {
                // Eat it
            }
        }
        else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }

        return null;
    }


    public static void alert(Context context,String str)
    {
        AlertDialog.Builder al=new AlertDialog.Builder(context);
        al.setMessage(str);
        al.setPositiveButton("Ok ",null);
        al.show();
    }


    public static void printLog(String str)
    {
        Log.d("perror", str);
    }



    public static String longToDate(long orderDate)
    {
        Date date=new Date(orderDate);

        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        return f.format(date);
    }

    public static long getMillisecond(String dateInString)
    {
        try
        {
            //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            //
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            dateInString=dateInString.replace("-", ".");
            dateInString=dateInString+" 0:0:1";
            //String dateInString = "22-01-2015 10:20:56";
            Date date = sdf.parse(dateInString.trim());

            System.out.println(dateInString.trim());
            System.out.println("Date - Time in milliseconds : " + date.getTime());

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println("Calender - Time in milliseconds : " + calendar.getTimeInMillis());

            return  calendar.getTimeInMillis();
        }
        catch(Exception e)
        {
            Log.d(e.toString(), e.getMessage());
        }
        return 0;
    }



    public  static void  openPdf(Context context,String path)
    {
        try
        {
            File file = new File(path);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            context.startActivity(intent);
        }
        catch (Exception e)
        {

        }
    }

    public static  boolean emailWithAttachement(Context context, String emailaddress,
                                                String message,String subject,String filepath)
    {


        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        //Intent.Extra_e
        emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{ emailaddress});
        emailIntent.putExtra(Intent.EXTRA_TEXT, message);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.setType("application/image");
        //  emailIntent.setType(Intent.EXTRA_STREAM);

        Uri uri = Uri.parse("file://" + filepath);
        emailIntent.putExtra(Intent.EXTRA_STREAM, uri);
        context.startActivity(emailIntent);

        return true;
    }
}
