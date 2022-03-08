// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleDestinationMetricsEventThreshold;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketReplicationConfigRuleDestinationMetrics {
    /**
     * A configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event documented below.
     * 
     */
    private final @Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold;
    /**
     * The status of the Destination Metrics. Either `"Enabled"` or `"Disabled"`.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"eventThreshold","status"})
    private BucketReplicationConfigRuleDestinationMetrics(
        @Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold,
        String status) {
        this.eventThreshold = eventThreshold;
        this.status = status;
    }

    /**
     * A configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event documented below.
     * 
    */
    public Optional<BucketReplicationConfigRuleDestinationMetricsEventThreshold> getEventThreshold() {
        return Optional.ofNullable(this.eventThreshold);
    }
    /**
     * The status of the Destination Metrics. Either `"Enabled"` or `"Disabled"`.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventThreshold = defaults.eventThreshold;
    	      this.status = defaults.status;
        }

        public Builder setEventThreshold(@Nullable BucketReplicationConfigRuleDestinationMetricsEventThreshold eventThreshold) {
            this.eventThreshold = eventThreshold;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BucketReplicationConfigRuleDestinationMetrics build() {
            return new BucketReplicationConfigRuleDestinationMetrics(eventThreshold, status);
        }
    }
}
