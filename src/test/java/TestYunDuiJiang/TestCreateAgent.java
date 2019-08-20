package TestYunDuiJiang;

import DataFile.CreateAgentFile;
import Util.Basicfile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 创建代理
 */
public class TestCreateAgent extends Basicfile {

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        super.setUp(); //super调用父类的setUp方法
        driver.get("https://tkzhushou.mylianzhi.com/eldf-sso/login.htm");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test(dataProvider = "dp_1", dataProviderClass = CreateAgentFile.class)
    public void testCase001 (String inputid_441_0, String inputid_441_1, String inputid_441_2,
                             String inputid_441_3, String inputid_441_4, String inputid_441_5,
                             String inputid_441_6, String inputid_441_7, String inputid_441_8)
            throws Exception {

        //判断用户名密码是否为空
        if (inputid_441_0 != null) {
            WebElement v_501 = driver.findElement(By.id("j_companyCode"));
            v_501.sendKeys(inputid_441_0);
        }
        if (inputid_441_1 != null) {
            WebElement v_501 = driver.findElement(By.id("j_username"));
            v_501.sendKeys(inputid_441_1);
        }
        if (inputid_441_2 != null) {
            WebElement v_501 = driver.findElement(By.id("j_password"));
            v_501.sendKeys(inputid_441_2);
        }
        //登录
        driver.findElement(By.xpath("//*[@id='main']/div[5]/form/section[5]/button")).click();
        Thread.sleep(2000);

        //代理管理
        driver.findElement(By.xpath("//*[@id=\"menu_333\"]/a/span")).click();
        Thread.sleep(2000);

        //代理查看
        driver.findElement(By.xpath("//*[@id=\"menu_335\"]/a/span")).click();
        Thread.sleep(2000);

        //鼠标悬浮事件
        Actions action = new Actions(driver);
        //WebElement mose = driver.findElement(By.linkText("泰金科技"));
        action.moveToElement(driver.findElement(By.linkText("泰金科技"))).click().perform();

        //新增代理
        driver.findElement(By.xpath("//*[@id=\"addBtn_agent_tree_1\"]")).click();
        Thread.sleep(2000);

        //滚动条事件--移动到窗口底部
        WebElement we =driver.findElement (By.xpath ("//*[@id=\"submit\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", we);
        Thread.sleep(1000);

        //代理中文名称
        if (inputid_441_3 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[1]/section[1]/label[2]/input"));
            v_501.sendKeys(inputid_441_3);
        }
        Thread.sleep(2000);

        //代理英文名称
        if (inputid_441_4 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[1]/section[2]/label[2]/input"));
            v_501.sendKeys(inputid_441_4);
        }
        Thread.sleep(2000);

        //代理编码
        if (inputid_441_5 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[1]/section[4]/label[2]/input"));
            v_501.sendKeys(inputid_441_5);
        }
        Thread.sleep(2000);

        //代理邮箱
        if (inputid_441_6 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[1]/section[5]/label[2]/input"));
            v_501.sendKeys(inputid_441_6);
        }
        Thread.sleep(2000);

        //代理账号
        if (inputid_441_7 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[1]/section[6]/label[2]/input"));
            v_501.sendKeys(inputid_441_7);
        }
        Thread.sleep(2000);

        //密码
        if (inputid_441_8 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[1]/section[7]/label[2]/input"));
            v_501.sendKeys(inputid_441_8);
        }
        Thread.sleep(2000);

        //代理权限
        driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[2]/section[1]/label[2]/select/option[3]")).click();
        Thread.sleep(3000);

        //权限编辑
        driver.findElement(By.xpath("//*[@id=\"mount_point\"]/form/fieldset/div[2]/section[2]/div[1]/button")).click();
        Thread.sleep(3000);

        //确认
        driver.findElement(By.xpath("//*[@id=\"mount_point\"]/fieldset/div/form/footer/div/button")).click();
        Thread.sleep(2000);

        //上传平台logo
        WebElement p = driver.findElement(By.name("files"));
        p.sendKeys("C:\\Users\\T560\\Pictures\\Saved Pictures\\新建文件夹\\L5.jpg");
        System.out.println(12121);
        Thread.sleep(8000);

        //auto工具上传图片
        /*driver.findElement(By.xpath("//*[@id=\"1565838577919\"]")).click();
        Thread.sleep(2000);
        Runtime rt1 = Runtime.getRuntime();
        try {
            String str1 = "E:\\AutoItFile\\云对讲\\平台logo.exe";
            rt1.exec(str1);
        }catch (Exception e) {
            System.out.println("Error to run the exe");
        }
        Thread.sleep(5000);*/

        //提交
        //driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        //Thread.sleep(2000);
    }
}
