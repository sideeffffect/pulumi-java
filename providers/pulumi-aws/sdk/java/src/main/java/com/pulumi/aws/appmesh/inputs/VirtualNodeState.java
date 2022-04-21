// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeState extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeState Empty = new VirtualNodeState();

    /**
     * The ARN of the virtual node.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The creation date of the virtual node.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * The last update date of the virtual node.
     * 
     */
    @Import(name="lastUpdatedDate")
    private @Nullable Output<String> lastUpdatedDate;

    public Optional<Output<String>> lastUpdatedDate() {
        return Optional.ofNullable(this.lastUpdatedDate);
    }

    /**
     * The name of the service mesh in which to create the virtual node. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="meshName")
    private @Nullable Output<String> meshName;

    public Optional<Output<String>> meshName() {
        return Optional.ofNullable(this.meshName);
    }

    /**
     * The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Import(name="meshOwner")
    private @Nullable Output<String> meshOwner;

    public Optional<Output<String>> meshOwner() {
        return Optional.ofNullable(this.meshOwner);
    }

    /**
     * The name to use for the virtual node. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource owner&#39;s AWS account ID.
     * 
     */
    @Import(name="resourceOwner")
    private @Nullable Output<String> resourceOwner;

    public Optional<Output<String>> resourceOwner() {
        return Optional.ofNullable(this.resourceOwner);
    }

    /**
     * The virtual node specification to apply.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<VirtualNodeSpecGetArgs> spec;

    public Optional<Output<VirtualNodeSpecGetArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private VirtualNodeState() {}

    private VirtualNodeState(VirtualNodeState $) {
        this.arn = $.arn;
        this.createdDate = $.createdDate;
        this.lastUpdatedDate = $.lastUpdatedDate;
        this.meshName = $.meshName;
        this.meshOwner = $.meshOwner;
        this.name = $.name;
        this.resourceOwner = $.resourceOwner;
        this.spec = $.spec;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeState $;

        public Builder() {
            $ = new VirtualNodeState();
        }

        public Builder(VirtualNodeState defaults) {
            $ = new VirtualNodeState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            $.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        public Builder lastUpdatedDate(String lastUpdatedDate) {
            return lastUpdatedDate(Output.of(lastUpdatedDate));
        }

        public Builder meshName(@Nullable Output<String> meshName) {
            $.meshName = meshName;
            return this;
        }

        public Builder meshName(String meshName) {
            return meshName(Output.of(meshName));
        }

        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            $.meshOwner = meshOwner;
            return this;
        }

        public Builder meshOwner(String meshOwner) {
            return meshOwner(Output.of(meshOwner));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceOwner(@Nullable Output<String> resourceOwner) {
            $.resourceOwner = resourceOwner;
            return this;
        }

        public Builder resourceOwner(String resourceOwner) {
            return resourceOwner(Output.of(resourceOwner));
        }

        public Builder spec(@Nullable Output<VirtualNodeSpecGetArgs> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(VirtualNodeSpecGetArgs spec) {
            return spec(Output.of(spec));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public VirtualNodeState build() {
            return $;
        }
    }

}
