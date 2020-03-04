package com.andrenas.applicationcarros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.andrenas.applicationcarros.R;
import com.andrenas.applicationcarros.constants.CarConstants;
import com.andrenas.applicationcarros.data.CarMock;
import com.andrenas.applicationcarros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        this.mCarMock = new CarMock(this);

        this.mViewHolder.imgCar = this.findViewById(R.id.img_car_picture);
        this.mViewHolder.txtModel = this.findViewById(R.id.txt_modelo);
        this.mViewHolder.txtManufacturer = this.findViewById(R.id.txt_manufacture);
        this.mViewHolder.txtHorsePower = this.findViewById(R.id.txt_horsePower);
        this.mViewHolder.txtPrice = this.findViewById(R.id.txt_price);

        this.getDataFromActivity();

        this.setData();

    }

    private void setData(){
        this.mViewHolder.imgCar.setImageDrawable(this.mCar.picture);
        this.mViewHolder.txtModel.setText(String.valueOf(this.mCar.model));
        this.mViewHolder.txtManufacturer.setText(this.mCar.Manufacture);
        this.mViewHolder.txtHorsePower.setText(String.valueOf(this.mCar.hoursePower));
        this.mViewHolder.txtPrice.setText(String.valueOf(this.mCar.price));
    }

    //esse metodo recebe a informacoes passadas pelo bundle da Main Activity
    private void getDataFromActivity(){

        Bundle extras = getIntent().getExtras();

        if (extras != null){
            this.mCar = this.mCarMock.get(extras.getInt(CarConstants.CARRO_ID));
        }
    }

    private static class ViewHolder{
        ImageView imgCar;
        TextView txtModel;
        TextView txtManufacturer;
        TextView txtHorsePower;
        TextView txtPrice;
    }

}
