package com.grutten.readinglist;

public class HelloGreeting {

  public String message;

  public HelloGreeting() {};

  public HelloGreeting(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
