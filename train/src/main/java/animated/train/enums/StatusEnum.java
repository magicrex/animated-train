package animated.train.enums;

import org.springframework.stereotype.Component;

@Component
public enum StatusEnum {

    SUCCESS(200, "成功"),

    SERVER_ERROR(500, "服务器内部错误");

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int code;

    public String message;


    private StatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
