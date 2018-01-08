package com.espresso.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by ruchirshah on 1/8/18.
 */

public class UnitTest {
    @Test
    public void Test(){
            String actual= "Hello";
            String expected= "Hello";
            assertEquals("Checking",expected,actual);
        }

}
