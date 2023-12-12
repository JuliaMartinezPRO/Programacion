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
public class Gato {

    int edad;
    String raza;
    String color;
    double peso;
    String caracter;

    private void aranar() {
        System.out.println("aranar");
    }

    private void comer() {
        System.out.println("comer");
    }

    private void dormir() {
        System.out.println("dormir");
    }
    //definir constructor

    public Gato(int edad, String raza) {
        this.edad = edad;
        this.raza = raza;
    }

    public static void main(String[] args) {
        Gato pepe = new Gato(20, "persa", "gris", 22.3, "curioso");
        pepe.color = "gris";
        System.out.println(pepe.color);

        Gato raul = new Gato(3, "turco", "negro", 17.7, "juguetón");
        raul.color = "negro";
        System.out.println(raul.color);

        Gato lola = new Gato(5, "oriental", "blanco", 19.3, "independiente");
        lola.color = "blanco";
        System.out.println(lola.color);

    }
    //crear tercer Gato,utilizando el constructor de 5 atributos

    public Gato(int edad, String raza, String color, 
            double peso, String caracter) {
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
        this.caracter = caracter;
    }
}
