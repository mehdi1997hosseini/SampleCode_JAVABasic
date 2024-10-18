package exceptionHandler;

public abstract class BaseException extends RuntimeException implements LoggerException {

    public BaseException(String message, String classname) {
        super(message);
        logger.warning("in class " + classname + " throw exception with message : "+message);
    }

}
