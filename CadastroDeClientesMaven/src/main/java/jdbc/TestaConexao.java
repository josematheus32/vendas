/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import br.com.projeto.jdbc.ConnectionFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class TestaConexao {
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
