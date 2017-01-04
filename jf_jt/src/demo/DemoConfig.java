package demo;

import com.jfinal.config.*;

/**
 * Created by lenovo on 2016/12/21.
 */
public class DemoConfig extends JFinalConfig {
    public void configConstant(Constants me){
        me.setDevMode(true);
    }
    public void configRoute(Routes me){
        me.add("/hello",HelloController.class);
        me.add("/",IndexController.class);
    }

    //hkllkllujv

    public void configPlugin(Plugins me){
//jkluo
    }
    public  void configInterceptor(Interceptors me){

    }
    public void configHandler(Handlers me){

    }
}
