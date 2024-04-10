package com.softtek.modelo;

import java.util.function.Function;

public class Contrasenas {
    private void contra(){
        Function<String, Boolean> cumple = cu -> {
            boolean longitudSuficiente = cu.length() >= 8;
            boolean tieneMayuscula = cu.matches(".*[A-Z].*");
            boolean tieneMinuscula = cu.matches(".*[a-z].*");
            boolean tieneNumero = cu.matches(".*\\d.*");
            boolean tieneCaracterEspecial = cu.matches(".*[!@#$%^&*()-_+=].*");
            return longitudSuficiente && tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
        };
        String contrasena = "Contraseña123$";
        boolean esValida = cumple.apply(contrasena);
        if (esValida){
            System.out.println("La contraseña es válida");
        }else {
            System.out.println("La contraseña no es válida");
        }
    }

    public static void main(String[] args) {
        Contrasenas contra = new Contrasenas();
        contra.contra();
    }
}
