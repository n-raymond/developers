package com.jcdecaux.recruiting.developers.dao;

import com.jcdecaux.recruiting.developers.model.Developer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperDAO extends CrudRepository<Developer, Long>{

}
