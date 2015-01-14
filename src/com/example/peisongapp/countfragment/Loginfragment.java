package com.example.peisongapp.countfragment;

import com.example.peisongapp.CountActivity;
import com.example.peisongapp.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Loginfragment extends Fragment {

	public Loginfragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.login_activity, null);

		Button button = (Button) view.findViewById(R.id.bt_login);
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				CountActivity.has_login = 1;
				CountActivity cn = (CountActivity) getActivity();
				cn.switchFragment();

			}
		});
		return view;
	}

}
