/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg5;

/**
 *
 * @author pablo
 */
public class Metodos {
    
    public String clasificacion(String tipo){
        String clasificacion = "";
        
        if (tipo.equals("niños")){
            clasificacion = "E todos los publicos";
        }else if (tipo.equals("jovenes")){
            clasificacion = "T adolescentes";
        }else if (tipo.equals("adultos")){
            clasificacion = "M mayor de edad";
        }else if (tipo.equals("adultos")){
            clasificacion = "A adultos";
        }else {
            clasificacion = "RP pendiente";
        }
        return clasificacion;
    }
    
    public double precioEnvio(double precio){
        double costo, impuesto, ganancia;
        impuesto = precio * 0.12;
        ganancia = precio * 0.21;
        
        costo = precio + impuesto + ganancia;
        
        return costo;
    }
}
