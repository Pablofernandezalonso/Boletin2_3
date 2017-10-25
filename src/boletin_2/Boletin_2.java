 
package boletin_2;

import java.util.Scanner;



public class Boletin_2 {

    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    float euros, cambio, dolares;
    System.out.println("teclea euros:");
    euros = sc.nextFloat();
    System.out.println("teclea cambio:");
    cambio = sc.nextFloat();
    dolares = euros*cambio;
    System.out.println(euros+"€ son "+dolares+"$");
    }
    
}
