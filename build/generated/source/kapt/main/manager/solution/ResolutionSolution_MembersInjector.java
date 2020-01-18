package manager.solution;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResolutionSolution_MembersInjector
    implements MembersInjector<ResolutionSolution> {
  private final Provider<BaseSolution> baseSolutionProvider;

  public ResolutionSolution_MembersInjector(Provider<BaseSolution> baseSolutionProvider) {
    this.baseSolutionProvider = baseSolutionProvider;
  }

  public static MembersInjector<ResolutionSolution> create(
      Provider<BaseSolution> baseSolutionProvider) {
    return new ResolutionSolution_MembersInjector(baseSolutionProvider);
  }

  @Override
  public void injectMembers(ResolutionSolution instance) {
    injectBaseSolution(instance, baseSolutionProvider.get());
  }

  public static void injectBaseSolution(ResolutionSolution instance, BaseSolution baseSolution) {
    instance.baseSolution = baseSolution;
  }
}
