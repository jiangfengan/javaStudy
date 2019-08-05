package Strategy;

public class MainTest {

    public static void main(String[] args) {
        Content content;
        content=new Content("1");
        System.out.println(content.getMoney());

        content=new Content("2");
        System.out.println(content.getMoney());

        content=new Content("3");
        System.out.println(content.getMoney());
    }
}
