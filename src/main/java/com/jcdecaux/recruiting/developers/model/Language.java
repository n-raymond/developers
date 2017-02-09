package com.jcdecaux.recruiting.developers.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private String creator;

  //TODO: Add paradigmes


  /* Constructors */

  public Language() {
  }

  public Language(long id, String name, String creator) {
    this.id = id;
    this.name = name;
    this.creator = creator;
  }



  /* Getters / Setters */

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
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

    if (id != language.id) return false;
    if (name != null ? !name.equals(language.name) : language.name != null) return false;
    return creator != null ? creator.equals(language.creator) : language.creator == null;
  }

  @Override
  public int hashCode() {
    int result = (int) (id ^ (id >>> 32));
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (creator != null ? creator.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Language{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", creator='" + creator + '\'' +
        '}';
  }

  /* Builder */

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private long id;
    private String name = null;
    private String creator = null;

    private Builder() {
    }

    public Builder id(long id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder creator(String creator) {
      this.creator = creator;
      return this;
    }

    public Language build() {
      Language language = new Language(id, name, creator);
      return language;
    }
  }

}
