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
public class Prueba5 {


	public static void main(String[] args){
            AplicacionDePrueba();
        }

        public static void AplicacionDePrueba(){
            Scanner in = new Scanner(System.in);
            String nombre,publico,clasificacion;
            double precio,total;
            System.out.println("Clasificador de videojuegos");
            System.out.println("Escribe el ttitulo del juego");
            nombre = in.next();
            System.out.println("Escribe quien puede jugarlo: niños, jovenes, mayores de edad, adultos o blanco si no sabe");
            publico = in.next();
            System.out.println("Escribe el precio del juego");
            precio = in.nextDouble();
            metodos met = new metodos();
            clasificacion = met.clasificacion(publico);
            total = met.precioEnvio(precio);
            System.out.println();
            System.out.println("********************************************");
            System.out.println("Los datos de su juego son:");
            
            System.out.println("Titulo:"+nombre);
            System.out.println("Clasificacion:"+clasificacion);
            System.out.println("Precio total:"+total);
        }
}
