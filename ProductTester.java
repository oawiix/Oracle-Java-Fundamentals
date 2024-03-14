package Java.OracleJavaFundamentals;

import java.util.Scanner;

public class ProductTester {
    int t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto(3, "Produto 3", 30, 300);
        Produto p4 = new Produto(4, "Produto 4", 40, 400);
        Produto p5 = new Produto(5, "Produto 5", 50, 500);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p4.getNome()); ;
        System.out.println("Digite um numero");
        int t = in.nextInt();
        p4.setPreco(t);
        System.out.println((int)p4.getPreco());
        in.close();
    }
}
