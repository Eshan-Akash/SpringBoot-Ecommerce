package dev.eshan.productservice.inheritancedemo.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_ur")
public interface UserRepo extends JpaRepository<User, Long> {
    @Override
    <S extends User> S save(S entity);
}
