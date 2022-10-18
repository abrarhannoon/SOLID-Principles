package Implemintaion.devices;

import Interface.controller;

public class Monitor implements controller {

    public void turnOn(){
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void turnOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }

}
