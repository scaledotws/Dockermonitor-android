package containers;

import java.util.AbstractMap;

import application.ScaleApp;
import rest_client.RestClient;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import unsigned.fluxify.stores.StoreObject;

/**
 * Created by Luca Bruzzone on 05/04/2016.
 *
 */
public class ContainerController {

    public static void listContainers(){
        new RestClient()
            .getContainerService()
            .listContainer()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(list -> {
                ScaleApp.dispatcher.dispatch("CONTAINER_LIST_CHANGED",
                    new AbstractMap.SimpleEntry<>(
                        "CONTAINER_LIST_CHANGED",
                        new StoreObject(
                            "post_list",
                            false,
                            list
                        ))
                );
                },
            err -> {
                ScaleApp.dispatcher.dispatch("CONTAINER_LIST_HAD_ERRORS",
                    new AbstractMap.SimpleEntry<>(
                        "CONTAINER_LIST_HAD_ERRORS",
                        new StoreObject(
                            "post_list",
                            false,
                            err
                        )));
            });
    }

    public static void inspectContainer(String id){
        new RestClient()
                .getContainerService()
                .inspectContainer(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(list -> {
                            ScaleApp.dispatcher.dispatch("CONTAINER_LIST_CHANGED",
                                    new AbstractMap.SimpleEntry<>(
                                            "CONTAINER_LIST_CHANGED",
                                            new StoreObject(
                                                    "post_list",
                                                    false,
                                                    list
                                            ))
                            );
                        },
                        err -> {
                            ScaleApp.dispatcher.dispatch("CONTAINER_LIST_HAD_ERRORS",
                                    new AbstractMap.SimpleEntry<>(
                                            "CONTAINER_LIST_HAD_ERRORS",
                                            new StoreObject(
                                                    "post_list",
                                                    false,
                                                    err
                                            )));
                        });
    }
}
