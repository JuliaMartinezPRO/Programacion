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
        //Creamos el objeto Scanner
        Scanner sc = new Scanner (System.in);
        //pedir al usuario que ingrese el nº que quiere calcular
        System.out.println("Ingrese el nº que quiere calcular");
        int n = sc.nextInt();
        System.out.println("Indique la potencia mas alta a la que desea elevar"+n);
        int i = sc.nextInt();
        int resultado = 0;
        int x = 1;
        while(x<i){
            if(resultado<n){
                resultado = n*n;
            }else{
                resultado = resultado*n;
            }
            x++;
        }
        System.out.println(resultado);
    }
        private static void ejercicio15(){
         //EJERCICO 15 cuadrado de los 10 nºs pares
        //definir suma y un valor como enteros
        int n=0;
        int resultado=1;
        while(n<=10){
            if(n%2==0){
                resultado=n*n;
                System.out.println("resultado"+n+"es:"+resultado);
            }
            n++;
            return;
        }
        }
        private static void ejercicio14(){
             //EJERCICIO 14
        //Creamos el objeto Scanner
        Scanner in = new Scanner (System.in);
        //pedir al usuario que escriba un nº
        System.out.println("Ingrese un número");
        int n= in.nextInt();
        while(n<=0);
        for(int i=1;i<=n;i++){
           if(n%i==0){
               System.out.println("resultado"+i);
           }
        }
        return;
        }
        private static void ejercicio13(){
    //EJERCICIO 13
        //Creamos el objeto Scanner
        Scanner in = new Scanner (System.in);
        //Pedir al usuario que ingrese un nº
        System.out.println("Escriba un número");
        int n = in.nextInt();
        double resultado=1;
        int a = 1;
        double resultadoi = 1;
        double i=1;
        double resultadoifraccion=0;
        while (a<=n){
            //multipicador
            resultado=resultado*a;
            a++;
            //fraccion
            resultadoi=1/i;
            i++;
            resultadoifraccion=resultadoifraccion+resultadoi;   
        }
        System.out.println("El resultado es:"+resultadoifraccion+(resultado*n));
        return;
}
 public static void ejercicio12(){
      //EJERCICIO 12
        //apartado a
        //Creamos el objeto Scanner
        Scanner in = new Scanner (System.in);
        //pedir al usuario que ingrese el nº
        System.out.println("Ingrese el número");
        int numero = in.nextInt();
        for (int x=1;x<=10;x++){
            System.out.println("La tabla de multiplicar es:"+numero+"*"+x+"="+numero*x);
        }
        //apartado b ejercicio 12
        for (int x=1;x<=9;x++){
            System.out.println("la tabla del numero"+x);
            for (int y=1;y<=10;y++){
                System.out.println("la tabla de multiplicar es:"+x+"*"+y+"="+x*y);
            }
        System.out.println();
        System.out.println();
       
 }   
        return;
 }
 private static void ejercicio11(){
     //EJERCICIO 11
        Scanner in = new Scanner (System.in);
       int min = 0, max = 0;
       int sumatorio =0;
       System.out.println("Ingresa los números que quieres calcular");
       String numeros = in.next();
       int num = in.nextInt();
       for (int x = 1;x<=num;x++){
           int num2=in.nextInt();
           if (x==1){
               min=num2;
               max=num2;
           }
           if(min>num2){
               min=num2;
           }
           if(max<num2){
               max=num2;
           }
           sumatorio+=num2;
       }
       System.out.println("El número máximo de los insertados es:" + max + ", el menor: " + min + ", y la media total es:"+(sumatorio/num));
       return;
 }
 private static void ejercico8(){
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
       }
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
 private static void ejercico5(){
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
 private static void ejercico4(){
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
 private static void ejercicio2(){
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
 private static void ejercico1(){
     //Ejercicio 1 boletin 2 tema 2 de estructuras repetitivas
       
        int suma = 0;
        for (int i = 1; i<=100;i++){
            suma = suma + i; 
        }
        System.out.println(" Resultado "+suma);
        return;
 }
}
