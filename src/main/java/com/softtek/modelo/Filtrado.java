package com.softtek.modelo;

import java.util.ArrayList;
import java.util.function.Function;

public class Filtrado {
    private void filtro() {
        Function<ArrayList<Integer>, ArrayList<Integer>> fl = lista -> {
            ArrayList<Integer> listaFiltrada = new ArrayList<Integer>();
            for (Integer num : lista) {
                if (num % 2 == 0) {
                    listaFiltrada.add(num);
                }
            }
            return listaFiltrada;
        };
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            numeros.add(i);
        }
        ArrayList<Integer> numerosPares = fl.apply(numeros);

        System.out.println("Números pares: " + numerosPares);
    }

    public static void main(String[] args) {
        Filtrado filtrado = new Filtrado();
        filtrado.filtro();
    }
}
