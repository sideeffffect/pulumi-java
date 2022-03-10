// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class BucketServerSideEncryptionConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketServerSideEncryptionConfigurationGetArgs Empty = new BucketServerSideEncryptionConfigurationGetArgs();

    /**
     * A single object for server-side encryption by default configuration. (documented below)
     * 
     */
    @InputImport(name="rule", required=true)
      private final Input<BucketServerSideEncryptionConfigurationRuleGetArgs> rule;

    public Input<BucketServerSideEncryptionConfigurationRuleGetArgs> getRule() {
        return this.rule;
    }

    public BucketServerSideEncryptionConfigurationGetArgs(Input<BucketServerSideEncryptionConfigurationRuleGetArgs> rule) {
        this.rule = Objects.requireNonNull(rule, "expected parameter 'rule' to be non-null");
    }

    private BucketServerSideEncryptionConfigurationGetArgs() {
        this.rule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketServerSideEncryptionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketServerSideEncryptionConfigurationRuleGetArgs> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketServerSideEncryptionConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        public Builder rule(Input<BucketServerSideEncryptionConfigurationRuleGetArgs> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder rule(BucketServerSideEncryptionConfigurationRuleGetArgs rule) {
            this.rule = Input.of(Objects.requireNonNull(rule));
            return this;
        }
        public BucketServerSideEncryptionConfigurationGetArgs build() {
            return new BucketServerSideEncryptionConfigurationGetArgs(rule);
        }
    }
}
