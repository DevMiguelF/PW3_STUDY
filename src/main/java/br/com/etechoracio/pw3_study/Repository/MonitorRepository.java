package br.com.etechoracio.pw3_study.Repository;

import br.com.etechoracio.pw3_study.Entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor ,Long> {
}
