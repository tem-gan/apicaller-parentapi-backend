package com.example.api_caller.controller;

import com.example.api_caller.entity.Parents;
import com.example.api_caller.service.ParentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("parent")
@CrossOrigin("*")
public class ParentController {
    @Autowired
    ParentService service;


    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Parents parent, HttpServletRequest req) {
        return ResponseEntity.ok(service.create(parent, req));
    }
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> read(@PathVariable("id") Long id, HttpServletRequest req) {

        return ResponseEntity.ok(service.read(id, req));
    }
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity<Object> update(@RequestBody Parents parent, HttpServletRequest req) {
        return ResponseEntity.ok(service.update(parent, req));
    }
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") Long id, HttpServletRequest req) {
        service.delete(id, req);
        return ResponseEntity.ok(null);
    }
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<Object> delete(HttpServletRequest req) {
        return ResponseEntity.ok(service.getAll(req));
    }
    //for authentication login
//    @RequestMapping(value = "/method", method = RequestMethod.POST)
//    public ResponseEntity<Object> method(@RequestBody User user, HttpServletRequest req) throws Exception {
//        try {
//
//            User user1=service.methodHelper(user);
//            boolean passwordMatch = Encryption.verifyUserPassword(user.getPassword(),user1.getPassword(),user1.getIv());
//            if(passwordMatch){
//                return ResponseEntity.ok(service.method(user, req));
//            }
//            return (ResponseEntity<Object>) ResponseEntity.status(400);
//        } catch (NotFoundException exception){
//            throw new NotFoundException(exception.getMessage());
//        }
//    }
    @RequestMapping(value = "find", method = RequestMethod.GET)
    public ResponseEntity<Object> getFL(@RequestBody Parents parent, HttpServletRequest req)  {


            return ResponseEntity.ok(service.getFL(parent, req));

    }

}
