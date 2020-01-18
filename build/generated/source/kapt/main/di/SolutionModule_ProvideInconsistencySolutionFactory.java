package di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import manager.solution.InconsistencySolution;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SolutionModule_ProvideInconsistencySolutionFactory
    implements Factory<InconsistencySolution> {
  private final SolutionModule module;

  public SolutionModule_ProvideInconsistencySolutionFactory(SolutionModule module) {
    this.module = module;
  }

  @Override
  public InconsistencySolution get() {
    return proxyProvideInconsistencySolution(module);
  }

  public static SolutionModule_ProvideInconsistencySolutionFactory create(SolutionModule module) {
    return new SolutionModule_ProvideInconsistencySolutionFactory(module);
  }

  public static InconsistencySolution proxyProvideInconsistencySolution(SolutionModule instance) {
    return Preconditions.checkNotNull(
        instance.provideInconsistencySolution(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
