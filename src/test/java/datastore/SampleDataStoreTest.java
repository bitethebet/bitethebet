/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastore;

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import org.junit.*;

public class SampleDataStoreTest {
    
    private final LocalServiceTestHelper helper =
        new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
    
    public SampleDataStoreTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        helper.setUp();
    }
    
    @After
   public void tearDown() {
        helper.tearDown();
    }

    @Test
    public void shouldAddUserToDatastore()  {
        
    }

}
