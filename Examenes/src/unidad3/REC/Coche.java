/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.REC;

/**
 *
 * @author marfonjul
 */
public class Coche {

    String Color;
    String Matricula;
    String Fabricante;
    int NºPuertas;
    String FechFab;
    String FechMat;
    String IDGlob;

    public static void main(String[] args) {

    }

    public String acelerar() {
        System.out.println("EL COCHE PUEDE ACELERAR");
        return null;

    }

    public String frenar() {
        System.out.println("EL COCHE PUEDE FRENAR");
        return null;
    }

    public String arrancar() {
        System.out.println("EL COCHE PUREDE ARRANCAR");
        return null;
    }

    public String apagar() {
        System.out.println("EL COCHE PUEDE APAGARSE");
        return null;
    }

    public Coche(String Color, String Matricula, String Fabricante, int NºPuertas, String FechFab, String FechMat, String IDGlob) {
        this.Color = Color;
        this.Matricula = Matricula;
        this.Fabricante = Fabricante;
        this.NºPuertas = NºPuertas;
        this.FechFab = FechFab;
        this.FechMat = FechMat;
        this.IDGlob = IDGlob;
    }

    public String getColor() {
        return Color;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public int getNºPuertas() {
        return NºPuertas;
    }

    public String getFechFab() {
        return FechFab;
    }

    public String getFechMat() {
        return FechMat;
    }

    public String getIDGlob() {
        return IDGlob;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public void setNºPuertas(int NºPuertas) {
        this.NºPuertas = NºPuertas;
    }

    public void setFechFab(String FechFab) {
        this.FechFab = FechFab;
    }

    public void setFechMat(String FechMat) {
        this.FechMat = FechMat;
    }

    public void setIDGlob(String IDGlob) {
        this.IDGlob = IDGlob;
    }

}
