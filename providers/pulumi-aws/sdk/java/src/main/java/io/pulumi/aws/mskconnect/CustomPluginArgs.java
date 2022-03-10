// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect;

import io.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomPluginArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomPluginArgs Empty = new CustomPluginArgs();

    /**
     * The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    @InputImport(name="contentType", required=true)
      private final Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType;
    }

    /**
     * A summary description of the custom plugin.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Information about the location of a custom plugin. See below.
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<CustomPluginLocationArgs> location;

    public Input<CustomPluginLocationArgs> getLocation() {
        return this.location;
    }

    /**
     * The name of the custom plugin..
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public CustomPluginArgs(
        Input<String> contentType,
        @Nullable Input<String> description,
        Input<CustomPluginLocationArgs> location,
        @Nullable Input<String> name) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.description = description;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
    }

    private CustomPluginArgs() {
        this.contentType = Input.empty();
        this.description = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentType;
        private @Nullable Input<String> description;
        private Input<CustomPluginLocationArgs> location;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomPluginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        public Builder contentType(Input<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder location(Input<CustomPluginLocationArgs> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder location(CustomPluginLocationArgs location) {
            this.location = Input.of(Objects.requireNonNull(location));
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
        public CustomPluginArgs build() {
            return new CustomPluginArgs(contentType, description, location, name);
        }
    }
}
