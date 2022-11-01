import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class exemplo2 {


    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1L,"Maria"));
        clientes.add(new Cliente(2L,"Joacil"));
        clientes.add(new Cliente(3L,"Vitoria"));

        clientes.forEach(cliente -> System.out.printf("ID: %d, Nome: %s%n",
                cliente.getId(), cliente.getNome()));
    }
}
