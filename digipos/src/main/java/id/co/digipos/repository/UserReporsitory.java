package id.co.digipos.repository;

import id.co.digipos.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporsitory extends JpaRepository<User, Long> {

}
