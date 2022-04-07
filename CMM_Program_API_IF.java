package com.company;

/**
 * "CoffeeIF" ... I think.
 *
 *
 */
public interface CMM_Program_API_IF {

    void makeCoffee();
    void setGrindingTime(int seconds);
    void setTemperature(int degrees);
    void holdTemperature(int seconds);
    void wait(int seconds);
    void setPowerLED(int num);
    void setTypeLED(int num);
    void displayPrice(CMM_Program_API_IF cf); // this part is what confused me, I think goes back to misconceptions about the abstract factory IFs from a previous lab.
}
