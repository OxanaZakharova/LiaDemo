import org.junit.*;
import static org.junit.Assert.*;

public class AddTest {

    private Math math;

    @BeforeClass
    static  public void start(){
        System.out.println("----------");
        System.out.println("ADDITION is under test...");
    }

    @Before
    public void setUp(){
        math = new Math();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addTestNormalValue() {
        System.out.println("Test: normal values a=15, b=36, result=51");
        assertEquals(math.add(15, 36), 51);
    }

    @Test
    public void addTestMaxValue() {
        System.out.println("Test: boundary value a=Integer.MAX_VALUE, b=1, result=Integer.MIN_VALUE");
        assertEquals(math.add(Integer.MAX_VALUE, 1), Integer.MIN_VALUE);
    }


    @AfterClass
    static  public void finish(){
        System.out.println("----------");
        System.out.println();
    }
}

