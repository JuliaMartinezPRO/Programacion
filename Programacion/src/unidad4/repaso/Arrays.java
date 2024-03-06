/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.repaso;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author marfonjul
 */
public class Arrays {
public static void main(String[]args){
   ArrayList lista = new ArrayList();
   //si lo comento ya se borra
   //lista.add("juan");
   lista.add("pepe");
   lista.add("1");
   lista.add("100");
   //añadir un dato si se puede porque son redimensionables
   lista.add("julia");
    for (int i = 0; i < lista.size(); i++) {
        System.out.println(lista.get(i));
       }
   
    System.out.println("posición 0 "+lista.get(0));
    //vuelve a imprimir toda lista
    System.out.println(lista);
}
//ejercicio2
 public Usuario consultarDatos(String nick,List<Usuario> usuarios){
        for(int i = 0;i<usuarios.size();i++){
            if (usuarios.get(i).nombre==nick){
                return usuarios.get(i);
            }
          
        }
        return null;
    }
 public Usuario modificarUsuario(Usuario usuario, List<Usuario> usuarios ){
   for(int i = 0; i<usuario.size();i++){
       if (usuario.get(i).nombre==usuario.nombre)
   }
   return usuario;
   return;
 }
}
