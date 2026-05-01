package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserStatusException extends DomainException {

  private InvalidUserStatusException(final String message) {
    super(message);
  }

  // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
  // CORREGIDO
  private static final String MSG_USER_STATUS_INVALID = "The user status '%s' is not valid.";

  public static InvalidUserStatusException becauseValueIsInvalid(final String status) {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserStatusException(String.format(MSG_USER_STATUS_INVALID, status));
  }
}
