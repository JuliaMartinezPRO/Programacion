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
public class UD2Examen {
    public static void main(String[] args){
        int opcionUno=0;
        int opcion2=0;
        int opcion3=0;
           System.out.println("Bienvenido al examen de la UD2-estructuras de control.Seleccione la opción deseada"+opcionUno+opcion2+opcion3);
           
           
     //OPCION2
     //Calacula el cuadrado de los 10 primeros numneros pares
     int n=0;
     int resultado =1;
    while(n<10){
        if(n%2==0);
        resultado=n*n;
    }
    n++;
     System.out.println("resultado"+n);
     
     
     //OPCION3
     //creamos el objeto Scanner
     Scanner scanner = new Scanner (System.in);
     //pedir al usuario que ingrese el numero
     System.out.println("Ingrese un número");
     int n = scanner.nextInt();
     int num1=0;
     int num2=1;
     int suma = 0;
     for(int x=num1;x<=num2;x++){
         suma += suma*n;
     }
     System.out.println("resultado"+n);
     //OPCION1
     int numero1=2;
     int numero2=3;
     int multiplicar=0;
     for (int y=1;y<=2;y++){
        int resultado*=(int)math.pow(2,y);
         multiplicar = numero1*numero2;
     }
           System.out.println("resultado"+multiplicar);
    }
}
