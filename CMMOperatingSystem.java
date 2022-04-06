package com.company;

import javax.net.ssl.SNIServerName;
import java.net.URLClassLoader;

/**
 * The versatile Coffee Making Machine(CMM) Class.
 *
 * Implementation Details:
 * When the CMM is powered on, its menu allows a user to select one from a list of 5 coffee maker programs that make
 * Regular, Mocha, Latte, Espresso, and Cappuccino coffees, respectively.
 *
 * Each coffee maker program (say, RegularProgram) has a makeCoffee() method that produces a cup of coffee of that type when it runs to completion.
 *
 * The makeCoffee() method has to call the built-in functionalities of CMM in an appropriate order (some examples shown below).
 * Due to memory constraints, at any time only one coffee program can be loaded into the run-time memory from an external flash memory.
 *
 * The CMM has an LED display with two digits:
 * The first digit is either 0 running or 1 not running.
 * The second digit is from 1 to 5, indicating the currently chosen coffee program.
 */
public class CMMOperatingSystem implements CMM_Program_API_IF, Runnable{ // Use interface?


    /**
     * Produces a cup of coffee of the specified type when it runs to completion.
     */
    @Override
    public void setGrindingTime(int seconds) {
            System.out.println("Running CMM make coffee method");
    }

    @Override
    public void makeCoffee() {

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

    /**
     * ...Using classloader to link objects dynamically.
     *
     */
    @Override
    public void run() {
//        ClassLoader cloader = new URLClassLoader(pathURL);
//        Class c = cloader.load(serverName);
//        currentCMMProgram = ()

    }
}
