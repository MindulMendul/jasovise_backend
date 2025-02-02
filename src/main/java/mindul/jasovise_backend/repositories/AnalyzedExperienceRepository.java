package mindul.jasovise_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mindul.jasovise_backend.domains.AnalyzedExperience;

public interface AnalyzedExperienceRepository extends JpaRepository<AnalyzedExperience, Integer> {
  
}
