// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift;

import com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BuildArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildArgs Empty = new BuildArgs();

    /**
     * Name of the build
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Operating system that the game server binaries are built to run onE.g., `WINDOWS_2012`, `AMAZON_LINUX` or `AMAZON_LINUX_2`.
     * 
     */
    @Import(name="operatingSystem", required=true)
    private Output<String> operatingSystem;

    public Output<String> operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Information indicating where your game build files are stored. See below.
     * 
     */
    @Import(name="storageLocation", required=true)
    private Output<BuildStorageLocationArgs> storageLocation;

    public Output<BuildStorageLocationArgs> storageLocation() {
        return this.storageLocation;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Version that is associated with this build.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private BuildArgs() {}

    private BuildArgs(BuildArgs $) {
        this.name = $.name;
        this.operatingSystem = $.operatingSystem;
        this.storageLocation = $.storageLocation;
        this.tags = $.tags;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildArgs $;

        public Builder() {
            $ = new BuildArgs();
        }

        public Builder(BuildArgs defaults) {
            $ = new BuildArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder operatingSystem(Output<String> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        public Builder operatingSystem(String operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        public Builder storageLocation(Output<BuildStorageLocationArgs> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        public Builder storageLocation(BuildStorageLocationArgs storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public BuildArgs build() {
            $.operatingSystem = Objects.requireNonNull($.operatingSystem, "expected parameter 'operatingSystem' to be non-null");
            $.storageLocation = Objects.requireNonNull($.storageLocation, "expected parameter 'storageLocation' to be non-null");
            return $;
        }
    }

}
