// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.aws.efs.inputs.AccessPointRootDirectoryCreationInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointRootDirectoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointRootDirectoryArgs Empty = new AccessPointRootDirectoryArgs();

    /**
     * POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
     * 
     */
    @InputImport(name="creationInfo")
      private final @Nullable Input<AccessPointRootDirectoryCreationInfoArgs> creationInfo;

    public Input<AccessPointRootDirectoryCreationInfoArgs> getCreationInfo() {
        return this.creationInfo == null ? Input.empty() : this.creationInfo;
    }

    /**
     * Path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creation_info`.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public AccessPointRootDirectoryArgs(
        @Nullable Input<AccessPointRootDirectoryCreationInfoArgs> creationInfo,
        @Nullable Input<String> path) {
        this.creationInfo = creationInfo;
        this.path = path;
    }

    private AccessPointRootDirectoryArgs() {
        this.creationInfo = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointRootDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AccessPointRootDirectoryCreationInfoArgs> creationInfo;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointRootDirectoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationInfo = defaults.creationInfo;
    	      this.path = defaults.path;
        }

        public Builder creationInfo(@Nullable Input<AccessPointRootDirectoryCreationInfoArgs> creationInfo) {
            this.creationInfo = creationInfo;
            return this;
        }

        public Builder creationInfo(@Nullable AccessPointRootDirectoryCreationInfoArgs creationInfo) {
            this.creationInfo = Input.ofNullable(creationInfo);
            return this;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }
        public AccessPointRootDirectoryArgs build() {
            return new AccessPointRootDirectoryArgs(creationInfo, path);
        }
    }
}
