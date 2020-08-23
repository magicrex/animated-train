package animated.train.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PhotoListResponse {

    //文件夹列表
    public List<String> folder;

    //图片文件
    public List<String> photo;

}
