package mindul.jasovise_backend.repositories;

import java.util.List;

import mindul.jasovise_backend.domains.Role;
import mindul.jasovise_backend.dtos.SelectStrongPointDTO;

public interface RoleRepositoryCustom {
  List<Role> findStrongPoints(SelectStrongPointDTO strongPointDTO);
}