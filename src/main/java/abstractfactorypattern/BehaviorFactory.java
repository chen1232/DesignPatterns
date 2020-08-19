package abstractfactorypattern;

/**
 * 行为工厂类
 */
public class BehaviorFactory extends AbstractFactory {
    public Behavior getBehavior(String behavior) {
        if (null == behavior || "".equals(behavior)) {
            return null;
        } else if ("CHEETAH".equalsIgnoreCase(behavior)) {
            return new Cheetah();
        } else if ("EAGLE".equalsIgnoreCase(behavior)) {
            return new Eagle();
        } else if ("WHALE".equalsIgnoreCase(behavior)) {
            return new Whale();
        } else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
