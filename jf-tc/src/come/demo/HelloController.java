package come.demo;

import com.jfinal.core.Controller;

/**
 * Created by lenovo on 2016/12/21.
 */
public class HelloController extends Controller{
    public void  index(){
        renderText("hi,这是index");
    }
}
