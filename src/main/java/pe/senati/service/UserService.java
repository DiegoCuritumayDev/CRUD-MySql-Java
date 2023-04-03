package pe.senati.service;

import pe.senati.entity.UserEntity;

public interface UserService 
{
	public abstract UserEntity findByUsername(String username);
}
