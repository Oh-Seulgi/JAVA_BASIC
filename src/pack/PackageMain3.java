package pack;

import pack.a.User;

/*
* import
* - 동일한 클래스명을 모두 import 할 수 없다. 1개만 가능
* */
public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
