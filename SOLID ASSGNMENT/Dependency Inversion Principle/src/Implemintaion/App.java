package Implemintaion;

import Implemintaion.devices.Keyboard;
import Implemintaion.devices.Monitor;

public class App {
    public static void main(String[] args) {
        WindowsMachine windowsMachine=new WindowsMachine();

        windowsMachine.changDeviceStatus(windowsMachine.getKeyboard(), true);
        windowsMachine.changDeviceStatus(windowsMachine.getMonitor(),false);



    }


}
