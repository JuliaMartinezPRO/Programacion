/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.paquete;
import java.util.Scanner;
/**
 *
 * @author marfonjul
 */
public class ProcesarEntrada {
    //metodo que separa el nombre y el dni
    public static String[] procesarEntrada(String entrada){
        //buscar el separador(la coma)
        int posicionSeparador = entrada.indexOf(',');
        //verificar si el formato es válido
        if(posicionSeparador != -1){
            //obtener el nombre y el dni utilizando la posicion del separador
            String nombreCompleto = entrada.substring(0, posicionSeparador).trim();
            String dni = entrada.substring(posicionSeparador + 1).trim();
            //verificar si el dni tenga un formato valido(nº y una letra mayuscula al final)
            if (dni.matches("\\d+[A-Z]")){
                return new String[]{nombreCompleto,dni};
            }
        }
        //formato de entrada incorrecta
        return null;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //solicitar entrada usuario
        System.out.println("ingrese nombre completo de usuario y DNI (en formato'Nombre apellido,DNI'):");
        String entrada = sc.nextLine();
        
        //procesar la entrada
        String [] partes = procesarEntrada(entrada);
        
        //verificar si la entrada es valida
        if (partes !=null){
            //mostrar por separado el DNI y el nombre en mayúsculas
            String dni = partes[1];
            String nombreCompleto = partes[0].toUpperCase();
            
            System.out.println("nombre en mayúsculas:"+nombreCompleto);
            System.out.println("DNI: "+ dni );
        }else{
            System.out.println("Formato de entrada oncorrecto");
        }
    }
}
