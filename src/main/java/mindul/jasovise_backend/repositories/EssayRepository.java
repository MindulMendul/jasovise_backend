package mindul.jasovise_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mindul.jasovise_backend.domains.Essay;

public interface EssayRepository extends JpaRepository<Essay, Integer> {
  
}
