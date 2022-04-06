package com.company;

/**
 * "CoffeeIF"
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
    void displayPrice(CMM_Program_API_IF cf);
}
