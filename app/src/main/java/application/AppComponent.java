package application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by unsigned on 23/04/16.
 */
@Singleton
@Component(
        modules = AppModule.class
)
public interface AppComponent {
    void inject(AppModule appModule);
}
