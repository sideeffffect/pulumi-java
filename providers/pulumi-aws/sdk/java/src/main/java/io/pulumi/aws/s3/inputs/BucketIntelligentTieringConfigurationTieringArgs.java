// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BucketIntelligentTieringConfigurationTieringArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationTieringArgs Empty = new BucketIntelligentTieringConfigurationTieringArgs();

    /**
     * S3 Intelligent-Tiering access tier. Valid values: `ARCHIVE_CONFIGURATION`, `DEEP_ARCHIVE_CONFIGURATION`.
     * 
     */
    @Import(name="accessTier", required=true)
      private final Output<String> accessTier;

    public Output<String> accessTier() {
        return this.accessTier;
    }

    /**
     * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier.
     * 
     */
    @Import(name="days", required=true)
      private final Output<Integer> days;

    public Output<Integer> days() {
        return this.days;
    }

    public BucketIntelligentTieringConfigurationTieringArgs(
        Output<String> accessTier,
        Output<Integer> days) {
        this.accessTier = Objects.requireNonNull(accessTier, "expected parameter 'accessTier' to be non-null");
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
    }

    private BucketIntelligentTieringConfigurationTieringArgs() {
        this.accessTier = Codegen.empty();
        this.days = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationTieringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accessTier;
        private Output<Integer> days;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationTieringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.days = defaults.days;
        }

        public Builder accessTier(Output<String> accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }
        public Builder accessTier(String accessTier) {
            this.accessTier = Output.of(Objects.requireNonNull(accessTier));
            return this;
        }
        public Builder days(Output<Integer> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(Integer days) {
            this.days = Output.of(Objects.requireNonNull(days));
            return this;
        }        public BucketIntelligentTieringConfigurationTieringArgs build() {
            return new BucketIntelligentTieringConfigurationTieringArgs(accessTier, days);
        }
    }
}
