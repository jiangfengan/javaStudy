package RSP;

public class Camera implements IPhotograph {

    @Override
    public void photograph() {
        System.out.println("拍个帅气的照片");
    }
}
