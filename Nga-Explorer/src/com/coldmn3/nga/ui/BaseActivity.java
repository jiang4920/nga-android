package com.coldmn3.nga.ui;

import android.app.Activity;
import android.os.Bundle;

import com.coldmn3.nga.app.AppManager;

/**
 * 应用程序Activity的基类
 * 
 * @author session
 */
public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 添加Activity到堆栈
		AppManager.getAppManager().addActivity(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		// 结束Activity&从堆栈中移除
		AppManager.getAppManager().finishActivity(this);
	}

}
