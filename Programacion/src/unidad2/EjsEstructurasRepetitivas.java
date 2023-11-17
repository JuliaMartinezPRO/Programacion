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

    public static void main(String args[]) {
        /*
        String persona="niño";
        switch (persona){
            case"bebe":
                System.out.println("tiene <3 años");
                break;
            case"niño":
                System.out.println("tiene entre 4 y 7 años");
                break;
            case"junilado":
                System.out.println("tiene mas de 70 años");
                break;
            case"joven":
                System.out.println("tiene entre 18 y 70 asños");
                break;
            default:
                       System.out.println("no es persona");
    }
  
        int a,b,c;
        b= 5;
        c= 10;
        a = (b<c) ? b * c : b/c;
        if (b<c){
            a=b*c;
        }else{
            a=c/b;
        }
   
   for (int i = 1; i <= 5; i++)
       System.out.println(i);
   for (i = 1; i <=10; i+=2){
       System.out.println(i);
   }
   for (i = 5; i >=1; i--){
       System.out.print("i:");
       System.out.println(i);
   }
   
        for (int i =1; i <= 5; i++){
        System.out.println ("i:");
        System.out.println (i);
        }

        int j = 0;
        for (int i = 1; i <=5; j++)
            System.out.println(i);
        //bucle infinito se ejecuta infinitivamente//
         
        Scanner in = new Scanner(System.in);
        System.out.print("Nº de iteraciones:");
        int interacion;
        for (interacion = in.nextInt(); interacion > 0; interacion--) {
            System.out.println("estás aprobado");
        }
        //scanner es una clase para poder usarla hay que usar import //

       //EJERCIO 1 BOLETIN 2 
       //Creamos un objeto Scanner
    Scanner sc = new Scanner(System.in);
    //pedir al usuario que introduzca una nota
    System.out.println("Ingrese una nota");
    double nota = sc.nextDouble();
    //definir rango
    if (nota < 0 ||  > 10)
    System.out.println("es correcto"+nota); 
    else
   System.out.println("es incorrecto"+nota);
 
        //EJERCICIO 2 BOLETIN 2
        //Creamos un objeto Sacaner
        Scanner sc = new Scanner (System.in);
        //Pedir al usuario que introduzca una nota
        System.out.println("Ingrese una nota");
        double nota = sc.nextDouble();
        //Definir rango
        if (nota < 0 || > 10)
        System.out.println("aprobado"+nota);
        else
        System.out.println("suspenso"+nota);
 
        //EJERCICIO 3 BOLETIN 2
        //Creamos un objeto Scanner
        Scanner sc = new Scanner (System.in);
        //Pedir al usuario que introduzca un nº entero
        System.out.println("Ingrese un nº entero");
        double entero = sc.nextDouble();
        //Definir rango
        if entero % 2 == 0{
        System.out.println("El numero" + entero + "es par");
        }else{
        System.out.println("El numero" + entero + "es impar");
        }
       
        //EJERCICIO 4 BOLETIN 2
       
        //Definir nombres
        int productos, precio, descuento;
         //Creamos un objeto Scanner
        Scanner sc = new Scanner (System.in);
        //Pedimos al usuario que ingrese precio
        System.out.print("Ingrese el precio de su compra");
        double precio = sc.nextDouble();
        //pedimos al usuario que ingrese los productos sellecionados
        System.out.print("Ingrese el nº de productos seleccionados");
        double productos = Scanner.nextDouble();
        if (productos=100){
            System.out.println("Usted tendrá un descuento del 40%");
            descuento=precio*40/100;
            System.out.println("el total de su compra con descuento incluido es:"+decuento+);
        }
       else if (productos=25&&100){
            System.out.println("ustede tendrá un descuento del 20%");
            descuento=precio*20/100;
            System.out.println("el total de su compra con descuento es:"+decuento);
        }
       else if (productos=10&&24){
            System.out.println("usted tendrá un descuento del 10%");
            descuento=precio*10/100;
            System.out.println("el total de su compra con descuento es:"+descuento);
        }
       else if(productos<10){
            System.out.println("usten no tendra descuento");
            System.out.println("el total de su cuenta sin descuento es:"+precio);
        }

        //EJERCICIO 5 BOLETIN 2
        //definir nombres
         double retencion=0.20;
         double saldoNeto;
        //Creamos el objeto scanner para el salario
        Scanner src = new Scanner (System.in);
        //Pedir al usuario que ingrese el salario
        System.out.println("Ingrese el salario");
        double salario = src.nextDouble();
        //Pedir al usuario que ingrese el Nº de hijos
        System.out.println("ingrese el nº de hijos");
        double hijos = src.nextDouble();
        if (hijos<=2){
            System.out.println("usted tendrá una retención del 20%");
           saldoNeto=hijos-retencion;
            System.out.println("El total de su salario neto es:"+saldoNeto);
        }
        double retencion1=0.15;
        if (hijos<=5){
            System.out.println("usted tendrá una retención del 15%");
           saldoNeto=hijos-retencion1;
            System.out.println("El total de su salario neto es:"+saldoNeto);
        }
        double retencion2=0.10;
        if (hijos<=7){
            System.out.println("usted tendrá una retención del 10%");
           saldoNeto=hijos-retencion2;
            System.out.println("El total de su salario neto es:"+saldoNeto);
    }
        double retencion3=0.05;
        if (hijos<=9){
            System.out.println("usted tendrá una retención del 15%");
           saldoNeto=hijos-retencion3;
            System.out.println("El total de su salario neto es:"+saldoNeto);
}
        double retencion4=0.00;
        if (hijos>10){

        System.out.println("usted tendrá una retención del 15%");
        saldoNeto=hijos-retencion4;
        System.out.println("El total de su salario neto es:"+saldoNeto);
        }
     
        //EJERCICIO 6
        
        //definir h como entero
        int h;
        //Definir hora,h2,m2,mensaje como caracter
        int hora ,h2 ,m2 ,mensaje;
        //creamos un objeto scanner para ingresar la hora 
        Scanner scs = new Scanner(System.in);
        //Pedimos al usuario que ingrese la hora
        System.out.println("Ingrese una hora");
        //int hora = scs.nextInt();
        int a = 9;
                
      
       
        //Ejercicio 1 boletin 2 tema 2 de estructuras repetitivas
       
        int suma = 0;
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
        }
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
        //EJERCICIO 16
        //Creamos el objeto Scanner
        Scanner sc = new Scanner (System.in);
        //pedir al usuario que ingrese el nº que quiere calcular
        System.out.println("Ingrese el nº que quiere calcular");
        int n = sc.nextInt();
        System.out.println("Indique la potencia mas alta a la que desea elevar"+n);
        int i
        */
    }
}
