package demo;

import com.jfinal.core.Controller;

/**
 * Created by lenovo on 2016/12/21.
 */
public class IndexController extends Controller {
    public void index(){
        renderText("hello,this is Controller");
    }
}
