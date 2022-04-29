// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Output location
 * 
 */
public final class JobOutputLocationArgs extends ResourceArgs {

    public static final JobOutputLocationArgs Empty = new JobOutputLocationArgs();

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="bucketOwner")
    private @Nullable Output<String> bucketOwner;

    public Optional<Output<String>> bucketOwner() {
        return Optional.ofNullable(this.bucketOwner);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private JobOutputLocationArgs() {}

    private JobOutputLocationArgs(JobOutputLocationArgs $) {
        this.bucket = $.bucket;
        this.bucketOwner = $.bucketOwner;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobOutputLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobOutputLocationArgs $;

        public Builder() {
            $ = new JobOutputLocationArgs();
        }

        public Builder(JobOutputLocationArgs defaults) {
            $ = new JobOutputLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder bucketOwner(@Nullable Output<String> bucketOwner) {
            $.bucketOwner = bucketOwner;
            return this;
        }

        public Builder bucketOwner(String bucketOwner) {
            return bucketOwner(Output.of(bucketOwner));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public JobOutputLocationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
