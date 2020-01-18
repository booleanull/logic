package manager.solution;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ValiditySolution_MembersInjector implements MembersInjector<ValiditySolution> {
  private final Provider<BaseSolution> baseSolutionProvider;

  public ValiditySolution_MembersInjector(Provider<BaseSolution> baseSolutionProvider) {
    this.baseSolutionProvider = baseSolutionProvider;
  }

  public static MembersInjector<ValiditySolution> create(
      Provider<BaseSolution> baseSolutionProvider) {
    return new ValiditySolution_MembersInjector(baseSolutionProvider);
  }

  @Override
  public void injectMembers(ValiditySolution instance) {
    injectBaseSolution(instance, baseSolutionProvider.get());
  }

  public static void injectBaseSolution(ValiditySolution instance, BaseSolution baseSolution) {
    instance.baseSolution = baseSolution;
  }
}
