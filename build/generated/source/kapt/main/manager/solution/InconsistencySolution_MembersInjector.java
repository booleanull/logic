package manager.solution;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InconsistencySolution_MembersInjector
    implements MembersInjector<InconsistencySolution> {
  private final Provider<BaseSolution> baseSolutionProvider;

  public InconsistencySolution_MembersInjector(Provider<BaseSolution> baseSolutionProvider) {
    this.baseSolutionProvider = baseSolutionProvider;
  }

  public static MembersInjector<InconsistencySolution> create(
      Provider<BaseSolution> baseSolutionProvider) {
    return new InconsistencySolution_MembersInjector(baseSolutionProvider);
  }

  @Override
  public void injectMembers(InconsistencySolution instance) {
    injectBaseSolution(instance, baseSolutionProvider.get());
  }

  public static void injectBaseSolution(InconsistencySolution instance, BaseSolution baseSolution) {
    instance.baseSolution = baseSolution;
  }
}
