// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.efs.inputs.AccessPointPosixUserArgs;
import io.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    /**
     * ID of the file system for which the access point is intended.
     * 
     */
    @InputImport(name="fileSystemId", required=true)
      private final Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Operating system user and group applied to all file system requests made using the access point. Detailed below.
     * 
     */
    @InputImport(name="posixUser")
      private final @Nullable Input<AccessPointPosixUserArgs> posixUser;

    public Input<AccessPointPosixUserArgs> getPosixUser() {
        return this.posixUser == null ? Input.empty() : this.posixUser;
    }

    /**
     * Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     * 
     */
    @InputImport(name="rootDirectory")
      private final @Nullable Input<AccessPointRootDirectoryArgs> rootDirectory;

    public Input<AccessPointRootDirectoryArgs> getRootDirectory() {
        return this.rootDirectory == null ? Input.empty() : this.rootDirectory;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AccessPointArgs(
        Input<String> fileSystemId,
        @Nullable Input<AccessPointPosixUserArgs> posixUser,
        @Nullable Input<AccessPointRootDirectoryArgs> rootDirectory,
        @Nullable Input<Map<String,String>> tags) {
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.posixUser = posixUser;
        this.rootDirectory = rootDirectory;
        this.tags = tags;
    }

    private AccessPointArgs() {
        this.fileSystemId = Input.empty();
        this.posixUser = Input.empty();
        this.rootDirectory = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fileSystemId;
        private @Nullable Input<AccessPointPosixUserArgs> posixUser;
        private @Nullable Input<AccessPointRootDirectoryArgs> rootDirectory;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.posixUser = defaults.posixUser;
    	      this.rootDirectory = defaults.rootDirectory;
    	      this.tags = defaults.tags;
        }

        public Builder fileSystemId(Input<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Input.of(Objects.requireNonNull(fileSystemId));
            return this;
        }

        public Builder posixUser(@Nullable Input<AccessPointPosixUserArgs> posixUser) {
            this.posixUser = posixUser;
            return this;
        }

        public Builder posixUser(@Nullable AccessPointPosixUserArgs posixUser) {
            this.posixUser = Input.ofNullable(posixUser);
            return this;
        }

        public Builder rootDirectory(@Nullable Input<AccessPointRootDirectoryArgs> rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }

        public Builder rootDirectory(@Nullable AccessPointRootDirectoryArgs rootDirectory) {
            this.rootDirectory = Input.ofNullable(rootDirectory);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AccessPointArgs build() {
            return new AccessPointArgs(fileSystemId, posixUser, rootDirectory, tags);
        }
    }
}
