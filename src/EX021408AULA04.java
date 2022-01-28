/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jennifer
 */
public class EX021408AULA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Uma empresa possui 5 funcionários em sua folha de pagamentos. 
        Crie um programa que receba o salário dos funcionários e calcule o total da folha de pagamento e a média dos salários.*/
        
        double f1,f2,f3,f4,f5,media,soma;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Salário do 1º funcionário: ");
        f1 = leitor.nextDouble();
        System.out.print("Salário do 2º funcionário: ");
        f2 = leitor.nextDouble();
        System.out.print("Salário do 3º funcionário: ");
        f3 = leitor.nextDouble();
        System.out.print("Salário do 4º funcionário: ");
        f4 = leitor.nextDouble();
        System.out.print("Salário do 5º funcionário: ");
        f5 = leitor.nextDouble();
        
        soma = f1+f2+f3+f4+f5;
        media = (f1+f2+f3+f4+f5)/5;
        
        System.out.print("O valor total da folha de pagamento é: " + soma+ "\nA média dos salários é de: " + media);
        
        
        
            
        
        
        
        
    }
    
}
