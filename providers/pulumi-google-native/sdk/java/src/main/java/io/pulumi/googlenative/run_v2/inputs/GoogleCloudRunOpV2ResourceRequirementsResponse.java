// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * ResourceRequirements describes the compute resource requirements.
 * 
 */
public final class GoogleCloudRunOpV2ResourceRequirementsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2ResourceRequirementsResponse Empty = new GoogleCloudRunOpV2ResourceRequirementsResponse();

    /**
     * Determines whether CPU should be throttled or not outside of requests.
     * 
     */
    @InputImport(name="cpuIdle", required=true)
      private final Boolean cpuIdle;

    public Boolean getCpuIdle() {
        return this.cpuIdle;
    }

    /**
     * Only memory and CPU are supported. Note: The only supported values for CPU are '1', '2', and '4'. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    @InputImport(name="limits", required=true)
      private final Map<String,String> limits;

    public Map<String,String> getLimits() {
        return this.limits;
    }

    public GoogleCloudRunOpV2ResourceRequirementsResponse(
        Boolean cpuIdle,
        Map<String,String> limits) {
        this.cpuIdle = Objects.requireNonNull(cpuIdle, "expected parameter 'cpuIdle' to be non-null");
        this.limits = Objects.requireNonNull(limits, "expected parameter 'limits' to be non-null");
    }

    private GoogleCloudRunOpV2ResourceRequirementsResponse() {
        this.cpuIdle = null;
        this.limits = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2ResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean cpuIdle;
        private Map<String,String> limits;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2ResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuIdle = defaults.cpuIdle;
    	      this.limits = defaults.limits;
        }

        public Builder cpuIdle(Boolean cpuIdle) {
            this.cpuIdle = Objects.requireNonNull(cpuIdle);
            return this;
        }

        public Builder limits(Map<String,String> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public GoogleCloudRunOpV2ResourceRequirementsResponse build() {
            return new GoogleCloudRunOpV2ResourceRequirementsResponse(cpuIdle, limits);
        }
    }
}
