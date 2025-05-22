package imposto;


import java.util.Scanner;


public class CalculoImposto {


public static void main(String[] args) {

// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);


double renda = 0, rendaAnual = 0, base, desconto = 0.2, aliquota = 0, impostobruto, parcelaDeduzir = 0, irFonte = 0;



System.out.println("Qual o seu nome?");

String nome = sc.next();

System.out.println("Qual seu CPF");

String cpf = sc.next();

for (int i = 0; i < 12 ; i++) {

System.out.printf("Digite a sua renda no %d º mês", i+1);

renda = sc.nextDouble();

rendaAnual = rendaAnual + renda;

}

System.out.printf("Digite o valor do 13º Terceiro");

double decimoTerceiro = sc.nextDouble();


base = renda-(renda * desconto);


if (base <= 2259.20) {

aliquota = 0;

}if (base >= 2259.21 || base <= 2826.65) {

aliquota = 0.75;

parcelaDeduzir = 169.44;

}if (base >= 2826.66 || base <= 3751.05) {

aliquota = 0.15;

parcelaDeduzir = 381.44;

}if (base >= 3751.06 || base <= 4664.68) {

aliquota = 0.225;

parcelaDeduzir = 662.77;

}if (base >= 4664.68) {

aliquota = 0.275;

parcelaDeduzir = 896.00;

}


impostobruto = base*aliquota;

double ir13o = base * aliquota - parcelaDeduzir;


irFonte = impostobruto - parcelaDeduzir;

System.out.printf("Nome do Contribuinte: %s\n", nome);

System.out.printf("CPF do Contribuinte: %s\n", cpf);

System.out.printf("O valor total de rendimentos tributáveis anuais é de : R$ %.2f\n", rendaAnual);

System.out.printf("O valor de Imposto de Renda na fonte é de R$ %.2f\n", irFonte);

System.out.printf("O valor do 13º Terceiro é de R$ %.2f\n", decimoTerceiro);

System.out.printf("O valor do IR sobre o 13º Terceiro: R$ %.2f\n ", ir13o);


}


}