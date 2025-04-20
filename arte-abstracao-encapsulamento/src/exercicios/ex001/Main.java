package exercicios.ex001;

import exercicios.ex001.entities.ContaBancaria;
import exercicios.ex001.exceptions.LimiteEstouradoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Informe o saldo inicial para a sua nova conta bancária: ");
            double saldo = sc.nextDouble();
            ContaBancaria conta = new ContaBancaria(saldo);
            menu();
            escolher(conta, sc);
        }catch(InputMismatchException exception) {
            System.out.println("Erro: valor inválido");
        }finally {
            sc.close();
            System.out.println("Programa encerrado.");
        }
    }

    public static void menu() {
        System.out.println("O que gostaria de fazer?: ");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Consultar cheque especial");
        System.out.println("3. Depositar dinheiro");
        System.out.println("4. Sacar dinheiro");
        System.out.println("5. Pagar um boleto");
        System.out.println("6. Verificar se a conta está usando cheque especial");
        System.out.println("7. Sair");
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void escolher(ContaBancaria conta, Scanner sc) {
        int opcao = sc.nextInt();
            while (opcao != 7) {
                try {
                    switch (opcao) {
                        case 1: {
                            System.out.println("O seu saldo: " + conta.getSaldo());
                            break;
                        }
                        case 2: {
                            System.out.println("Seu cheque especial: " + conta.getChequeEspecial());
                            break;
                        }
                        case 3: {
                            System.out.println("Quanto gostaria de depositar?: ");
                            conta.depositarDinheiro(sc.nextDouble());
                            System.out.println("Depositado com sucesso!");
                            break;
                        }
                        case 4: {
                            System.out.println("Quanto gostaria de sacar?: ");
                            double quantia = conta.sacarDinheiro(sc.nextDouble());
                            System.out.println("Valor obtido: " + quantia);
                            break;
                        }
                        case 5: {
                            System.out.println("Quantia do boleto: ");
                            conta.pagarBoleto(sc.nextDouble());
                            break;
                        }
                        case 6: {
                            System.out.println("O que já foi usado do seu cheque especial: " + conta.getChequeEspecialUsado());
                            System.out.println("Você deve pagar: " + conta.getTaxa());
                            break;
                        }
                        default : {
                            System.out.println("Valor inválido!");
                            break;
                        }
                    }
                    if(conta.getTaxa() != 0) {
                        boolean pago = conta.cobrarTaxa();
                        if(pago) {
                            System.out.println("Taxa sobre o cheque especial paga!");
                        }
                    }
                }catch(InputMismatchException exception) {
                    System.out.println("Erro: valor inválido");
                }catch(LimiteEstouradoException exception) {
                    System.out.println("Erro: " + exception.getMessage());
                }finally {
                    opcao = sc.nextInt();
                }
            }
    }
}
