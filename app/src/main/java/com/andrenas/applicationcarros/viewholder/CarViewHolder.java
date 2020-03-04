package com.andrenas.applicationcarros.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.andrenas.applicationcarros.R;
import com.andrenas.applicationcarros.entities.Car;
import com.andrenas.applicationcarros.listener.OnListClickInteractionListener;

public class CarViewHolder extends RecyclerView.ViewHolder {

    // chama os elementos de interface
    private ImageView mImageCar;
    private TextView mTextModel;
    private TextView mTextDetails;
    private OnListClickInteractionListener listener;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageCar = itemView.findViewById(R.id.img_car_pic);
        this.mTextModel = itemView.findViewById(R.id.txt_modelo);
        this.mTextDetails = itemView.findViewById(R.id.txt_details);

    }

    public void bindData(final Car car, final OnListClickInteractionListener listener){
        this.mImageCar.setImageDrawable(car.picture);
        this.mTextModel.setText(car.model);

        this.mTextDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                listener.onClick(car.id);
            }
        });
    }

}
