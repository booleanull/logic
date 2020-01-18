package controller.solution;

import com.google.gson.Gson;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import manager.solution.ConsequenceSolution;
import manager.solution.InconsistencySolution;
import manager.solution.ResolutionSolution;
import manager.solution.ValiditySolution;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SolutionController_MembersInjector
    implements MembersInjector<SolutionController> {
  private final Provider<Gson> gsonProvider;

  private final Provider<ValiditySolution> validitySolutionProvider;

  private final Provider<InconsistencySolution> inconsistencySolutionProvider;

  private final Provider<ConsequenceSolution> consequenceSolutionProvider;

  private final Provider<ResolutionSolution> resolutionSolutionProvider;

  public SolutionController_MembersInjector(
      Provider<Gson> gsonProvider,
      Provider<ValiditySolution> validitySolutionProvider,
      Provider<InconsistencySolution> inconsistencySolutionProvider,
      Provider<ConsequenceSolution> consequenceSolutionProvider,
      Provider<ResolutionSolution> resolutionSolutionProvider) {
    this.gsonProvider = gsonProvider;
    this.validitySolutionProvider = validitySolutionProvider;
    this.inconsistencySolutionProvider = inconsistencySolutionProvider;
    this.consequenceSolutionProvider = consequenceSolutionProvider;
    this.resolutionSolutionProvider = resolutionSolutionProvider;
  }

  public static MembersInjector<SolutionController> create(
      Provider<Gson> gsonProvider,
      Provider<ValiditySolution> validitySolutionProvider,
      Provider<InconsistencySolution> inconsistencySolutionProvider,
      Provider<ConsequenceSolution> consequenceSolutionProvider,
      Provider<ResolutionSolution> resolutionSolutionProvider) {
    return new SolutionController_MembersInjector(
        gsonProvider,
        validitySolutionProvider,
        inconsistencySolutionProvider,
        consequenceSolutionProvider,
        resolutionSolutionProvider);
  }

  @Override
  public void injectMembers(SolutionController instance) {
    injectGson(instance, gsonProvider.get());
    injectValiditySolution(instance, validitySolutionProvider.get());
    injectInconsistencySolution(instance, inconsistencySolutionProvider.get());
    injectConsequenceSolution(instance, consequenceSolutionProvider.get());
    injectResolutionSolution(instance, resolutionSolutionProvider.get());
  }

  public static void injectGson(SolutionController instance, Gson gson) {
    instance.gson = gson;
  }

  public static void injectValiditySolution(
      SolutionController instance, ValiditySolution validitySolution) {
    instance.validitySolution = validitySolution;
  }

  public static void injectInconsistencySolution(
      SolutionController instance, InconsistencySolution inconsistencySolution) {
    instance.inconsistencySolution = inconsistencySolution;
  }

  public static void injectConsequenceSolution(
      SolutionController instance, ConsequenceSolution consequenceSolution) {
    instance.consequenceSolution = consequenceSolution;
  }

  public static void injectResolutionSolution(
      SolutionController instance, ResolutionSolution resolutionSolution) {
    instance.resolutionSolution = resolutionSolution;
  }
}
