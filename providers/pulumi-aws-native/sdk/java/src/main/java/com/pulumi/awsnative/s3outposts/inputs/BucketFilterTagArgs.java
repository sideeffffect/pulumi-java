// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Tag used to identify a subset of objects for an Amazon S3Outposts bucket.
 * 
 */
public final class BucketFilterTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketFilterTagArgs Empty = new BucketFilterTagArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private BucketFilterTagArgs() {}

    private BucketFilterTagArgs(BucketFilterTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketFilterTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketFilterTagArgs $;

        public Builder() {
            $ = new BucketFilterTagArgs();
        }

        public Builder(BucketFilterTagArgs defaults) {
            $ = new BucketFilterTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public BucketFilterTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
