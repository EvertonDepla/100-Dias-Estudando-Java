package edu.everton.dia68;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criação de um HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Alice", 30);
        hashMap.put("Everton", 25);
        hashMap.put("Paulo", 35);

        System.out.println("HashMap: " + hashMap);

        int age = hashMap.get("Alice");
        System.out.println("Idade da Alice: " + age);

        if (hashMap.containsKey("Everton")) {
            System.out.println("Everton está no HashMap");
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        hashMap.remove("Paulo");
        System.out.println("HashMap após remover Paulo: " + hashMap);
    }
}