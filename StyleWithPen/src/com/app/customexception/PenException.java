package com.app.customexception;

@SuppressWarnings("serial")
public class PenException extends RuntimeException {
  public PenException(String mesg) {
	  super( mesg);
  }
}
