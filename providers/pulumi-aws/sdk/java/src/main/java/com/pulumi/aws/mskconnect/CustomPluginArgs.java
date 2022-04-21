// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect;

import com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomPluginArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomPluginArgs Empty = new CustomPluginArgs();

    /**
     * The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * A summary description of the custom plugin.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Information about the location of a custom plugin. See below.
     * 
     */
    @Import(name="location", required=true)
    private Output<CustomPluginLocationArgs> location;

    public Output<CustomPluginLocationArgs> location() {
        return this.location;
    }

    /**
     * The name of the custom plugin..
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private CustomPluginArgs() {}

    private CustomPluginArgs(CustomPluginArgs $) {
        this.contentType = $.contentType;
        this.description = $.description;
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomPluginArgs $;

        public Builder() {
            $ = new CustomPluginArgs();
        }

        public Builder(CustomPluginArgs defaults) {
            $ = new CustomPluginArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder location(Output<CustomPluginLocationArgs> location) {
            $.location = location;
            return this;
        }

        public Builder location(CustomPluginLocationArgs location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CustomPluginArgs build() {
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
