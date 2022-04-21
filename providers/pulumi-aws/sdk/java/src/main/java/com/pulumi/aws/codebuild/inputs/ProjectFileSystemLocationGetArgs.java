// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectFileSystemLocationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectFileSystemLocationGetArgs Empty = new ProjectFileSystemLocationGetArgs();

    /**
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD\_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * A string that specifies the location of the file system created by Amazon EFS. Its format is `efs-dns-name:/directory-path`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The mount options for a file system created by AWS EFS.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<String> mountOptions;

    public Optional<Output<String>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * The location in the container where you mount the file system.
     * 
     */
    @Import(name="mountPoint")
    private @Nullable Output<String> mountPoint;

    public Optional<Output<String>> mountPoint() {
        return Optional.ofNullable(this.mountPoint);
    }

    /**
     * Authorization type to use. The only valid value is `OAUTH`. This data type is deprecated and is no longer accurate or used. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ProjectFileSystemLocationGetArgs() {}

    private ProjectFileSystemLocationGetArgs(ProjectFileSystemLocationGetArgs $) {
        this.identifier = $.identifier;
        this.location = $.location;
        this.mountOptions = $.mountOptions;
        this.mountPoint = $.mountPoint;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectFileSystemLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectFileSystemLocationGetArgs $;

        public Builder() {
            $ = new ProjectFileSystemLocationGetArgs();
        }

        public Builder(ProjectFileSystemLocationGetArgs defaults) {
            $ = new ProjectFileSystemLocationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(String mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        public Builder mountPoint(@Nullable Output<String> mountPoint) {
            $.mountPoint = mountPoint;
            return this;
        }

        public Builder mountPoint(String mountPoint) {
            return mountPoint(Output.of(mountPoint));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProjectFileSystemLocationGetArgs build() {
            return $;
        }
    }

}
