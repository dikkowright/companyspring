//package com.example.companyspring.Service;
//
//import com.example.companyspring.Model.Entity.RecuitmentEntity;
//import com.example.companyspring.Model.Request.RecuitmentRequest;
//import com.example.companyspring.Repository.RepositoryRecuitment;
//import org.glassfish.jersey.process.internal.RequestScoped;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RecuitmentService {
//
//
//    private final RepositoryRecuitment repositoryRecuitment;
//
//    public RecuitmentService(RepositoryRecuitment repositoryRecuitment) {
//        this.repositoryRecuitment = repositoryRecuitment;
//    }
//
////    public RecuitmentService(RepositoryRecuitment repositoryRecuitment) {
////      //  Assert.notNull(repositoryRecuitment);
////        this.repositoryRecuitment = repositoryRecuitment;
////    }
//    public RecuitmentEntity createrStaff(RecuitmentRequest recuitmentRequest){
//        RecuitmentEntity recuitmentEntity = repositoryRecuitment.save(createrStaff(recuitmentRequest));
//        return recuitmentEntity;
//    }
//
//
//}
