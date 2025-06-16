/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vancuong.mathutil.test.core;

import junit.framework.Assert;
import org.junit.Test;
import vn.vancuong.mathutil.core.MathUtil;

/**
 *
 * @author vovan
 */
public class TestMath {

    //đây là class sẽ sử dụng các hàm thư viện /framework Junit
    //Để kiểm thử, kiểm tra code chính - hàm tính giathua() bên class core.MathUtil
    //Có nhiều quy tắc đặc tên hàm kiểm thử 
    //nhưng sẽ nói lên mục đích của case / tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại
    //hàm dưới đây là tình huống test mà hàm chạy thành công, trả về ngon ko 
    //ta sẽ xài hàm kiểu well - đưa 5 , 6 hong chơi đưa -5! , 30!
    //Test Junit sẽ phối hợp vs JVM dê chạy hàm này
    //Test ở phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng vs nhiều case khác nhau để kiểm thử
    @Test
    public void testGetFactorialGivenRightArgurmentWell() {
        int n = 4; //test thử tình huống tử tế dầu vào , mà phải chạy đúng
        long expected = 24; // hy vong 0! la 1
        // long actual = ; //gọi hàm cần test
        long actual = MathUtil.getFactorial(n);
        //so sánh ex vs ac dùng xanh xanh đỏ đỏ , framework

        Assert.assertEquals(expected, actual);
        //hàm giúp so sánh hai giá trị nào đó có giống nhau ko
        //nếu giống nhau -> thì xanh, code ngon
        //                  it cho nhất cho case đang test
        //nếu ko giống nhau -> thấy màu đỏ, đang bị sai 
        //evx vs ac ko giống nhau 

        //gộp thêm vài case thành công / đưa dầu vào ngon !!! Hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1));// tui muốn 1! cũng phỉa là 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));// tui muốn 1! cũng phỉa là 1
        Assert.assertEquals(6, MathUtil.getFactorial(3));// tui muốn 1! cũng phỉa là 1
        Assert.assertEquals(24, MathUtil.getFactorial(4));// tui muốn 1! cũng phỉa là 1
        Assert.assertEquals(720, MathUtil.getFactorial(5));// tui muốn 1! cũng phỉa là 1
        Assert.assertEquals(820, MathUtil.getFactorial(6));// tui muốn 1! cũng phỉa là 1

    }

    //Hàm getF() taa thiết kế có 2 tình huống xử lí
    //1. Đưa data tử té trong [0.20] -> tính đúng dc n! - done
    //2. Đưa data vào cà chớn , âm, > 20; Thiết kế của hàm là ném ra ngoại lệ 
    //Tao kì vọng ngoại lệ xuất hiện khi N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn 
    //Nếu hàm nhận vào n < 0 hoặc n > 20  và ném ra ngoại lệ 
    //Hảm chạy đúng như thiết kế -> xanh phải xuất hiện 
    //nếu hàm nhận vào n < 0 || n > 20 và hàm ko ém ra ngoại lệ 
    //sure , hàm chạy sai thiết kế , sai kì vọng , màu đỏ
    //Testcase: 
    //input : -5
    //expected : Invalid argument xuất hiện
    //tính huống bất thường , ngoại lệ , ngoài dự tính , dự liệu 
    //là những thứ ko do lường so sánh kiễu value
    //mà chỉ có thể đo lường = cách chúng có xuất hiện hay ko 
    //assertEquals() ko dùng đề so sánh 2 ngoại lệ
    //      Equals() là bằng nhau hay ko trên value   
    
    
    
    //Màu đỏ đó em , do hàm đúng là có ném ngoại lệ thật sự
    //               nhưng ko phải là ngoại lệ như kì vọng - thực sự kì vọng sai
    //               ko phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowExcepttion() {
//        MathUtil.getFactorial(-5);   //Hàm @Test chạy , hay hàm GetF() chạy
//                                     //sẽ ném ra ngoại lệ 
//    }
    
    
     @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowExcepttion() {
        MathUtil.getFactorial(-5);   //Hàm @Test chạy , hay hàm GetF() chạy
                                     //sẽ ném ra ngoại lệ 
    }
    
    //cách khác ném ngoại lệ xuất hiện , viết tự nhiên hơn
    //xài Lamda
    
    //Test case : hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi choi vs 21!
    
//    @Test
//    public void testGetFactorialGivenWrongArgumentThrowExcepttion_LamdaExperesion() {
////        Assert.assertThrows();
//        
//        MathUtil.getFactorial(-5);   //Hàm @Test chạy , hay hàm GetF() chạy
//                                     //sẽ ném ra ngoại lệ 
//    }
    
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowExcepttion_TryCathc() {
        //chủ donng kiềm soát ngoại lệ
        try {
             MathUtil.getFactorial(-5); 
        } catch (Exception e) {
            //bắt try cacth thì junit thì ra màu xanh do đã chủ động kiểm  soát ngoại lệ hay ko 
            //nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko??
            //có đoạn code kiểm soát ngoại lệ IllagaArguementExpection
            Assert.assertEquals("Invalid argument. N must be between 0 ..  20", e.getMessage());
        }    
    }
    
    
}
