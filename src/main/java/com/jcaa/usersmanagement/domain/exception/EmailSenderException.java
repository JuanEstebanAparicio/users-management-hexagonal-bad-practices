package com.jcaa.usersmanagement.domain.exception;

public final class EmailSenderException extends DomainException {

  // VIOLACIÓN Regla 9 (Clean Code): constructores public en una excepción que
  // debería usar
  // factory methods con constructores privados para controlar cómo se instancia.
  // Así cualquier clase puede crear excepciones con mensajes arbitrarios.
  public EmailSenderException(final String message) {
    super(message);
  }

  public EmailSenderException(final String message, final Throwable cause) {
    super(message, cause);
  }

  // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
  // CORREGIDO
  private static final String MSG_SMTP_FAILED = "No se pudo enviar el correo a '%s'. Error SMTP: %s";

  public static EmailSenderException becauseSmtpFailed(
      final String destinationEmail, final String smtpError) {
    return new EmailSenderException(
        String.format(MSG_SMTP_FAILED, destinationEmail, smtpError));
  }

  private static final String MSG_SEND_FAILED = "La notificación por correo no pudo ser enviada.";

  public static EmailSenderException becauseSendFailed(final Throwable cause) {
    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
    // CORREGIDO
    return new EmailSenderException(MSG_SEND_FAILED, cause);
  }
}
