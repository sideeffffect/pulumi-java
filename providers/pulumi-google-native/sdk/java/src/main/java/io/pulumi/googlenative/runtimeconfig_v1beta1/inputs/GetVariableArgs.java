// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVariableArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVariableArgs Empty = new GetVariableArgs();

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

    @InputImport(name="variableId", required=true)
      private final String variableId;

    public String getVariableId() {
        return this.variableId;
    }

    public GetVariableArgs(
        String configId,
        @Nullable String project,
        String variableId) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.project = project;
        this.variableId = Objects.requireNonNull(variableId, "expected parameter 'variableId' to be non-null");
    }

    private GetVariableArgs() {
        this.configId = null;
        this.project = null;
        this.variableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configId;
        private @Nullable String project;
        private String variableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.project = defaults.project;
    	      this.variableId = defaults.variableId;
        }

        public Builder configId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder variableId(String variableId) {
            this.variableId = Objects.requireNonNull(variableId);
            return this;
        }
        public GetVariableArgs build() {
            return new GetVariableArgs(configId, project, variableId);
        }
    }
}
