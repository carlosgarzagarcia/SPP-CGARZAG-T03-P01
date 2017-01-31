/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgarzag.act3;
import java.util.*;
/**
 *
 * @author Carlos Rafael
 */
public class SPP2CGarzaGAct3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double x1,x2,y1,y2,p;//Se declaran las variables de tipo double para que permita numeros no enteros
    
       Scanner entrada= new Scanner(System.in);//Se llama a scanner
       System.out.println("Inserte el valor de x1");//se piden los datos 
        x1= entrada.nextDouble();
       System.out.println("Inserte el valor de x2");     
        x2=entrada.nextDouble();
       System.out.println("Inserte el valor de y1");     
        y1=entrada.nextDouble();
       System.out.println("Inserte el valor de y2");   
        y2=entrada.nextDouble();
          
        //Proceso 
        p= Math.hypot(x2-x1,y2-y1);//Math.hypot es una función que te devuelve el teorema de pitagoras en lugar de utilizar Math.sqrt y Math.pow 
        
        System.out.println("La distancia entre los puntos: A(" + x1 + "," + x2 + ")" + "B(" + y1 + "," + y2 + ")" + " es " +  p);// se imprime el valor 
        
        
        
        
    }
}