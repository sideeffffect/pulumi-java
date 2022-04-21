// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketMetricFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketMetricFilterArgs Empty = new BucketMetricFilterArgs();

    /**
     * Object prefix for filtering (singular).
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Object tags for filtering (up to 10).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BucketMetricFilterArgs() {}

    private BucketMetricFilterArgs(BucketMetricFilterArgs $) {
        this.prefix = $.prefix;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketMetricFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketMetricFilterArgs $;

        public Builder() {
            $ = new BucketMetricFilterArgs();
        }

        public Builder(BucketMetricFilterArgs defaults) {
            $ = new BucketMetricFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public BucketMetricFilterArgs build() {
            return $;
        }
    }

}
