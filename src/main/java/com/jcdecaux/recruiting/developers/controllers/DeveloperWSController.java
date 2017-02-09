package com.jcdecaux.recruiting.developers.controllers;

import com.jcdecaux.recruiting.developers.model.Language;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class DeveloperWSController {

  @RequestMapping(value = "/hi/{id}", method = RequestMethod.GET)
  public @ResponseBody Language getLanguage(@PathVariable("id") UUID id) {
    return Language.builder()
        .id(id)
        .name("java")
        .paradigme("Object")
        .creator("Sun Microsystems")
        .build();
  }

}
