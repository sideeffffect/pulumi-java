// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWaiterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWaiterArgs Empty = new GetWaiterArgs();

    @InputImport(name="configId", required=true)
      private final String configId;

    public String getConfigId() {
        return this.configId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="waiterId", required=true)
      private final String waiterId;

    public String getWaiterId() {
        return this.waiterId;
    }

    public GetWaiterArgs(
        String configId,
        @Nullable String project,
        String waiterId) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.project = project;
        this.waiterId = Objects.requireNonNull(waiterId, "expected parameter 'waiterId' to be non-null");
    }

    private GetWaiterArgs() {
        this.configId = null;
        this.project = null;
        this.waiterId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWaiterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configId;
        private @Nullable String project;
        private String waiterId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWaiterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.project = defaults.project;
    	      this.waiterId = defaults.waiterId;
        }

        public Builder configId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder waiterId(String waiterId) {
            this.waiterId = Objects.requireNonNull(waiterId);
            return this;
        }
        public GetWaiterArgs build() {
            return new GetWaiterArgs(configId, project, waiterId);
        }
    }
}
