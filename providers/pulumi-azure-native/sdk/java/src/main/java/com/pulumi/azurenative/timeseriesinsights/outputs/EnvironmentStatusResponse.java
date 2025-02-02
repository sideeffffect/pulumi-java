// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.outputs;

import com.pulumi.azurenative.timeseriesinsights.outputs.IngressEnvironmentStatusResponse;
import com.pulumi.azurenative.timeseriesinsights.outputs.WarmStorageEnvironmentStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class EnvironmentStatusResponse {
    /**
     * @return An object that represents the status of ingress on an environment.
     * 
     */
    private final IngressEnvironmentStatusResponse ingress;
    /**
     * @return An object that represents the status of warm storage on an environment.
     * 
     */
    private final WarmStorageEnvironmentStatusResponse warmStorage;

    @CustomType.Constructor
    private EnvironmentStatusResponse(
        @CustomType.Parameter("ingress") IngressEnvironmentStatusResponse ingress,
        @CustomType.Parameter("warmStorage") WarmStorageEnvironmentStatusResponse warmStorage) {
        this.ingress = ingress;
        this.warmStorage = warmStorage;
    }

    /**
     * @return An object that represents the status of ingress on an environment.
     * 
     */
    public IngressEnvironmentStatusResponse ingress() {
        return this.ingress;
    }
    /**
     * @return An object that represents the status of warm storage on an environment.
     * 
     */
    public WarmStorageEnvironmentStatusResponse warmStorage() {
        return this.warmStorage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressEnvironmentStatusResponse ingress;
        private WarmStorageEnvironmentStatusResponse warmStorage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingress = defaults.ingress;
    	      this.warmStorage = defaults.warmStorage;
        }

        public Builder ingress(IngressEnvironmentStatusResponse ingress) {
            this.ingress = Objects.requireNonNull(ingress);
            return this;
        }
        public Builder warmStorage(WarmStorageEnvironmentStatusResponse warmStorage) {
            this.warmStorage = Objects.requireNonNull(warmStorage);
            return this;
        }        public EnvironmentStatusResponse build() {
            return new EnvironmentStatusResponse(ingress, warmStorage);
        }
    }
}
