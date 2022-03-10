// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the volume mount.
 * 
 */
public final class VolumeMountArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeMountArgs Empty = new VolumeMountArgs();

    /**
     * The path within the container where the volume should be mounted. Must not contain colon (:).
     * 
     */
    @InputImport(name="mountPath", required=true)
      private final Input<String> mountPath;

    public Input<String> getMountPath() {
        return this.mountPath;
    }

    /**
     * The name of the volume mount.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The flag indicating whether the volume mount is read-only.
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    public VolumeMountArgs(
        Input<String> mountPath,
        Input<String> name,
        @Nullable Input<Boolean> readOnly) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = readOnly;
    }

    private VolumeMountArgs() {
        this.mountPath = Input.empty();
        this.name = Input.empty();
        this.readOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> mountPath;
        private Input<String> name;
        private @Nullable Input<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder mountPath(Input<String> mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder mountPath(String mountPath) {
            this.mountPath = Input.of(Objects.requireNonNull(mountPath));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder readOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }
        public VolumeMountArgs build() {
            return new VolumeMountArgs(mountPath, name, readOnly);
        }
    }
}
