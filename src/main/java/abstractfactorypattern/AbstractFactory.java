package abstractfactorypattern;

public abstract class AbstractFactory {
    public abstract Behavior getBehavior(String behavior);

    public abstract Color getColor(String color);
}
