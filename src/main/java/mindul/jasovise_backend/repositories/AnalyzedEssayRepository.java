package mindul.jasovise_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mindul.jasovise_backend.domains.AnalyzedEssay;

public interface AnalyzedEssayRepository extends JpaRepository<AnalyzedEssay, Integer> {
  
}
