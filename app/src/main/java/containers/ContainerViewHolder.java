package containers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import scalews.dockermonitor.R;

/**
 * Created by Luca Bruzzone on 05/04/2016.
 */
public class ContainerViewHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.title_container)
    TextView title;
    @Bind(R.id.image_container)
    TextView image;
    @Bind(R.id.command_container)
    TextView command;
    @Bind(R.id.status_container)
    TextView status;

    @Bind(R.id.card_view)
    View cardView;

    String id;

    public ContainerViewHolder(View itemView, Context context) {
        super(itemView);

        ButterKnife.bind(this, itemView);

        cardView.setOnClickListener(l -> {
            ContainerController.inspectContainer(id);

        });
    }
}
