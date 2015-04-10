package nl.mprog.apps.mrpotatohead;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] {"Body Parts", "Accesoires"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BodyFeaturesFragment bodyFeaturesTab = new BodyFeaturesFragment();
                return bodyFeaturesTab;

            case 1:
                AccesoiresFeaturesFragment accesoiresFeaturesTab = new AccesoiresFeaturesFragment();
                return accesoiresFeaturesTab;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
