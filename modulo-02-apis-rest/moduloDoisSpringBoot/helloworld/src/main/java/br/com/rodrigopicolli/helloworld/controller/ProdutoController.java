package br.com.rodrigopicolli.helloworld.controller;

import br.com.rodrigopicolli.helloworld.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.IntStream;


@RestController
public class ProdutoController {
    private ArrayList<Produto> database;

    public ProdutoController() {
        database = new ArrayList<>() {{
            add(new Produto(1, "computador", 1500.0));
            add(new Produto(2, "mouse", 50.0));
            add(new Produto(3, "teclado", 100.0));
            add(new Produto(4, "monitor", 500.0));
            add(new Produto(5, "impressora", 350.0));
        }};

    }

    @GetMapping("/produtos")
    public ArrayList<Produto> recuperarTodos() {
        return database;
    }

    @GetMapping("/produtos/{id}")
    public Produto recuperarPeloId(@PathVariable int id) {
        return database.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @PostMapping("/produtos")
    public Produto adicionarProduto (@RequestBody Produto novo){
       database.add(novo);
       return novo;
    }
@PutMapping("/produtos/{id}")
public Produto alterarDados(@PathVariable int id, @RequestBody Produto produto){
int posicao = IntStream.range(0,database.size()).filter(i->database.get(i).getId()==id).findFirst().orElse(-1);

if (posicao >=0 ){
    database.set(posicao,produto);
    return produto;
    }
return null;
}
}

