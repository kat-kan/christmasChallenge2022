package main.java.wSwiecieKoduXMasChallenge;

public class Day3 {

    /**
     * Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie choinkę.
     * Jeżeli potrafisz, nie wpisuj drzewka bezposrednio w printy - pokombinuj z pętlami.
     * Przygotuj funkcję przyjmującą wysokość choinki i wypisującą choinkę na ekranie.
     * Tak, żeby choinka wygenerowała się sama! Choinka może być po prostu trójkątem, albo być żłożona z kilku warstw. :)
     */

    public static void main(String[] args) {

        int height = 10;
        generateXMasTree(height);
    }

    static void generateXMasTree(int height) {
        String sprigPattern = "*";
        String decorationPattern = "~";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                if (k % 3 == 0) {
                    System.out.print(decorationPattern);
                } else {
                    System.out.print(sprigPattern);
                }
            }
            System.out.println();
        }

    }
}


