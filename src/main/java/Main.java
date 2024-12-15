import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
       /* byte value1 = -128;
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
        }*/

        /*for (int i = 0; i < 256; i++) {
            char znak = (char) i;
            System.out.println(i + " = " + znak);
        }

        int speed = 0;

        if (speed >= 1 && speed < 10) {
            System.out.println("Info");
        } else if (speed >= 10) {
            System.out.println("Warning");
        }*/

        /*int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};

        for (int i = 0; i <=9; i++) {
            System.out.println(array[i]);
        }*/

        /*int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }*/

        /*int[] newArray = new int[10];
        for (int i = 0; i <= 9; i++) {
            newArray[i] = i + 21;
            System.out.println(newArray[i]);
        }

        String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        for (int i =0; i < days.length; i++) {
            System.out.println(days[i]);
        }*/

        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Dla i =  " + i + ", j = " + j);
                System.out.println("A zatem " + i + " * " + j + " to " + i*j);
            }
        }*/

        /*char operacja = '*';
        int a = 3, b = 9;
        switch (operacja) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Błędny znak lub wartość");
        }*/

        /*Punkt p1 = new Punkt();
        int poleXObiektuP1 = p1.pobierzX();
        int poleYObiektuP1 = p1.pobierzY();

        System.out.println(poleXObiektuP1);
        System.out.println(poleYObiektuP1);


        Punkt p2 = new Punkt();


    *//*p1.wyswietlWspolrzedne();
    p2.wyswietlWspolrzedne();*//*


        p1.ustawX(5);
        System.out.println(p1.pobierzX());
        p1.ustawY(18);
        System.out.println(p1.pobierzY());
*/
        /*Car notAudi = new Car();
        notAudi.setIlosc_drzwi(5);
        System.out.println(notAudi.getIlosc_drzwi());

        notAudi.setModel("notA4");
        System.out.println(notAudi.getModel());

        notAudi.setRok_produkcji(2020);
        System.out.println(notAudi.getRok_produkcji());

        notAudi.setV_max(300);
        System.out.println(notAudi.getV_max());

        notAudi.rusz();
        notAudi.zatrzymajSie();*/

        Punkt.metodaStatyczna();
        System.out.println(Punkt.poleStatyczne);


        Punkt3D punkt3D = new Punkt3D();
        punkt3D.z = 2;
        punkt3D.x = 3;
        punkt3D.y = 5;
        System.out.println(punkt3D.z);
        System.out.println(punkt3D.x);
        System.out.println(punkt3D.y);


      OverridenMethods om1 = new OverridenMethods();

        System.out.println(om1.dodawaj(3, 7, 7, 8));
    }
}
