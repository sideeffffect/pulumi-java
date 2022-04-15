// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleFilterAndGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleFilterAndGetArgs Empty = new BucketReplicationConfigRuleFilterAndGetArgs();

    /**
     * An object key name prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    /**
     * A map of tags (key and value pairs) that identifies a subset of objects to which the rule applies. The rule applies only to objects having all the tags in its tagset.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public BucketReplicationConfigRuleFilterAndGetArgs(
        @Nullable Output<String> prefix,
        @Nullable Output<Map<String,String>> tags) {
        this.prefix = prefix;
        this.tags = tags;
    }

    private BucketReplicationConfigRuleFilterAndGetArgs() {
        this.prefix = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleFilterAndGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> prefix;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleFilterAndGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public BucketReplicationConfigRuleFilterAndGetArgs build() {
            return new BucketReplicationConfigRuleFilterAndGetArgs(prefix, tags);
        }
    }
}
