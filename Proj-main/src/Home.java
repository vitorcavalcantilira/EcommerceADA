package src;
import src.Produtos.Informatica;
import src.Produtos.Livro;
import src.Produtos.Mercado;
import src.Usuario.Admin;
import src.Usuario.Cliente;

public class Home extends Etapa01 {

    public static <String> void main(String[] args) {

        Admin Tipo1 = new Admin();
        Cliente CLT1 = new Cliente("Vitor", "Rua Um", "1122-3344");

        Livro ABC = new Livro(
                "ABCÊ DÁRIO",
                34,
                "INFANTIL",
                "ABC",
                "XUXA",
                26);

        Informatica teclado = new Informatica(
                "FONE",
                99,
                "HEADSET",
                "JBL",
                0);

        Mercado CAFE = new Mercado(
                "CAFE",
                10,
                "GRAO",
                "MELITA",
                "GRAO",
                true);


        Tipo1.cadastrarProduto(ABC);
        Tipo1.cadastrarProduto(teclado);
        Tipo1.cadastrarProduto(CAFE);

        Tipo1.removerProduto(CAFE);
        Tipo1.visualizarProdutos();
        CLT1.ordenarPorPreco();
        CLT1.ordenarPorNome();

    }
}
