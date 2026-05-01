package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserNameException extends DomainException {

  private InvalidUserNameException(final String message) {
    super(message);
  }

  private static final String MSG_USER_NAME_EMPTY = "The user name must not be empty.";
  private static final String MSG_LENGTH_TOO_SHORT = "The user name must have at least %d characters.";

  public static InvalidUserNameException becauseValueIsEmpty() {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserNameException(MSG_USER_NAME_EMPTY);
  }

  public static InvalidUserNameException becauseLengthIsTooShort(final int minimumLength) {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserNameException(
        String.format(MSG_LENGTH_TOO_SHORT, minimumLength));
  }
}
