
public class App {
    public static String maskify(String str) {
        if (str.length() < 4) {
            return str;
        } 
        String withoutHash = str.substring(0, str.length()-4);
        String withHash = str.substring(str.length()-4);
        return "#".repeat(withoutHash.length()) + withHash; // .repeat(int count) makes repeat of string n times
      
    }
    public static void main(String[] args) throws Exception {
        System.out.println(maskify("1"));
       
    }
}
