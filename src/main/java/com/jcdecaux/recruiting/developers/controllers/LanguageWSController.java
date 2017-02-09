package com.jcdecaux.recruiting.developers.controllers;

import com.jcdecaux.recruiting.developers.model.Language;
import com.jcdecaux.recruiting.developers.services.impl.LanguageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageWSController {

  @Autowired
  LanguageServiceImpl languageService;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Language getLanguage(@PathVariable("id") long id) {
    return languageService.findOne(id);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public void saveLanguage(@RequestBody Language language) {
    languageService.save(language);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteLanguage(@PathVariable("id") long id) {
    languageService.delete(id);
  }

}
