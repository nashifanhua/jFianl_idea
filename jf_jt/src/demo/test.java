package demo;

import com.jfinal.core.JFinal;

/**
 * Created by lenovo on 2016/12/21.
 */
public class test {
    public static void main(String[] args) {
        JFinal.start("WebRoot", 80, "/demo", 5);
    }
}
