package tk.hadeslee.examples;

/**
 * Project: HappyProgramming
 * FileName: CalBean
 * Date: 2015-10-12
 * Time: 오후 2:45
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalBean {
    // 아래의 3가지 규칙을 지켜서 만드는 클래스는 싱글턴 패턴이 적용되었다.

    // 2) private 하지만 static한 필드를 선언(자기 자신을 참조하는)
    // 자기 자신의 생성자를 호출하여 초기화한다.
    // static은 인스턴스가 만들어지기 전에 호출되는 코드. 딱 한번.
    private static CalBean instance = new CalBean();

    // 3) 2에서 선언한 instance를 반환하는 public static메소드를 만든다.
    public static CalBean getInstance() {
        return instance;
    }

    // 1) private 한 생성자를 만듦. 외부에서 인스턴스를 못만들게 하겠다.
    private CalBean() {
    }

    public int plus(int i, int m) {
        return i + m;
    }


}
