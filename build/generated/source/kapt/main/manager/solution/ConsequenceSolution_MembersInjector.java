package manager.solution;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ConsequenceSolution_MembersInjector
    implements MembersInjector<ConsequenceSolution> {
  private final Provider<ValiditySolution> validitySolutionProvider;

  public ConsequenceSolution_MembersInjector(Provider<ValiditySolution> validitySolutionProvider) {
    this.validitySolutionProvider = validitySolutionProvider;
  }

  public static MembersInjector<ConsequenceSolution> create(
      Provider<ValiditySolution> validitySolutionProvider) {
    return new ConsequenceSolution_MembersInjector(validitySolutionProvider);
  }

  @Override
  public void injectMembers(ConsequenceSolution instance) {
    injectValiditySolution(instance, validitySolutionProvider.get());
  }

  public static void injectValiditySolution(
      ConsequenceSolution instance, ValiditySolution validitySolution) {
    instance.validitySolution = validitySolution;
  }
}
