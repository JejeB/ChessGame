package com.cir3.chessgame.repository;

import com.cir3.chessgame.domain.Authority;
import com.cir3.chessgame.domain.Cases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Long> {
    ArrayList<Authority> findByAuthorityEquals(String authority);
}
