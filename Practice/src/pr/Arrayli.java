package pr;

import java.util.*;

public class Arrayli {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));//객체.subList( i부터, i까지의 값을 반환한다)
        print(list1,list2);

        Collections.sort(list1);//Collections.sort 객체를 정령
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));//boolean 타입으로 list1.containsAll(list2) list2의 객체가 list1에 포함되어있는지 확인

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");// 3번 인덱스에 A라는 문자열을 추가해 B,C가 밀림
        print(list1,list2);

        list2.set(3,"AA");//3번 인덱스에 A를 AA로 변경
        print(list1,list2);

        System.out.println("list1.retainAll(list2): " + list1.containsAll(list2));
        print(list1,list2);

        for (int i = list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1,list2);
    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }
}
