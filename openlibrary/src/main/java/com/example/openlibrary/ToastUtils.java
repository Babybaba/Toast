package com.example.openlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    private static boolean type=true;

    public static void setType(boolean type) {
        ToastUtils.type = type;
    }

    public static void Toast(Context context, String msg){
        if (type){
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }

    }



}
