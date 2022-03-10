// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigurationRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BucketReplicationConfiguration {
    /**
     * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    private final String role;
    /**
     * Specifies the rules managing the replication (documented below).
     * 
     */
    private final List<BucketReplicationConfigurationRule> rules;

    @OutputCustomType.Constructor
    private BucketReplicationConfiguration(
        @OutputCustomType.Parameter("role") String role,
        @OutputCustomType.Parameter("rules") List<BucketReplicationConfigurationRule> rules) {
        this.role = role;
        this.rules = rules;
    }

    /**
     * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * Specifies the rules managing the replication (documented below).
     * 
    */
    public List<BucketReplicationConfigurationRule> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String role;
        private List<BucketReplicationConfigurationRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder rules(List<BucketReplicationConfigurationRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public BucketReplicationConfiguration build() {
            return new BucketReplicationConfiguration(role, rules);
        }
    }
}
