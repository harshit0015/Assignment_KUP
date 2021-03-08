package com.knoldus.learning.solid;

public class Vehicle {
    public void startEngine(){

    }

    public static void main(String [] a){
        Vehicle ob=new Vehicle();
        System.out.println("Vehicle class called");
        ob.startEngine();
    }
}
class Car extends EngineVehicle{

}

class BiCycle extends NonEngineVehicle implements BicycleInterface {
    @Override
    public void startEngine() throws Exception {
        throw new Exception("Start Engine not supported");
    }
}
