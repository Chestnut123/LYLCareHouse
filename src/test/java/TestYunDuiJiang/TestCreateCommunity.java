package TestYunDuiJiang;

import DataFile.CreateCommunityFile;
import Util.Basicfile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 创建社区
 */
public class TestCreateCommunity extends Basicfile {

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        super.setUp(); //super调用父类的setUp方法
        driver.get("https://tkzhushou.mylianzhi.com/eldf-sso/login.htm");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test(dataProvider = "dp_1", dataProviderClass = CreateCommunityFile.class)
    public void testCase002 (String inputid_441_0, String inputid_441_1, String inputid_441_2,
                             String inputid_441_3, String inputid_441_4, String inputid_441_5)
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

        //社区管理
        driver.findElement(By.xpath("//*[@id=\"menu_189\"]/a/span")).click();
        Thread.sleep(2000);

        //社区维护
        driver.findElement(By.xpath("//*[@id=\"menu_180\"]/a/span")).click();
        Thread.sleep(4000);

        //新增社区
        driver.findElement(By.xpath("//*[@id=\"community_search_form\"]/footer/div/button[3]/span")).click();
        Thread.sleep(2000);

        //社区中文名称
        if (inputid_441_3 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/section[1]/form/fieldset/div[1]/section[1]/label[2]/input"));
            v_501.sendKeys(inputid_441_3);
        }
        Thread.sleep(2000);

        //社区英文名称
        if (inputid_441_4 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/section[1]/form/fieldset/div[1]/section[2]/label[2]/input"));
            v_501.sendKeys(inputid_441_4);
        }
        Thread.sleep(2000);

        //状态
        driver.findElement(By.xpath("//*[@id=\"status\"]/option[2]")).click();
        Thread.sleep(2000);

        //省市区
        driver.findElement(By.xpath("//*[@id='mount_point']/section[1]/form/fieldset/div[1]/section[4]/div/label[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"130000\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"130100\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"130103\"]")).click();
        Thread.sleep(2000);

        //状态描述
        if (inputid_441_5 != null) {
            WebElement v_501 = driver.findElement(By.xpath("//*[@id=\"mount_point\"]/section[1]/form/fieldset/div[2]/section[1]/section[2]/div/div[2]/div[3]/div[2]"));
            v_501.sendKeys(inputid_441_5);
        }
        Thread.sleep(2000);

        //将页面滚动条拖到底部
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        //上传位置图
        /*WebElement p = driver.findElement(By.name("files"));
        p.sendKeys("C:\\Users\\T560\\Pictures\\Saved Pictures\\新建文件夹\\L5.jpg");
        System.out.println(12121);
        Thread.sleep(8000);*/

        //autoit工具上传图片
        driver.findElement(By.xpath("//*[@id=\"mount_point\"]/section[1]/form/fieldset/div[2]/section[2]/section[3]/div/div[1]/div")).click();
        Thread.sleep(2000);
        Runtime rt1 = Runtime.getRuntime();
        try {
            String str1 = "E:\\AutoItFile\\云对讲\\平台logo.exe";
            rt1.exec(str1);
        }catch (Exception e) {
            System.out.println("Error to run the exe");
        }
        Thread.sleep(5000);

    }
}
