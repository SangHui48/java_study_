package access.b;

//import access.a.DefaultClass1;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 개발자는 직접 돌려서 해보는 능력이 중요하겠쥬?
        // 같은 패키지 안에 있는게 아니자너 default 접근제어자 때문.
//        DefaultClass1 defaultClass1 = new DefaultClass1();
    }
}
