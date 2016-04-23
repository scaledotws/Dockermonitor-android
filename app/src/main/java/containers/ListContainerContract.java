package containers;

import java.util.List;

import models.Container;

/**
 * Created by unsigned on 23/04/16.
 */
public interface ListContainerContract {
    void draw(List<Container> list);
    void error();
}
