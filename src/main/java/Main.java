import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        byte value1 = -128;
        System.out.println("Current value is " + value1);

        int myValue;                //deklaracja
        myValue = 1500;             //inicjacja
        int myValue2 = 1500;        //definicja

        byte myValue3 = (byte) 129;
        System.out.println("Casted value is " + myValue3);

        int valueToCheck = 300;

        if(valueToCheck <= 127) {
            System.out.println("The number type is byte");
        } else {
            System.out.println("The number type is integer");
            System.out.println("Additional line");
        }

        // Sting someText = "Anything you want to type";
        char justOneChar = 'a';

        String checkColour = "Fuck";

        if(checkColour == "Red") {
            System.out.println("Stój!");
        } else if (checkColour == "Green") {
            System.out.println("Jedź!");
        } else {
            System.out.println("Nieokreslony sygnał");
        }

        int newVariable = 10;
        System.out.println("Output is " + newVariable);
        newVariable = newVariable +1;
        System.out.println("New output is " + newVariable);
        newVariable++;
        System.out.println("New output is " + newVariable);
        newVariable +=1;
        System.out.println("New output is " + newVariable);
        newVariable +=10;
        System.out.println("New output is " + newVariable);


        for (int counter = 0; counter <= 10; counter++) {
            System.out.println(counter
            );
        }




        int zmiennaGlobalna = 90;
        while(zmiennaGlobalna > 0) {
            zmiennaGlobalna--;
        }

        int numberToCheck = 11;

        if(numberToCheck % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }

        boolean sygnalizacja = true;
        boolean zapory = true;

        if (zapory || sygnalizacja) {
            System.out.println("Można jechać");
        } else {
            System.out.println("Nie wolno jechać");
        }

    }
}
