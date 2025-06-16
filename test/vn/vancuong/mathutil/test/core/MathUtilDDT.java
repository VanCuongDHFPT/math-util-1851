/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vancuong.mathutil.test.core;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import vn.vancuong.mathutil.core.MathUtil;

/**
 *
 * @author vovan
 */
//câu lệnh này là chỉnh chơi vs Junit thôi báo hiệu rằng sẽ cần loop qua tập data để 
//lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDT {
    //hàm này ta sẽ trả về mảng hai chiều gồm nhiều cặp expected/input
    @Parameterized.Parameters  //JUnit sẽ ngầm chạy loop qua từng dòng 
                               //của mảng để lấy ra dc cặp data input/expected
    //tên hàm ko quan trọng , quan trong là @
    public static Object[][] intitData(){
        return new Integer[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120},
            {6,820},   
        };    
    }
    //giả sử nó loop qua từng dòng cũa mảng ,ta vẩn cần gán từng value của cột 
    //vào biến tướng ứng input, expected
    @Parameterized.Parameter(value = 0)
    public int n; //biến map vs vlaue input[0] của mảng
    @Parameterized.Parameter(value = 1)
    public long expected; //kiểu long vì giá trị trả về hàm GetF();
    @Test
    public void testGetFactorialGivenRightArgurmentWell() {
         Assert.assertEquals(expected, MathUtil.getFactorial(n));
        
    }
    
    
}
