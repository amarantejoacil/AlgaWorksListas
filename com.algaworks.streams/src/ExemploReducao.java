import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploReducao {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Categoria categoriaBebidas = new Categoria("Bebidas");
        Categoria categoriaCarnes = new Categoria("Carnes");
        Categoria categoriaOutros = new Categoria("Outros");

        produtos.add(new Produto("Agua", new BigDecimal(9.2), Produto.Status.ATIVO, categoriaBebidas));
        produtos.add(new Produto("Picanha", new BigDecimal(99.00), Produto.Status.ATIVO, categoriaCarnes));
        produtos.add(new Produto("Carvao", new BigDecimal(19.3), Produto.Status.INATIVO, categoriaOutros));
        produtos.add(new Produto("Cerveja", new BigDecimal(39.4), Produto.Status.ATIVO, categoriaBebidas));
        produtos.add(new Produto("cupim", new BigDecimal(139.2), Produto.Status.ATIVO, categoriaCarnes));

//        modelo tradicional
//        BigDecimal total = BigDecimal.ZERO;
//        for(Produto produto : produtos){
//            if(produto.getStatus().equals(Produto.Status.ATIVO)){
//                total = total.add(produto.getPreco());
//            }
//        }
//        System.out.println(total);

        BinaryOperator<BigDecimal> operacao = (x,y) -> x.add(y);
        BigDecimal total = produtos.stream().filter(p -> p.getStatus().equals(Produto.Status.ATIVO))
                .map(Produto::getPreco)
                .reduce(BigDecimal.ZERO, operacao);

        System.out.println(total);

    }
}
