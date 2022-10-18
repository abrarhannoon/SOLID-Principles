package Implement;

import Interface.Flayable;
import Interface.Swimable;

public class Bird {
    String currentLocation;
    int numberOfFeathers;
    private Flayable flayable;
    private Swimable swimable;


    public Flayable getFlayable() {
        return flayable;
    }

    public void setFlayable(Flayable flayable) {
        this.flayable = flayable;
    }

    public Swimable getSwimable() {
        return swimable;
    }

    public void setSwimable(Swimable swimable) {
        this.swimable = swimable;
    }
    //end


    public void molt() {
        this.numberOfFeathers -= 1;
    }
    public void swim(){
        swimable.swim();
    }
    public void flay(){
        flayable.fly();
    }
}
