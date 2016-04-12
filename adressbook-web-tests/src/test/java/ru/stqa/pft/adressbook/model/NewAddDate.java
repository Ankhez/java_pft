package ru.stqa.pft.adressbook.model;

/**
 * Created by vity on 05.04.2016.
 */
public class NewAddDate {
  private final String name;
  private final String header;
  private final String footer;
  private String group;

  public NewAddDate(String name, String header, String footer,String group) {
    this.name = name;
    this.header = header;
    this.footer = footer;
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}
