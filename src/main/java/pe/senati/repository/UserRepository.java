package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.senati.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>
{
	@Query(value="select * from users where username=?",nativeQuery=true)
	public abstract UserEntity findByUsername(String username);
}
