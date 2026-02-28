// para aprimorar o aprendizado, foi inserido o recurso scanner.

package ApiOptional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String scannerId = String.valueOf(sc.nextInt());
        sc.close();
        ProdutoRepo repo = new ProdutoRepo(scannerId);
        Produto p = repo.findById(Integer.parseInt(scannerId)).orElseThrow(()-> new RuntimeException("Este produto não existe!"));
                                                            //.orElse (new Produto(-1, "Produto inexistente", 0)) - posso criar um novo produto
        System.out.println(p);

    }

}
