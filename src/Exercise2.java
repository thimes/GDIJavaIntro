import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {

    public static void main(String[] args) {
        Integer myInteger = 5;
        Integer myObjectInteger = new Integer(5);
        Integer myStringInteger = new Integer("5");
//        Integer myExceptionInteger = new Integer("five"); // doesn't work

        Boolean myBoolean = true;
        Boolean myObjectBoolean = new Boolean(true);
        Boolean myStaticObjectBoolean = Boolean.TRUE;

        String s = new String();
        String s2 = "";
        String s3 = "this is a string";
        String s4 = "this" + " " + "is" + " a string";
//        String s5 = myInteger; // Doesn't work
        String s6 = myInteger.toString();
        String s7 = myInteger + "";
        String s8 = myInteger + myStringInteger + "";

        List myList = new ArrayList();

        myList.add("Alpha");
        System.out.println(myList.size());  // arrays are .length, lists are .size() - length is a property of an array, while size is a method of a list

        myList.add("Beta");
        System.out.println(myList);

        myList.add(0, "Omega");
        System.out.println(myList.toString());

        Map myMap = new HashMap();
        myMap.put("GDI", "rules!");
        System.out.println(myMap);
        System.out.println(myMap.get("GDI"));

        myMap.put("Dont do this!", myList);
        System.out.println(myMap);
    }

}
