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
public class EjerciciosEstructurasRep {

    public static void main(String[] args) {
        int numeroEj = 4;
        switch (numeroEj) {
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio10();
                break;
            case 9:
                ejercicio11();
                break;
            case 10:
                ejercicio12();
                break;
            case 11:
                ejercicio13();
                break;
            case 12:
                ejercicio14();
                break;
            case 13:
                ejercicio15();
                break;
            case 14:
                ejercicio16();
                break;
        }
    }

    private static void ejercicio1() {
        //Ejercicio 1 boletin 2 tema 2 de estructuras repetitivas
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println(" Resultado " + suma);
        return;
    }

    private static void ejercicio2() {
        //EJERCICIO 2 BOLETIN 2

        //ejercico 2 boletin 2 de repetitivas
        //crear objeto scanner
        Scanner entero = new Scanner(System.in);
        //PEDIR AL USUARIO QUE INGRESE 5 NºS ENTEROS
        System.out.println("Ingrese 5 números enteros");
        int p = entero.nextInt();
        int sumatorio = 0;

        for (int x = 0; x <= 5; x++) {
            sumatorio += p;

        }
        System.out.println("resultado " + sumatorio / 5);
        return;
    }

    private static void ejercicio4() {
        //EJERCICIO 4
        Scanner par = new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        int num1 = par.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = par.nextInt();
        int suma=0;
        //asegurarse de que el numero2 es mayor que el numero1
        if(num1>=num2){
            int temp = num1;
            num1=num2;
            num2=temp;   
        }      
        //imprimir los numeros pares entre numero1 y numero2 usando un bucle do-while
        
        int CurrentNum = num1; //inicializar el primer num
        do{//verificar si el numero actual es par
            if(CurrentNum % 2 == 0){
                  suma+=CurrentNum;
                System.out.println(CurrentNum);
            }//Incrementar
            CurrentNum ++;  
        }while(CurrentNum < num2);
       
         System.out.println("Resultado suma de los pares: "+suma);
       return;
    }


    private static void ejercicio5() {
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
        return;
    }

    private static void ejercicio6() {
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
        return;
    }

    private static void ejercicio7() {
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
        return;
    }
    private static void ejercicio10(){
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
        return;
    }
    private static void ejercicio11(){
// Ejercicio 11
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");

        int n = scanner.nextInt(), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;

       

        for (int i = 0, num; i < n; i++) {

            System.out.print("Ingrese el número #" + (i + 1) + ": ");

            num = scanner.nextInt();

            max = Math.max(max, num);

            min = Math.min(min, num);

            sum += num;

        }

       

        System.out.println("El número mayor es: " + max + "\nEl número menor es: " + min +

                           "\nLa media de los números es: " + (double) sum / n);
        return;
}
    private static void ejercicio12(){
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
        return;
}
    private static void ejercicio13(){
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
        return;
    }
    private static void ejercicio14(){
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
        return;
    }
    private static void ejercicio15(){
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
        return;
    }
    private static void ejercicio16(){
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
        return;
    }
}
