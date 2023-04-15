/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoja.de.trabajo5_ejercicio6;

/**
 *
 * @author waldemar
 */
public class HojaDeTrabajo5_ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese un número para calcular su factorial: ");
       int numero = Scanner.nextInt();
       int resultado = Factorial.calcularFactorial(numero);
       if (resultado == -1){
           System.out.println("El número ingresado es negativo, no se puede calcular el factorial.");
       } else {
           System.out.printf("El factorial de %d\n", numero, resultado);
           
           
           
           
            
        } 
    }
    
}
