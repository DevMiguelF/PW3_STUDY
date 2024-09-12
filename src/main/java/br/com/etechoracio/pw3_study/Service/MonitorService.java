package br.com.etechoracio.pw3_study.Service;

import br.com.etechoracio.pw3_study.Entity.Monitor;
import br.com.etechoracio.pw3_study.Repository.MonitorRepository;
import br.com.etechoracio.pw3_study.dto.MonitorResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository repository;
    private ModelMapper modelMapper = new ModelMapper();


    @Autowired
    public List<MonitorResponseDTO> listar (){
        var monitores = repository.findAll();
        var resultado = monitores.stream().map(
                e-> modelMapper.map(e,MonitorResponseDTO.class)).collect(Collectors.toList());
        return resultado;
    }
    @Autowired
    public MonitorResponseDTO ListarID(Long id){
        var monitor = repository.findById(id);
        return modelMapper.map(monitor,MonitorResponseDTO.class);
    }

    @Autowired
    public MonitorResponseDTO atualizar(Long id){
        var monitor =  repository.findById(id);
        if (monitor.isEmpty()){
            return null;
        }else{
            //modelMapper.map(monitorDTO, monitor.get());
            var monitorAtualizado = repository.save(monitor.get());
            return modelMapper.map(monitorAtualizado, MonitorResponseDTO.class);
        }
    }

    @Autowired
    public void excluir(Long id){
        var monitor = repository.findById(id);
        if (monitor.isEmpty()) {
            throw new RuntimeException("Monitor não encontrado com o ID: " + id);
        }
        else {
            repository.deleteById(id);
        }
    }

    @Autowired
    public MonitorResponseDTO cadastrar(MonitorResponseDTO monitorDTO) {
        var monitor = modelMapper.map(monitorDTO, Monitor.class);
        var monitorSalvo = repository.save(monitor);
        return modelMapper.map(monitorSalvo, MonitorResponseDTO.class);
    }
}



