package jp.co.omron.plus_sensing.hvc_c2w_sample;

public enum ErrorCode {
    SUCCESS(1, "success"),
    INVALID_PARAM(2, "invalid_param"),
    NOT_READY(3, "not ready"),
    BUSY(4, "busy"),
    NOT_SUPPORT(5, "not support"),
    TIMEOUT(6, "time out"),
    NOT_FOUND(7, "not fount"),
    FAILURE(8, "failure"),
    NOT_INITIALIZE(11, "not initialize"),
    DISCONNECTED(12, "disconnected"),
    NOHANDLE(20, "nohandle"),
    NO_FACE(30, "no face"),
    PLURAL_FACES(31, "plural faces"),
    INVALID_RECEIVEDATA(40, "invalid receivedata");

    private final int code;
    private final String message;
    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
