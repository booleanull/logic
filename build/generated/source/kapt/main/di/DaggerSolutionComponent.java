package di;

import com.google.gson.Gson;
import controller.settings.SettingsController;
import controller.settings.SettingsController_MembersInjector;
import controller.solution.SolutionController;
import controller.solution.SolutionController_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import manager.solution.BaseSolution;
import manager.solution.ConsequenceSolution;
import manager.solution.ConsequenceSolution_MembersInjector;
import manager.solution.InconsistencySolution;
import manager.solution.InconsistencySolution_MembersInjector;
import manager.solution.ResolutionSolution;
import manager.solution.ResolutionSolution_MembersInjector;
import manager.solution.ValiditySolution;
import manager.solution.ValiditySolution_MembersInjector;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerSolutionComponent implements SolutionComponent {
  private Provider<Gson> provideGsonProvider;

  private Provider<ValiditySolution> provideValiditySolutionProvider;

  private Provider<InconsistencySolution> provideInconsistencySolutionProvider;

  private Provider<ConsequenceSolution> provideConsequenceSolutionProvider;

  private Provider<ResolutionSolution> provideResolutionSolutionProvider;

  private Provider<BaseSolution> provideBaseSolutionProvider;

  private DaggerSolutionComponent(GsonModule gsonModuleParam, SolutionModule solutionModuleParam) {

    initialize(gsonModuleParam, solutionModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SolutionComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(
      final GsonModule gsonModuleParam, final SolutionModule solutionModuleParam) {
    this.provideGsonProvider =
        DoubleCheck.provider(GsonModule_ProvideGsonFactory.create(gsonModuleParam));
    this.provideValiditySolutionProvider =
        DoubleCheck.provider(
            SolutionModule_ProvideValiditySolutionFactory.create(solutionModuleParam));
    this.provideInconsistencySolutionProvider =
        DoubleCheck.provider(
            SolutionModule_ProvideInconsistencySolutionFactory.create(solutionModuleParam));
    this.provideConsequenceSolutionProvider =
        DoubleCheck.provider(
            SolutionModule_ProvideConsequenceSolutionFactory.create(solutionModuleParam));
    this.provideResolutionSolutionProvider =
        DoubleCheck.provider(
            SolutionModule_ProvideResolutionSolutionFactory.create(solutionModuleParam));
    this.provideBaseSolutionProvider =
        DoubleCheck.provider(SolutionModule_ProvideBaseSolutionFactory.create(solutionModuleParam));
  }

  @Override
  public void inject(SolutionController solutionController) {
    injectSolutionController(solutionController);
  }

  @Override
  public void inject(SettingsController settingsController) {
    injectSettingsController(settingsController);
  }

  @Override
  public void inject(ValiditySolution validitySolution) {
    injectValiditySolution(validitySolution);
  }

  @Override
  public void inject(InconsistencySolution inconsistencySolution) {
    injectInconsistencySolution(inconsistencySolution);
  }

  @Override
  public void inject(ConsequenceSolution consequenceSolution) {
    injectConsequenceSolution(consequenceSolution);
  }

  @Override
  public void inject(ResolutionSolution resolutionSolution) {
    injectResolutionSolution(resolutionSolution);
  }

  private SolutionController injectSolutionController(SolutionController instance) {
    SolutionController_MembersInjector.injectGson(instance, provideGsonProvider.get());
    SolutionController_MembersInjector.injectValiditySolution(
        instance, provideValiditySolutionProvider.get());
    SolutionController_MembersInjector.injectInconsistencySolution(
        instance, provideInconsistencySolutionProvider.get());
    SolutionController_MembersInjector.injectConsequenceSolution(
        instance, provideConsequenceSolutionProvider.get());
    SolutionController_MembersInjector.injectResolutionSolution(
        instance, provideResolutionSolutionProvider.get());
    return instance;
  }

  private SettingsController injectSettingsController(SettingsController instance) {
    SettingsController_MembersInjector.injectGson(instance, provideGsonProvider.get());
    return instance;
  }

  private ValiditySolution injectValiditySolution(ValiditySolution instance) {
    ValiditySolution_MembersInjector.injectBaseSolution(
        instance, provideBaseSolutionProvider.get());
    return instance;
  }

  private InconsistencySolution injectInconsistencySolution(InconsistencySolution instance) {
    InconsistencySolution_MembersInjector.injectBaseSolution(
        instance, provideBaseSolutionProvider.get());
    return instance;
  }

  private ConsequenceSolution injectConsequenceSolution(ConsequenceSolution instance) {
    ConsequenceSolution_MembersInjector.injectValiditySolution(
        instance, provideValiditySolutionProvider.get());
    return instance;
  }

  private ResolutionSolution injectResolutionSolution(ResolutionSolution instance) {
    ResolutionSolution_MembersInjector.injectBaseSolution(
        instance, provideBaseSolutionProvider.get());
    return instance;
  }

  public static final class Builder {
    private GsonModule gsonModule;

    private SolutionModule solutionModule;

    private Builder() {}

    public Builder solutionModule(SolutionModule solutionModule) {
      this.solutionModule = Preconditions.checkNotNull(solutionModule);
      return this;
    }

    public Builder gsonModule(GsonModule gsonModule) {
      this.gsonModule = Preconditions.checkNotNull(gsonModule);
      return this;
    }

    public SolutionComponent build() {
      if (gsonModule == null) {
        this.gsonModule = new GsonModule();
      }
      if (solutionModule == null) {
        this.solutionModule = new SolutionModule();
      }
      return new DaggerSolutionComponent(gsonModule, solutionModule);
    }
  }
}
