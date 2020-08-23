package animated.train.controller;

import animated.train.common.Response;
import animated.train.response.PhotoListResponse;
import animated.train.service.PhotoService;
import animated.train.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("photo")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping(value = "/getPhoto", method = RequestMethod.GET)
    @ResponseBody
    public Response getPtoto() {
        PhotoListResponse response = new PhotoListResponse();
        List<String> list = photoService.getList();
        response.setPhoto(list);
        return ResponseUtil.returnOk(response);
    }

    @RequestMapping(value = "/getImage", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getImage(String imageUrl) {
        return photoService.getImage(imageUrl);
    }


}
