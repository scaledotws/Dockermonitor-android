package rest_client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import services.ContainerService;

public class RestClient {
    private Retrofit retrofit;

    public RestClient() {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();

        // it's really useful
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);


        // okhttp3 client
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        // create Retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl(RestEndpoint.endpoint)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

    }

    public ContainerService getContainerService(){
        return retrofit.create(ContainerService.class);
    }
}
