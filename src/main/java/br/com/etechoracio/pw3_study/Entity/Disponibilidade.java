package br.com.etechoracio.pw3_study.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISPONIBILIDADE")
    private long id;

    @Column(name = "TX_DIA_SEMANA")
    private  String tx_dia_semana;

    @Column(name = "DT_DAS")
    private LocalDateTime dt_das;

    @Column(name = "DT_ATE")
    private LocalDateTime dt_ate;

}
