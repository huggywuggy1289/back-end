package com.ultimate.mathfusion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ultimate.mathfusion.entity.User;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email); //이메일로 사용자 정보가져온다.
}
