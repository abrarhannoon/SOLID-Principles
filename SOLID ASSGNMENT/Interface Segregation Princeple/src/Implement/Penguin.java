package Implement;

import Interface.Swimable;

public class Penguin extends Bird implements Swimable {


    public Penguin(int initialFeatherCount) {
    this.numberOfFeathers = initialFeatherCount;
    }


    @Override
    public void swim() {
        this.currentLocation = "in the water";
        System.out.println(currentLocation);
    }

}
