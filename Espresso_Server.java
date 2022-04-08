package com.company;

/**
 * A concrete "loadable class" coffee making program
 */
public class Espresso_Server extends AbstractCMM_LoadableServer implements CMM_Program_API_IF{
    private String name = "Espresso program";
    private int typeLED = 0;
    private int powerLED = 0;

    public void makeCoffee() {

    }


    @Override
    public void setGrindingTime(int seconds) {
        System.out.println("Grinding for " + seconds + "...\n");
    }

    @Override
    public void setTemperature(int degrees) {
        System.out.println("Setting temperature to " + degrees + "F ...\n");
    }

    @Override
    public void holdTemperature(int seconds) {
        System.out.println("Holding temperature for " + seconds + " seconds...\n");
    }

    @Override
    public void wait(int seconds) {
        System.out.println("waiting for " + seconds + "seconds...");
    }

    @Override
    public void setPowerLED(int num) {
        if(num == 1){
            powerLED = 1;
        }
        else if(num == 0){
            powerLED = 0;
        }
        else{
            System.out.println("internal LED error");
            System.exit(0);
        }
    }

    @Override
    public void setTypeLED(int num) {
        switch(num){
            case 1:
                typeLED = 1; // regular
                break;
            case 2:
                typeLED = 2; // mocha
                break;

            case 3:
                typeLED = 3; // latte
                break;

            case 4:
                typeLED = 4; // espresso
                break;

            case 5:
                typeLED = 5; // capp
                break;
        }
    }

    @Override
    public void displayPrice(CMM_Program_API_IF cf) {

    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void start() {

    }
}
