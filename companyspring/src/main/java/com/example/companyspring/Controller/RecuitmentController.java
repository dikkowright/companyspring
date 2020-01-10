package com.example.companyspring.Controller;

import com.example.companyspring.Model.Entity.RecuitmentEntity;
import com.example.companyspring.Model.Request.RecuitmentRequest;
import com.example.companyspring.Repository.RepositoryRecuitment;


import org.springframework.web.bind.annotation.*;


import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController

@RequestMapping("/recruitment")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RecuitmentController {
//
//    @Autowired
//    private RecuitmentService service;
//
//    public RecuitmentController(RecuitmentService service) {
//        this.service = service;
//    }


    private RepositoryRecuitment repo;

    public RecuitmentController(RepositoryRecuitment repo) {
        this.repo = repo;
    }

    //    @Transactional
//    @RequestMapping(method = RequestMethod.POST)
//    public RecuitmentEntity createrStaff(RecuitmentRequest recuitmentRequest){
//        RecuitmentEntity recuitmentEntity = service.createrStaff(recuitmentRequest);
//        return recuitmentEntity;
//    }

    @PostMapping
    public RecuitmentEntity createStaff(@RequestBody RecuitmentEntity recuitmentEntity /*RecuitmentRequest recuitmentRequest*/){
       //RecuitmentEntity recuitmentEntity = repo.save(createStaff(recuitmentRequest));
        return repo.save(recuitmentEntity);
    }
}
