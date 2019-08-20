package DataFile;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

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
                {"C0006","lvliwen","111111","testYun","testYun",
                "20190814","123456@qq.com","lvliwen","111111"},
        };
    }

}
