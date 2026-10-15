package br.edu.ifpe.oxefood_api.api.voto;
import br.edu.ifpe.oxefood_api.util.EntidadeAuditavel;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Voto")
@SQLRestriction("habilitado = true")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Voto extends EntidadeAuditavel {
    

   @Column (nullable = false, length = 100)
   private String  nomeEleitor;
   @Column (unique = true)
   private String numeroRegistroEleitoral;
   @Column
   private LocalDate dataVotacao;
   @Column 
   private Integer numeroCandidatoDepFederal;
   @Column 
   private Integer numeroCandidatoDepEstadual;
   @Column 
   private Integer numeroCandidatoSenador;
   @Column 
   private Integer numeroCandidatoGovernador;
    @Column 
   private Integer numeroCandidatoPresidente;
  
}
