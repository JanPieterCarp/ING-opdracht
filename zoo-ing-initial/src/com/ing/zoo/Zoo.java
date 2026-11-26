package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        String[] commands = new String[4];
            commands[0] = "hello";
            commands[1] = "give leaves";
            commands[2] = "give meat";
            commands[3] = "perform trick";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        String[] splitInput = input.split("\\s+");


        // Eerste stap herken het command en gebaseerd op het eerste onderdeel spreek de correcte functie aan.
        try {
            if(splitInput[0].equals(commands[0]))
            {
                helloCommand();
            }
            else if(splitInput[1].equals(commands[1]))
            {
                feedLeaves();
            }
            else if(splitInput[2].equals(commands[2]))
            {
                feedMeat();
            }
            else if(splitInput[3].equals(commands[3]))
            {
                askForTrick();
            }
        } finally {
            scanner.close();
        }


    }

// Tijdelijke versie van de uitvoering, deze moeten later worden vervangen door de juiste methodes van de dieren
    public static void helloCommand()
    {
        System.out.println("Hello command executed");
    }
    public static void feedLeaves()
    {
        System.out.println("Feeding leaves");
    }
    public static void feedMeat()
    {
        System.out.println("Feeding meat");
    }
    public static void askForTrick()
    {
        System.out.println("Performing trick");
    }


}
