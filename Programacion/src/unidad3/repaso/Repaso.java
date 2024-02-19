/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.repaso;

/**
 *
 * @author marfonjul
 */
public class Repaso {

    public static void main(String[] args) {
        //valores de los numeros
      sumar(1,2,3,4,5);
      sumar2(1,2,3,4);
      sumar3(1,2,3);  
      sumar4(1,4);
    }

    private static void imprimir(String cadena) {
        System.out.println("resultado" + cadena);

    }
    private static void sumar(int num1,int num2,int num3,int num4,int num5){
       
        int resultado = num1 + num2 + num3 + num4 + num5;
        
    }
    private static void sumar2(int num1,int num2,int num3,int num4){
        int resultado = num1 + num2 + num3 + num4;
    }
    private static void sumar3(int num1,int num2,int num3){
        int resultado = num1 + num2 + num3;
    }
    private static void sumar4(int num1 , int num2 ){
        int resultado = num1+num2;
    }
}
