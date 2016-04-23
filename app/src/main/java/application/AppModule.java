package application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by unsigned on 23/04/16.
 */
@Module
public class AppModule {
    private final App app;

    public AppModule(App app){
        this.app = app;
    }

    @Provides @Singleton
    public SharedPreferences provideSharedPreference() {
        return PreferenceManager.getDefaultSharedPreferences(app);
    }
    @Provides @Singleton
    Application providesApplication(){
        return this.app;
    }

    @Provides
    Context providesContext() {
        return app.getApplicationContext();
    }

}
