package com.example.imageconverflowtomirs;

import java.util.LinkedList;

import com.example.adapter.GalleryAdapter;
import com.example.view.GalleryFlow;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	private GalleryFlow mCoverFlowView;
	private GalleryAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mCoverFlowView = (GalleryFlow) this.findViewById(R.id.coverflow);

		LinkedList<Bitmap> bmList = new LinkedList<Bitmap>();

		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
				R.drawable.a1);
		bmList.add(bitmap);
		Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),
				R.drawable.a2);
		bmList.add(bitmap1);
		Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),
				R.drawable.a3);
		bmList.add(bitmap2);
		Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(),
				R.drawable.a4);
		bmList.add(bitmap3);
		Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(),
				R.drawable.a5);
		bmList.add(bitmap4);
		Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(),
				R.drawable.a6);
		bmList.add(bitmap5);
		Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(),
				R.drawable.a7);
		bmList.add(bitmap6);
		//设置缩放值  最大为120 最小为-120
		mCoverFlowView.setMaxZoom(120);
		//设置角度 最大为60 最小为-60
		mCoverFlowView.setMaxRotationAngle(60);
		//设置间距 最大为60 最小为-60
		mCoverFlowView.setSpacing(-20);
		adapter = new GalleryAdapter(this, bmList);
		mCoverFlowView.setAdapter(adapter);
	}

}
