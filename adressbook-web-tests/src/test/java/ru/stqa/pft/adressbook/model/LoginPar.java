package ru.stqa.pft.adressbook.model;

public class LoginPar {
  private final String username;
  private final String password;

  public LoginPar(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
