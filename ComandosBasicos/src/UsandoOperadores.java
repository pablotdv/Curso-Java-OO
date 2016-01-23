/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class UsandoOperadores {

    public static void main(String args[]) {
        //entrada
        double num1 = 15;
        double num2 = 20;

        double inform = 5;

        double altura = 1.7;
        double peso = 114.4;

        int contComando = 0;

        //Processamento
        double resultado = num1 / num2;
        contComando++;

        double resto = inform % 2;
        contComando++;

        double imc = peso / (altura * altura);
        contComando++;

        boolean abaixoPeso = imc < 25;
        boolean acimaPeso = imc >= 30;

        //saída
        System.out.println("Resultado: " + resultado);
        System.out.println("resto: " + resto);
        System.out.println("IMC: " + imc);
        System.out.println("Commando: " + contComando);
        System.out.println("abaixo do peso: " + abaixoPeso);
        System.out.println("é forte: " + acimaPeso);
                
    }
}
