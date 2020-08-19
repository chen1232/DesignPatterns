package abstractfactorypattern;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory color = FactoryProducer.getFactory("COlOR");
        color.getColor("red").isColor();
        color.getColor("green").isColor();
        color.getColor("yellow").isColor();

        AbstractFactory behavior = FactoryProducer.getFactory("BEHAVIOR");
        behavior.getBehavior("Cheetah").doBehavior();
        behavior.getBehavior("Eagle").doBehavior();
        behavior.getBehavior("Whale").doBehavior();
    }
}
