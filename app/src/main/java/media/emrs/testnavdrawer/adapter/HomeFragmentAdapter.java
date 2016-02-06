package media.emrs.testnavdrawer.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;
import media.emrs.testnavdrawer.model.FragmentModel;

/**
 * Created by : pratama - set.mnemonix@gmail.com
 * Date : 2/6/16
 * Project : TestNavDrawer
 */
public class HomeFragmentAdapter extends FragmentPagerAdapter {

  private Context context;
  private List<FragmentModel> fragmentModels;

  public HomeFragmentAdapter(FragmentManager fm, Context context,
      List<FragmentModel> fragmentModels) {
    super(fm);
    this.context = context;
    this.fragmentModels = fragmentModels;
  }

  @Override public Fragment getItem(int position) {
    return fragmentModels.get(position).getFragment();
  }

  @Override public int getCount() {
    return fragmentModels.size();
  }

  @Override public CharSequence getPageTitle(int position) {
    return fragmentModels.get(position).getTitle();
  }
}
