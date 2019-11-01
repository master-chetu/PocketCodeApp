package chetu.felixpat.pocketcodeapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;



public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentsList = new ArrayList<>();
    List<String> fragmentNames = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentNames.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentNames.get(position);
    }

    public void addFragments(Fragment fragment,String name)
    {
        fragmentsList.add(fragment);
        fragmentNames.add(name);
    }

}
