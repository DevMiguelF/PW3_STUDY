package br.com.etechoracio.pw3_study.Entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "TBL_CONEXAO")
public class Conexao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONEXAO")
    private long id;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dt_criacao;

    @JoinColumn(name = "ID_MONITOR")
    @ManyToOne
    private Monitor id_monitor;

}
