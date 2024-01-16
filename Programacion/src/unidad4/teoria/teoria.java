/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.teoria;
import java.util.Scanner;
import unidad4.teoria.ejercicioNutriscore;

/**
 *
 * @author marfonjul
 */
public class teoria {
    
    
    public static void main(String [] args){
      
        Scanner sc = new Scanner(System.in);
        String estado = sc.nextLine();
        System.out.println("ingrese el estado");
       ejercicioNutriscore estado = ejercicioNutriscore.MUYSANO;
        switch(estado){
            case MUYMALO:
                estado=ejercicioNutriscore.MUYMALO;
                break;
            case MALO:
                estado=ejercicioNutriscore.MALO;
                break;
            case NEUTRAL:
                estado=ejercicioNutriscore.NEUTRAL;
                break;
            case SANO:
                estado=ejercicioNutriscore.SANO;
                break;
            case MUYSANO:
                estado=ejercicioNutriscore.MUYSANO;
                break;
            default:
        }
        System.out.println("el estado de salud es :" + estado);
    }
}
