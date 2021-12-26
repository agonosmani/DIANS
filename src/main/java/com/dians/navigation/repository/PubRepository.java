package com.dians.navigation.repository;

import com.dians.navigation.model.FastFood;
import com.dians.navigation.model.Pub;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PubRepository extends JpaRepository<Pub, Long> {

    List<Pub> findAllByNameContainingIgnoreCase(String name);

    Page<Pub> findAll(Pageable pageable);

    void deleteByName(String name);

    void deleteById(Long id);
}
