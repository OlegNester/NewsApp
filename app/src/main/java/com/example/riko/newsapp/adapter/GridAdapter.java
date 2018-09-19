package com.example.riko.newsapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.riko.newsapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ujang Wahyu on 24/01/2017.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem nama = new EndangeredItem();
        nama.setName("Coming of age in Lady Bird and American Graffiti");
        nama.setThumbnail(R.drawable.image1);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("22 female composers being championed at the Proms");
        nama.setThumbnail(R.drawable.image2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Six of the best:Amazing build-ings on RIBA Stirling Prize");
        nama.setThumbnail(R.drawable.image3);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Five musical postcard from your next holiday destination");
        nama.setThumbnail(R.drawable.image4);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Coming of age in Lady Bird and American Graffiti");
        nama.setThumbnail(R.drawable.image1);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Five musical postcard from your next holiday destination");
        nama.setThumbnail(R.drawable.image2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("22 female composers being championed at the Proms");
        nama.setThumbnail(R.drawable.image3);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Coming of age in Lady Bird and American Graffiti");
        nama.setThumbnail(R.drawable.image4);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("22 female composers being championed at the Proms");
        nama.setThumbnail(R.drawable.image1);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Five musical postcard from your next holiday destination");
        nama.setThumbnail(R.drawable.image2);
        mItems.add(nama);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
