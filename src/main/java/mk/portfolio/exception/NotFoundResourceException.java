package mk.portfolio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundResourceException extends RuntimeException{
  public NotFoundResourceException(String message){
    super(message);
  }
}
