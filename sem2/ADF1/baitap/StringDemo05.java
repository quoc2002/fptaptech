
public class StringDemo05 {
    public static void main(String[] args) {
        

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bill Gate");
        System.out.println(stringBuilder);

        //String str1 = "";

        String str = " Microsoft";
        stringBuilder.append(str);
        System.out.println(stringBuilder);

        stringBuilder.insert(9,"C#");
        System.out.println("After insert: "+stringBuilder);

        stringBuilder.delete(0,3);
        System.out.println("After delete: "+stringBuilder);
    }
}
