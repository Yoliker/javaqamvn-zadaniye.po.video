public class BonusServiceTest {

    @Test


    public void test() {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calcBonus(5_000, true);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);


    }
}
