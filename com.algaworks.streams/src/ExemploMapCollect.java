import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExemploMapCollect {

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

        //modelo tradicional - antigo
//        List<Categoria> categoriasLista = new ArrayList<>();
//        for (Produto produto: produtos){
//            if(produto.getStatus().equals(Produto.Status.ATIVO)){
//                Categoria categoria = produto.getCategoria();
//                if (!categoriasLista.contains(categoria)) {
//                    categoriasLista.add(categoria);
//                }
//            }
//        }


//        System.out.println(categoriasLista);

    }
}
