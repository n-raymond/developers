package com.jcdecaux.recruiting.developers.services.impl;

import com.jcdecaux.recruiting.developers.dao.LanguageDAO;
import com.jcdecaux.recruiting.developers.model.Language;
import com.jcdecaux.recruiting.developers.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

  @Autowired
  LanguageDAO languageDAO;

  public Language findOne(long id) {
    return languageDAO.findOne(id);
  }

  public void save(Language language) {
    languageDAO.save(language);
  }

  public void delete(long id) {
    languageDAO.delete(id);
  }

}
