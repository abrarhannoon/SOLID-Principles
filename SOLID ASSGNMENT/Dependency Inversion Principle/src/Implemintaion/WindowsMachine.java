package Implemintaion;

import Implemintaion.devices.Keyboard;
import Implemintaion.devices.Monitor;
import Interface.controller;


public class WindowsMachine {
    private final controller keyboard;
    private final controller Monitor;

    public WindowsMachine(){
        keyboard=new Keyboard();
        Monitor=new Monitor();
    }

    public controller getKeyboard() {
        return keyboard;
    }

    public controller getMonitor() {
        return Monitor;
    }


    public void changDeviceStatus(controller device, boolean status){
        if (status){
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    }




