package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserRoleException extends DomainException {

  private InvalidUserRoleException(final String message) {
    super(message);
  }

  // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
  // CORREGIDO
  private static final String MSG_USER_ROLE_INVALID = "The user role '%s' is not valid.";

  public static InvalidUserRoleException becauseValueIsInvalid(final String role) {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new InvalidUserRoleException(String.format(MSG_USER_ROLE_INVALID, role));
  }
}
