package br.osodrac.devdojo.maratonajava.introducao;

import java.util.Date;

/*
 Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome;
        String endereco;
        double salario;
        String data;
        nome = "Caio";
        endereco = "Avenida Vereador João Batista da Costa";
        salario = 10000.10;
        data = "27/08/2022";
        System.out.println("Eu "+nome+ ", morando no endereço " +endereco+ " confirmo que recebi o salário de "+ salario+" na data "+data);
    }
}
