package core;
// records são imutaveis

public record Cliente(int id, String nome, String email) {

    static Cliente c = new Cliente(001,"Rodrigo Picolli","rodrigo@email.com");
}
