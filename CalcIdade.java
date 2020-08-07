/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcidade;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CalcIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o ano de seu nascimento");
        int ano = input.nextInt();
        int idade = 2020 - ano;
        System.out.println("Sua idade é " + idade);
        if (idade > 18){
            System.out.println("Maior");
        } else{
            System.out.println("Menor");
        }
    }
    
}
