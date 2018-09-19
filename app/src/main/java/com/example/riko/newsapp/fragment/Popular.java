package com.example.riko.newsapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.MenuAdapter;
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
public class Popular extends Fragment {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    public Popular() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_popular, container, false);
            mRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
            mRecyclerView.setHasFixedSize(true);

            mLayoutManager = new GridLayoutManager(getActivity(), 2);
            mRecyclerView.setLayoutManager(mLayoutManager);

            mAdapter = new GridAdapter();
            mRecyclerView.setAdapter(mAdapter);

        return view;
    }

}
