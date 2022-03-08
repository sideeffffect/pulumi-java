// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketCorsRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BucketCorsConfiguration {
    private final List<BucketCorsRule> corsRules;

    @OutputCustomType.Constructor({"corsRules"})
    private BucketCorsConfiguration(List<BucketCorsRule> corsRules) {
        this.corsRules = corsRules;
    }

    public List<BucketCorsRule> getCorsRules() {
        return this.corsRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketCorsRule> corsRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsRules = defaults.corsRules;
        }

        public Builder setCorsRules(List<BucketCorsRule> corsRules) {
            this.corsRules = Objects.requireNonNull(corsRules);
            return this;
        }
        public BucketCorsConfiguration build() {
            return new BucketCorsConfiguration(corsRules);
        }
    }
}
