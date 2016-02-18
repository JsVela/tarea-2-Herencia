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
public class Productos {

    //Atributos
    protected String fechaCad;
    protected int numLote;

    //Constructor
    public Productos(String fecha, int numLote) {
        this.fechaCad = fecha;
        this.numLote = numLote;
    }

    //Métodos
    public int envio(int pf, int pr, int pc) {
        return pf + pr + pc;
    }
}
