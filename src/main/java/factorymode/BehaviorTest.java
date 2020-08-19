package factorymode;

public class BehaviorTest {
    public static void main(String[] args) {
        BehaviorFactory behaviorFactory = new BehaviorFactory();
        behaviorFactory.getBehavior("Cheetah").doBehavior();
        behaviorFactory.getBehavior("Eagle").doBehavior();
        behaviorFactory.getBehavior("Whale").doBehavior();
    }
}
