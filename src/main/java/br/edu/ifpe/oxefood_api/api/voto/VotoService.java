package br.edu.ifpe.oxefood_api.api.voto;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;


@Service
public class VotoService {

    private final VotoRepository repository;

    public VotoService(VotoRepository repository) {
       this.repository = repository;
    }

    public Voto build(VotoDTO dto) {
        Voto voto = new Voto();
        
        if (dto.getId() != null) { // Consultado para a alteração
            voto = repository.findById(dto.getId()).get();
        }

     voto.setNomeEleitor(dto.getNomeEleitor());
     voto.setNumeroRegistroEleitoral(dto.getNumeroRegistroEleitoral());
     voto.setDataCriacao(dto.getDataVotacao());
     voto.setNumeroCandidatoDepFederal(dto.getNumeroCandidatoDepFederal());
     voto.setNumeroCandidatoDepEstadual(dto.getNumeroCandidatoDepEstadual());
     voto.setNumeroCandidatoSenador(dto.getNumeroCandidatoSenador());
     voto.setNumeroCandidatoGovernador(dto.getNumeroCandidatoGovernador());
     voto.setNumeroCandidatoPresidente(dto.getNumeroCandidatoPresidente());
        return voto;
    }

    @Transactional
    public Voto cadastrar(VotoDTO dto) {

        Voto voto = build(dto);
        voto.setHabilitado(true);
        return repository.save(voto);
    }

    public List<Voto> listar() {
        return repository.findAll();
    }

    public Voto buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    public Voto atualizar(VotoDTO dto) {
        Voto voto = build(dto);
        return repository.save(voto);
    }

    @Transactional
   public void remover(Long id) {

       Voto voto = repository.findById(id).get();
        voto.setHabilitado(false);

        repository.save(voto);
   }
    
}
