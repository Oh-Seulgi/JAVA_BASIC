package ref;

/*
* GC(가비지컬렉션) java에서는 null로 된 인스턴스를 자동으로 삭제해준다.
* */
public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
