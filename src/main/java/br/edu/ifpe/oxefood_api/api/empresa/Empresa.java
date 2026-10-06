package br.edu.ifpe.oxefood_api.api.empresa;

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
@Table(name = "Empresa")
@SQLRestriction("habilitado = true")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresa extends EntidadeAuditavel {
  
    @Column
    private String site;

    @Column(nullable = false, unique = true, length = 20)
    private String cnpj;

    @Column(length = 30)
    private String inscricaoEstadual;

    @Column(nullable = false, length = 150)
    private String nomeEmpresarial;

    @Column(length = 150)
    private String nomeFantasia;

    @Column(length = 20)
    private String fone;

    @Column(length = 20)
    private String foneAlternativo;
}
