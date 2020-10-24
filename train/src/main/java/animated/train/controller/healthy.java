package animated.train.controller;


import animated.train.common.Response;
import animated.train.utils.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/healthy")
public class healthy {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Response getPtoto() {
        return ResponseUtil.returnOk();
    }


}
