package ApiReflectionAndAnnotation;


public class Main {
    public static void main(String[] args) throws Exception {
        Product p = new Product(1, "Computador", 1000.0);
       Explorer.exploreMetadata(p);
        Client c = new Client(1,"Rodrigo Picolli","987.654.321-00","rodrigo@rodrigo.com");
       Explorer.exploreMetadata(c);

    }
}