package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserIdException extends DomainException {

  private InvalidUserIdException(final String message) {
    super(message);
  }

  private static final String MSG_USER_ID_EMPTY = "The user id must not be empty.";

  public static InvalidUserIdException becauseValueIsEmpty() {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserIdException(MSG_USER_ID_EMPTY);
  }
}
