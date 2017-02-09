package com.jcdecaux.recruiting.developers.model;

import java.util.UUID;

public class Developer {

  private long id;
  private String firstName;
  private String lastName;
  private Language language;

  /* Constructors */

  public Developer() {
  }

  public Developer(long id, String firstName, String lastName, Language language) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.language = language;
  }


  /* Getters / Setters */

  public long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Language getLanguage() {
    return language;
  }


  /* Object methods */

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Developer developer = (Developer) o;

    if (id != developer.id) return false;
    if (firstName != null ? !firstName.equals(developer.firstName) : developer.firstName != null) return false;
    if (lastName != null ? !lastName.equals(developer.lastName) : developer.lastName != null) return false;
    return language != null ? language.equals(developer.language) : developer.language == null;
  }

  @Override
  public int hashCode() {
    int result = (int) (id ^ (id >>> 32));
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (language != null ? language.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Developer{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", language=" + language +
        '}';
  }


}
