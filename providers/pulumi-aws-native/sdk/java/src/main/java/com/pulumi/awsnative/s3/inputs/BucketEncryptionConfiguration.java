// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies encryption-related information for an Amazon S3 bucket that is a destination for replicated objects.
 * 
 */
public final class BucketEncryptionConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final BucketEncryptionConfiguration Empty = new BucketEncryptionConfiguration();

    /**
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed customer master key (CMK) stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    @Import(name="replicaKmsKeyID", required=true)
      private final String replicaKmsKeyID;

    public String replicaKmsKeyID() {
        return this.replicaKmsKeyID;
    }

    public BucketEncryptionConfiguration(String replicaKmsKeyID) {
        this.replicaKmsKeyID = Objects.requireNonNull(replicaKmsKeyID, "expected parameter 'replicaKmsKeyID' to be non-null");
    }

    private BucketEncryptionConfiguration() {
        this.replicaKmsKeyID = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String replicaKmsKeyID;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaKmsKeyID = defaults.replicaKmsKeyID;
        }

        public Builder replicaKmsKeyID(String replicaKmsKeyID) {
            this.replicaKmsKeyID = Objects.requireNonNull(replicaKmsKeyID);
            return this;
        }        public BucketEncryptionConfiguration build() {
            return new BucketEncryptionConfiguration(replicaKmsKeyID);
        }
    }
}
