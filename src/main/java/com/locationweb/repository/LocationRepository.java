package com.locationweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locationweb.entity.Location;
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
