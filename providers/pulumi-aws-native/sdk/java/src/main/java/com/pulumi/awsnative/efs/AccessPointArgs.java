// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.efs;

import com.pulumi.awsnative.efs.inputs.AccessPointPosixUserArgs;
import com.pulumi.awsnative.efs.inputs.AccessPointRootDirectoryArgs;
import com.pulumi.awsnative.efs.inputs.AccessPointTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    @Import(name="accessPointTags")
      private final @Nullable Output<List<AccessPointTagArgs>> accessPointTags;

    public Output<List<AccessPointTagArgs>> accessPointTags() {
        return this.accessPointTags == null ? Codegen.empty() : this.accessPointTags;
    }

    /**
     * (optional) A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * 
     */
    @Import(name="clientToken")
      private final @Nullable Output<String> clientToken;

    public Output<String> clientToken() {
        return this.clientToken == null ? Codegen.empty() : this.clientToken;
    }

    /**
     * The ID of the EFS file system that the access point provides access to.
     * 
     */
    @Import(name="fileSystemId", required=true)
      private final Output<String> fileSystemId;

    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The operating system user and group applied to all file system requests made using the access point.
     * 
     */
    @Import(name="posixUser")
      private final @Nullable Output<AccessPointPosixUserArgs> posixUser;

    public Output<AccessPointPosixUserArgs> posixUser() {
        return this.posixUser == null ? Codegen.empty() : this.posixUser;
    }

    /**
     * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory>Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
     * 
     */
    @Import(name="rootDirectory")
      private final @Nullable Output<AccessPointRootDirectoryArgs> rootDirectory;

    public Output<AccessPointRootDirectoryArgs> rootDirectory() {
        return this.rootDirectory == null ? Codegen.empty() : this.rootDirectory;
    }

    public AccessPointArgs(
        @Nullable Output<List<AccessPointTagArgs>> accessPointTags,
        @Nullable Output<String> clientToken,
        Output<String> fileSystemId,
        @Nullable Output<AccessPointPosixUserArgs> posixUser,
        @Nullable Output<AccessPointRootDirectoryArgs> rootDirectory) {
        this.accessPointTags = accessPointTags;
        this.clientToken = clientToken;
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.posixUser = posixUser;
        this.rootDirectory = rootDirectory;
    }

    private AccessPointArgs() {
        this.accessPointTags = Codegen.empty();
        this.clientToken = Codegen.empty();
        this.fileSystemId = Codegen.empty();
        this.posixUser = Codegen.empty();
        this.rootDirectory = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AccessPointTagArgs>> accessPointTags;
        private @Nullable Output<String> clientToken;
        private Output<String> fileSystemId;
        private @Nullable Output<AccessPointPosixUserArgs> posixUser;
        private @Nullable Output<AccessPointRootDirectoryArgs> rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointTags = defaults.accessPointTags;
    	      this.clientToken = defaults.clientToken;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.posixUser = defaults.posixUser;
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder accessPointTags(@Nullable Output<List<AccessPointTagArgs>> accessPointTags) {
            this.accessPointTags = accessPointTags;
            return this;
        }
        public Builder accessPointTags(@Nullable List<AccessPointTagArgs> accessPointTags) {
            this.accessPointTags = Codegen.ofNullable(accessPointTags);
            return this;
        }
        public Builder accessPointTags(AccessPointTagArgs... accessPointTags) {
            return accessPointTags(List.of(accessPointTags));
        }
        public Builder clientToken(@Nullable Output<String> clientToken) {
            this.clientToken = clientToken;
            return this;
        }
        public Builder clientToken(@Nullable String clientToken) {
            this.clientToken = Codegen.ofNullable(clientToken);
            return this;
        }
        public Builder fileSystemId(Output<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Output.of(Objects.requireNonNull(fileSystemId));
            return this;
        }
        public Builder posixUser(@Nullable Output<AccessPointPosixUserArgs> posixUser) {
            this.posixUser = posixUser;
            return this;
        }
        public Builder posixUser(@Nullable AccessPointPosixUserArgs posixUser) {
            this.posixUser = Codegen.ofNullable(posixUser);
            return this;
        }
        public Builder rootDirectory(@Nullable Output<AccessPointRootDirectoryArgs> rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }
        public Builder rootDirectory(@Nullable AccessPointRootDirectoryArgs rootDirectory) {
            this.rootDirectory = Codegen.ofNullable(rootDirectory);
            return this;
        }        public AccessPointArgs build() {
            return new AccessPointArgs(accessPointTags, clientToken, fileSystemId, posixUser, rootDirectory);
        }
    }
}
