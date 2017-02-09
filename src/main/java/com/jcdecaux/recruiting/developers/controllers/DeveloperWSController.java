package com.jcdecaux.recruiting.developers.controllers;

import com.jcdecaux.recruiting.developers.dao.DeveloperDAO;
import com.jcdecaux.recruiting.developers.model.Developer;
import com.jcdecaux.recruiting.developers.model.Language;
import com.jcdecaux.recruiting.developers.services.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/developer")
public class DeveloperWSController {

  @Autowired
  DeveloperService developerService;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Developer getDeveloper(@PathVariable("id") long id) {
    return developerService.findOne(id);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public void setDeveloper(@RequestBody Developer developer) {
    developerService.save(developer);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteDeveloper(@PathVariable("id") long id) {
    developerService.delete(id);
  }

  @RequestMapping(value = "/{id}/langage/{languageId}", method = RequestMethod.POST)
  public void addLanguage(@PathVariable("id") long id, @PathVariable("languageId") long languageId) {
    developerService.addLanguage(id, languageId);
  }

  @RequestMapping(value = "/find-by-language/{languageId}", method = RequestMethod.GET)
  public List<Developer> findByLanguage(@PathVariable("languageId") long languageId) {
    return developerService.findByLanguage(languageId);
  }

}
