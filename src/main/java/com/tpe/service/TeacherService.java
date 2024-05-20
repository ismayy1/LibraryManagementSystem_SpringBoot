package com.tpe.service;


import com.tpe.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    /*
        we have 3 types of injections in springBoot:
            1. Failed injection
            2. Constructor injection
            3. Setter injection
     */
    @Autowired  // this injection called Failed injection
    private TeacherRepository teacherRepository;

}
