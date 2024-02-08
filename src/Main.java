import cz.engeto.ja.Computer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        Computer computer1 = new Computer("Dell", 2019, 15000);
        Computer computer2 = new Computer("HP", 2018, 12000);
        Computer computer3 = new Computer("Lenovo", 2017, 10000);

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        for (Computer computer : computers) {
            System.out.println(computer.getDescription() + " " + computer.getYearOfProduction() + " " + computer.getPrice());
        }

        computers.sort(Comparator.comparing(Computer::getYearOfProduction).reversed());

        System.out.println("\nSorted by year of production:\n");
        computers.forEach(System.out::println);
//        for (Computer computer : computers) {
//            System.out.println(computer);
//        }

        // Obecnější pro jakoukoli kolekci: Collections.sort(computers, Comparator.comparing(Computer::getPrice));
        computers.sort(Comparator.comparing(Computer::getPrice));

        System.out.println("\nSorted by price from lowest:\n");
        computers.forEach(System.out::println);
    }
}