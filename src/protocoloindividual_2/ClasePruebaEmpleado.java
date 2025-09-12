/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package protocoloindividual_2;

/**
 *
 * @author Sebastian
 */
public class ClasePruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp_1 = new Empleado("Ana López", 3000);
        
        System.out.println("Nombre: " + emp_1.nombre); 
        System.out.println("Salario: " + emp_1.getSalario()); 
        emp_1.setSalario(3500); 
        System.out.println("Nuevo salario: " + emp_1.getSalario());
    }
    
}
