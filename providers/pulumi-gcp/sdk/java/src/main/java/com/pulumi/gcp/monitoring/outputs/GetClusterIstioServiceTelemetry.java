// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterIstioServiceTelemetry {
    private final String resourceName;

    @CustomType.Constructor
    private GetClusterIstioServiceTelemetry(@CustomType.Parameter("resourceName") String resourceName) {
        this.resourceName = resourceName;
    }

    public String resourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterIstioServiceTelemetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterIstioServiceTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public GetClusterIstioServiceTelemetry build() {
            return new GetClusterIstioServiceTelemetry(resourceName);
        }
    }
}
