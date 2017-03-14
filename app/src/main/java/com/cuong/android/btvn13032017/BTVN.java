package com.cuong.android.btvn13032017;

import java.util.Scanner;

/**
 * Created by Admin on 14/3/2017.
 */

public class BTVN {
    public static void main(String[] args) {
        BTVN bt = new BTVN();
        Scanner scan = new Scanner(System.in);
        String string = "";
        System.out.println("Nhập vào chuỗi: ");
        string = scan.nextLine();
        System.out.println("Số chữ a là: " + bt.countChar('a', string));
        System.out.println("Số từ: " + bt.countWord(string));
        String result = bt.checkLastName("Doan", string) ?"Có họ là Doan":"Không có họ là Doan";
        System.out.println(result);
    }

    public int countChar(char ch, String res) {
        int count = 0;
        for (char c : res.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public int countWord(String res) {
        res = fixSpace(res);
        String[] words = res.split(" ");
        return words.length;
    }

    public String fixSpace(String res) {
        res.trim(); // loại bỏ khoảng trắng đầu và cuối
        for (int i=0; i<res.length()-1; i++) {
            if (res.charAt(i) == ' ' && res.charAt(i+1) == ' ') {
                res = (new StringBuffer(res)).deleteCharAt(i).toString();
                i--;
            }
        }
        return res;
    }

    public boolean checkLastName(String lastName, String fullName) {
        String tmp = fullName;
        tmp = fixSpace(tmp);
        String ln = (tmp.split(" "))[0];
        return ln.toUpperCase().equals(lastName.toUpperCase())?true:false;
    }
}
