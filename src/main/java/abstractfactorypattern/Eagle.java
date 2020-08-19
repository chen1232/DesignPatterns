package abstractfactorypattern;

/**
 * 老鹰实现会飞的行为
 */
public class Eagle implements Behavior {
    public void doBehavior() {
        System.out.println("我是老鹰，我会飞");
    }
}
