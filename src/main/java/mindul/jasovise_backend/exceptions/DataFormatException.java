package mindul.jasovise_backend.exceptions;

public class DataFormatException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  public DataFormatException(String msg) {
    super(msg);
  }
}