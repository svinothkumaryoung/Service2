package com.micros.service2.Service2.repo;

import com.micros.service2.Service2.entity.Manufactuer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManuRepo extends JpaRepository<Manufactuer,Integer> {

    Manufactuer findByManufacuterId(Integer id);
}
