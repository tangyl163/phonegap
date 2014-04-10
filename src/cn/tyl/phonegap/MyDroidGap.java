package cn.tyl.phonegap;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MyDroidGap extends DroidGap
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		loadUrl("file:///android_asset/www/index.html");
	}

}
