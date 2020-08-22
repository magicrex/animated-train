package animated.train.utils;


import animated.train.common.Response;
import animated.train.enums.StatusEnum;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ResponseUtil {

    /**
     * 返回成功
     *
     * @param
     * @param
     * @return
     */
    public static Response returnOk() {
        return new Response().setStatus(StatusEnum.SUCCESS).setData(new HashMap());
    }

    /**
     * 返回成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> returnOk(T data) {
        return new Response<T>().setStatus(StatusEnum.SUCCESS).setData(data);
    }

    /**
     * 返回错误
     *
     * @param status
     * @return
     */
    public static Response returnError(StatusEnum status) {
        return new Response().setStatus(status).setData(new HashMap());
    }

    /**
     * 返回错误
     *
     * @param status
     * @return
     */
    public static Response returnError(StatusEnum status, String message) {
        return new Response().setStatus(status).setMessage(message).setData(new HashMap());
    }

}
