package com.mmm.toastutils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by tekabo
 * Created on 2020/4/29
 * PackageName com.mmm.toastutils
 */
public class ToastUtils {
    public static void shoowToast(Context context,String str){
        Toast.makeText(context,str,Toast.LENGTH_LONG).show();
    }

}
