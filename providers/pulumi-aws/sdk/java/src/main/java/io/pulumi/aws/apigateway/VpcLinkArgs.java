// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcLinkArgs Empty = new VpcLinkArgs();

    /**
     * The description of the VPC link.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name used to label and identify the VPC link.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    @InputImport(name="targetArn", required=true)
      private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public VpcLinkArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        Input<String> targetArn) {
        this.description = description;
        this.name = name;
        this.tags = tags;
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private VpcLinkArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder targetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }
        public VpcLinkArgs build() {
            return new VpcLinkArgs(description, name, tags, targetArn);
        }
    }
}
