package animated.train.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoServiceTest {

    @Autowired
    PhotoService photoService;

    @Test
    public void test() {
        String[] list = photoService.getList();
        for(String s : list) {
            System.out.println(s);
        }
    }

}