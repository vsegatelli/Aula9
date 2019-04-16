package br.com.digitalhouse;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa ("Tairo ", "Roberto ", 30);
        Pessoa jessica = new Pessoa ("Jessica ", "Milena ", 18);
        Pessoa vini = new Pessoa ("Vini ", "PHP ", 35);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(vini);

        //for (Pessoa pessoa : pessoas) {
           // System.out.println("Nome: " + pessoa.getNome() + "Sobrenome: " + pessoa.getSobrenome());
        //}

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(jessica);
        pessoaSet.add(vini);
        pessoaSet.add(vini);
        pessoaSet.add(vini);

        /*for (Pessoa pessoa : pessoaSet) {
            System.out.println("Nome: " + pessoa.getNome() + "Sobrenome: " + pessoa.getSobrenome());
        }*/

        Map<String, Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("Tairo", tairo);
        pessoaMap.put("Jessica", jessica);
        pessoaMap.put("Vini", vini);

        for (String chave: pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() + "Sobrenome: " + pessoaMap.get(chave).getSobrenome());

        }

        Map<Integer, String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "Ovos ");
        loteriaDosSonhos.put(1, "Agua ");
        loteriaDosSonhos.put(2, "Escopeta ");
        loteriaDosSonhos.put(3, "Cavalo ");
        loteriaDosSonhos.put(4, "Dentista ");
        loteriaDosSonhos.put(5, "Fogo ");

        for(int chave : loteriaDosSonhos.keySet()){
            System.out.println("Valor da loteria: " + loteriaDosSonhos.get(chave));
        }



    }
    }

