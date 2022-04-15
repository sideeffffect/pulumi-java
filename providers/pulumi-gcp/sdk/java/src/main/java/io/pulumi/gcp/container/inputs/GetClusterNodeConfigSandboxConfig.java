// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodeConfigSandboxConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodeConfigSandboxConfig Empty = new GetClusterNodeConfigSandboxConfig();

    @Import(name="sandboxType", required=true)
      private final String sandboxType;

    public String sandboxType() {
        return this.sandboxType;
    }

    public GetClusterNodeConfigSandboxConfig(String sandboxType) {
        this.sandboxType = Objects.requireNonNull(sandboxType, "expected parameter 'sandboxType' to be non-null");
    }

    private GetClusterNodeConfigSandboxConfig() {
        this.sandboxType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigSandboxConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder sandboxType(String sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }        public GetClusterNodeConfigSandboxConfig build() {
            return new GetClusterNodeConfigSandboxConfig(sandboxType);
        }
    }
}
