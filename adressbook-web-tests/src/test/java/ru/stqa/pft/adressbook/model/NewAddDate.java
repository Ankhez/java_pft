package ru.stqa.pft.adressbook.model;

/**
 * Created by vity on 05.04.2016.
 */
public class NewAddDate {
  private final String name;
  private final String header;
  private final String footer;
  public NewAddDate(String name, String header, String footer) {
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }
}
