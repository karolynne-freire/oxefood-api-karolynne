package br.edu.ifpe.oxefood_api.api.cliente;

import java.time.LocalDate;

import br.edu.ifpe.oxefood_api.util.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;




@Entity
@Table(name = "Cliente")
@SQLRestriction("habilitado = true")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cliente extends EntidadeAuditavel  {
  
   @Column
   private String nome;
   @Column
   private LocalDate dataNascimento;
   @Column
   private String cpf;
   @Column
   private String foneCelular;
   @Column
   private String foneFixo;

}
