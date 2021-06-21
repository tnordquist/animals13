package edu.cnm.deepdive.animals13;

import android.app.Application;
import com.squareup.picasso.Picasso;

public class AnimalsApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Picasso.setSingletonInstance(
        new Picasso.Builder(this)
            .loggingEnabled(BuildConfig.DEBUG)
            .build()
    );
  }
}
