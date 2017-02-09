package com.jcdecaux.recruiting.developers.services;

import com.jcdecaux.recruiting.developers.model.Developer;
import com.jcdecaux.recruiting.developers.model.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeveloperService {

  Developer findOne(long id);

  void save(Developer developer);

  void delete(long id);

  void addLanguage(long id, long languageId);

  List<Developer> findByLanguage(long id);

}
