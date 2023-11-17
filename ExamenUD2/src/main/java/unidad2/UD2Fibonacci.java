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
public class UD2Fibonacci {
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int numero1=0;
       int numero2=1;
       for(int x=2;x<=n;x++){
           int term=numero1;
           int res = numero1+numero2;
           numero1=term;
       }
       System.out.print("resultado"+n);
    }
    
}
