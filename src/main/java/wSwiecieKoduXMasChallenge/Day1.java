package main.java.wSwiecieKoduXMasChallenge;

import java.awt.*;

public class Day1 {

    /**
     * Wyzwanie Świąteczne @wswieciekodu
     * Dzień 1
     * * Mikołaj musi odwiedzić 3 miasta o współrzędnych (1,1), (4,5), (11,5) w podanej kolejności.
     * Startuje z punktu 1,1 spod stacji paliw
     * Na 10 jednostek odległości jego sanie zużywają 20 litrów magicznego paliwa.
     * Ile paliwa potrzebuje na całą trasę? Do policzenia przygotuj odpowiedni kod.
     * Obliczony wynik wypisz na ekranie.
     *
     * Oblicz w kodzie dystans miedzy miastami, a nastepnie policz niezbedną ilosc paliwa.
     * Do obliczenia dystansu przygotuj odpowiednią funkcję.
     * Do obliczeń matematycznych użyj funkcji z biblioteki Twojego jezyka.
     */
    static final double PETROL_PER_UNIT = 2;

    public static void main(String[] args) {

        Point firstCity = new Point(1,1);
        Point secondCity = new Point(4,5);
        Point thirdCity = new Point(11,5);

        double neededPetrol = PETROL_PER_UNIT * (distanceBetweenPoints(firstCity, secondCity) + distanceBetweenPoints(secondCity, thirdCity));
        System.out.println(neededPetrol);

    }

    protected static double distanceBetweenPoints(Point A, Point B){
        return Math.sqrt(Math.pow((B.getX() - A.getX()), 2)+Math.pow((B.getY() - A.getY()), 2));
    }
}
