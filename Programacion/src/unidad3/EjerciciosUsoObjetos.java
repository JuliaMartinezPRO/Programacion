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
public class EjerciciosUsoObjetos {
  private static int calcularDias(int mes,int ano){
      if (mes==2){
               // algoritmo de bisiesto
               if(esBisiesto(ano)){
                    System.out.println("Este mes tiene 29 dias");
               }else{
                   System.out.println("Este mes tiene 28 dias");
               }
      }

  }
  private static boolean esBisiesto(int anio){


}

