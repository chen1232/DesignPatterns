package abstractfactorypattern;

/**
 * 创建一个工厂创造器/生成器类，通过传递行为或颜色信息来获取工厂
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if ("BEHAVIOR".equalsIgnoreCase(choice)) {
            return new BehaviorFactory();
        } else if ("COLOR".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
