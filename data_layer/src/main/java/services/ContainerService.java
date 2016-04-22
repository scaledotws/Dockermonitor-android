package services;

import java.util.List;

import models.Container;
import models.ContainerDetails;
import models.ContainerTop;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Luca Bruzzone on 03/04/2016.
 *
 */
public interface ContainerService {
    @GET("/containers/json")
    Observable<List<Container>> listContainer();

    @POST("/containers/create")
    Observable<Container> createContainer();

    @GET("/containers/{id}/json")
    Observable<ContainerDetails> inspectContainer(@Path("id") String id);

    @GET("/containers/{id}/top")
    Observable<ContainerTop> topContainer(@Path("id") String id);

}
