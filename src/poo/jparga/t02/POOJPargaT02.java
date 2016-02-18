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
public class POOJPargaT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancia
        Frescos pera= new Frescos("12 de Enero",6);
        System.out.println("total de pf: "+pera.envio(5, 0, 0));
        System.out.println("Caducidad: "+pera.fechaCad);
        System.out.println("Lote: "+pera.numLote);
    }
    
}
