import sofia.micro.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Quan Nguyen (ntq2503)
// -------------------------------------------------------------------------
/**
 *  tests for methods in Bee class
 *  
 *  @author Quan Nguyen (ntq2503)
 *  @version 2018.04.23
 */
public class BeeTest extends TestCase
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new BeeTest test object.
     */
    public BeeTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * test if Bee attacks ant
     */
    public void testBee()
    {
        Colony colony = new Colony();
        colony.setSelectedActor(HarvesterAnt.class);
        colony.onTouchDown(2, 2);
        colony.add(new Bee(), 2, 2);
        run(colony, 100);
        assertEquals(1, colony.getObjects(Bee.class).size());
        assertEquals(0, colony.getObjects(HarvesterAnt.class).size());
    }
}
