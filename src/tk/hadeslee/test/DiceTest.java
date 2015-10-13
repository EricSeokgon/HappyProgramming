package tk.hadeslee.test;

/**
 * Project: HappyProgramming
 * FileName: DiceTest
 * Date: 2015-10-13
 * Time: 오후 3:17
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

public class DiceTest {
    //main메소드 뒤에 throws Exception이라고 적으면 Exception을 무시하겠다.
    public static void main(String[] args) throws Exception {
        //인스턴스를 만들려면 new 생성자()
        //인터페이스 참조type이 될 수 있다.
        //클래스 이름이 문자열이니깐. 다양한 경로로 읽어들일수 있다.
        String className = "tk.hadeslee.test.Dice9";

        // ClassLoader를 이용하여 className에 해당하는 클래스의 정보를 읽어들여서
        //메모리에 올리고 그 클래스 정보를 가지는 clazz라는 변수를 선언.
        //clazz변수를 이용하면 그 클래스 이름, 필드 정보, 메소드 정보 등을 구할 수 있다.
        Class clazz = Class.forName(className);
        //clazz.newInstance) - clazz가 가지고 있는 정보를 이용하여 인스턴스를 만들어라.
        //리플렉션기술
//        Method[] methods = clazz.getMethods();
//        for (int i = 0; i < methods.length; i++) {
//            System.out.println(methods[i].getName());
//        }
//        class.newInstance() - clazz가 가지고 있는 정보를 이용하여 인스턴스를 만들어라.
        Dice dice1 = (Dice) clazz.newInstance();
        Dice dice2 = (Dice) clazz.newInstance();

        //Dice type으로 변수를 선언하는 것은 무슨의미냐?
        //해당 인터페이스를 구현하고 있는 클래스가 무엇이든지 간에 이용가능.
        System.out.println(dice1.get());
        System.out.println(dice2.get());

    }


}
