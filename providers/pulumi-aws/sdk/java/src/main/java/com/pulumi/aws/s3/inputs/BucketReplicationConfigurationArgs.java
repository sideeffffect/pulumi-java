// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BucketReplicationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationArgs Empty = new BucketReplicationConfigurationArgs();

    /**
     * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    /**
     * Specifies the rules managing the replication (documented below).
     * 
     */
    @Import(name="rules", required=true)
      private final Output<List<BucketReplicationConfigurationRuleArgs>> rules;

    public Output<List<BucketReplicationConfigurationRuleArgs>> rules() {
        return this.rules;
    }

    public BucketReplicationConfigurationArgs(
        Output<String> role,
        Output<List<BucketReplicationConfigurationRuleArgs>> rules) {
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketReplicationConfigurationArgs() {
        this.role = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> role;
        private Output<List<BucketReplicationConfigurationRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder rules(Output<List<BucketReplicationConfigurationRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(List<BucketReplicationConfigurationRuleArgs> rules) {
            this.rules = Output.of(Objects.requireNonNull(rules));
            return this;
        }
        public Builder rules(BucketReplicationConfigurationRuleArgs... rules) {
            return rules(List.of(rules));
        }        public BucketReplicationConfigurationArgs build() {
            return new BucketReplicationConfigurationArgs(role, rules);
        }
    }
}
