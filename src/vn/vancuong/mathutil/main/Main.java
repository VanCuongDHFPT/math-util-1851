/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vancuong.mathutil.main;

import vn.vancuong.mathutil.core.MathUtil;

/**
 *
 * @author vovan
 */
public class Main {

    public static void main(String[] args) {
        //thữ nghiệm hàm tính giai thừa coi chạy đúng như thiết kết ko
        //ta phải đưa ra các tình huống sử dụng trong thực tế
        //ví đưa -5 coi tính dc ko
        //        0 coi tính mấy 
        //        20 coi tính mấy 
        //        21 coi tính mấy 
        //Test Case : Một tình huống hàm/app/màn hình /tính năng dc đưa vào sữ dụng 
        //giả lập hành vì xài của ai đó
        
        //TestCase:là 1 tình huống dc sử dụng, xài app(hàm) mà nó bao hàm
        //Intput :Data đầu vào cụ thể nào đó
        //OutPut :dẩy ra ứng với xữ lí của hàm/ chức năng của app, dĩ nhiên dùng để xử lí
        //kì vọng : mongg hàm sẽ trả về value nào đó ứng vs input ở trên 
        //so snah1 để cem kết quả có như kì vọng hay ko
        
        long expected = 120;// tao kì vọng hàm ói về 120 nếu tính 5
        int n = 5;         //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5!= " + expected + " expected");
        System.out.println("5!= " + actual + "  actual");
        
        
        
    }

}
