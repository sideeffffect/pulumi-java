// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterMonitoringConfig {
    private final List<String> enableComponents;

    @OutputCustomType.Constructor({"enableComponents"})
    private GetClusterMonitoringConfig(List<String> enableComponents) {
        this.enableComponents = enableComponents;
    }

    public List<String> getEnableComponents() {
        return this.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMonitoringConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMonitoringConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder setEnableComponents(List<String> enableComponents) {
            this.enableComponents = Objects.requireNonNull(enableComponents);
            return this;
        }
        public GetClusterMonitoringConfig build() {
            return new GetClusterMonitoringConfig(enableComponents);
        }
    }
}
