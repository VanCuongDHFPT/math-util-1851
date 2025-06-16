/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vancuong.mathutil.core;

/**
 *
 * @author vovan
 */
public class MathUtil {
    //trong class này cung cấp cho ai đó rất nhiều hàm xữ lí toán học 
    //clone class math của jdk
    //hàm thư viên xài chung cho ai đó , ko cần lưu lại trạng thái/ giá trị
    // chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!!!
    //n! = 1.2.3.4.5.6....n
    //ko có giai thừa âm 
    //0! = 1! = 1 quy ước 
    // giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0 , vừa kịp đủ cho kiểu long
    //21 gia thừa chèn kiễu long
    //bài này ta quy ước tính n! trong khoang 0 ..0
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0 ..  20");
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        long product = 1; // tích là nhân
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;    
    }
    
}
