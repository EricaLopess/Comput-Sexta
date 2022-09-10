/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista01;

import javax.swing.JOptionPane;

/**
 *
 * Faça um programa que recebe três números reais e exibe a multiplicação desses números.
 */
public class ExA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //float - numeros reais, ou seja, numeros com casas decimais.
    //double - numeros reais, ou seja, numeros com casas decimai com dupla precisão.
    //Converter de String para Int -> Integer.parseInt
    //Converter de String para Float -> Float.parseFloat
    //Converter de String para Double -> Double.parseDouble
   
        float n1, n2, n3, result;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        
        result = n1 * n2 * n3;
        
        JOptionPane.showMessageDialog(null, result);
    }
    
}
