package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserEmailException extends DomainException {

  private InvalidUserEmailException(final String message) {
    super(message);
  }

  private static final String MSG_USER_EMAIL_EMPTY = "El correo del usuario no debe estar vacío.";
  private static final String MSG_FORMAT_INVALID = "El formato del correo del usuario es inválido: '%s'.";

  public static InvalidUserEmailException becauseValueIsEmpty() {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserEmailException(MSG_USER_EMAIL_EMPTY);
  }

  public static InvalidUserEmailException becauseFormatIsInvalid(final String email) {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserEmailException(String.format(MSG_FORMAT_INVALID, email));
  }
}
