// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerBuildOptionsVolume {
    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    private final @Nullable String name;
    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the same
     * build step or with certain reserved volume paths.
     * 
     */
    private final @Nullable String path;

    @OutputCustomType.Constructor
    private TriggerBuildOptionsVolume(
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("path") @Nullable String path) {
        this.name = name;
        this.path = path;
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the same
     * build step or with certain reserved volume paths.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildOptionsVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildOptionsVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public TriggerBuildOptionsVolume build() {
            return new TriggerBuildOptionsVolume(name, path);
        }
    }
}
