import java.util.Map;

import static java.util.Map.entry;

public class Translate {
    public static final Map <String,Integer> ROMAN_NUMERALS = Map.ofEntries(
            entry("I", 1),
            entry("II", 2),
            entry("III", 3),
            entry("IV", 4),
            entry("V", 5),
            entry("VI", 6),
            entry( "VII", 7),
            entry("VIII", 8),
            entry("IX", 9),
            entry("X", 10),
            entry("XI", 11),
            entry("XII", 12),
            entry("XIII", 13),
            entry("XIV", 14),
            entry("XV", 15),
            entry("XVI", 16),
            entry( "XVII", 17),
            entry("XVIII", 18),
            entry("XIX", 19),
            entry("XX", 20)
     );
    public static String searchKey(int value) throws Exception {
        for (Map.Entry<String, Integer> search:
             ROMAN_NUMERALS.entrySet()) {
            if (search.getValue() == value){
                return search.getKey();
            }
        }
        throw new Exception("Key not found");

    }


}