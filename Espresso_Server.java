package com.company;

/**
 * A concrete coffee making program
 */
public class Espresso_Server extends CMM_LoadableServer implements CMM_Program_API_IF{
    private String name = "Espresso program";

    @Override
    public void makeCoffee() {

    }

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

    @Override
    void setEnvironment(CMM_Program_API_IF cf) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void start() {

    }
}
