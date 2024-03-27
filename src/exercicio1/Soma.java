package exercicio1;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numero;
        System.out.print("Digite um numero: ");
        numero = input.nextDouble();

        String operador= "+ - * /";
        System.out.print("Digite o operador: ");
        operador = input.next();

        double numero1;
        System.out.print("Digite outro numero: ");
        numero1 = input.nextDouble();


        double resultado = 0;
        if (operador.equals("+")){
            System.out.println(resultado = numero + numero1);

        } else if (operador.equals("-")) {
            System.out.println(numero - numero1);
        } else if (operador.equals("*")){
            System.out.println(numero * numero1);
        } else if(operador.equals("/")){
            System.out.println(numero / numero1);

        } else

        System.out.print("Resultado: " + resultado);

        input.close();

    }
}
