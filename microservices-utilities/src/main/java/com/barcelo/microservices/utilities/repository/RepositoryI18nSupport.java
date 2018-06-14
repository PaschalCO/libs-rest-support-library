package com.barcelo.microservices.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface RepositoryI18nSupport<T, ID extends Serializable> extends JpaRepository<T, ID> {

    public List<T> findByIdLanguageCode(String languageCode);
}
