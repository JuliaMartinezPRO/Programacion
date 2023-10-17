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
*/
       //EJERCIO 1 BOLETIN 2 
       //Creamos un objeto Scanner
    Scanner sc = new Scanner(System.in);
    //pedir al usuario que introduzca una nota
    System.out.println("Ingrese una nota");
    double nota = Scanner.nextDouble();
    //definir rango
    if (nota < 0 ||  > 10)
    System.out.println("es correcto"+nota); 
    else
   System.out.println("es incorrecto"+nota);
    }
}
