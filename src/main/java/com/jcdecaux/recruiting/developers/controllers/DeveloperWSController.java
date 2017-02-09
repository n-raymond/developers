package com.jcdecaux.recruiting.developers.controllers;

import com.jcdecaux.recruiting.developers.model.Language;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperWSController {

  @RequestMapping(value = "/hi/{id}", method = RequestMethod.GET)
  public Language getLanguage(@PathVariable("id") int id) {
    return Language.builder()
        .id(id)
        .name("java")
        .creator("Sun Microsystems")
        .build();
  }

}
