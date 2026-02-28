import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto(1, "Computador", 1500.0));
        lista.add(new Produto(2, "Mouse", 50.0));
        lista.add(new Produto(3, "Teclado", 100.0));
        System.out.println(lista);

        Set<Produto> conjunto = new HashSet<>();
        conjunto.add(new Produto(1, "Computador", 1500.0));
        conjunto.add(new Produto(1, "Computador", 1500.0)); // daqui em diante é ignorado.
        conjunto.add(new Produto(1, "Computador", 1500.0));
        conjunto.add(new Produto(1, "Computador", 1500.0));
        System.out.println(conjunto);

        Map<Integer, Produto> mapa = new HashMap<>();
        mapa.put(1, new Produto(1, "Computador", 1500.0));
        mapa.put(2, new Produto(2, "Mouse", 50.0));
        mapa.put(3, new Produto(3, "Teclado", 100.0));
        mapa.put(4, new Produto(1, "Computador", 1500.0)); // se o item for o mesmo, mas em outra posição ele considera novo item
        mapa.put(1, new Produto(1, "Mesa", 200.0)); // se um outro item estiver na mesma posição, ele considera o ultimo item

        System.out.println(mapa);
        benchmark(10000);
        // benchmarkMapa(10000);
    }

    public static void benchmark(int tamanho) {
        List<Produto> lista = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            lista.add(new Produto(i + 1, "produto " + (i + 1), (double) ((i + 1) * 10)));
        }
        int itemBusca = tamanho - 1;
        long ini, fim;
        ini = System.currentTimeMillis();
        for (int count = 1; count <= 1000; count++) {
            for (Produto p : lista) {
                if (p.getId() == itemBusca) ;
                break;

            }
        }

        fim = System.currentTimeMillis();

        System.out.println("Demorou " + (fim - ini) + "ms para finalizar a busca;");
    }
    public static void benchmarkMapa (int tamanho){
        Map<Integer,Produto> mapa =new  HashMap<>();
        for(int i=0;i<tamanho;i++){
            mapa.put(i+1,new Produto(i+1,"produto "+(i+1), (double) ((i+1)*10)));
        }
        int itemBusca = tamanho-1;
        long ini, fim;
        ini = System.currentTimeMillis();

        for (int count = 0;count<1000;count++) {

        }
        if (mapa.get(itemBusca)!=null){

        }
        fim = System.currentTimeMillis();
        System.out.println("Demorou " + (fim - ini) + "ms para finalizar a busca;");

    }
}
