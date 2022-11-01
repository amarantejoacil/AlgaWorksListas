import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemploFilterForEach {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Agua", new BigDecimal(9.9), Produto.Status.ATIVO ));
        produtos.add(new Produto("Feijão", new BigDecimal(5.9), Produto.Status.ATIVO ));
        produtos.add(new Produto("Carvão", new BigDecimal(20.00), Produto.Status.INATIVO ));
        produtos.add(new Produto("Cerveja", new BigDecimal(32.50), Produto.Status.ATIVO ));
        produtos.add(new Produto("Cupoim", new BigDecimal(102.50), Produto.Status.ATIVO ));

        //modelo tradicional
//        for(Produto produto : produtos){
//            if(produto.getNome().startsWith("C")){
//                produto.inativa();
//            }
//        }

        //exemplo utilizando streams
//        Predicate<Produto> predicate = p -> p.getNome().startsWith("C");
//        Consumer<Produto> consumer = p -> p.inativa();
//
//        Stream<Produto> produtoStream = produtos.stream().filter(predicate);
//        produtoStream.forEach(consumer);

        //exemplo resumido do streams
        produtos.stream().filter(p -> p.getNome().startsWith("C")).forEach(Produto::inativa);

    }
}
