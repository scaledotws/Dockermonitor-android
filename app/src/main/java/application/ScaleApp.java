package application;

import android.app.Application;


/**
 * Created by Luca Bruzzone on 05/04/2016.
 *
 */
public class ScaleApp extends Application {

    public static Dispatcher dispatcher;

    @Override
    public void onCreate(){
       dispatcher = new Dispatcher();
       super.onCreate();
    }

}
