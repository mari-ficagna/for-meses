/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesesvetor;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class MesesVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul",
            "Ago", "Set", "Out", "Nov", "Dez"};
        int dias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};    
        for (int c = 0; c< mes.length; c++){
            System.out.println("O mês de " + mes[c]+ " tem " +dias[c]+ " dias ao todo.");
        }
    }
    
}
