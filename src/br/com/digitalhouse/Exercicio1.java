package br.com.digitalhouse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio1 {
    public static void main(String[] args) {

        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

        apelidos.put("joao" , apelidosJoao);
        apelidos.put("miguel", apelidosMiguel);
        apelidos.put("maria",  apelidosMaria);
        apelidos.put("lucas", apelidosLucas);

        for (String chave : apelidos.keySet()){
            System.out.println("Apelidos do: " + chave);
            for (String apelido : apelidos.get(chave)){
                System.out.println("\t" + apelido);
            }
        }

    }
}
