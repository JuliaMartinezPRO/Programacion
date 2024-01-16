/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.teoria;
import java.util.Scanner;
import unidad4.teoria.EjercicioNutriscore;

/**
 *
 * @author marfonjul
 */
public class Teoria {
    
    
    public static void main(String [] args){
      
        Scanner sc = new Scanner(System.in);
         System.out.println("ingrese el estado");
        String estad = sc.nextLine();
       
       EjercicioNutriscore estado = EjercicioNutriscore.MUYSANO;
        switch(estado){
            case MUYMALO:
                estado=EjercicioNutriscore.MUYMALO;
                break;
            case MALO:
                estado=EjercicioNutriscore.MALO;
                break;
            case NEUTRAL:
                estado=EjercicioNutriscore.NEUTRAL;
                break;
            case SANO:
                estado=EjercicioNutriscore.SANO;
                break;
            case MUYSANO:
                estado=EjercicioNutriscore.MUYSANO;
                break;
            default:
        }
        System.out.println("el estado de salud es :" + estado);
    }
}
