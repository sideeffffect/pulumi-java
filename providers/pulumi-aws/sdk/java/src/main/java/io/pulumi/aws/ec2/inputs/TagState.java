// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagState extends io.pulumi.resources.ResourceArgs {

    public static final TagState Empty = new TagState();

    /**
     * The tag name.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * The ID of the EC2 resource to manage the tag for.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    /**
     * The value of the tag.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public TagState(
        @Nullable Output<String> key,
        @Nullable Output<String> resourceId,
        @Nullable Output<String> value) {
        this.key = key;
        this.resourceId = resourceId;
        this.value = value;
    }

    private TagState() {
        this.key = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<String> resourceId;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TagState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.resourceId = defaults.resourceId;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public TagState build() {
            return new TagState(key, resourceId, value);
        }
    }
}
