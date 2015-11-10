package com.sendinfo.testvollery;

import com.sendinfo.javahttpservice.application.BaseUtilApplication;

/**
 * Created by Administrator on 2015/11/5.
 */
public class AppAplication extends BaseUtilApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        checkUpdate();
    }
}
