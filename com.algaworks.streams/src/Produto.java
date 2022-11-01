import java.math.BigDecimal;

public class Produto {

    public enum Status{
        ATIVO,INATIVO
    }

    private String nome;
    private BigDecimal preco;
    private Status status;
    private Categoria categoria;

    public Produto(String nome, BigDecimal preco, Status status) {
        this.nome = nome;
        this.preco = preco;
        this.status = status;
    }

    public Produto(String nome, BigDecimal preco, Status status, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.status = status;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Status getStatus() {
        return status;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public void inativa(){
        System.out.println("Inativando: " + getNome());
        this.status = Status.INATIVO;
    }

}
