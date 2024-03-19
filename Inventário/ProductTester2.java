package Java.OracleJavaFundamentals.Inventário;

import java.util.Scanner;

public class ProductTester2 {
    int t;
    public static void main(String[] args) {
        int tempNumber;
        String tempName;
        int tempQty;
        float tempPrice;
        int maxSize=-1;
        Scanner in = new Scanner(System.in);
        while (maxSize < 0){
            try{
                System.out.println("Digite a quantidade de produtos que deseja cadastrar: (0) para sair.");
            maxSize = in.nextInt();
            if (maxSize < 0){
                System.out.println("Valor incorreto, digite um valor maior que zero.");
            }
        } catch (Exception e){
            System.out.println("Tipo incorreto de dados inserido");
            in.next();
        }
        int qtd = maxSize;
        Produto[] po = new Produto[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o numero do produto "+"["+(i+1)+"]");
            tempNumber = in.nextInt();
            System.out.println("Digite o nome do produto "+"["+(i+1)+"]");
            tempName = in.next();
            System.out.println("Digite a quantidade do produto "+"["+(i+1)+"]");
            tempQty = in.nextInt();
            System.out.println("Digite o preço do produto "+"["+(i+1)+"]");
            tempPrice = in.nextFloat();
            po[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);
        }
        if(maxSize == 0){
            System.out.println("Nenhum produto cadastrado.");
        }
        else{
            for (int i = 0; i <= po.length-1; i++) {
                System.out.println(po[i].toString());
            }
        
        }
        in.close();
    }
}
}