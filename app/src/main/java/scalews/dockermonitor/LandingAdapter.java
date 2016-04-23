package scalews.dockermonitor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import containers.ContainerFragment;

/**
 * Created by unsigned on 23/04/16.
 */
public class LandingAdapter extends FragmentStatePagerAdapter {

    int tabNumber;

    public LandingAdapter(FragmentManager fm, int tabNumber) {
        super(fm);
        this.tabNumber = tabNumber;
    }

    @Override
    public Fragment getItem(int position) {
        return new ContainerFragment();
    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
