package com.example.api_caller.repository;

import com.example.api_caller.entity.Parents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ParentRepository extends CrudRepository<Parents, Long> {
    List<Parents> findAll();

    List<Parents> findByFirstnameAndLastname(String firstname, String lastname);

//    Optional<Parents> findByFamilyIdAndFirstName(String firstname, Long familyId);

    Optional<Parents> findByFamilyId(long familyId);

}
