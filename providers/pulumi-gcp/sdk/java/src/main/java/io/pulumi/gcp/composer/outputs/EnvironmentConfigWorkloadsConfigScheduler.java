// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentConfigWorkloadsConfigScheduler {
    private final @Nullable Integer count;
    private final @Nullable Double cpu;
    private final @Nullable Double memoryGb;
    private final @Nullable Double storageGb;

    @CustomType.Constructor
    private EnvironmentConfigWorkloadsConfigScheduler(
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("cpu") @Nullable Double cpu,
        @CustomType.Parameter("memoryGb") @Nullable Double memoryGb,
        @CustomType.Parameter("storageGb") @Nullable Double storageGb) {
        this.count = count;
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    public Optional<Double> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    public Optional<Double> memoryGb() {
        return Optional.ofNullable(this.memoryGb);
    }
    public Optional<Double> storageGb() {
        return Optional.ofNullable(this.storageGb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWorkloadsConfigScheduler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable Double cpu;
        private @Nullable Double memoryGb;
        private @Nullable Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWorkloadsConfigScheduler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }
        public Builder storageGb(@Nullable Double storageGb) {
            this.storageGb = storageGb;
            return this;
        }        public EnvironmentConfigWorkloadsConfigScheduler build() {
            return new EnvironmentConfigWorkloadsConfigScheduler(count, cpu, memoryGb, storageGb);
        }
    }
}
