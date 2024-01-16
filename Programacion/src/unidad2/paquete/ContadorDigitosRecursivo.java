/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.paquete;

/**
 *
 * @author marfonjul
 */
public class ContadorDigitosRecursivo {
    public static void main(String[]args){
        int numero = 1234;
        int longitud = contadorDigitos(numero);
        //respuesta del ejercicio
        System.out.println("el nº de digitos en "+ numero +"es:"+ longitud);
    }

    public static int contadorDigitos(int numero) {
       //caso base:si el nº es menor que 10,tiene un solo digito
       if (Math.abs(numero)<10){
           return 1;
       }else{
           //llamada recursiva para dividir el numero por 10
           return 1 + contadorDigitos(numero/10);
       }
    }
}
