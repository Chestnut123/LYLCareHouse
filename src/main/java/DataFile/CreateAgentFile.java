package DataFile;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class CreateAgentFile {

    public static void dpcall(String m) throws Exception {
        Class<?> c = Class.forName("DataFile.CreateAgentFile");
        Object obj = c.newInstance();
        Method method = c.getMethod(m);
        method.invoke(obj);
    }

    /**
     * 创建代理
     * @return
     */
    @DataProvider(name = "dp_1")
    public Object[][] dp_1() {
        return new Object[][]{
                {"C0006","lvliwen","123456","test123","test123",
                "201909899","123456@qq.com","lvliwen","111111"},
        };
    }

}
