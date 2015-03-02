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

        List phonecianAlphabet = new ArrayList();

        phonecianAlphabet.add("Bee");
        System.out.println(phonecianAlphabet.size());  // arrays are .length, lists are .size() - length is a property of an array, while size is a method of a list

        phonecianAlphabet.add("Cee");
        System.out.println(phonecianAlphabet);

        phonecianAlphabet.add(0, "Ay");
        System.out.println(phonecianAlphabet.toString());

        Map myMap = new HashMap();
        myMap.put("GDI", "rules!");
        System.out.println(myMap);
        System.out.println(myMap.get("GDI"));

        Map<String, List> alphabets = new HashMap<String, List>();
        alphabets.put("Phonecian", phonecianAlphabet);
        List<String> phoneticAlphabet = new ArrayList<String>();
        phoneticAlphabet.add("Alpha");
        phoneticAlphabet.add("Bravo");
        phoneticAlphabet.add("Charlie");
        phoneticAlphabet.add("Delta");
        phoneticAlphabet.add("Echo");
        phoneticAlphabet.add("Foxtrot");
        List<String> greekAlphabet = new ArrayList<String>();
        greekAlphabet.add("Alpha");
        greekAlphabet.add("Beta");
        greekAlphabet.add("Gamma");
        alphabets.put("Greek", greekAlphabet);

        System.out.println(alphabets);

        System.out.println(alphabets.get("Greek"));

    }

}
