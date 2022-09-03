/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author erica
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variáveis
        String nome;
        int idade;
       
        
        //programação
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog
                                     ("Digite o sua idade:"));
        JOptionPane.showMessageDialog(null, "Olá " + nome +
                                    "! Você tem " + idade + "  anos.");
        
        
    }
    
}
