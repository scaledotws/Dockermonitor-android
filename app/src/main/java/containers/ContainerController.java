package containers;

import rest_client.RestClient;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Luca Bruzzone on 05/04/2016.
 *
 */
public class ContainerController {

    public static void listContainers(ListContainerContract view){
        new RestClient()
            .getContainerService()
            .listContainer()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(view::draw, error -> view.error());
    }

    public static void inspectContainer(String id){
        new RestClient()
            .getContainerService()
            .inspectContainer(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(list -> {

            },
            err -> {

            });
    }
}
