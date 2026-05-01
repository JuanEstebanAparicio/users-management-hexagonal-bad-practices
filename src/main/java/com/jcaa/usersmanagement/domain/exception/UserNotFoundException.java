package com.jcaa.usersmanagement.domain.exception;

public final class UserNotFoundException extends DomainException {

  private UserNotFoundException(final String message) {
    super(message);
  }

  private static final String MSG_USER_NOT_FOUND = "The user with id '%s' was not found.";

  public static UserNotFoundException becauseIdWasNotFound(final String userId) {
    // VIOLACIÓN Regla 10: texto de error hardcodeado directamente en el método
    // fábrica.
    // CORREGIDO
    return new UserNotFoundException(String.format(MSG_USER_NOT_FOUND, userId));
  }
}
