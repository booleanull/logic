package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import manager.solution.ValiditySolution;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SolutionModule_ProvideValiditySolutionFactory
    implements Factory<ValiditySolution> {
  private final SolutionModule module;

  public SolutionModule_ProvideValiditySolutionFactory(SolutionModule module) {
    this.module = module;
  }

  @Override
  public ValiditySolution get() {
    return proxyProvideValiditySolution(module);
  }

  public static SolutionModule_ProvideValiditySolutionFactory create(SolutionModule module) {
    return new SolutionModule_ProvideValiditySolutionFactory(module);
  }

  public static ValiditySolution proxyProvideValiditySolution(SolutionModule instance) {
    return Preconditions.checkNotNull(
        instance.provideValiditySolution(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
