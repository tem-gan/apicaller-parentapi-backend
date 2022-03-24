package com.example.api_caller.serviceImpl;

import com.example.api_caller.entity.Parents;
import com.example.api_caller.repository.ParentRepository;
import com.example.api_caller.service.ParentService;
import javafx.scene.Parent;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    ParentRepository repository;


    public Parents create(Parents parent, HttpServletRequest req) {
        return repository.save(parent);
    }


    public Parents read(Long id, HttpServletRequest req) {
        return repository.findById(id).orElse(null);
    }


    public Parents update(Parents parent, HttpServletRequest req) {
        return repository.save(parent);
    }


    public void delete(Long id, HttpServletRequest req) {
        repository.deleteById(id);
    }


    public List<Parents> getAll(HttpServletRequest req) {
        List<Parents> parent = repository.findAll();

        return parent;
    }

    public List<Parents> getFL(Parents parent,HttpServletRequest req)  {
        List<Parents> parent1 = repository.findByFirstnameAndLastname(parent.getFirstname(),parent.getLastname() );
        return parent1;
    }
}
