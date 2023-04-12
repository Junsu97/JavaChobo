package ch6;

public class TvExample {
    public static void main(String[] args) {
        Tv t = new Tv();  // 인스턴스 생성
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t2 = t1;   // 같은 주소를 가리키게 됨.
        t1.channel = 7;
        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}
