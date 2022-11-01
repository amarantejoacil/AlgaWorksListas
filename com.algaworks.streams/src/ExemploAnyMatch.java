import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExemploAnyMatch {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Categoria categoriaBebidas = new Categoria("Bebidas");
        Categoria categoriaCarnes = new Categoria("Carnes");
        Categoria categoriaOutros = new Categoria("Outros");

        produtos.add(new Produto("Agua", new BigDecimal(9.9), Produto.Status.ATIVO, categoriaBebidas));
        produtos.add(new Produto("Picanha", new BigDecimal(99.99), Produto.Status.ATIVO, categoriaCarnes));
        produtos.add(new Produto("Carvao", new BigDecimal(19.9), Produto.Status.INATIVO, categoriaOutros));
        produtos.add(new Produto("Cerveja", new BigDecimal(39.9), Produto.Status.ATIVO, categoriaBebidas));
        produtos.add(new Produto("cupim", new BigDecimal(139.9), Produto.Status.ATIVO, categoriaCarnes));

        //modelo tradicional
//        boolean temPicanha = false;
//        for(Produto produto : produtos){
//            if(produto.getNome().equals("Picanha")){
//                temPicanha = true;
//                break;
//            }
//        }
//        System.out.println(temPicanha);

        //modelo com lambda
//        boolean temPicanha = produtos.stream().anyMatch(p -> p.getNome().equals("Picanha"));
//        System.out.println(temPicanha);

    }
}
