package com.company;

/**
 * A concrete "loadable class" coffee making program
 */
public class Coffee_Server extends AbstractCMM_LoadableServer{
    private String name = "Coffee program";

    public void makeCoffee() {
       /*
        1.	Indicate the machine as running and display the purchased type of coffee to LED.
        2.	Grind coffee beans for 8 seconds.
        3.	Heat up the water to 150 degree F and hold the temperature for 2 seconds.
        4.	After 15 seconds, set the LED to indicate the machine is not running.
        */
    }

    /*
    @Override
    public void setGrindingTime(int seconds) {

    }

    @Override
    public void setTemperature(int degrees) {

    }

    @Override
    public void holdTemperature(int seconds) {

    }

    @Override
    public void wait(int seconds) {

    }

    @Override
    public void setPowerLED(int num) {

    }

    @Override
    public void setTypeLED(int num) {

    }

    @Override
    public void displayPrice(CMM_Program_API_IF cf) {

    }
    */

    @Override
    public void setEnvironment(CMM_Program_API_IF cf) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void start() {

    }


}
