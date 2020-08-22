package animated.train.common;

import animated.train.enums.StatusEnum;
import org.springframework.stereotype.Component;

@Component
public class Response<T> {

    private int code;

    private String message;

    private T data;

    public int getCode() {
        return code;
    }

    public Response<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Response<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Response<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Response<T> setStatus(StatusEnum status) {
        this.code = status.code;
        this.message = status.message;
        return this;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
