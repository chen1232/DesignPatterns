package abstractfactorypattern;

/**
 * 颜色工厂类
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Behavior getBehavior(String behavior) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (null == color || "".equals(color)) {
            return null;
        } else if ("GREEN".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("RED".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("YELLOW".equalsIgnoreCase(color)) {
            return new Yellow();
        } else {
            return null;
        }
    }
}
