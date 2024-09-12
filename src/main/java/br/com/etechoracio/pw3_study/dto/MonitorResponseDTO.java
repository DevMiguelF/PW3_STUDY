package br.com.etechoracio.pw3_study.dto;

import br.com.etechoracio.pw3_study.Entity.Disciplina;
import br.com.etechoracio.pw3_study.Entity.Disponibilidade;
import lombok.Data;

import java.util.List;

@Data
public class MonitorResponseDTO {

    private String tx_nome;
    private String tx_foto;
    private String tx_whatsapp;
    private String tx_email;
    private String tx_conteudo;
    private Disciplina disciplina;
    private List<Disponibilidade> disponibilidades;
}
