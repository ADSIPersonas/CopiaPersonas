/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sala319
 */
public class MiModelo extends DefaultTableModel
{
    public boolean isCellEditable(int row, int column)
    {
        return false;
    }
            
}

