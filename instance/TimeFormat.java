//以下实例演示了如何使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间：

package instance;

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class TimeFormat{
    public static void main(String[] args){
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        System.out.println(timeStamp);
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // 时间戳转换成时间
        System.out.println(sd);
   }
}