/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4.enumerados;

/**
 *
 * @author marfonjul
 */
public interface Comida {
    enum PlatoPrincipal implements Comida { 
        BACALAO, RAXO, PULPO 
    } 
    enum Postre implements Comida{ 
        HELADO, TARTA 
    } 
} 

