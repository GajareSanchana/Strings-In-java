//delete() and insert()
public class deleteAndinsert{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdef");

        //delete
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);//abcef
        System.out.println(sb.charAt(3));
        sb.append("xyz");
        System.out.println(sb);//abcefxyz , here i want to delete cefx(2,5)
        sb.delete(2,6); //deletes characters from 2 to 5
        System.out.println(sb);//abyz -->insert g at 2 index (abgyz)

        //insert
        sb.insert(2,'g');
        System.out.println(sb);//abgyz
        sb.insert(2,67);
        System.out.println(sb);//ab67yz

    }
}
