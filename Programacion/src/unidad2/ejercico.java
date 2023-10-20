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
public class ejercico {

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
*/
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
    }
}
