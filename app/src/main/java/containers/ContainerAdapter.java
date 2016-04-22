package containers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import models.Container;
import scalews.dockermonitor.R;

/**
 * Created by Luca Bruzzone on 05/04/2016.
 *
 */
public class ContainerAdapter extends RecyclerView.Adapter<ContainerViewHolder> {

    private List<Container> containers;
    private Context context;

    public ContainerAdapter(List<Container> containers, Context context) {
        this.containers = containers;
        this.context = context;
    }

    @Override
    public ContainerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.option_card, parent, false);
        return new ContainerViewHolder(v,context);
    }

    @Override
    public void onBindViewHolder(ContainerViewHolder holder, int position) {
        Container container = containers.get(position);

        holder.id = container.getId();
        holder.title.setText(container.getNames().get(0));
        holder.image.setText(container.getImage());
        holder.command.setText(container.getCommand());
        holder.status.setText(container.getStatus());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
