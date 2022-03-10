// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs Empty = new BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs();

    /**
     * Whether the existing objects should be replicated. Either `"Enabled"` or `"Disabled"`.
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    public BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs(Input<String> status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs() {
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs build() {
            return new BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs(status);
        }
    }
}
