// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune.inputs;

import com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterParameterGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterParameterGroupState Empty = new ClusterParameterGroupState();

    /**
     * The ARN of the neptune cluster parameter group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The description of the neptune cluster parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The family of the neptune cluster parameter group.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The name of the neptune parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * A list of neptune parameters to apply.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<ClusterParameterGroupParameterGetArgs>> parameters;

    public Optional<Output<List<ClusterParameterGroupParameterGetArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
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

    private ClusterParameterGroupState() {}

    private ClusterParameterGroupState(ClusterParameterGroupState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.family = $.family;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.parameters = $.parameters;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterParameterGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterParameterGroupState $;

        public Builder() {
            $ = new ClusterParameterGroupState();
        }

        public Builder(ClusterParameterGroupState defaults) {
            $ = new ClusterParameterGroupState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        public Builder family(String family) {
            return family(Output.of(family));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder parameters(@Nullable Output<List<ClusterParameterGroupParameterGetArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<ClusterParameterGroupParameterGetArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(ClusterParameterGroupParameterGetArgs... parameters) {
            return parameters(List.of(parameters));
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

        public ClusterParameterGroupState build() {
            return $;
        }
    }

}
