package animated.train.service;

import animated.train.config.BasicProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private BasicProperties basicProperties;

    public List<String> getList() {
        String path = basicProperties.photoPath;
        String[] list = new File(path).list();
        List<String> nameList = Arrays.asList(list);
        List<String> res = new ArrayList<>();
        for(String s : nameList) {
            String tmp = basicProperties.imagePre + s;
            res.add(tmp);
        }
        return res;
    }

    public List<byte[]> getImages(List<String> nameList) {
        List<byte[]> images = new ArrayList<>();
        try {
            for (String s : nameList) {
                String imgPath = basicProperties.photoPath + "\\" + s;
                File image = new File(imgPath);
                FileInputStream inputStream = new FileInputStream(image);
                byte[] bytes = new byte[inputStream.available()];
                inputStream.read(bytes, 0, inputStream.available());
                images.add(bytes);
            }
        } catch (Exception FileNotFoundException) {
            System.out.println("error");
        }
        return images;
    }

    public byte[] getImage(String path) {

        String imgPath = basicProperties.photoPath + "\\" + path;
        File image = new File(imgPath);

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(image);
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, inputStream.available());
            return bytes;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new byte[0];
    }


}
