package com.jcdecaux.recruiting.developers.dao;


import com.jcdecaux.recruiting.developers.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageDAO extends CrudRepository<Language, Long> {

}
