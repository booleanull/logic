package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import manager.solution.ResolutionSolution;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SolutionModule_ProvideResolutionSolutionFactory
    implements Factory<ResolutionSolution> {
  private final SolutionModule module;

  public SolutionModule_ProvideResolutionSolutionFactory(SolutionModule module) {
    this.module = module;
  }

  @Override
  public ResolutionSolution get() {
    return proxyProvideResolutionSolution(module);
  }

  public static SolutionModule_ProvideResolutionSolutionFactory create(SolutionModule module) {
    return new SolutionModule_ProvideResolutionSolutionFactory(module);
  }

  public static ResolutionSolution proxyProvideResolutionSolution(SolutionModule instance) {
    return Preconditions.checkNotNull(
        instance.provideResolutionSolution(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
