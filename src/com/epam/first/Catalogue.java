package com.epam.first;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    public static void main(String[] args) {
        List<Car> carList=new ArrayList<>();
        Car mers = new S600("Sedan", 6000, "Black");
        Car toyota = new Camry("Sedan", 3500, "White");
        Car honda = new CivicH("Hatchback", 1600, "Green");
        //System.out.println(mers);
        mers.move();

       // System.out.println(honda);
        honda.move();

        //System.out.println(toyota);
        toyota.move();

        tellAboutMe(mers);
        tellAboutMe(honda);
        tellAboutMe(toyota);
        System.out.println("===============");
        ((Camry) toyota).setColor("Blue");
        tellAboutMe(toyota);
        System.out.println("===============");
        carList.add(mers);
        carList.add(honda);
        carList.add(toyota);
        System.out.println("Get information using List");
        for (Car car :carList) {
            System.out.println(car);

        }
        


    }
    public static void tellAboutMe(Car car){
        System.out.println(car);
    }
}
