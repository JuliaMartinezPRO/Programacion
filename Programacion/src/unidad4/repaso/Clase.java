/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import unidad4.repaso.Persona;

/**
 *
 * @author marfonjul
 */
public class Clase {

    public static void main(String[] args) {
        //define un array de 13 personas con el nombre"claseDAM"
        Persona julia = new Persona('nombre',Color.Rojo);
        Persona kenia = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona alfonso = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona melvin =new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona antonT =new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona hugo =new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona sergio = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona santi = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona ruben =new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona adrian = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona uxio = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona anton = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);
        Persona jesus = new Persona('nombre',Color.Rojo,ColorPelo.Negro,MarcasC.MERCEDES,MarcasM.IPOHONE,MarcasO.APPLE);

        Persona[] claseDAM = new Persona[13];
        claseDAM[0] = julia;
        claseDAM[1] = kenia;
        claseDAM[2] = alfonso;
        claseDAM[3] = melvin;
        claseDAM[4] = antonT;
        claseDAM[5] = hugo;
        claseDAM[6] = sergio;
        claseDAM[7] = santi;
        claseDAM[8] = ruben;
        claseDAM[9] = adrian;
        claseDAM[10] = uxio;
        claseDAM[11] = anton;
        claseDAM[12] = jesus;

        //verifica su longitud con el método correspondiente
        System.out.println("longitud array:" + claseDAM.length);

    }

    //DEFINE UN MÉTODO matricularPersona(Clase,Persona)para añadir a una persona array
    private static void matricularPersona(int clase, int persona) {
        Persona nueva[] = new Persona[1];
        for (int i = 0; i < 1; i++) {
            Persona[] Persona = null;
            Persona[i] = new Persona();
            //utilizar este metodo para rellenar el array con todas las persona del aula
            
        }

    }
}
