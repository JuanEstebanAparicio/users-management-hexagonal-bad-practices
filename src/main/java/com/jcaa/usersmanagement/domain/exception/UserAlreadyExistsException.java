package com.jcaa.usersmanagement.domain.exception;

public final class UserAlreadyExistsException extends DomainException {

  private UserAlreadyExistsException(final String message) {
    super(message);
  }

  // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
  // CORREGIDO
  private static final String MSG_USER_ALREADY_EXISTS = "A user with email '%s' already exists.";

  public static UserAlreadyExistsException becauseEmailAlreadyExists(final String email) {
    // VIOLACIÓN Regla 10: texto de error hardcodeado directamente en el método
    // fábrica.
    // CORREGIDO
    return new UserAlreadyExistsException(String.format(MSG_USER_ALREADY_EXISTS, email));
  }
}
