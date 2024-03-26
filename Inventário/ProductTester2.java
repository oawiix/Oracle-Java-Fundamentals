package Java.OracleJavaFundamentals.Inventário;

import java.util.Scanner;

public class ProductTester2 {
    int t;
    public static void main(String[] args) {
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
        addToInventory(po); // método retorna um array de objetos Produto
        displayInventory(po, maxSize);
        getNumProducts(maxSize);
    }
        in.close();
}





    static void addToInventory(Produto[] po) // metodo para adicionar produtos
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < po.length; i++) {
            System.out.println("Digite o numero do produto "+"["+(i+1)+"]");
            int tempNumber = in.nextInt();
            System.out.println("Digite o nome do produto "+"["+(i+1)+"]");
            String tempName = in.next();
            System.out.println("Digite a quantidade do produto "+"["+(i+1)+"]");
            int tempQty = in.nextInt();
            System.out.println("Digite o preço do produto "+"["+(i+1)+"]");
            float tempPrice = in.nextFloat();
            po[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);
        }
        in.close();
    }
    static void displayInventory(Produto[] po, int maxSize) // metodo para mostrar os produtos
    {
        if(maxSize == 0){
            System.out.println("Nenhum produto cadastrado.");
        }
        for (int i = 0; i < po.length; i++) {
            System.out.println(po[i].toString());
        }
    }
    static void getNumProducts(int maxSize){
        System.out.println(
        "---------------------"
        +"\nNúmero de produtos cadastrados: "
        +maxSize
        +"\n---------------------");
    }
}