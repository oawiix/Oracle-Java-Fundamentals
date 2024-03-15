package Java.OracleJavaFundamentals.Inventário;

import java.util.Scanner;

public class ProductTester2 {
    int t;
    public static void main(String[] args) {
        int tempNumber;
        String tempName;
        int tempQty;
        float tempPrice;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos que deseja cadastrar:");
        int qtd = in.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o numero do produto "+"["+(i+1)+"]");
            tempNumber = in.nextInt();
            System.out.println("Digite o nome do produto "+"["+(i+1)+"]");
            tempName = in.next();
            System.out.println("Digite a quantidade do produto "+"["+(i+1)+"]");
            tempQty = in.nextInt();
            System.out.println("Digite o preço do produto "+"["+(i+1)+"]");
            tempPrice = in.nextFloat();
            Produto p = new Produto(tempNumber, tempName, tempQty, tempPrice);
            System.out.println(p.toString());
        }
        in.close();
    }
}
