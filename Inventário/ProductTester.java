package Java.OracleJavaFundamentals.Inventário;

import java.util.Scanner;

public class ProductTester {
    int t;
    public static void main(String[] args) {
        int tempNumber;
        String tempName;
        int tempQty;
        float tempPrice;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero do produto");
        tempNumber = in.nextInt();
        System.out.println("Digite o nome do produto");
        tempName = in.next();
        System.out.println("Digite a quantidade do produto");
        tempQty = in.nextInt();
        System.out.println("Digite o preço do produto");
        tempPrice = in.nextFloat();
        Produto p1 = new Produto(tempNumber, tempName, tempQty, tempPrice);
        /*System.out.println("Digite o numero do segundo produto");
        tempNumber = in.nextInt();
        System.out.println("Digite o nome do segundo produto");
        tempName = in.next();
        System.out.println("Digite a quantidade do segundo produto");
        tempQty = in.nextInt();
        System.out.println("Digite o preço do segundo produto");
        tempPrice = in.nextFloat();*/
        Produto p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);
        Produto p3 = new Produto();
        Produto p4 = new Produto(3, "Produto 3", 30, 300);
        Produto p5 = new Produto(4, "Produto 4", 40, 400);
        Produto p6 = new Produto(5, "Produto 5", 50, 500);
        p6.setAtivo(false);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        in.close();
    }
}
