import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class BookingTest extends BaseTest {

    @DataProvider
    public Object[][] testData() {
        //retrive data from
        return new Object[][] {
                //from, to
                {"Киев","Львов"},
                {"Киев","Одесса"},
                {"Киев","Харьков"},
                {"Киев","Мариуполь"}
        };
    }

    @Test
    public void testOpenSite() throws InterruptedException {
        driver.get("https://booking.uz.gov.ua/ru/?from=2200001&to=2218000&date=2019-02-11&time=00%3A00&url=train-list");
        HomePage homePage = new HomePage(driver);
//        homePage.setFrom("Киев");
//        homePage.setTo("Львов");
//        homePage.submit();
        homePage.getTrains().get(2).clickOnTitle();
        Thread.sleep(3000);
    }

}
