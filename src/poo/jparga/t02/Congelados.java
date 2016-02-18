/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jparga.t02;

/**
 *
 * @author JESUS PARGA VELA
 */
public class Congelados extends Productos {

    //Atributos
    protected int temp;

    //Constructor
    public Congelados(String fecha, int numLote, int temp) {
        super(fecha, numLote);
        this.temp = temp;
    }

    //Métodos
    public void setTemp(int temperatura) {
        this.temp = temperatura;
    }
}
