// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleDestinationMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleDestinationMetricsArgs Empty = new BucketReplicationConfigurationRuleDestinationMetricsArgs();

    /**
     * Threshold within which objects are to be replicated. The only valid value is `15`.
     * 
     */
    @InputImport(name="minutes")
      private final @Nullable Input<Integer> minutes;

    public Input<Integer> getMinutes() {
        return this.minutes == null ? Input.empty() : this.minutes;
    }

    /**
     * The status of replication metrics. Either `Enabled` or `Disabled`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public BucketReplicationConfigurationRuleDestinationMetricsArgs(
        @Nullable Input<Integer> minutes,
        @Nullable Input<String> status) {
        this.minutes = minutes;
        this.status = status;
    }

    private BucketReplicationConfigurationRuleDestinationMetricsArgs() {
        this.minutes = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestinationMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minutes;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleDestinationMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
    	      this.status = defaults.status;
        }

        public Builder minutes(@Nullable Input<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = Input.ofNullable(minutes);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public BucketReplicationConfigurationRuleDestinationMetricsArgs build() {
            return new BucketReplicationConfigurationRuleDestinationMetricsArgs(minutes, status);
        }
    }
}
