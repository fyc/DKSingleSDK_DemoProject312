package com.duoku.platform.demo.single;

import com.duoku.platform.single.DKPlatform;

import android.app.Application;

public class DemoApplication extends Application {

    @Override
	public void onCreate() {
		super.onCreate();
		 //百度账号
		DKPlatform.getInstance().invokeBDInitApplication(this);
	}
}