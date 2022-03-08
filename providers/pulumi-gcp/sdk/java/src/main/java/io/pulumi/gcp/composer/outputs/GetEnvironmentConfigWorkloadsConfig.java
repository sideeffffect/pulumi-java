// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigScheduler;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigWebServer;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfigWorker;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigWorkloadsConfig {
    private final List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;
    private final List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;
    private final List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

    @OutputCustomType.Constructor({"schedulers","webServers","workers"})
    private GetEnvironmentConfigWorkloadsConfig(
        List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers,
        List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers,
        List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
        this.schedulers = schedulers;
        this.webServers = webServers;
        this.workers = workers;
    }

    public List<GetEnvironmentConfigWorkloadsConfigScheduler> getSchedulers() {
        return this.schedulers;
    }
    public List<GetEnvironmentConfigWorkloadsConfigWebServer> getWebServers() {
        return this.webServers;
    }
    public List<GetEnvironmentConfigWorkloadsConfigWorker> getWorkers() {
        return this.workers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers;
        private List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers;
        private List<GetEnvironmentConfigWorkloadsConfigWorker> workers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulers = defaults.schedulers;
    	      this.webServers = defaults.webServers;
    	      this.workers = defaults.workers;
        }

        public Builder setSchedulers(List<GetEnvironmentConfigWorkloadsConfigScheduler> schedulers) {
            this.schedulers = Objects.requireNonNull(schedulers);
            return this;
        }

        public Builder setWebServers(List<GetEnvironmentConfigWorkloadsConfigWebServer> webServers) {
            this.webServers = Objects.requireNonNull(webServers);
            return this;
        }

        public Builder setWorkers(List<GetEnvironmentConfigWorkloadsConfigWorker> workers) {
            this.workers = Objects.requireNonNull(workers);
            return this;
        }
        public GetEnvironmentConfigWorkloadsConfig build() {
            return new GetEnvironmentConfigWorkloadsConfig(schedulers, webServers, workers);
        }
    }
}
