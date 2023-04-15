/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoja.de.trabajo5_ejercicio_5;

/**
 *
 * @author waldemar
 */
public class HojaDeTrabajo5_ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int piezasTotal = 0;
        int piezasMenos = 0;
        int piezasEntre = 0;
        int piezasMas = 0;
        
        double peso;
        
        do {
            System.out.print("Ingrese el peso de la pieza (0 para terminar): ");
            peso = scanner.nextDoble();
            
            if (peso > 0){
                piezasTotal++;
                
                if (peso < 9.8){
                    piezasMenos++;
                }else if (peso> 10.2){
                    piezasMas++;
                } else {
                    piezasEntre++;
                }
                
            }

        } while (peso !=0);
        
        System.out.println("Cantidad total de piezas procesadas:" + piezasTotal);
        System.out.println("Piezas con peso menor a 9.8 Kg:" + piezasMenos);
        System.out.println("PPiezas con peso entre 9.8 kg y 10.2 kg: " + piezasEntre);
        System.out.println("Piezas con peso mayor a 10.2 Kg :" + piezasMas);
        
                
    }
    
}
