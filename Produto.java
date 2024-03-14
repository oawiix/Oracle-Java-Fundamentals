package Java.OracleJavaFundamentals;

public class Produto {

    int num=0;
    String nome="Produto";
    int estoque=0;
    float preco=0;

    public Produto() {
    }

    public Produto(int num, String nome, int estoque, float preco) {
        this.num = num;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public int getNum() {
        return num;
    }  
    public String getNome() {
        return nome;
    }
    public int getEstoque() {
        return estoque;
    }
    public float getPreco() {
        return preco;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String toString() {
        return "Produto (" + "num=" + num + ", nome=" + nome + ", estoque=" + estoque + ", preco=" + preco + ')';
    }


}
