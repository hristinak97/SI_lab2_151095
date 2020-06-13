import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SILab2Test {

    @Test
    void everyBranchOne(){

        SILab2 siLab2 = new SILab2();

        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");
        list.add("#");
        list.add("0");

        List<String> listExpected = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("#");
        list.add("1");

        assertEquals(listExpected, siLab2.function(list));
    }

    @Test
    void everyBranchTwo(){

        SILab2 siLab2 = new SILab2();
        assertEquals(new IllegalArgumentException("List length should be greater than 0"), siLab2.function(new ArrayList<>()));
    }


    @Test
    void everyPath1() {
        SILab2 siLab2 = new SILab2();

        assertEquals(new IllegalArgumentException("List length should be greater than 0"), siLab2.function(new ArrayList<>()));
    }

    @Test
    void everyPath2() {
        SILab2 siLab2 = new SILab2();
        List<String> path2 = new ArrayList<>();
        path2.add("0");

        List<String> path2Expected = new ArrayList<>();
        path2.add("0");


        assertEquals(path2Expected, siLab2.function(path2));

    }

    @Test
    void everyPath3() {
        SILab2 siLab2 = new SILab2();
        List<String> path3 = new ArrayList<>();
        path3.add("#");

        List<String> path3Expected = new ArrayList<>();
        path3.add("#");

        assertEquals(path3Expected, siLab2.function(path3));
    }

    @Test
    void everyPath4() {
        SILab2 siLab2 = new SILab2();

        List<String> path4 = new ArrayList<>();
        path4.add("#");
        path4.add("0");

        List<String> path4Expected = new ArrayList<>();
        path4.add("#");
        path4.add("1");

        assertEquals(path4Expected, siLab2.function(path4));

    }

    @Test
    void everyPath5() {
        SILab2 siLab2 = new SILab2();
        List<String> path5 = new ArrayList<>();
        path5.add("0");
        path5.add("#");

        List<String> path5Expected = new ArrayList<>();
        path5.add("1");
        path5.add("#");

        assertEquals(path5Expected, siLab2.function(path5));

    }

    @Test
    void everyPath6() {
        SILab2 siLab2 = new SILab2();
        List<String> path6 = new ArrayList<>();
        path6.add("#");
        path6.add("0");
        path6.add("#");

        List<String> path6Expected = new ArrayList<>();
        path6.add("#");
        path6.add("1");
        path6.add("#");

        assertEquals(path6Expected, siLab2.function(path6));


    }

    @Test
    void everyPath7() {
        SILab2 siLab2 = new SILab2();

        List<String> path7 = new ArrayList<>();
        path7.add("0");
        path7.add("#");
        path7.add("0");

        List<String> path7Expected = new ArrayList<>();
        path7.add("1");
        path7.add("#");
        path7.add("1");

        assertEquals(path7Expected, siLab2.function(path7));
    }

}
