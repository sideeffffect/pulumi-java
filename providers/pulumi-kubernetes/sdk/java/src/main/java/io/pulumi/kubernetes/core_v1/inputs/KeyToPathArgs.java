// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Maps a string key to a path within a volume.
 * 
 */
public final class KeyToPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyToPathArgs Empty = new KeyToPathArgs();

    /**
     * The key to project.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Optional: mode bits used to set permissions on this file. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<Integer> mode;

    public Input<Integer> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    public KeyToPathArgs(
        Input<String> key,
        @Nullable Input<Integer> mode,
        Input<String> path) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.mode = mode;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private KeyToPathArgs() {
        this.key = Input.empty();
        this.mode = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyToPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private @Nullable Input<Integer> mode;
        private Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyToPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder mode(@Nullable Input<Integer> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable Integer mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder path(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }
        public KeyToPathArgs build() {
            return new KeyToPathArgs(key, mode, path);
        }
    }
}
