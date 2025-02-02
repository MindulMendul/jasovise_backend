package mindul.jasovise_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mindul.jasovise_backend.domains.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  
}
