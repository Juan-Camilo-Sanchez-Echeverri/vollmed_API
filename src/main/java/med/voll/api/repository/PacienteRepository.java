package med.voll.api.repository;

import med.voll.api.models.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PacienteRepository extends JpaRepository<Paciente,Long>{
}
