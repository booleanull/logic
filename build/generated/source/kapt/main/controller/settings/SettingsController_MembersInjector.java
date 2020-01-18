package controller.settings;

import com.google.gson.Gson;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettingsController_MembersInjector
    implements MembersInjector<SettingsController> {
  private final Provider<Gson> gsonProvider;

  public SettingsController_MembersInjector(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<SettingsController> create(Provider<Gson> gsonProvider) {
    return new SettingsController_MembersInjector(gsonProvider);
  }

  @Override
  public void injectMembers(SettingsController instance) {
    injectGson(instance, gsonProvider.get());
  }

  public static void injectGson(SettingsController instance, Gson gson) {
    instance.gson = gson;
  }
}
