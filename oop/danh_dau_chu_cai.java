package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class danh_dau_chu_cai {

    public static void timKiem(String str) {
        //Tạo một HashMap
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        //Chuyển đổi chuỗi thành mảng char
        char[] chars = str.toCharArray();
        /*
         * char được chèn dưới dạng khóa và
         *  được tính là giá trị. Nếu map đã chứa char
         *  rồi thì hãy tăng giá trị lên 1.
         * */
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        //lấy key ra
        Set<Character> keys = map.keySet();
        /*
          Hiển thị số lượng ký tự nếu nó là
          lớn hơn 1. Tất cả các ký tự trùng lặp sẽ
          có giá trị lớn hơn 1.
         */
        int dem = 0;
        for (Character ch : keys) {
            dem++;
        }
        System.out.println(dem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        timKiem(s);
    }
}
