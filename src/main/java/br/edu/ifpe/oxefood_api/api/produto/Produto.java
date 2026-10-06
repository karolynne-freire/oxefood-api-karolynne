package br.edu.ifpe.oxefood_api.api.produto;
import br.edu.ifpe.oxefood_api.api.empresa.Empresa;
import br.edu.ifpe.oxefood_api.util.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "Produto")
@SQLRestriction("habilitado = true")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto extends EntidadeAuditavel {

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @Column(nullable = false, length = 50)
    private String codigo;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(length = 255)
    private String descricao;

    @Column(nullable = false)
    private Double valorUnitario;

    @Column
    private Integer tempoEntregaMinimo;

    @Column
    private Integer tempoEntregaMaximo;
}
