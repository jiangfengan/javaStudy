package RSP;

public class MainTest {
    private static Camera camera=null;
    private static MP5 mp5=null;

    public static void main(String[] args) {
        //拍照
        if(camera==null){
            camera=new Camera();
            camera.photograph();
        }
        //看视频
        if(mp5==null){
            mp5=new MP5();
            mp5.video();
        }
    }
}
