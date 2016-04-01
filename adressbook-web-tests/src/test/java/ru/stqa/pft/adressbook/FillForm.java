package ru.stqa.pft.adressbook;

public class FillForm {
  private final String name;
  private final String lastname;
  private final String login;

  public FillForm(String name, String lastname, String login) {
    this.name = name;
    this.lastname = lastname;
    this.login = login;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getLogin() {
    return login;
  }
}
