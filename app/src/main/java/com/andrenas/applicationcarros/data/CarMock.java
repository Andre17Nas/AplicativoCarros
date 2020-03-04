package com.andrenas.applicationcarros.data;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

import com.andrenas.applicationcarros.R;
import com.andrenas.applicationcarros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mListCars;

    public CarMock(Activity activity){
        this.mListCars = getCarMockList(activity);

    }

    public List<Car> ListCar(){
        return this.mListCars;
    }

    public Car get(int id){
        return this.mListCars.get(id);
    }

    public List<Car> getCarMockList(Activity activity){

        List<Car> mCarMockList = new ArrayList<>();
        int id = 0;
        Car audir8 = new Car(id, "Audir8", "Audi", 610, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.audir8));
        Car bugattichiron = new Car(++id, "bugattichiron Chiron", "bugattichiron", 1520, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.bugattichiron));
        Car civictyper = new Car(++id, "civic typer R", "civic", 310, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.civictyper));
        Car corolla = new Car(++id, "corolla", "Toyota", 144, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.corolla));
        Car ferrari458 = new Car(++id, "Ferrari 458", "ferrari", 670, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.ferrari458));

        Car ferrarif60america = new Car(++id, "Ferrarif 60 america", "ferrari", 610, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.ferrarif60america));
        Car jaguarftype = new Car(++id, "Audir8", "Audi", 610, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.jaguarftype));
        Car jeeprenegade = new Car(++id, "Jeep Renegade", "Jeep", 610, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.jeeprenegade));
        Car lamborghiniaventador = new Car(++id, "lamborghiniaventador", "lamborghini", 610, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.lamborghiniaventador));
        Car mclarenmp412c = new Car(++id, "Mc Laren mp-412c", "mclaren", 610, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.mclarenmp412c));

        Car mustang = new Car(++id, "Mustang", "mustang", 533, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.mustang));
        Car porsche911 = new Car(++id, "porsche911", "porsche", 435, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.porsche911));
        Car rangerover = new Car(++id, "Range Rover Evoque", "Range Rover", 285, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.rangerover));
        Car vanquish = new Car(++id, "vanquish", "Aston Martin", 573, Double.valueOf(152999), ContextCompat.getDrawable(activity, R.drawable.vanquish));

        mCarMockList.add(audir8);
        mCarMockList.add(bugattichiron);
        mCarMockList.add(civictyper);
        mCarMockList.add(corolla);
        mCarMockList.add(ferrari458);
        mCarMockList.add(ferrarif60america);
        mCarMockList.add(jaguarftype);
        mCarMockList.add(jeeprenegade);
        mCarMockList.add(lamborghiniaventador);
        mCarMockList.add(mclarenmp412c);
        mCarMockList.add(mustang);
        mCarMockList.add(porsche911);
        mCarMockList.add(rangerover);
        mCarMockList.add(vanquish);

        return mCarMockList;

    }

}
