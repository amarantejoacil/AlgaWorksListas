import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class exemplo1 {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();


        nomes.add("josé");
        nomes.add("maria");
        nomes.add("naruto");

        //modelo 01 :
        //removendo indice zero
//        nomes.remove(0);
//        System.out.println(nomes);

        //modelo 02: interando com for
//        for(int i = 0; i < nomes.size();i++){
//            System.out.println("Nome: " + nomes.get(i));
//        }

        //modelo 03: for otimizado para cada elemento da lista "nomes", intera nome
//        for(String nome : nomes){
//            System.out.println("Nome: " + nome);
//        }

        //utilizando modelo 03
//        nomes.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //utilizando modelo 04 - utilizando lambda expression
//        nomes.forEach(nome -> {
//            System.out.println(nome);
//        });

    }

}
