// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object.
 * 
 */
public final class BucketAccessControlTranslationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketAccessControlTranslationArgs Empty = new BucketAccessControlTranslationArgs();

    @InputImport(name="owner", required=true)
      private final Input<String> owner;

    public Input<String> getOwner() {
        return this.owner;
    }

    public BucketAccessControlTranslationArgs(Input<String> owner) {
        this.owner = Objects.requireNonNull(owner, "expected parameter 'owner' to be non-null");
    }

    private BucketAccessControlTranslationArgs() {
        this.owner = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlTranslationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> owner;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlTranslationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
        }

        public Builder owner(Input<String> owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder owner(String owner) {
            this.owner = Input.of(Objects.requireNonNull(owner));
            return this;
        }
        public BucketAccessControlTranslationArgs build() {
            return new BucketAccessControlTranslationArgs(owner);
        }
    }
}
