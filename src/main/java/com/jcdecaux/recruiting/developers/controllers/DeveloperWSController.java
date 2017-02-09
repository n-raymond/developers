package com.jcdecaux.recruiting.developers.controllers;

import com.jcdecaux.recruiting.developers.dao.DeveloperDAO;
import com.jcdecaux.recruiting.developers.dao.LanguageDAO;
import com.jcdecaux.recruiting.developers.model.Developer;
import com.jcdecaux.recruiting.developers.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperWSController {

  @Autowired
  LanguageDAO languageDAO;

  @Autowired
  DeveloperDAO developerDAO;

  @RequestMapping(value = "/language/{id}", method = RequestMethod.GET)
  public Language getLanguage(@PathVariable("id") long id) {
    return languageDAO.findOne(id);
  }

  @RequestMapping(value = "/dev/{id}", method = RequestMethod.GET)
  public Developer getDeveloper(@PathVariable("id") long id) {
    return developerDAO.findOne(id);
  }

}
