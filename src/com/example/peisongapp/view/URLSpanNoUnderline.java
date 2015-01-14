package com.example.peisongapp.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public class URLSpanNoUnderline extends URLSpan {
	private Context mContext;

	public URLSpanNoUnderline(String p_Url, Context context) {
		super(p_Url);
		mContext = context;
	}

	public void updateDrawState(TextPaint p_DrawState) {
		super.updateDrawState(p_DrawState);
		p_DrawState.setUnderlineText(false);
	}

	@Override
	public String getURL() {
		// TODO Auto-generated method stub
		return super.getURL();
	}

	@Override
	public void onClick(View widget) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(mContext, Object.class);
		intent.putExtra("url", getURL());
		mContext.startActivity(intent);
	}

}
