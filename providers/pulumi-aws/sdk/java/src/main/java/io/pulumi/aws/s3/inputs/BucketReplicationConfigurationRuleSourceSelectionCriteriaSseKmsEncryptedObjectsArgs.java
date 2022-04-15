// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs Empty = new BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs();

    /**
     * Boolean which indicates if this criteria is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    public BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs(Output<Boolean> enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }        public BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs build() {
            return new BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs(enabled);
        }
    }
}
