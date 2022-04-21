// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs;

import com.pulumi.aws.efs.inputs.AccessPointPosixUserArgs;
import com.pulumi.aws.efs.inputs.AccessPointRootDirectoryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    /**
     * ID of the file system for which the access point is intended.
     * 
     */
    @Import(name="fileSystemId", required=true)
    private Output<String> fileSystemId;

    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Operating system user and group applied to all file system requests made using the access point. Detailed below.
     * 
     */
    @Import(name="posixUser")
    private @Nullable Output<AccessPointPosixUserArgs> posixUser;

    public Optional<Output<AccessPointPosixUserArgs>> posixUser() {
        return Optional.ofNullable(this.posixUser);
    }

    /**
     * Directory on the Amazon EFS file system that the access point provides access to. Detailed below.
     * 
     */
    @Import(name="rootDirectory")
    private @Nullable Output<AccessPointRootDirectoryArgs> rootDirectory;

    public Optional<Output<AccessPointRootDirectoryArgs>> rootDirectory() {
        return Optional.ofNullable(this.rootDirectory);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AccessPointArgs() {}

    private AccessPointArgs(AccessPointArgs $) {
        this.fileSystemId = $.fileSystemId;
        this.posixUser = $.posixUser;
        this.rootDirectory = $.rootDirectory;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointArgs $;

        public Builder() {
            $ = new AccessPointArgs();
        }

        public Builder(AccessPointArgs defaults) {
            $ = new AccessPointArgs(Objects.requireNonNull(defaults));
        }

        public Builder fileSystemId(Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        public Builder posixUser(@Nullable Output<AccessPointPosixUserArgs> posixUser) {
            $.posixUser = posixUser;
            return this;
        }

        public Builder posixUser(AccessPointPosixUserArgs posixUser) {
            return posixUser(Output.of(posixUser));
        }

        public Builder rootDirectory(@Nullable Output<AccessPointRootDirectoryArgs> rootDirectory) {
            $.rootDirectory = rootDirectory;
            return this;
        }

        public Builder rootDirectory(AccessPointRootDirectoryArgs rootDirectory) {
            return rootDirectory(Output.of(rootDirectory));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AccessPointArgs build() {
            $.fileSystemId = Objects.requireNonNull($.fileSystemId, "expected parameter 'fileSystemId' to be non-null");
            return $;
        }
    }

}
