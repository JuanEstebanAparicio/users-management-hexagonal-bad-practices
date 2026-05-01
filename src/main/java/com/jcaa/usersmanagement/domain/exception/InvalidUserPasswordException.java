package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserPasswordException extends DomainException {

  private InvalidUserPasswordException(final String message) {
    super(message);
  }

  private static final String MSG_USER_PASSWORD_EMPTY = "The user password must not be empty.";
  private static final String MSG_LENGTH_TOO_SHORT = "The user password must have at least %d characters.";

  public static InvalidUserPasswordException becauseValueIsEmpty() {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserPasswordException(MSG_USER_PASSWORD_EMPTY);
  }

  public static InvalidUserPasswordException becauseLengthIsTooShort(final int minimumLength) {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserPasswordException(
        String.format(MSG_LENGTH_TOO_SHORT, minimumLength));
  }
}
