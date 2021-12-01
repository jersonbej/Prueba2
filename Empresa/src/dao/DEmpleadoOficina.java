/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.IOperaciones;

/**
 *
 * @author denni
 */
public class DEmpleadoOficina implements IOperaciones{
    
    private double salarioBruto;
    
    public double CalcularSalarioBruto(){
        
        Scanner entrada = new Scanner(System.in);
        
        double salarioBase;
        double horasExtra;
        double salarioBruto = 0;
        
        System.out.println("Salario base");
        salarioBase = entrada.nextDouble();
        
        System.out.println("Cantidad de horas extras trabajadas");
        horasExtra = entrada.nextDouble();
        
        System.out.println("Salario bruto"+salarioBruto);
        
        
        return 0;
        
    }
    
    public float CalcularSalarioNeto(){
        
        double salarioNeto;
        double salarioBase = 0;
        
        salarioNeto = salarioBase+(salarioBruto*0.07);
        
        return 0;
        
    }
    
    
    @Override
    public int agregarRegistro(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> mostrarRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
