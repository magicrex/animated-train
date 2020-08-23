package animated.train.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

//目录返回值
@Getter
@Setter
@ToString
public class PhotoResponse {

    //图片文件
    public List<byte[]> imageList;
}
