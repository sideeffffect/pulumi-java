// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input location
 * 
 */
public final class RecipeS3LocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecipeS3LocationArgs Empty = new RecipeS3LocationArgs();

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private RecipeS3LocationArgs() {}

    private RecipeS3LocationArgs(RecipeS3LocationArgs $) {
        this.bucket = $.bucket;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecipeS3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecipeS3LocationArgs $;

        public Builder() {
            $ = new RecipeS3LocationArgs();
        }

        public Builder(RecipeS3LocationArgs defaults) {
            $ = new RecipeS3LocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public RecipeS3LocationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
