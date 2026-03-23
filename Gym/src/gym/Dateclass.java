/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author thidapondchuanwiriyachan
 */
public class Dateclass extends Exception{
    // เมธอดสำหรับดึงวันที่ปัจจุบันในรูปแบบ dd/MM/yyyy
    public String CurrentDate() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1; // เดือนเริ่มจาก 0, ต้อง +1
        int year = cal.get(Calendar.YEAR);

        // คืนค่าข้อความวันที่ในรูปแบบ dd/MM/yyyy
        return day + "/" + month + "/" + year;
    }
    public String getCurrentDate() {
        return CurrentDate(); // เรียกใช้เมธอด CurrentDate แทน
    }
    
}
