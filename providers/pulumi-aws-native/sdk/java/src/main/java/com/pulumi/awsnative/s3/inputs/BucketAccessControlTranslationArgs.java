// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object.
 * 
 */
public final class BucketAccessControlTranslationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketAccessControlTranslationArgs Empty = new BucketAccessControlTranslationArgs();

    @Import(name="owner", required=true)
    private Output<String> owner;

    public Output<String> owner() {
        return this.owner;
    }

    private BucketAccessControlTranslationArgs() {}

    private BucketAccessControlTranslationArgs(BucketAccessControlTranslationArgs $) {
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAccessControlTranslationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccessControlTranslationArgs $;

        public Builder() {
            $ = new BucketAccessControlTranslationArgs();
        }

        public Builder(BucketAccessControlTranslationArgs defaults) {
            $ = new BucketAccessControlTranslationArgs(Objects.requireNonNull(defaults));
        }

        public Builder owner(Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public BucketAccessControlTranslationArgs build() {
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            return $;
        }
    }

}
