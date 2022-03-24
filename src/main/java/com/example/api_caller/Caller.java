package com.example.api_caller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("caller")
public class Caller {

    @RequestMapping("/{id}")
    public List<User> get(@PathVariable("id") String id){
        RestTemplate rt= new RestTemplate();

        List<family>fami=Arrays.asList(
                new family("gg",4),
                new family("abc",5)
        );

        return fami.stream().map(member->{
                    User user=rt.getForObject("http://localhost:8080/user/"+member.getMember(), User.class);
                    System.out.println(user.getId()
                    );
                    return user;
                })
                .collect(Collectors.toList());








    }

}
