package edu.everton.dia65;

import java.util.ArrayList;

import java.util.*;

public class Main {
    

    public static void main(String[] args) {
        
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Audi"));
        listCarros.add(new Carro("Gol"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford")));

        System.out.println(listCarros.get(2));
        System.out.println(listCarros.indexOf(new Carro("Gol")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}
