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
public class EJjerciciosMetodos {
   
    public static void main(String [] args){
    //EJERCICIO 16
       
     //Ejercicio 1 boletin 2 tema 2 de estructuras repetitivas
       
        int suma = 0;
        for (int i = 1; i<=100;i++){
            suma = suma + i; 
        }
        System.out.println(" Resultado "+suma);
        return;
 }
    private static void ejercico2(){
        //ejercico 2 boletin 2 de repetitivas
        
        //crear objeto scanner
        Scanner entero = new Scanner (System.in);
        //PEDIR AL USUARIO QUE INGRESE 5 NºS ENTEROS
        System.out.println("Ingrese 5 números enteros");
        int p = entero.nextInt();
        int sumatorio = 0;
        
        for (int x = 0;x <= 5;x++){
         sumatorio += p;
    
        }
        System.out.println("resultado "+sumatorio/5);
        return;
    }
    private static void ejercicio4(){
        //EJERCICIO 4
        Scanner par = new Scanner (System.in);
        System.out.println("ingrese 2 numeros pares (2 100)");
        int num1 = par.nextInt();
        int sumatorio=0;
        int num2 = par.nextInt();
        if (num1<=0 || num2 > 2){
            System.out.println("Ingrese un valor válido");
        }
        System.out.println("ingrese"+num1+"numeros:");
        for (int x=1;x<=num1;x++){
             System.out.println("numero"+x+":");
           
          
            sumatorio=num1+num2;
        }
        System.out.println("resultado "+sumatorio);
        return;
    }
    private static void ejercicio5(){
       //EJERCICO 5
        Scanner serieAr = new Scanner(System.in);
        System.out.println("ingrese x terminos");
        int input = serieAr.nextInt();
        final double numerador = 1;
        double suma=0;
        double division;
        for (int x=1;x<=input;x++){
             division = numerador/x;
            suma+=division;
        }   
        System.out.println("resultado "+suma);
        return;
    }
    private static void ejercicio6(){
        //ejercicio 6
        int terminos=5;
        double num = 0;
        double deno = 2;
        double suma = 0;
        double fraccion;
        
        for (int m=1;m<=terminos;m++){
           fraccion = num/deno; 
           suma+=fraccion;
           num+=5;
           deno*=3;
        }
        System.out.println(suma);
        return;
    }
    private static void ejercicio7(){
           //EJERCICIO 7
        int terminosSerie=3;
        double suma =0;
        double devuelve;
        double fraccion;
        for (int j=1;j<=terminosSerie;j++){
            devuelve=Math.pow(2,j);
            fraccion=j/devuelve;
            suma+=fraccion;
        }
        System.out.println(suma);
        return;
    }
    private static void ejercicio8(){
          //EJERCICIO 8
       Scanner temperatura1=new Scanner (System.in);
       System.out.println("Ingrese valor a calcular");
       double desde = temperatura1.nextDouble();
       System.out.println("Ingrese otro valor");
       double hasta=temperatura1.nextDouble();
       double C=5(desde-32)/9;
       double R=desde+459.67;
       double K=hasta+273.15;
       if(desde > hasta){
           double temp = desde;
           desde = hasta;
           hasta = temp;
           //sin acabar
           return;
       }
    }
    public static void main(String[]args){
        
    }
}
      

