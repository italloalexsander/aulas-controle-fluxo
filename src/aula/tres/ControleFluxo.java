package aula.tres;

import java.util.Objects;
import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número do mês: ");
        int mesNum = input.nextInt();
        checaMesNum(mesNum);

        System.out.println("Digite o nome do mês: ");
        input.nextLine();
        String mesNome = input.nextLine();
        System.out.println("Debug: " + mesNome);
        checaFerias(mesNome);

        System.out.println("Digite o nome do dia da semana: ");
        String diaSemana = input.nextLine();
        checaDiaSemana(diaSemana);

        System.out.println("Digite um valor de 1 a 5: ");
        int valor = input.nextInt();
        checaValor(valor);



    }

    /*As funções abaixo tem objetivos didáticos e não seguem
    necessariamente boas práticas de programação */
    public static void checaMesNum(int mesNum){
        if(mesNum == 1){
            System.out.println("O mês é janeiro");
        }else if(mesNum == 2){
            System.out.println("O mês é fevereiro");
        }else if(mesNum == 3){
            System.out.println("O mês é março");
        }else if(mesNum == 4){
            System.out.println("O mês é abril");
        }else if(mesNum == 5){
            System.out.println("O mês é maio");
        }else if(mesNum == 6){
            System.out.println("O mês é junho");
        }else if(mesNum == 7){
            System.out.println("O mês é julho");
        }else if(mesNum == 8){
            System.out.println("O mês é agosto");
        }else if(mesNum == 9){
            System.out.println("O mês é setembro");
        }else if(mesNum == 10){
            System.out.println("O mês é outubro");
        }else if(mesNum == 11){
            System.out.println("O mês é novembro");
        }else if(mesNum == 12){
            System.out.println("O mês é dezembro");
        }else{
            System.out.println("Mês invalido");
        }
    }

    public static void checaFerias(String mesNome){
        if(Objects.equals(mesNome, "julho") || Objects.equals(mesNome, "dezembro") || Objects.equals(mesNome, "janeiro")){
            System.out.println("Férias!!!");
        }
        else{
            System.out.println("Trabalho!!!");
        }
    }

    public static void checaDiaSemana(String diaSemana){
        switch(diaSemana){
            case "segunda":
                System.out.println("Dia 2");
                break;
            case "terça":
                System.out.println("Dia 3");
                break;
            case "quarta":
                System.out.println("Dia 4");
                break;
            case "quinta":
                System.out.println("Dia 5");
                break;
            case "sexta":
                System.out.println("Dia 6");
                break;
            case "sábado":
                System.out.println("Dia 7");
                break;
            case "domingo":
                System.out.println("Dia 1");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }

    public static void checaValor(int valor){
        switch(valor){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }
    }
}
