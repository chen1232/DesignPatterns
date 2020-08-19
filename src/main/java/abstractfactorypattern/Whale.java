package abstractfactorypattern;

/**
 * 鲸鱼实现会游泳的行为
 */
public class Whale implements Behavior {
    public void doBehavior() {
        System.out.println("我是鲸鱼，我会游泳");
    }
}
