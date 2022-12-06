package main.java.wSwiecieKoduXMasChallenge;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.random.RandomGenerator;

public class Day2 {

    /**
     * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii.
     * Zamiast zastanawiać się, komu jaki prezent dostarczyć postanowił skorzystać z programu.
     * Pomoż Mikołajowi!
     * Przygotuj kod, który z listy dostępnych prezentów wylosuje 3 prezenty i wypisze na ekranie.
     * Odpal program kilka razy - sprawdź, czy na pewno losuje za kazdym razem inne prezenty!
     * Wylosowane prezenty wypisz na ekranie. Zadbaj o to, żeby wylosowane prezenty były unikalne.
     */

    static final int GIFTS_NUMER = 3;

    public static void main(String[] args) {

        List<String> ideas = List.of(
                "Perfume", "Socks", "Sweater", "Cup",
                "Hat", "Tea", "Coffee", "Clock", "Bag",
                "Book", "Wallet", "Cream", "Earrings");

        RandomGenerator generator = RandomGenerator.getDefault();
        Set<Integer> generatedNumbers = new HashSet<>();

        while (generatedNumbers.size() != GIFTS_NUMER){
            generatedNumbers.add(generator.nextInt(ideas.size()));
        }

        for (Integer generatedGiftIndex: generatedNumbers) {
            System.out.println(ideas.get(generatedGiftIndex));
        }
    }
}
