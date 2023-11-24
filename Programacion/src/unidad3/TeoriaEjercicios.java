/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

/**
 *
 * @author marfonjul
 */
public class TeoriaEjercicios {
    //metodo statico y privado para sumar dos numeros
    private static int sumarPrivado(int numero1,int numero2){
        //llamar al método privado "sumarBlanco"
        int sumarBlanco;
        int sumar = sumarBlanco(numero1,numero2);
        //crear método para realizar la operación de la suma
        private static int sumarBlanco(int a , int b){
            return a+b;
        }
    }  
public static void main(String [] args){
//llamar al método statico sumarPrivado
int resultado = sumarPrivado(5,7);
System.out.println("la suma es"+resultado);
}
    }

