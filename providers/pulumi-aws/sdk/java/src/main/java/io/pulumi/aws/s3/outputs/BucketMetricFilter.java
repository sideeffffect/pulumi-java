// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketMetricFilter {
    /**
     * Object prefix for filtering (singular).
     * 
     */
    private final @Nullable String prefix;
    /**
     * Object tags for filtering (up to 10).
     * 
     */
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private BucketMetricFilter(
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.prefix = prefix;
        this.tags = tags;
    }

    /**
     * Object prefix for filtering (singular).
     * 
    */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * Object tags for filtering (up to 10).
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketMetricFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String prefix;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketMetricFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public BucketMetricFilter build() {
            return new BucketMetricFilter(prefix, tags);
        }
    }
}
