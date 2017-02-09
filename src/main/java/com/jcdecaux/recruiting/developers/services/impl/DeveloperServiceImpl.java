package com.jcdecaux.recruiting.developers.services.impl;

import com.jcdecaux.recruiting.developers.dao.DeveloperDAO;
import com.jcdecaux.recruiting.developers.dao.LanguageDAO;
import com.jcdecaux.recruiting.developers.model.Developer;
import com.jcdecaux.recruiting.developers.model.Language;
import com.jcdecaux.recruiting.developers.services.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {

  @Autowired
  DeveloperDAO developerDAO;

  @Autowired
  LanguageDAO languageDAO;

  public Developer findOne(long id) {
    return developerDAO.findOne(id);
  }

  public void save(Developer developer) {
    developerDAO.save(developer);
  }

  public void delete(long id) {
    developerDAO.delete(id);
  }

  public void addLanguage(long id, long languageId) {
    Developer dev = developerDAO.findOne(id);
    Language lang = languageDAO.findOne(languageId);
    dev.setLanguage(lang);
  }

  public List<Developer> findByLanguage(long id) {
    return developerDAO.findByLanguage(id);
  }

}
