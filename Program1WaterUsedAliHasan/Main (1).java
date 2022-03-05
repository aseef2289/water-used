/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 5, 2021
* Description:
* This is a program that calculate how much water is needed to create any number of computer/monitor combos
* Display total water used in tons
*/

import java.util.Scanner; //used for input

class Main {
  public static void main(String[] args) {
    //declare variables and constants
    Scanner typedInput = new Scanner(System.in); //scanner object needed for keyboard input
    int comboNumber; //to store user's number of computer/monitor combos
    double waterUsed; //to store the calculated amount of water used
    String finalStatement; //to store the final statement the user will receive
    final double WATER_RATE = 1.5; //to store water rate constant

    //data input
    System.out.print("How many computer/monitor combos are being manufactured? "); //ask amount of user's combos
    comboNumber = typedInput.nextInt(); //get user's input
    
    //data processing
    waterUsed = comboNumber * WATER_RATE; //calculates the amount of water used

    //display processed data to user
    //prepare final statement 
    finalStatement = "The total water used in manufacturing " + comboNumber + " combos is " + waterUsed + " tons"; //+ concentrates the text and double value
    System.out.println(finalStatement); //display final statement to user
    typedInput.close(); //close scanner object

  }
}