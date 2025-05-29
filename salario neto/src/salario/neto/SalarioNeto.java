/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario.neto;

/**
 *
 * @author DELL
 */import java.util.Scanner;
public class SalarioNeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingresa el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();

        
        System.out.print("Ingresa el porcentaje de impuestos: ");
        double porcentajeImpuestos = scanner.nextDouble();

       
        System.out.print("Ingresa las deducciones adicionales: ");
        double deducciones = scanner.nextDouble();

      
        double impuesto = salarioBruto * (porcentajeImpuestos / 100);

       
        double salarioNeto = salarioBruto - impuesto - deducciones;

        
        System.out.println("El salario neto es: $" + salarioNeto);
    }
    
}
