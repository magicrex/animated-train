package animated.train.response;

import java.util.List;


public class PhotoListResponse {

    //文件夹列表
    public List<String> folder;

    //图片文件
    public List<String> photo;

    public List<String> getFolder() {
        return folder;
    }

    public void setFolder(List<String> folder) {
        this.folder = folder;
    }

    public List<String> getPhoto() {
        return photo;
    }

    public void setPhoto(List<String> photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "PhotoListResponse{" +
                "folder=" + folder +
                ", photo=" + photo +
                '}';
    }
}
