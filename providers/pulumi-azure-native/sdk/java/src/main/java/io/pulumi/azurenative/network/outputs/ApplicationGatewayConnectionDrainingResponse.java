// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ApplicationGatewayConnectionDrainingResponse {
    /**
     * The number of seconds connection draining is active. Acceptable values are from 1 second to 3600 seconds.
     * 
     */
    private final Integer drainTimeoutInSec;
    /**
     * Whether connection draining is enabled or not.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor
    private ApplicationGatewayConnectionDrainingResponse(
        @OutputCustomType.Parameter("drainTimeoutInSec") Integer drainTimeoutInSec,
        @OutputCustomType.Parameter("enabled") Boolean enabled) {
        this.drainTimeoutInSec = drainTimeoutInSec;
        this.enabled = enabled;
    }

    /**
     * The number of seconds connection draining is active. Acceptable values are from 1 second to 3600 seconds.
     * 
    */
    public Integer getDrainTimeoutInSec() {
        return this.drainTimeoutInSec;
    }
    /**
     * Whether connection draining is enabled or not.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayConnectionDrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer drainTimeoutInSec;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayConnectionDrainingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainTimeoutInSec = defaults.drainTimeoutInSec;
    	      this.enabled = defaults.enabled;
        }

        public Builder drainTimeoutInSec(Integer drainTimeoutInSec) {
            this.drainTimeoutInSec = Objects.requireNonNull(drainTimeoutInSec);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public ApplicationGatewayConnectionDrainingResponse build() {
            return new ApplicationGatewayConnectionDrainingResponse(drainTimeoutInSec, enabled);
        }
    }
}
