package Unidad2;


import java.util.Scanner;

public class ServicioSocial1 {
    
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Dime cuántos créditos acumulaste el primer semestre:");
            int s1 = scanner.nextInt();//omg
            
            if (s1 == 34) {
                System.out.println("Tienes el máximo de créditos acumulados.");
                if (s1 > 34) {
                    System.out.println("Número de créditos inválidos.");
                }
            } else {
                if (s1 == 18) {
                    System.out.println("Tienes el mínimo de créditos acumulados.");
                    if (s1 < 18) {
                        System.out.println("No tienes los suficientes créditos.");
                    }
                }
            }
            
            System.out.println("Dime cuántos créditos acumulaste el segundo semestre:");
            int s2 = scanner.nextInt();
            
            if (s2 == 34) {
                System.out.println("Tienes el máximo de créditos acumulados.");
                if (s2 > 34) {
                    System.out.println("Número de créditos inválidos.");
                }
            } else {
                if (s2 == 18) {
                    System.out.println("Tienes el mínimo de créditos acumulados.");
                    if (s2 < 18) {
                        System.out.println("No tienes los suficientes créditos.");
                    }
                }
            }
            
            System.out.println("Dime cuántos créditos acumulaste el tercer semestre:");
            int s3 = scanner.nextInt();
            
            if (s3 == 34) {
                System.out.println("Tienes el máximo de créditos acumulados.");
                if (s3 > 34) {
                    System.out.println("Número de créditos inválidos.");
                }
            } else {
                if (s3 == 18) {
                    System.out.println("Tienes el mínimo de créditos acumulados.");
                    if (s3 < 18) {
                        System.out.println("No tienes los suficientes créditos.");
                    }
                }
            }
            
            System.out.println("Dime cuántos créditos acumulaste el cuarto semestre:");
            int s4 = scanner.nextInt();
            
            if (s4 == 34) {
                System.out.println("Tienes el máximo de créditos acumulados.");
                if (s4 > 34) {
                    System.out.println("Número de créditos inválidos.");
                }
            } else {
                if (s4 == 18) {
                    System.out.println("Tienes el mínimo de créditos acumulados.");
                    if (s4 < 18) {
                        System.out.println("No tienes los suficientes créditos.");
                    }
                }
            }
            
            System.out.println("Dime cuántos créditos acumulaste el quinto semestre:");
            int s5 = scanner.nextInt();
            
            if (s5 == 34) {
                System.out.println("Tienes el máximo de créditos acumulados.");
                if (s5 > 34) {
                    System.out.println("Número de créditos inválidos.");
                }
            } else {
                if (s5 == 18) {
                    System.out.println("Tienes el mínimo de créditos acumulados.");
                    if (s5 < 18) {
                        System.out.println("No tienes los suficientes créditos.");
                    }
                }
            }
            
            System.out.println("Dime cuántos créditos acumulaste el sexto semestre:");
            int s6 = scanner.nextInt();
            
            if (s6 == 34) {
                System.out.println("Tienes el máximo de créditos acumulados.");
                if (s6 > 34) {
                    System.out.println("Número de créditos inválidos.");
                }
            } else {
                if (s6 == 18) {
                    System.out.println("Tienes el mínimo de créditos acumulados.");
                    if (s6 < 18) {
                        System.out.println("No tienes los suficientes créditos.");
                    }
                }
            }
            
            int cre = s1 + s2 + s3 + s4 + s5 + s6;
            
            if (cre >= 122.4) {
                System.out.println("Tu total de créditos es: " + cre);
                System.out.println("El porcentaje de tus créditos obtenidos es: " + (cre * 100) / 204);
                System.out.println("El porcentaje es mayor o igual al 60%, por lo tanto puedes hacer tu servicio social.");
            } else {
                System.out.println("Tu total de créditos es: " + cre);
                System.out.println("El porcentaje de tus créditos obtenidos es: " + (cre * 100) / 204);
                System.out.println("El porcentaje es menor al 60%, por lo tanto no puedes hacer tu servicio social.");
            }
        }
    }
}



