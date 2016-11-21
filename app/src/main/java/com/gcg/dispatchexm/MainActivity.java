package com.gcg.dispatchexm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gcg.dispatchexm.ui.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView,mRecyclerView2,mRecyclerView3;
    private String a[]=new  String[]{"1","2","3","4","5","6","7","8","9","10","A","B","C","D","E","F","G","H","I","J"};

    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView= (RecyclerView) findViewById(R.id.rl);
        mRecyclerView2= (RecyclerView) findViewById(R.id.rl2);
        mRecyclerView3= (RecyclerView) findViewById(R.id.rl3);

        mAdapter=new MyAdapter(a,this);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView2.setAdapter(mAdapter);
        mRecyclerView3.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView3.setAdapter(mAdapter);


    }
}
