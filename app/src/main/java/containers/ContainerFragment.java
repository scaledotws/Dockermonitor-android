package containers;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import models.Container;
import scalews.dockermonitor.R;

public class ContainerFragment extends Fragment implements ListContainerContract{

    @Bind(R.id.controller_recycler_view)
    RecyclerView recyclerView;

    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_container, container, false);
        ButterKnife.bind(this, view);
        context = getActivity().getApplicationContext();
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(new ContainerAdapter(new ArrayList<>(), getActivity()));

        ContainerController.listContainers(this);
        return view;
    }

    @Override
    public void draw(List<Container> list) {
        Log.wtf("containers", list.toString());
        recyclerView.setAdapter(new ContainerAdapter(list, getActivity()));
    }

    @Override
    public void error() {
        Toast.makeText(getActivity(), "problem retriving list", Toast.LENGTH_SHORT).show();
    }
}