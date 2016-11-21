package com.gcg.dispatchexm.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gcg.dispatchexm.R;

/**
 * Created by imSunLight on 2016/10/21.
 */
public class MyAdapter  extends RecyclerView.Adapter {
    private String[] a;
    private LayoutInflater mInflater;
    private Context mContext;

    public MyAdapter(String[] a, Context context) {
        this.a=a;
        mContext = context;
        mInflater=LayoutInflater.from(mContext);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=mInflater.inflate(R.layout.item,parent,false);
        return new ItemHolder(view);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof  ItemHolder){

            ((ItemHolder) holder).mTextView.setText(a[position]);
        }
    }
    @Override
    public int getItemCount() {
        return a.length;
    }

    public  class ItemHolder extends  RecyclerView.ViewHolder{

        private TextView mTextView;

        public ItemHolder(View itemView) {
            super(itemView);
            mTextView= (TextView) itemView.findViewById(R.id.tv);
        }
    }

}
