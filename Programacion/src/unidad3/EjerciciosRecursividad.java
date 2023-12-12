/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;
import java.util.Scanner;
/**
 *
 * @author marfonjul
 */
public class EjerciciosRecursividad {
    public static void main (String[]args){
     
        
            
    }
    //EJERCICIO 1 CALCULAR FACTORIAL
     private static void calcularFactorial(int n){
        
        int factorial=1;
        for(int x=n;x>=1;x--){
           factorial *=x;
        }
        System.out.println(factorial);
        }
     private static void ejercicioFactorial(){
    //pedir al usuario un numero para que calcule su factorial
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int n = sc.nextInt();
        calcularFactorial(n);
}
     //EJERCICIO 2 CALCULAR CASO BASE Y LLAMARSE A SI MISMO
     private int fatctorial(int n){
         int factorial=1;
         for(int i=n;i>=2;i--){
             factorial*=i;
         }
         System.out.println(n);
         return factorial;
     }
     private int factorial(int n){
         if(n == 1||n==0){
            return n * factorial(n-1);
         }else{
            return 1;
         }
         
     }
    
     }
