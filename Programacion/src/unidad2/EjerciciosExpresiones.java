/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;

/**
 *
 * @author marfonjul
 */
public class EjerciciosExpresiones {
    public static void main(String [] args) {
      
        //ejercicio 1
        boolean a = (true && true) || false == true;
        //realizar la combinación de los booleans con el operador AND que estan dentro de los paréntesis que da como resultado true
        // realizamos la combinación de los dos booleans con el operador OR que como resultado nos da true
        //true==true
        //Entonces el resultado de la expresión es un true
        System.out.println("a:"+a);
        boolean b =(false || false) && false == true;
        System.out.println("b:"+b);
        boolean c = (!(true && false)) == false;
        System.out.println("c:"+c);
        boolean d = 1-1<=0-1*3 && -1>=2;
        System.out.println("d:"+d);
        boolean e = 3==3 || 2<=2 && -1>0;
        System.out.println("e:"+e);
        boolean f = 3 == 2 || 5> 1+1;
        System.out.println("f:"+f);
        boolean g1 = 3.1416*1*1>4||2*3.1416*1<=10;
        System.out.println("g1:"+g1);
        //pi por x por x es el area de un circulo con radio x 2 por pi por x es la circunferencia de un circulo con radio x ,la expresión se convierte en el area de un circulo con radio x es mayor que y? OR la circunferencia de un circulo con radio x menor = z?
        //Ambas partes son verdaderas, pero recordemos que es una expresión con el operador || (o), por lo que la expresión completa será verdadera (true) porque al menos una de las partes es verdadera.
        boolean g2 = 1 > 3 && 4 == 4 || 1 + 4 <= 10;
         System.out.println("g2:"+g2);
         //La primera parte (x>3) es falsa, pero la segunda parte (y==4 o x+y≤z) es verdadera, porque al menos una de las partes es verdadera. 
         //Por lo tanto, la expresión completa será falsa (false) porque ambas partes de la expresión con el operador && (y) deben ser verdaderas para que la expresión sea verdadera. En este caso, la primera parte es falsa.
         
         
       /*  //EJERCICIO 2
         //Puedes utilizar el operador de módulo (%) para determinar si un número es divisible por otro. La expresión sería verdadera si el resultado de la operación a % b es igual a cero, ya que esto indica que no hay un residuo al dividir a por b.
         boolean esDivisible;
                 esDivisible = (0 == (a % b));
         
                 int probandin = (a % b);
                 boolean esDivisible;
                 esDivisible = (0 == (a % b));        
                 
       //a es el dividendo.
       
       */
       
                 
    } 
}
