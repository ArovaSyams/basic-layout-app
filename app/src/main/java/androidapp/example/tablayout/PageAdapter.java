package androidapp.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import androidapp.example.tablayout.androidapp.tab.fragment.TabOne;
import androidapp.example.tablayout.androidapp.tab.fragment.Tab_two;

public class PageAdapter extends FragmentStatePagerAdapter {

    int countTab;

    public PageAdapter(@NonNull FragmentManager fm, int countTab) {
        super(fm);
        this.countTab = countTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0 :
                TabOne tabOne = new TabOne();
                return tabOne;
            case 1 :
                Tab_two tabTwo = new Tab_two();
                return tabTwo;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return countTab;
    }
}
