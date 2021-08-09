class ParentClass{
    int a;

    /*
    this keyword:
    1. Tham chieu toi instance of class hien tai
    2. this() goi constructor cua lop hien tai
    3. truyen tham so vao phuong thuc, constructor
    4. tra ve instance cua lop hien tai
    */
    void setData(int a){
        this.a = a;//this: goi ra instance cua lop hien tai va co the goi ra thuoc tinh cua lop hien tai

    }
}
class ChildClass extends ParentClass{
    void showDataChild(){
        System.out.println("Value of a is:" + a);
    }
}




public class SingleInheritance {
    public static void main(String[] args) {
        ChildClass childclass = new ChildClass();
        childclass.setData(30);//goi method ma child duoc ke thua tu parent
        childClass.showData();
    }
}
