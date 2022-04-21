// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.iot.inputs.ThingTypePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThingTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThingTypeArgs Empty = new ThingTypeArgs();

    /**
     * Whether the thing type is deprecated. If true, no new things could be associated with this type.
     * 
     */
    @Import(name="deprecated")
    private @Nullable Output<Boolean> deprecated;

    public Optional<Output<Boolean>> deprecated() {
        return Optional.ofNullable(this.deprecated);
    }

    /**
     * The name of the thing type.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * , Configuration block that can contain the following properties of the thing type:
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ThingTypePropertiesArgs> properties;

    public Optional<Output<ThingTypePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ThingTypeArgs() {}

    private ThingTypeArgs(ThingTypeArgs $) {
        this.deprecated = $.deprecated;
        this.name = $.name;
        this.properties = $.properties;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThingTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThingTypeArgs $;

        public Builder() {
            $ = new ThingTypeArgs();
        }

        public Builder(ThingTypeArgs defaults) {
            $ = new ThingTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder deprecated(@Nullable Output<Boolean> deprecated) {
            $.deprecated = deprecated;
            return this;
        }

        public Builder deprecated(Boolean deprecated) {
            return deprecated(Output.of(deprecated));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder properties(@Nullable Output<ThingTypePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(ThingTypePropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ThingTypeArgs build() {
            return $;
        }
    }

}
