package com.andrenas.applicationcarros.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.andrenas.applicationcarros.R;
import com.andrenas.applicationcarros.adapter.CarListAdapter;
import com.andrenas.applicationcarros.constants.CarConstants;
import com.andrenas.applicationcarros.data.CarMock;
import com.andrenas.applicationcarros.entities.Car;
import com.andrenas.applicationcarros.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Trocando o Icone da Aplicacao
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        this.mContext = this;

        CarMock carMock = new CarMock(this);
        List<Car> carList = new ArrayList<>(carMock.ListCar());



        //1 - Obter a Recycler Vieew
        this.mViewHolder.recyclerCars = this.findViewById(R.id.recyclerCars);

        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {
                //
                Bundle bundle = new Bundle();
                bundle.putInt(CarConstants.CARRO_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        };




        //2 - Definir Adapter
        CarListAdapter mCarListAdapter = new CarListAdapter(carList, listener);
        this.mViewHolder.recyclerCars.setAdapter(mCarListAdapter);

        //3 - Definir um Layout
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(mLinearLayoutManager);
    }

    private static class ViewHolder {
        RecyclerView recyclerCars;
    }

}
