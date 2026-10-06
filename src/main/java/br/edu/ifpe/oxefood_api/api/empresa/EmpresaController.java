package br.edu.ifpe.oxefood_api.api.empresa;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService service) {
        this.empresaService = service;
    }

    @PostMapping
    public ResponseEntity<Empresa> cadastrar(@RequestBody @Valid EmpresaDTO dto) {
        Empresa cadastrada = empresaService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastrada);
    }

    @GetMapping
    public ResponseEntity<List<Empresa>> listar() {
        return ResponseEntity.ok(empresaService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(empresaService.buscarPorId(id));
    }

    @PutMapping
    public ResponseEntity<Empresa> atualizar(@RequestBody @Valid EmpresaDTO dto) {
        Empresa atualizada = empresaService.atualizar(dto);
        return ResponseEntity.ok(atualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        empresaService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
