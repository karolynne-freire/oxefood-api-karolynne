package br.edu.ifpe.oxefood_api.api.produto;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService service) {
        this.produtoService = service;
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody @Valid ProdutoDTO dto) {
        Produto cadastrado = produtoService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastrado);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        return ResponseEntity.ok(produtoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }

    @PutMapping
    public ResponseEntity<Produto> atualizar(@RequestBody @Valid ProdutoDTO dto) {
        Produto atualizado = produtoService.atualizar(dto);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        produtoService.remover(id);
        return ResponseEntity.noContent().build();
    }
}