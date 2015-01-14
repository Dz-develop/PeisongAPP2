package com.example.peisongapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.peisongapp.base.BaseActivity;
import com.example.peisongapp.countfragment.CountFragment;
import com.example.peisongapp.countfragment.Loginfragment;
import com.example.peisongapp.countfragment.MyCountinFragment;
import com.example.peisongapp.view.BaseLayout;

public class CountActivity extends BaseActivity {
	public  static int has_login = 0;

	FragmentManager fm = null;
	FragmentTransaction transaction = null;
	BaseLayout baseLayout=null;
	
	public CountActivity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setView(R.layout.count, HEADERONLYREFRESH, "登陆");

		fm = getFragmentManager();
		baseLayout=getBaseLayout();
		
	
		switchFragment();
		

		
	}
	
	

	public void switchFragment(){
	
		transaction = fm.beginTransaction();
		if (has_login == 0) {

			Loginfragment lofragment = new Loginfragment();

			transaction.replace(R.id.fragment, lofragment, "lofragment");
			baseLayout.setTitleAndButton("登录");
			baseLayout.btn_right2.setVisibility(View.GONE);
		
		}
		if (has_login == 1) {
			MyCountinFragment myfragment = new MyCountinFragment();
			baseLayout.setTitleAndButton("我的账户");
			baseLayout.btn_right2.setVisibility(View.VISIBLE);
			transaction.replace(R.id.fragment, myfragment, "myfragment");
		}
		if (has_login == 2) {
			baseLayout.setTitleAndButton("账号信息");
			CountFragment cfragment = new CountFragment();
			baseLayout.btn_right2.setVisibility(View.GONE);
			transaction.replace(R.id.fragment, cfragment, "cfragment");
		}
		
		transaction.commit();
		
	}

}
	
	
	
	
