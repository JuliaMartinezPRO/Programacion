/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author marfonjul
 */
public class EjsEstructurasRepetitivas {

    public static void main(String [] args) {
        
        //Ejercicio 1 boletin 2 tema 2 de estructuras repetitivas
        int suma=0;
        for (int i = 1; i<=100;i++){
            suma = suma + i; 
        }
        System.out.println(" Resultado "+suma);
        
        
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

        //EJERCICIO 4
        Scanner par = new Scanner (System.in);
        System.out.println("ingrese 2 numeros pares (2 100)");
        int num1 = par.nextInt();
        int sumatoriow=0;
        int num2 = par.nextInt();
        if (num1<=num2){
        }
         int CurrentNum = num1; //inicializar el primer num
        do{//verificar si el numero actual es par
            if(CurrentNum % 2 == 0){
                System.out.println(CurrentNum);
            }//Incrementar
            CurrentNum ++;    
        }while(CurrentNum < num2);
        
           
          
            sumatoriow=num1+num2;
             System.out.println("resultado " + sumatoriow);
        

      
        System.out.println("resultado "+sumatorio);
        //EJERCICO 5
        Scanner serieAr = new Scanner(System.in);
        System.out.println("ingrese x terminos");
        int input = serieAr.nextInt();
        final double numerador = 1;
        double sumaw=0;
        double division;
        for (int x=1;x<=input;x++){
             division = numerador/x;
            sumaw+=division;
        }   
        System.out.println("resultado "+sumaw);

        //ejercicio 6
        int terminos=5;
        double num = 0;
        double deno = 2;
        double sumac = 0;
        double fraccion;
        
        for (int m=1;m<=terminos;m++){
           fraccion = num/deno; 
           sumac+=fraccion;
           num+=5;
           deno*=3;
        }
        System.out.println(sumac);
   
        //EJERCICIO 7
        int terminosSerie=3;
        double sumat =0;
        double devuelve;
        double fraction;
        for (int j=1;j<=terminosSerie;j++){
            devuelve=Math.pow(2,j);
            fraction=j/devuelve;
            sumat+=fraction;
        }
        System.out.println(sumat);

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
       //EJERCICIO 10
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un valor entero");
        int n = sc.nextInt();
        int terminal = 1;
        for(int x=1;x<n;x++){
        System.out.println(terminal+"");
        //calcular siguiente termino serie
        terminal = -terminal*2;
        }
        
   
        //EJERCICIO 11
        Scanner in = new Scanner (System.in);
       int min = 0, max = 0;
       int sumatorios =0;
       System.out.println("Ingresa los números que quieres calcular");
       String numeros = in.next();
       int nums;
        nums = in.nextInt();
       for (int x = 1;x<=nums;x++){
           int nums2=in.nextInt();
           if (x==1){
               min=nums2;
               max=nums2;
           }
           if(min>nums2){
               min=nums2;
           }
           if(max<nums2){
               max=nums2;
           }
           sumatorios+=nums2;
       }
       System.out.println("El número máximo de los insertados es:" + max + ", el menor: " + min + ", y la media total es:"+(sumatorios/nums));

        //EJERCICIO 12
        //apartado a
        //Creamos el objeto Scanner
        Scanner ins = new Scanner (System.in);
        //pedir al usuario que ingrese el nº
        System.out.println("Ingrese el número");
        int numero = ins.nextInt();
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
     
        //EJERCICIO 13
        //Creamos el objeto Scanner
        Scanner ine = new Scanner (System.in);
        //Pedir al usuario que ingrese un nº
        System.out.println("Escriba un número");
        int s = ine.nextInt();
        double resultado=1;
        int a = 1;
        double resultadoi = 1;
        double i=1;
        double resultadoifraccion=0;
        while (a<=s){
            //multipicador
            resultado=resultado*a;
            a++;
            //fraccion
            resultadoi=1/i;
            i++;
            resultadoifraccion=resultadoifraccion+resultadoi;   
        }
        System.out.println("El resultado es:"+resultadoifraccion+(resultado*s));

        //EJERCICIO 14
        //Creamos el objeto Scanner
        Scanner itn = new Scanner (System.in);
        //pedir al usuario que escriba un nº
        System.out.println("Ingrese un número");
        int u= itn.nextInt();
        while(u<=0);
        for(int r=1;r<=u;r++){
           if(u%r==0){
               System.out.println("resultado"+r);
           }
        }

        //EJERCICO 15 cuadrado de los 10 nºs pares
        //definir suma y un valor como enteros
        int o=0;
        int resultados=1;
        while(o<=10){
            if(o%2==0){
                resultados=o*o;
                System.out.println("resultado"+o+"es:"+resultados);
            }
            o++;
        }
 
//EJERCICIO 16
        //Creamos el objeto Scanner
        Scanner scs = new Scanner (System.in);
        //pedir al usuario que ingrese el nº que quiere calcular
        System.out.println("Ingrese el nº que quiere calcular");
        int np = scs.nextInt();
        System.out.println("Indique la potencia mas alta a la que desea elevar"+np);
        int ic = scs.nextInt();
        int resultadoc = 0;
        int x = 1;
        while(x<ic){
            if(resultadoc<np){
                resultadoc = np*np;
            }else{
                resultadoc = resultadoc*np;
            }
            x++;
        }
        System.out.println(resultadoc);
    }
 
}

