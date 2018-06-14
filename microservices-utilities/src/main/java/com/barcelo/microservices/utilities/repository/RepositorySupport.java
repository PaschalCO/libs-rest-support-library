package com.barcelo.microservices.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface RepositorySupport<T, ID extends Serializable> extends JpaRepository<T, ID> {

    public T findByCode(String code);
}
