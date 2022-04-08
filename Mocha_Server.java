package com.company;

/**
 * A concrete "loadable class" coffee making program
 */
public class Mocha_Server extends AbstractCMM_LoadableServer implements CMM_Program_API_IF{
    private String name = "Mocha program";
    private int typeLED = 0;
    private int powerLED = 0;
    private int grindTime;
    private int temp;
    private int holdTime;


    @Override
    public void makeCoffee() {
        /*
        1.	Indicate the machine as running and display the purchased type of coffee to LED.
        2.	Grind coffee beans for 5 seconds.
        3.	Heat up the water to 200 degree F and hold the temperature for 5 seconds.
        4.	Add cream and vanilla once.
        5.	After 15 seconds, set the LED to indicate the machine is not running.
        */
        setPowerLED(1);
        setGrindingTime(5);
        setTemperature(200);
        wait(15);
        System.out.println("Done. going into low power mode\n");
        setPowerLED(0);
    }


    @Override
    public void setGrindingTime(int seconds) {
        System.out.println("Grinding for " + seconds + "seconds...\n");
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
        System.out.println("waiting for " + seconds + "seconds...\n");
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
        System.out.println("Brewing Mocha coffee...\n");
        makeCoffee();
    }
}
