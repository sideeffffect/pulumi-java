// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationConfigurationRuleDestinationMetrics {
    /**
     * Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
     */
    private final @Nullable Integer minutes;
    /**
     * The status of replication metrics. Either `Enabled` or `Disabled`.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor
    private BucketReplicationConfigurationRuleDestinationMetrics(
        @OutputCustomType.Parameter("minutes") @Nullable Integer minutes,
        @OutputCustomType.Parameter("status") @Nullable String status) {
        this.minutes = minutes;
        this.status = status;
    }

    /**
     * Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
    */
    public Optional<Integer> getMinutes() {
        return Optional.ofNullable(this.minutes);
    }
    /**
     * The status of replication metrics. Either `Enabled` or `Disabled`.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestinationMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minutes;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleDestinationMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
    	      this.status = defaults.status;
        }

        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public BucketReplicationConfigurationRuleDestinationMetrics build() {
            return new BucketReplicationConfigurationRuleDestinationMetrics(minutes, status);
        }
    }
}
