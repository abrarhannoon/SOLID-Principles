package Implement;

import Interface.Flayable;

public class Eagle  extends Bird implements Flayable {


    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
        System.out.println(currentLocation);
    }


}
