package com.jcdecaux.recruiting.developers.model;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Language {

  private UUID id;
  private String name;
  private List<String> paradigmes;
  private String creator;


  /* Constructors */

  public Language() {
  }

  public Language(UUID id, String name, List<String> paradigmes, String creator) {
    this.id = id;
    this.name = name;
    this.paradigmes = paradigmes;
    this.creator = creator;
  }



  /* Getters / Setters */

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<String> getParadigmes() {
    return paradigmes;
  }

  public String getCreator() {
    return creator;
  }



  /* Object methods */

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Language language = (Language) o;

    if (id != null ? !id.equals(language.id) : language.id != null) return false;
    if (name != null ? !name.equals(language.name) : language.name != null) return false;
    if (paradigmes != null ? !paradigmes.equals(language.paradigmes) : language.paradigmes != null) return false;
    return creator != null ? creator.equals(language.creator) : language.creator == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (paradigmes != null ? paradigmes.hashCode() : 0);
    result = 31 * result + (creator != null ? creator.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Language{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", paradigmes=" + paradigmes +
        ", creator='" + creator + '\'' +
        '}';
  }

  /* Builder */

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private UUID id = null;
    private String name = null;
    private List<String> paradigmes = new ArrayList<String>();
    private String creator = null;

    private Builder() {
    }

    public Builder id(UUID id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder paradigme(String paradigme) {
      this.paradigmes.add(paradigme);
      return this;
    }

    public Builder creator(String creator) {
      this.creator = creator;
      return this;
    }

    public Language build() {
      Language language = new Language(id, name, paradigmes, creator);
      return language;
    }
  }

}
