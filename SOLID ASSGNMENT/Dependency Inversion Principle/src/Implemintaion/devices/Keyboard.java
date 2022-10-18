package Implemintaion.devices;

import Interface.controller;

public class Keyboard implements controller {
    public void turnOn(){
        System.out.println("Power on " + this.getClass().getName());
    }

    public void turnOff(){
        System.out.println("Power off " + this.getClass().getName());
    }
}
