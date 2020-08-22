package animated.train.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "basic")
@Component
public class BasicProperties {

    //图片文件夹路径
    public String photoPath;
}
