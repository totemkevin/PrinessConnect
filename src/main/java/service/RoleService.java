package service;

import java.util.Date;
import java.util.Optional;

import dao.Role;
import entity.RoleEntity;
import repository.RoleRepository;

public class RoleService {
	private RoleRepository roleRep;
	
	public Role findById(long id) {
		Optional<Role> role = roleRep.findById(id);
		return role.get();
	}
	
	public long createRole(RoleEntity roleEntity) {
		Role role = EntityToDAO(roleEntity);
		role.setCreateDtae(new Date());
		role.setModifyDtae(new Date());
		
		Role result = roleRep.save(role);
		return result.getId();
	}
	
	private Role EntityToDAO(RoleEntity roleEntity) {
		Role role = new Role();
		role.setId(roleEntity.getId());
		role.setName(roleEntity.getName());
		role.setImg(roleEntity.getImg());
		
		return role;
	}
}
