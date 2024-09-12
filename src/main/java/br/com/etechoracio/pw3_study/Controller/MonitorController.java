package br.com.etechoracio.pw3_study.Controller;

import br.com.etechoracio.pw3_study.Service.MonitorService;
import br.com.etechoracio.pw3_study.dto.MonitorResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/monitores")
public class MonitorController {
    @Autowired
    private MonitorService service;

    @GetMapping
    private List<MonitorResponseDTO> listar(){

        return service.listar();
    }
    @GetMapping("/{id}")
    private MonitorResponseDTO listarID(@PathVariable Long id){
        return service.ListarID(id);
    }

    @PostMapping
    private MonitorResponseDTO Cadastrar(@PathVariable MonitorResponseDTO monitorDTO){
        return service.cadastrar(monitorDTO);
    }

    @PutMapping("/{id}")
    private MonitorResponseDTO atualizar(@PathVariable Long id){
        return service.atualizar(id);
    }

    @DeleteMapping("/{id}")
    private void deletar(@PathVariable Long id){    service.excluir(id);    }

}
