package com.jcdecaux.recruiting.developers.services;

import com.jcdecaux.recruiting.developers.model.Language;
import org.springframework.stereotype.Service;

@Service
public interface LanguageService {

  Language findOne(long id);

  void save(Language language);

  void delete(long id);
}
