package singletonpattern;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）,
 */
public class DCLSingleObject {
    private volatile static DCLSingleObject dclSingleObject;

    private DCLSingleObject() {
    }

    public static DCLSingleObject getInstance() {
        if (null == dclSingleObject) {
            synchronized (DCLSingleObject.class) {
                if (null == dclSingleObject) {
                    dclSingleObject = new DCLSingleObject();
                }
            }
        }
        return dclSingleObject;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
