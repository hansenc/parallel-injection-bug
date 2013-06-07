package testcase;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(classes = InjectionConfig.class)
public class InjectionTest extends AbstractJUnit4SpringContextTests
{
    @Autowired
    private String testString;

    @Test
    public void test1()
    {
        Logger.getLogger(getClass()).debug("test1");
        makeAssertions();
    }

    @Test
    public void test2()
    {
        Logger.getLogger(getClass()).debug("test2");
        makeAssertions();
    }

    private void makeAssertions()
    {
        assertNotNull("Test string should be injected", testString);
    }
}
