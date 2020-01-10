package com.example.companyspring.Repository;

import com.example.companyspring.Model.Entity.RecuitmentEntity;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.Query;
@RequestScoped
public interface RepositoryRecuitment extends CrudRepository<RecuitmentEntity, Long> {

    RecuitmentEntity findOneById (Long id);
    RecuitmentEntity findAllByDepartment (String department);

}
