import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("### Praticando ###");
        double totalVenda = 0.0;
        int qtdItens = 0;
        int op = -1;
        while (op != 0) {
            System.out.println("# Mini Sistema de Vendas #");
            System.out.println("1-  Adicionar Pão (R$ 0.50)");
            System.out.println("2 - Adicionar Leite (R$ 5.00)");
            System.out.println("3 - Adicionar Café (R$ 15.00)");
            System.out.println("4 - Ver Carrinho (Total de R$ e quantidade de itens)");
            System.out.println("0 - Finalizar Compra.");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Adicionando Pão ao carrinho");
                    totalVenda += 0.50;
                    qtdItens++;
                    break;

                case 2:
                    System.out.println("Adicionando Leite, lá ele.");
                    totalVenda += 5.00;
                    qtdItens++;
                    break;

                case 3:
                    System.out.println(" Adicionar Cafézin");
                    totalVenda += 15.00;
                    qtdItens++;
                    break;

                 case 4:
                     System.out.println("Carrinho: " + qtdItens + " itens | Total: R$ " + totalVenda);
                    break;

                case 0:{
                    System.out.println("Finalizando Compra...");
                    break;
                }

                default:
                    System.out.println("Opção invalida");
            }

        }
        if(totalVenda > 50.00){
            double descontodepobre = totalVenda * 0.10;
            totalVenda -= descontodepobre;
            System.out.println("PARABÉNS! Você ganhou 10% de desconto!");
            System.out.println("Valor do desconto: R$ " + descontodepobre);
        }
        System.out.println("\n=== COMPRA FINALIZADA ===");
        System.out.println("Itens totais: " + qtdItens);
        System.out.println("Valor a pagar: R$ " + totalVenda);
        System.out.println("Obrigado pela preferência, volte sempre!");
        sc.close();
    }
}
