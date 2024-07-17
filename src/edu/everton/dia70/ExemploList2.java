package edu.everton.dia70;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList2 {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menos nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas " + (soma/notas.size()));

        System.out.println("Remova a nota 0: " );
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: " );
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
          Double next = iterator1.next();
          if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}