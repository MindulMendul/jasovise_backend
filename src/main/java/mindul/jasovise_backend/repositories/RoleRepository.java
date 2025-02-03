package mindul.jasovise_backend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mindul.jasovise_backend.domains.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>, RoleRepositoryCustom {
  public Optional<Role> findStrongPoints(int roleId);
}
