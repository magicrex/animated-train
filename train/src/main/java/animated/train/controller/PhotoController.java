package animated.train.controller;

import animated.train.common.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/photo")
public class PhotoController {

    @RequestMapping(value = "getPhoto", method = RequestMethod.GET)
    public Response getPtoto() {

    }

}
