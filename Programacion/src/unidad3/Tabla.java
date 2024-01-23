/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

/**
 *
 * @author marfonjul
 */
class Tabla {
    private static void imprimeTablaMultiplicar(int valor){
System.out.println("Tabla de multiplicar del"  + valor);
for (int i=1; i<=10; i++)
System.out.println (valor + "* " + i + " = " + i*valor);
}
public static void main(String[] args){
for (int valor = 1; valor <= 10; valor++)
imprimeTablaMultiplicar (valor);
}
//
private static boolean múltiploTres(int valor){
return valor % 3 == 0;
}



}
