package repository;

import org.springframework.data.repository.CrudRepository;

import dao.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
}
