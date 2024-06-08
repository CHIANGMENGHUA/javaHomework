package phase2.hw7;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/*
Java的InputStream類別（Java 9 引入）中的transferTo方法會自動將資料從輸入流傳輸到輸出流，並且它直接處理位元組的傳輸。
因此，使用該方法時不需要明確指定編碼類型。
 */

/* 此方法必須在 Java 9 以後環境才能執行 */

public class IOTest {

    public static void main(String[] args) throws MalformedURLException {

        try (InputStream input = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld").openStream();
             OutputStream output = System.out
             // 讓 output 物件 = System.out, 當 input 轉換成 output 時可以直接 print stream 到 console 上
        ) {
            input.transferTo(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
