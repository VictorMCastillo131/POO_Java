package Unidad2;

import java.util.Scanner;

public class ComparacionDeNumeros3 {

    public static void main(String[] args) {
        byte a, b, c, m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime tres números:");
        
        System.out.print("Ingrese el primer número: ");
        a = scanner.nextByte();
        
        System.out.print("Ingrese el segundo número: ");
        b = scanner.nextByte();
        
        System.out.print("Ingrese el tercer número: ");
        c = scanner.nextByte();

        if (a > b) {
            m = a;
        } else {
            m = b;
            
        }
 if (m > c) {
            System.out.println("El número mayor es: " + m);
        } else {
            System.out.println("El número mayor es: " + c);
        }

        if (a == b) {
            if (b == c) {
                System.out.println("Los tres números son iguales");
            }
        }
    }
}



