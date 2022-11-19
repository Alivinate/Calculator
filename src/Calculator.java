public class Calculator {
    public static String plus(String a, String b) throws Exception {
        int aNum = Translate.romanNumerals.get(a);
        int bNum = Translate.romanNumerals.get(b);
        int result = aNum + bNum;
        return Translate.searchKey(result);
    }
    public static String minus(String a, String b) throws Exception {
        int aNum = Translate.romanNumerals.get(a);
        int bNum = Translate.romanNumerals.get(b);
        int result = aNum - bNum;
        return Translate.searchKey(result);
    }
    public static String multiply(String a, String b) throws Exception {
        int aNum = Translate.romanNumerals.get(a);
        int bNum = Translate.romanNumerals.get(b);
        int result = aNum * bNum;
        return Translate.searchKey(result);
    }
    public static String divide(String a, String b) throws Exception {
        int aNum = Translate.romanNumerals.get(a);
        int bNum = Translate.romanNumerals.get(b);
        int result = aNum / bNum;
        return Translate.searchKey(result);
    }
}
