package com.edu.unab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edu.unab.modelo.entity.Propietario;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Integer> {

}
