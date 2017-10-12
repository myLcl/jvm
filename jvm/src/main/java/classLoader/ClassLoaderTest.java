package classLoader;

import org.junit.Test;

/**
 * 测试ClassLoader
 *
 */
public class ClassLoaderTest {
    String path = "classLoader.ClassLoaderTest";

    static {
        System.out.println("in static block");
    }

    public ClassLoaderTest() {
        System.out.println("---");
    }

    /**
     * 打印本类的加载器
     * 通过类加载器来加载类 ,不会触发初始化
     */
    @Test
    public  void classLoader() {
        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        System.out.println(loader);

        try {
            //loadClass()来加载类，不会执行初始化块
            loader.loadClass(path);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印 应用程序类加载器Application ClassLoader 的加载路径
     */
    @Test
    public  void classpath () {
        System.out.println(System.getProperty("java.class.path"));
    }
}


