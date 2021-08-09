
public class StringDemo02 {
    public static void main(String[] args) {
        //String la 1 kie "dac biet"
        //dada input co the qui doi thanh String roi convert sau
        String str = " Hello java core application  ";
        System.out.println("Chuoi vua nhap:" +str);

        String str2 = str.toLowerCase();
        System.out.println("str2 " +str2);

        String str3 = str.trim();//checl tinh dung dan cua data nhap lieu
        System.out.println("str3" +str3);

        String str4 = str.toUpperCase();
        System.out.println("str4" +str4);
    }
}
