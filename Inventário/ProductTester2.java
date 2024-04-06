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
        char option = '0';
        do
        {
            System.out.println(
                "---------------------"
                +"\nDigite a opção desejada:"
                +"\n1 - Exibir inventário"
                +"\n2 - Adicionar estoque"
                +"\n3 - Deduzir estoque"
                +"\n4 - Descontinuar produto"
                +"\n0 - Sair"
                +"\n Escolha uma opção: "
                +"\n---------------------");
                switch (option){
                    case '1':
                        System.out.println("Exibir inventário");
                        displayInventory(po, maxSize);
                        break;
                    case '2':
                        System.out.println("Adicionar estoque, digite o numero do produto: ");
                        int num = in.nextInt();
                        int qty = in.nextInt();
                        po[num].addEstoque(qty);
                        break;
                    case '3':
                        System.out.println("Deduzir estoque");
                        break;
                    case '4':
                        System.out.println("Descontinuar produto");
                        break;
                    case '5':
                        System.out.println("Sair");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
        }
            while(option != '0');
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