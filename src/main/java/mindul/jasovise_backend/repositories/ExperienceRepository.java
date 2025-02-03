package mindul.jasovise_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mindul.jasovise_backend.domains.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
  
}
