package com.jcaa.usersmanagement.domain.exception;

public final class InvalidCredentialsException extends DomainException {

  private InvalidCredentialsException(final String message) {
    super(message);
  }

  private static final String MSG_WRONG_CREDENTIALS = "Correo o contraseña incorrectos.";
  private static final String MSG_USER_NOT_ACTIVE = "Tu cuenta no está activa. Contacta al administrador.";

  public static InvalidCredentialsException becauseCredentialsAreInvalid() {
    // VIOLACIÓN Regla 10: texto de error hardcodeado directamente.
    // Debe usarse una constante con nombre descriptivo en lugar de un String
    // literal.
    // CORREGIDO
    return new InvalidCredentialsException(MSG_WRONG_CREDENTIALS);
  }

  public static InvalidCredentialsException becauseUserIsNotActive() {
    // VIOLACIÓN Regla 10: texto de error hardcodeado directamente.
    // CORREGIDO
    return new InvalidCredentialsException(MSG_USER_NOT_ACTIVE);
  }
}
