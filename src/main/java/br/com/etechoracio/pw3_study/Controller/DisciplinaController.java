package br.com.etechoracio.pw3_study.Controller;

import br.com.etechoracio.pw3_study.Entity.Disciplina;
import br.com.etechoracio.pw3_study.Service.DisciplinaService;
import br.com.etechoracio.pw3_study.dto.DisciplinaResponseDTO;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService service;

    @GetMapping
    private List<DisciplinaResponseDTO> listar(){

        return service.listar();
    }

}
