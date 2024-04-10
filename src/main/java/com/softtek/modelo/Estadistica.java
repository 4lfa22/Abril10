package com.softtek.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Estadistica {
    private void estadistica(ArrayList<Integer> numeros) {
        Function<ArrayList<Integer>, Stats> st = est -> {
            Stats sta = new Stats();
            int suma = 0;
            for (Integer num : est) {
                suma += num;
            }
            Integer min = Collections.min(est);
            Integer max = Collections.max(est);
            double media = (double) suma / est.size();
            sta.setMin(min);
            sta.setMax(max);
            sta.setMedia(media);
            return sta;
        };
        Stats estadisticas = st.apply(numeros);
        System.out.println(estadisticas);
    }

    public static void main(String[] args) {
        Estadistica estadistica = new Estadistica();
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            numeros.add(i);
        }
        estadistica.estadistica(numeros);
    }
}

