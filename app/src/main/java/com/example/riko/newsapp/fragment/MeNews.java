package com.example.riko.newsapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.riko.newsapp.R;
import com.example.riko.newsapp.adapter.GridAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MeNews extends Fragment {

    private FragmentTabHost mTabhost;

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    public MeNews() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_me_news, container , false);

        mTabhost = (FragmentTabHost)view.findViewById(android.R.id.tabhost);
        mTabhost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);
        mTabhost.addTab(mTabhost.newTabSpec("ByTopic").setIndicator("By Topic"), TopStories.class, null);
        mTabhost.addTab(mTabhost.newTabSpec("ByTime").setIndicator("By Time"), Popular.class, null);

        mRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new GridAdapter();
        mRecyclerView.setAdapter(mAdapter);

        return view;

    }

}
