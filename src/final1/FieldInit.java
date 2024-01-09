package final1;

/*
* static final
* - static 영역은 단 하나만 존재하는 영역이다.
* - 필드에 final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적이다.
* - 대문자를 사용하고 구분은 _로 한다.(관례)
* - 필드를 직접 접근해서 사용한다.
* */
public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 10;
}
