package com.example.adapter;

import java.util.LinkedList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class GalleryAdapter extends BaseAdapter
{
	private Context context;
	private LinkedList<Bitmap> mBitmaps;
	
	public GalleryAdapter(Context context, LinkedList<Bitmap> mBitmaps) {
		// TODO Auto-generated constructor stub
		this.context=context;
		this.mBitmaps=mBitmaps;
	}
	
    @Override
    public int getCount()
    {
        return mBitmaps.size();
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (null == convertView)
        {
            convertView = new MyImageView(context);
            convertView.setLayoutParams(new Gallery.LayoutParams(mBitmaps.get(position).getWidth(), mBitmaps.get(position).getHeight()));
        }
        
        ImageView imageView = (ImageView)convertView;
        imageView.setImageBitmap(mBitmaps.get(position));
        imageView.setScaleType(ScaleType.FIT_XY);
        
        return imageView;
    }
}

 class MyImageView extends ImageView
{
    public MyImageView(Context context)
    {
        this(context, null);
    }
    
    public MyImageView(Context context, AttributeSet attrs)
    {
        super(context, attrs, 0);
    }
    
    public MyImageView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }
    
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }
    
}