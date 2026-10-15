package br.edu.ifpe.oxefood_api.api.categoriaproduto;
import java.util.List;
import jakarta.transaction.Transactional;

public class CategoriaProdutoService {
    

    private final CategoriaProdutoRepository repository;

    public CategoriaProdutoService(CategoriaProdutoRepository repository) {
       this.repository = repository;
    }

    public CategoriaProduto build(CategoriaProdutoDTO dto) {
        CategoriaProduto categoria = new CategoriaProduto();
        
        if (dto.getId() != null) { // Consultado para a alteração
            categoria = repository.findById(dto.getId()).get();
        }
        
        categoria.setDescricao(dto.getDescricao());
        return categoria;
    }

    @Transactional
    public CategoriaProduto cadastrar(CategoriaProdutoDTO dto) {

        CategoriaProduto categoriaProduto = build(dto);
       categoriaProduto.setHabilitado(true);
        return repository.save(categoriaProduto);
    }

    public List<CategoriaProduto> listar() {
        return repository.findAll();
    }

    public CategoriaProduto buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    public CategoriaProduto atualizar(CategoriaProdutoDTO dto) {
       CategoriaProduto categoriaProduto = build(dto);
        return repository.save(categoriaProduto);
    }

    @Transactional
   public void remover(Long id) {

        CategoriaProduto categoriaProduto = repository.findById(id).get();
        categoriaProduto.setHabilitado(false);
        repository.save(categoriaProduto);
   }
}
