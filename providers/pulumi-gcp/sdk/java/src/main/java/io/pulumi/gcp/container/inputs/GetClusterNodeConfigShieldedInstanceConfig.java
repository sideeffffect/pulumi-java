// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetClusterNodeConfigShieldedInstanceConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterNodeConfigShieldedInstanceConfig Empty = new GetClusterNodeConfigShieldedInstanceConfig();

    @Import(name="enableIntegrityMonitoring", required=true)
      private final Boolean enableIntegrityMonitoring;

    public Boolean enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    @Import(name="enableSecureBoot", required=true)
      private final Boolean enableSecureBoot;

    public Boolean enableSecureBoot() {
        return this.enableSecureBoot;
    }

    public GetClusterNodeConfigShieldedInstanceConfig(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
    }

    private GetClusterNodeConfigShieldedInstanceConfig() {
        this.enableIntegrityMonitoring = null;
        this.enableSecureBoot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }        public GetClusterNodeConfigShieldedInstanceConfig build() {
            return new GetClusterNodeConfigShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
