// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect.inputs;

import io.pulumi.aws.mskconnect.inputs.CustomPluginLocationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomPluginState extends io.pulumi.resources.ResourceArgs {

    public static final CustomPluginState Empty = new CustomPluginState();

    /**
     * the Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * A summary description of the custom plugin.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * an ID of the latest successfully created revision of the custom plugin.
     * 
     */
    @Import(name="latestRevision")
      private final @Nullable Output<Integer> latestRevision;

    public Output<Integer> latestRevision() {
        return this.latestRevision == null ? Codegen.empty() : this.latestRevision;
    }

    /**
     * Information about the location of a custom plugin. See below.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<CustomPluginLocationGetArgs> location;

    public Output<CustomPluginLocationGetArgs> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the custom plugin..
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * the state of the custom plugin.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public CustomPluginState(
        @Nullable Output<String> arn,
        @Nullable Output<String> contentType,
        @Nullable Output<String> description,
        @Nullable Output<Integer> latestRevision,
        @Nullable Output<CustomPluginLocationGetArgs> location,
        @Nullable Output<String> name,
        @Nullable Output<String> state) {
        this.arn = arn;
        this.contentType = contentType;
        this.description = description;
        this.latestRevision = latestRevision;
        this.location = location;
        this.name = name;
        this.state = state;
    }

    private CustomPluginState() {
        this.arn = Codegen.empty();
        this.contentType = Codegen.empty();
        this.description = Codegen.empty();
        this.latestRevision = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomPluginState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> latestRevision;
        private @Nullable Output<CustomPluginLocationGetArgs> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomPluginState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.latestRevision = defaults.latestRevision;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder latestRevision(@Nullable Output<Integer> latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }
        public Builder latestRevision(@Nullable Integer latestRevision) {
            this.latestRevision = Codegen.ofNullable(latestRevision);
            return this;
        }
        public Builder location(@Nullable Output<CustomPluginLocationGetArgs> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable CustomPluginLocationGetArgs location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public CustomPluginState build() {
            return new CustomPluginState(arn, contentType, description, latestRevision, location, name, state);
        }
    }
}
