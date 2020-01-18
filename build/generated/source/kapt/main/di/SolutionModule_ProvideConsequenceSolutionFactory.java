package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import manager.solution.ConsequenceSolution;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SolutionModule_ProvideConsequenceSolutionFactory
    implements Factory<ConsequenceSolution> {
  private final SolutionModule module;

  public SolutionModule_ProvideConsequenceSolutionFactory(SolutionModule module) {
    this.module = module;
  }

  @Override
  public ConsequenceSolution get() {
    return proxyProvideConsequenceSolution(module);
  }

  public static SolutionModule_ProvideConsequenceSolutionFactory create(SolutionModule module) {
    return new SolutionModule_ProvideConsequenceSolutionFactory(module);
  }

  public static ConsequenceSolution proxyProvideConsequenceSolution(SolutionModule instance) {
    return Preconditions.checkNotNull(
        instance.provideConsequenceSolution(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
