// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigWorkloadsConfigWebServer {
    private final Double cpu;
    private final Double memoryGb;
    private final Double storageGb;

    @CustomType.Constructor
    private GetEnvironmentConfigWorkloadsConfigWebServer(
        @CustomType.Parameter("cpu") Double cpu,
        @CustomType.Parameter("memoryGb") Double memoryGb,
        @CustomType.Parameter("storageGb") Double storageGb) {
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    public Double cpu() {
        return this.cpu;
    }
    public Double memoryGb() {
        return this.memoryGb;
    }
    public Double storageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfigWebServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfigWebServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder memoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }
        public Builder storageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }        public GetEnvironmentConfigWorkloadsConfigWebServer build() {
            return new GetEnvironmentConfigWorkloadsConfigWebServer(cpu, memoryGb, storageGb);
        }
    }
}
