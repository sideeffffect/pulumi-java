// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotInstanceRequestLaunchTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestLaunchTemplateGetArgs Empty = new SpotInstanceRequestLaunchTemplateGetArgs();

    /**
     * The ID of the launch template. Conflicts with `name`.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the launch template. Conflicts with `id`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Template version. Can be a specific version number, `$Latest` or `$Default`. The default value is `$Default`.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public SpotInstanceRequestLaunchTemplateGetArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<String> version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    private SpotInstanceRequestLaunchTemplateGetArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestLaunchTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestLaunchTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public SpotInstanceRequestLaunchTemplateGetArgs build() {
            return new SpotInstanceRequestLaunchTemplateGetArgs(id, name, version);
        }
    }
}
