package java_basic;

import java.util.Scanner;

public class threeCompany {
    public static void main(String args[]){
        String nombre;
        Scanner in = new Scanner((System.in));

        System.out.println("porfavor pon tu nombre: ");

        nombre = in.nextLine();
        three(nombre);



    }

    public static void three(String input) {
        int n = input.length();
        String output = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(input.charAt(i));
            }
        }
    }
}
