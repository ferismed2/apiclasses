package java_basic;

import java.util.Scanner;

public class escribirTexto {
    public static void main(String args[]){
        String nombre;
        Scanner in = new Scanner((System.in));

        System.out.println("porfavor pon tu nombre: ");

        nombre = in.nextLine();

        System.out.println("Hola: " + nombre);

    }
}
