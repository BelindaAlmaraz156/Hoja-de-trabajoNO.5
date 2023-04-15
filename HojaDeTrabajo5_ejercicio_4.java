/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoja.de.trabajo5_ejercicio_4;

/**
 *
 * @author waldemar
 */
public class HojaDeTrabajo5_ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, promedio;
        
        System.out.print("Ingrese su nota del primer parcial (20%): ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Ingrese su nota del segundo parcial (20%): ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Ingrese su nota del tercer parcial (30%): ");
        nota3 = scanner.nextDouble();
        
        System.out.print("ingrese su nota del cuarto parcial (30%); ");
        nota4 = scanner.nextDouble();
        
        //caclulo del promedio con los pesos especificados
        promedio = (nota1 * 0.2 + nota2 * 0.2 + nota3 * 0.3 + nota4 * 0.3);
        
        System.out.println("Su promedio es: " + promedio);
        
        //Evaluación del promedio y mostrar resultado
        if (promedio >= 85){
            System.out.println("Excelente");
            
        } else if (promedio >= 80){
            System.out.println("muy bueno");
        } else if (promedio >= 70){
            System.out.println("bueno");
        } else if (promedio >= 60) {
            System.out.println("Regular");
        } else  {
            System.out.println("Repite curso");
        
            
        
        
        
            
            
        }
    }
    
}
