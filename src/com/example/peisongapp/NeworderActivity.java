package com.example.peisongapp;

import android.os.Bundle;

import com.example.peisongapp.base.BaseActivity;

public class NeworderActivity extends BaseActivity {


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setView(R.layout.new_order_activity, HEADERONLYREFRESH,"新订单");
	}
}
