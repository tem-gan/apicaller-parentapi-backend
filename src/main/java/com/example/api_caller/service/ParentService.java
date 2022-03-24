package com.example.api_caller.service;

import com.example.api_caller.entity.Parents;
import javassist.NotFoundException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ParentService {
    Parents create(Parents parent, HttpServletRequest req);

    Parents read(Long id, HttpServletRequest req);

    Parents update(Parents parent, HttpServletRequest req);

    void delete(Long id, HttpServletRequest req);

    List<Parents> getAll(HttpServletRequest req);

    List<Parents> getFL(Parents parent, HttpServletRequest req);
//    Parents login(Parents parent, HttpServletRequest req) throws NotFoundException;
//
//    Parents method(Parents parent, HttpServletRequest req) throws NotFoundException;
//
//    Parents methodHelper(Parents parent) throws NotFoundException;
}
