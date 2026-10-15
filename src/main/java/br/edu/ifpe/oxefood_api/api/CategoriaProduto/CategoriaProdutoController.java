package br.edu.ifpe.oxefood_api.api.categoriaproduto;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categoriaproduto")
public class CategoriaProdutoController {
    
      private final CategoriaProdutoService categoriaProdutoService;

  public CategoriaProdutoController(CategoriaProdutoService service) {
    this.categoriaProdutoService = service;
}

    @PostMapping
    public ResponseEntity<CategoriaProduto> cadastrar(@RequestBody @Valid CategoriaProdutoDTO dto) {

        CategoriaProduto categoriaProdutoCadastrado = categoriaProdutoService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaProdutoCadastrado);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaProduto>> listar() {

        return ResponseEntity.ok(categoriaProdutoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaProduto> buscarPorId(@PathVariable Long id) {

        return ResponseEntity.ok(categoriaProdutoService.buscarPorId(id));
    }

    @PutMapping
    public ResponseEntity<CategoriaProduto> atualizar(@RequestBody @Valid CategoriaProdutoDTO dto) {

        CategoriaProduto categoriaProdutoAtualizado = categoriaProdutoService.atualizar(dto);
        return ResponseEntity.ok(categoriaProdutoAtualizado);
    }
    
    @DeleteMapping("/{id}")
   public ResponseEntity<Void> remover(@PathVariable Long id) {

        categoriaProdutoService.remover(id);
        return ResponseEntity.noContent().build();
   }
}
