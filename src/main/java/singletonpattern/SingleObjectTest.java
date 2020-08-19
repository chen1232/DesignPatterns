package singletonpattern;

public class SingleObjectTest {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();

        DCLSingleObject instance1 = DCLSingleObject.getInstance();
        instance1.showMessage();
    }
}
