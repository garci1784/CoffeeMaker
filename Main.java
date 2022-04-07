package com.company;

/**
 * Main Driver for CMM Lab Assignment
 *
 */
public class Main {


    public static void main(String[] args) {


	// write your code here
        System.out.println("The main is running...");

        //TODO: implement main menu for program selection, OR test all coffee servers sequentially

        // testing out program selection
        CMMOperatingSystem InstanceOS = new CMMOperatingSystem();


        InstanceOS.run("coffee");
    }
}
