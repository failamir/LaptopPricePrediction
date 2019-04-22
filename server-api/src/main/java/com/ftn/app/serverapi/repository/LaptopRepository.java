package com.ftn.app.serverapi.repository;

import com.ftn.app.serverapi.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

    Optional<Laptop> getOneById(Long id);

    List<Laptop> findAllByOrderByPriceDesc();

}
