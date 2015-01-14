package com.example.peisongapp;



import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TabHost;

public class TabMenu extends TabActivity {

	public TabMenu() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	  super.onCreate(savedInstanceState);
	  // 去除标题
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  
	  setContentView(R.layout.maintab_activity);
	  TabHost myTabhost = this.getTabHost();
		//get Tabhost
	//	LayoutInflater.from(this).inflate(R.layout.main,myTabhost.getTabContentView(), true);
		myTabhost.setBackgroundColor(Color.argb(150, 22, 70, 150));
		
		myTabhost
				.addTab(myTabhost.newTabSpec("One")// make a new Tab
						.setIndicator("新订单",
								getResources().getDrawable(R.drawable.abroad_icon))
						// set the Title and Icon
						.setContent(new Intent(TabMenu.this, NeworderActivity.class)));
		// set the layout

		myTabhost
				.addTab(myTabhost.newTabSpec("Two")// make a new Tab
						.setIndicator("已处理订单",
								getResources().getDrawable(R.drawable.about_logo))
						// set the Title and Icon
						.setContent(new Intent(TabMenu.this,MyActivity.class)));
		// set the layout

		myTabhost
				.addTab(myTabhost.newTabSpec("Three")// make a new Tab
						.setIndicator("我的",
								getResources().getDrawable(R.drawable.about_logo))
						// set the Title and Icon
						.setContent(new Intent(TabMenu.this, CountActivity.class)));
	
	}

}
