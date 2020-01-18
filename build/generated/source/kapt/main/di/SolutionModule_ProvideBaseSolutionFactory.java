package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import manager.solution.BaseSolution;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SolutionModule_ProvideBaseSolutionFactory implements Factory<BaseSolution> {
  private final SolutionModule module;

  public SolutionModule_ProvideBaseSolutionFactory(SolutionModule module) {
    this.module = module;
  }

  @Override
  public BaseSolution get() {
    return proxyProvideBaseSolution(module);
  }

  public static SolutionModule_ProvideBaseSolutionFactory create(SolutionModule module) {
    return new SolutionModule_ProvideBaseSolutionFactory(module);
  }

  public static BaseSolution proxyProvideBaseSolution(SolutionModule instance) {
    return Preconditions.checkNotNull(
        instance.provideBaseSolution(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
