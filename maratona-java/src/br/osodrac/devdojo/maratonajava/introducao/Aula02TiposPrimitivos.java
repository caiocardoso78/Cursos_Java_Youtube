package br.osodrac.devdojo.maratonajava.introducao;

import java.net.StandardSocketOptions;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int,double,float,char,byte,short,boolean,long
        int age = 41;
        int idade = (int) 10000000000L; //aqui fizemos um casting que não é uma pratica tão boa!
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.00F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;            // tabela ASCII
        char caractere1 = '\u0041';     //tabela Unicode

        //vamos falar abaixo sobre o tipo String
        String nome = "Caio um grande texto pode ser escrito aqui";

        System.out.println("A minha idade atual é " + age + " anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char " +caractere);
        System.out.println(caractere1);
        System.out.println(nome);
        System.out.println("aqui exemplo de casting " +idade);

    }
}
