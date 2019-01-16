package ius;

/**Use the two imports below if you use the set up/tear down in the NOTES section
 import org.junit.Before;
 import org.junit.After;
 **/

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @AUTHOR: Amanda Goodridge
 */

public class LinkedListTest {

    public LinkedListTest() {
    }//end LinkedListTest()

    @BeforeClass                                //YOU MUST ALWAYS HAVE A SET UP AND TEAR DOWN FOR TEST
    public static void setUpClass() {
    }//end setUpClass()

    @AfterClass
    public static void tearDownClass() {
    }//end tearDownClass()


   //BEGINNING OF NOTES FOR THIS SECTION

    //For future use: THE OTHER TWO WAYS TO DO A SET UP/TEAR DOWN!
/**
 * make sure to use the imports above if you do this
    @Before
    public void setUp() {
    }//setUp()

    @After
    public void tearDown() {
    }//tearDown()

 **/

/**BELOW IS AN EXAMPLE OF HOW TO DO A TEST!!!!
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }//end testSome Method
**/
//END OF EXAMPLE OF TEST

  //END OF NOTES FOR THIS SECTION



    //Start of tests for: append, detach, insert, get, set, last, next, after, setNext

    @Test
    //you always need @Test before each test to let the program know when you are doing a test
    public void next() {
        //Set up
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        add.data = 20;
        number.data = 16;
        add.data = 43;

        number.append(add);
        Integer expected = 43;

        ILinkedList<Integer> temp = number.next();
        assertEquals(expected, temp.get());
    }//end test for next


    @Test
    public void last() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        LinkedList<Integer> add2 = new LinkedList();

        add2.set(4);
        add.set(6);
        number.set(10);
        number.setNext(add);
        number.insert(add2);

        LinkedList<Integer> temp = new LinkedList();
        temp.data = 6;

        Integer expected = 6;
        ILinkedList<Integer> temp2 = number.last();
        assertEquals(expected, temp2.get());
    }//end test for last


    @Test
    public void after() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        LinkedList<Integer> addtwo = new LinkedList();
        LinkedList<Integer> addthree = new LinkedList();
        LinkedList<Integer> addfive = new LinkedList();
        LinkedList<Integer> addfour = new LinkedList();

        addfive.set(13);
        addfour.set(10);
        addthree.set(4);
        number.set(6);
        addtwo.set(8);
        add.set(14);

        //List = 4, 8, 6, 14, 10, 13

        number.setNext(add);
        number.append(addtwo);
        number.append(addthree);
        number.append(addfour);
        number.append(addfive);

        ILinkedList<Integer> temp = number.after(2);
        assertEquals(addtwo.get(), temp.get());
    }//end test for after


    @Test
    public void detach() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();

        add.set(5);
        number.set(2);
        number.setNext(add);

        ILinkedList<Integer> temp = number.detach();
        assertEquals(temp.get(), add.get());
    }//end test for detach
    @Test

    public void detach2() {
        //wanted to see a function run correctly with negative numbers
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();

        add.set(-5);
        number.set(-2);
        number.setNext(add);

        ILinkedList<Integer> temp = number.detach();
        assertEquals(temp.get(), add.get());
    }//end test for detach

       @Test
    public void get() {
        LinkedList<Integer> number = new LinkedList();
        number.data = 20;

        Integer temp = 20;
        assertEquals(number.get(), temp);
    }//end test for get

    @Test
    public void get2() {
        //test extra to see if it overrides
        LinkedList<Integer> number = new LinkedList();
        number.data = 20;
        number.data = 30;
        number.data = 40;

        Integer temp = 40;
        assertEquals(number.get(), temp);
    }//end test for get


    @Test
    public void set() {
        LinkedList<Integer> number = new LinkedList();
        number.set(10); //set the number to 10
        Integer temp = 10; //make temp equal to 10

        assertEquals(number.get(), temp); //make sure the number is 10
    }//end test for set

    @Test
    public void set2() {
        //test to make sure set overrides
        LinkedList<Integer> number = new LinkedList();
        number.set(10); //set the number to 10
        number.set(20); //set the number to 20
        number.set(30); //set the number to 30
        //each one set after overrides the one before! number = 30

        Integer temp = 30;
        assertEquals(number.get(), temp); //make sure the number equals 30
    }//end test for set


    @Test
    public void setNext() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();

        add.data = 250;
        number.data = 15;

        number.setNext(add);
        assertEquals(number.next().get(), add.get());
    }//end test for setNext

    @Test
    public void setNext2() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();

        add.data = 250;
        add.data = 40;

        number.setNext(add);
        assertEquals(number.next().get(), add.get());
    }//end test for setNext


    @Test
    public void append() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        LinkedList<Integer> addtwo = new LinkedList();
        LinkedList<Integer> addthree = new LinkedList<>();

        addthree.data = 70;
        addtwo.data = 15;
        add.data = 10;
        number.data = 5;

        number.insert(add);
        number.insert(addtwo);
        number.append(addthree); //append adds addthree's value to the end

        Integer expected = 70;
        assertEquals(expected, number.last().get());
    }//end test for append

    @Test
    public void append2() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        LinkedList<Integer> addtwo = new LinkedList();
        LinkedList<Integer> addthree = new LinkedList<>();
        LinkedList<Integer> addfour = new LinkedList<>();

        addfour.data = 90;
        addthree.data = 70;
        addtwo.data = 15;
        add.data = 10;
        number.data = 5;

        number.insert(add);
        number.insert(addtwo);
        number.insert(addfour);
        number.append(addthree); //append adds addthree's value to the end


        Integer expected = 70;
        assertEquals(expected, number.last().get());
    }//end test for append

    @Test
    public void insert() {
        LinkedList<Integer> number = new LinkedList();

        number.data = 5;

        Integer expected = 5;
        assertEquals(expected, number.get());
    }//end test for insert


    @Test
    public void insert2() {
        LinkedList<Integer> number = new LinkedList();

        number.data = 5;
        number.data = 10;
        number.data = 15;
        number.data = 20;

        Integer expected = 20;
        assertEquals(expected, number.get());
    }//end test for insert

    @Test
    public void insert3() {
        LinkedList<Integer> number = new LinkedList();
        LinkedList<Integer> add = new LinkedList();
        add.data = 2;
        add.data = 3;
        number.data = 5;
        number.insert(add);

        Integer expected = 5;
        assertEquals(expected, number.get());
    }//end test for insert
}//end class for LinkedListTest