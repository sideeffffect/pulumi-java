// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A POSIX filesystem resource.
 * 
 */
public final class PosixFilesystemArgs extends io.pulumi.resources.ResourceArgs {

    public static final PosixFilesystemArgs Empty = new PosixFilesystemArgs();

    /**
     * Root directory path to the filesystem.
     * 
     */
    @InputImport(name="rootDirectory")
      private final @Nullable Input<String> rootDirectory;

    public Input<String> getRootDirectory() {
        return this.rootDirectory == null ? Input.empty() : this.rootDirectory;
    }

    public PosixFilesystemArgs(@Nullable Input<String> rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    private PosixFilesystemArgs() {
        this.rootDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PosixFilesystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(PosixFilesystemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder rootDirectory(@Nullable Input<String> rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }

        public Builder rootDirectory(@Nullable String rootDirectory) {
            this.rootDirectory = Input.ofNullable(rootDirectory);
            return this;
        }
        public PosixFilesystemArgs build() {
            return new PosixFilesystemArgs(rootDirectory);
        }
    }
}
