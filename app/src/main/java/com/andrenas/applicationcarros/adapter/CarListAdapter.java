package com.andrenas.applicationcarros.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andrenas.applicationcarros.R;
import com.andrenas.applicationcarros.entities.Car;
import com.andrenas.applicationcarros.listener.OnListClickInteractionListener;
import com.andrenas.applicationcarros.viewholder.CarViewHolder;

import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<Car> mListCar;
    private OnListClickInteractionListener mOnListClickInteractionListener;

    public CarListAdapter(List<Car> cars, OnListClickInteractionListener listener){
        this.mListCar = cars;
        this.mOnListClickInteractionListener = listener;
    }


    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //instanceia row_car_list e infla o layout
        Context mContext = viewGroup.getContext();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View carView = inflater.inflate(R.layout.row_car_list, viewGroup, false);

        return  new CarViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder carViewHolder, int i) {
        // é chamado toda vez que uma linha é inserida no layout
        Car car = this.mListCar.get(i);
        carViewHolder.bindData(car, this.mOnListClickInteractionListener);
    }

    @Override
    public int getItemCount() {
        return this.mListCar.size();
    }
}
