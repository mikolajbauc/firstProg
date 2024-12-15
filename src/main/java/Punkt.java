public class Punkt {

    int x = 100;
    int y = 12;

    /*int pobierzX() {
        return x;
    }

    int pobierzY() {
        return y;
    }

    void ustawX(int x) {
         this.x = x;
    }

    void ustawY(int y) {
         this.y = y;
    }*/

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void wyswietlWspolrzedne() {
        System.out.println("Wyswietlam x " + x);
        System.out.println("Wyswietlam y " + y);
    }

    static void metodaStatyczna() {
        System.out.println("Test metody statycznej");
    }

    static int poleStatyczne = 101;
}
