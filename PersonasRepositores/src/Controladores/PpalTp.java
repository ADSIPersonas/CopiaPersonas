/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.FrmTipoPersona;

/**
 *
 * @author Sala319
 */
public class PpalTp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        iniciar();
    }
    
    //Comentario para borrar
      public  static void iniciar(){
         new ControladoresTipoPersona(new FrmTipoPersona()).Iniciar();
    }
    
}
