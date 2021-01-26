package e2018.exam2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//sort 메소드와 insert 메소드를 구현하라.
//구현 방법에 제한 없음.
//출력
//[1, 2, 3, 4, 5, 7, 8]
//[1, 2, 3, 4, 5, 6, 7, 8]

public class Exam15 {

    static void sort(int[] a) {
    	Arrays.sort(a);
   }

    static int[] insert(int[] a, int value) {
		
    	Set<Integer> set = new HashSet<Integer>();
    	return a;
    	
    	
    	//풀이방법
//        int index = Arrays.binarySearch(a, value);
//        if (index >= 0) return a;
//        index = -(index + 1);
//        int[] a2 = Arrays.copyOf(a, a.length + 1);
//        for (int i = a2.length - 1; i > index; --i)
//            a2[i] = a2[i - 1];
//        a2[index] = value;
//        return a2;
//    }

    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 1, 2, 4, 5, 7 };

        sort(a);
        System.out.println(Arrays.toString(a));

        a = insert(a, 2);
        a = insert(a, 6);
        System.out.println(Arrays.toString(a));
    }
}