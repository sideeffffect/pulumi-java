// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketFilterRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * A container for object key name prefix and suffix filtering rules.
 * 
 */
public final class BucketS3KeyFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketS3KeyFilterArgs Empty = new BucketS3KeyFilterArgs();

    @InputImport(name="rules", required=true)
      private final Input<List<BucketFilterRuleArgs>> rules;

    public Input<List<BucketFilterRuleArgs>> getRules() {
        return this.rules;
    }

    public BucketS3KeyFilterArgs(Input<List<BucketFilterRuleArgs>> rules) {
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketS3KeyFilterArgs() {
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketS3KeyFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<BucketFilterRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketS3KeyFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(Input<List<BucketFilterRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder rules(List<BucketFilterRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }
        public BucketS3KeyFilterArgs build() {
            return new BucketS3KeyFilterArgs(rules);
        }
    }
}
