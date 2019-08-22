package DataFile;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class CreateCommunityFile {

    public static void dpcall(String m) throws Exception {
        Class<?> c = Class.forName("DataFile.CreateCommunityFile");
        Object obj = c.newInstance();
        Method method = c.getMethod(m);
        method.invoke(obj);
    }

    /**
     * 创建社区
     * @return
     */
    @DataProvider(name = "dp_1")
    public Object[][] dp_1() {
        return new Object[][]{
                {"telll","telll","111111","景德镇","jdz",
                "20190814",},
        };
    }

}
