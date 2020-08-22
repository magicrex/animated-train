package animated.train.service;

import animated.train.config.BasicProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class PhotoService {

    @Autowired
    private BasicProperties basicProperties;

    public String[] getList() {

        String[] nameList = new File(basicProperties.photoPath).list();

        return nameList;
    }


}
