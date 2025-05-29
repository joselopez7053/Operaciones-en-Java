/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area.rectangulo;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa la base del rectangulo: ");
        double base = scanner.nextDouble();

        
        System.out.print("Ingresa la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        
        double area = base * altura;

        
        System.out.println("El area del rectangulo es: " + area);
    }
    
}
