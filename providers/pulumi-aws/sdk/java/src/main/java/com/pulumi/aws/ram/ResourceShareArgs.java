// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ram;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceShareArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceShareArgs Empty = new ResourceShareArgs();

    /**
     * Indicates whether principals outside your organization can be associated with a resource share.
     * 
     */
    @Import(name="allowExternalPrincipals")
    private @Nullable Output<Boolean> allowExternalPrincipals;

    public Optional<Output<Boolean>> allowExternalPrincipals() {
        return Optional.ofNullable(this.allowExternalPrincipals);
    }

    /**
     * The name of the resource share.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the resource share. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ResourceShareArgs() {}

    private ResourceShareArgs(ResourceShareArgs $) {
        this.allowExternalPrincipals = $.allowExternalPrincipals;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceShareArgs $;

        public Builder() {
            $ = new ResourceShareArgs();
        }

        public Builder(ResourceShareArgs defaults) {
            $ = new ResourceShareArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowExternalPrincipals(@Nullable Output<Boolean> allowExternalPrincipals) {
            $.allowExternalPrincipals = allowExternalPrincipals;
            return this;
        }

        public Builder allowExternalPrincipals(Boolean allowExternalPrincipals) {
            return allowExternalPrincipals(Output.of(allowExternalPrincipals));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ResourceShareArgs build() {
            return $;
        }
    }

}
