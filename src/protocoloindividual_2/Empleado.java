/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual_2;

/**
 *
 * @author Sebastian
 */
public class Empleado {
    public String nombre;
    private int salario;
    
    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.setSalario(salario);
    }
    
    public int getSalario(){
        return salario;
    }
    
    public void setSalario(int salario) {
        if (salario >= 100){
            this.salario = salario;
        }else {
            System.out.println("El salario no puede ser menor que que 100");
        }
    }
    
}    


