// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.composer.outputs.EnvironmentConfigWorkloadsConfigScheduler;
import io.pulumi.gcp.composer.outputs.EnvironmentConfigWorkloadsConfigWebServer;
import io.pulumi.gcp.composer.outputs.EnvironmentConfigWorkloadsConfigWorker;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentConfigWorkloadsConfig {
    private final @Nullable EnvironmentConfigWorkloadsConfigScheduler scheduler;
    private final @Nullable EnvironmentConfigWorkloadsConfigWebServer webServer;
    private final @Nullable EnvironmentConfigWorkloadsConfigWorker worker;

    @OutputCustomType.Constructor
    private EnvironmentConfigWorkloadsConfig(
        @OutputCustomType.Parameter("scheduler") @Nullable EnvironmentConfigWorkloadsConfigScheduler scheduler,
        @OutputCustomType.Parameter("webServer") @Nullable EnvironmentConfigWorkloadsConfigWebServer webServer,
        @OutputCustomType.Parameter("worker") @Nullable EnvironmentConfigWorkloadsConfigWorker worker) {
        this.scheduler = scheduler;
        this.webServer = webServer;
        this.worker = worker;
    }

    public Optional<EnvironmentConfigWorkloadsConfigScheduler> getScheduler() {
        return Optional.ofNullable(this.scheduler);
    }
    public Optional<EnvironmentConfigWorkloadsConfigWebServer> getWebServer() {
        return Optional.ofNullable(this.webServer);
    }
    public Optional<EnvironmentConfigWorkloadsConfigWorker> getWorker() {
        return Optional.ofNullable(this.worker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWorkloadsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EnvironmentConfigWorkloadsConfigScheduler scheduler;
        private @Nullable EnvironmentConfigWorkloadsConfigWebServer webServer;
        private @Nullable EnvironmentConfigWorkloadsConfigWorker worker;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWorkloadsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduler = defaults.scheduler;
    	      this.webServer = defaults.webServer;
    	      this.worker = defaults.worker;
        }

        public Builder scheduler(@Nullable EnvironmentConfigWorkloadsConfigScheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public Builder webServer(@Nullable EnvironmentConfigWorkloadsConfigWebServer webServer) {
            this.webServer = webServer;
            return this;
        }

        public Builder worker(@Nullable EnvironmentConfigWorkloadsConfigWorker worker) {
            this.worker = worker;
            return this;
        }
        public EnvironmentConfigWorkloadsConfig build() {
            return new EnvironmentConfigWorkloadsConfig(scheduler, webServer, worker);
        }
    }
}
