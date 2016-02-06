package media.emrs.testnavdrawer.model;

import android.support.v4.app.Fragment;

/**
 * Created by : pratama - set.mnemonix@gmail.com
 * Date : 2/6/16
 * Project : TestNavDrawer
 */
public class FragmentModel {
  public String title;
  public Fragment fragment;

  public FragmentModel(String title, Fragment fragment) {
    this.title = title;
    this.fragment = fragment;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Fragment getFragment() {
    return fragment;
  }

  public void setFragment(Fragment fragment) {
    this.fragment = fragment;
  }
}
