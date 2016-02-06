package media.emrs.testnavdrawer;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by : pratama - set.mnemonix@gmail.com
 * Date : 2/6/16
 * Project : TestNavDrawer
 */
public class App extends Application {
  @Override public void onCreate() {
    super.onCreate();
    Fabric.with(this, new Crashlytics());

  }
}
