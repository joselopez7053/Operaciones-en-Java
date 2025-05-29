/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

       
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        
        double imc = peso / (altura * altura);

     
        System.out.println("Tu Indice de Masa Corporal (IMC) es: " + imc);
    }
    }
    
}
