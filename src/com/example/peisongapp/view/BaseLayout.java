package com.example.peisongapp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.peisongapp.R;
import com.example.peisongapp.utils.StringUtils;

public class BaseLayout extends RelativeLayout {

	private static final int HEADER = 1;
	private static final int PROGRESS = 2;
	private static final int HEADERANDPROGRESS = 3;
	private static final int SEARCH = 4;
	private static final int HEADERANDREFRESH = 5;
	private static final int HEADERONLYREFRESH = 6;
	private static final int HEADERONLY = 7;
	private Context mContext;
	public Button btn_back, btn_right2, btn_right1;
	private TextView tv_header;
	private View ll_header_right, header_bar,header_only;


	public View progressbg;
	public PageLoadingView plv_loading;
	public TextView tv_load_error, tv_city_header, tv_des1, tv_des2;


	public BaseLayout(Context context, int layoutResourceId, int type) {
		super(context);
		mContext = context;
		LayoutInflater layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		switch (type) {
		case PROGRESS:
			//setProgressBg(layoutInflater);// 
											// 在进入页面的饿时候进行一个
											// 预加载的动画效果
			break;
		case HEADER:
			

			break;
		case SEARCH:
			// setSearchBar(layoutInflater);
			break;
		case HEADERANDPROGRESS:
		
			break;
		case HEADERANDREFRESH:
			setHeaderBarWithRe(layoutInflater);

			break;
		case HEADERONLY:
			setHeaderBarOnly(layoutInflater);

			break;
		case HEADERONLYREFRESH:
			setHeaderBarWithRe(layoutInflater);

			break;
		}

		View view = layoutInflater.inflate(layoutResourceId, null);
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);

		if (header_only != null) {
			params.addRule(RelativeLayout.BELOW, R.id.header_only);
		} else {
			params.addRule(RelativeLayout.BELOW, R.id.header_bar);
		}
		addView(view, params);

	}
	
	
	
	protected void setHeaderBarOnly(LayoutInflater layoutInflater) {
		header_only = layoutInflater.inflate(R.layout.header_only, null);
		tv_header = (TextView) header_only.findViewById(R.id.tv_header);
		
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		addView(header_only, params);
	}
	protected void setHeaderBarWithRe(LayoutInflater layoutInflater) {
		header_bar = layoutInflater.inflate(R.layout.header_bar, null);
		tv_header = (TextView) header_bar.findViewById(R.id.tv_header);
		
	
		
		btn_right2 = (Button) header_bar.findViewById(R.id.btn_right2);

		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		addView(header_bar, params);
	}





	public void setTitleAndButton(String title, String btn_text) {
		setTitleAndButton(title, btn_text, "");
	}

	public void setTitleAndButton(String title, String btn_text,
			String btn_text1) {
		if (!StringUtils.isNullOrEmpty(title)) {
			tv_header.setVisibility(View.VISIBLE);
			tv_header.setText(title);
		} else {
			tv_header.setVisibility(View.GONE);
		}
		if (StringUtils.isNullOrEmpty(btn_text)
				&& StringUtils.isNullOrEmpty(btn_text1)) {
			ll_header_right.setVisibility(View.INVISIBLE);
			btn_right1.setVisibility(View.VISIBLE);
		} else {
			ll_header_right.setVisibility(View.VISIBLE);
			if (!StringUtils.isNullOrEmpty(btn_text)) {
				btn_right1.setVisibility(View.VISIBLE);
				btn_right2.setVisibility(View.GONE);
				btn_right1.setText(btn_text);
			}
			if (!StringUtils.isNullOrEmpty(btn_text1)) {
				btn_right2.setVisibility(View.VISIBLE);
				btn_right2.setText(btn_text1);
			}
		}
	}

	public void setTitleAndButton(String title) {
		tv_header.setText(title);
	}
}
