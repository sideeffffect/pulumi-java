// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs Empty = new AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs();

    /**
     * The default POSIX group ID (GID). If not specified, defaults to `100`. Valid values are `0` and `100`.
     * 
     */
    @Import(name="defaultGid")
    private @Nullable Output<Integer> defaultGid;

    public Optional<Output<Integer>> defaultGid() {
        return Optional.ofNullable(this.defaultGid);
    }

    /**
     * The default POSIX user ID (UID). If not specified, defaults to `1000`. Valid values are `0` and `1000`.
     * 
     */
    @Import(name="defaultUid")
    private @Nullable Output<Integer> defaultUid;

    public Optional<Output<Integer>> defaultUid() {
        return Optional.ofNullable(this.defaultUid);
    }

    /**
     * The path within the image to mount the user&#39;s EFS home directory. The directory should be empty. If not specified, defaults to `/home/sagemaker-user`.
     * 
     */
    @Import(name="mountPath")
    private @Nullable Output<String> mountPath;

    public Optional<Output<String>> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }

    private AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs() {}

    private AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs(AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs $) {
        this.defaultGid = $.defaultGid;
        this.defaultUid = $.defaultUid;
        this.mountPath = $.mountPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs $;

        public Builder() {
            $ = new AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs();
        }

        public Builder(AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs defaults) {
            $ = new AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultGid(@Nullable Output<Integer> defaultGid) {
            $.defaultGid = defaultGid;
            return this;
        }

        public Builder defaultGid(Integer defaultGid) {
            return defaultGid(Output.of(defaultGid));
        }

        public Builder defaultUid(@Nullable Output<Integer> defaultUid) {
            $.defaultUid = defaultUid;
            return this;
        }

        public Builder defaultUid(Integer defaultUid) {
            return defaultUid(Output.of(defaultUid));
        }

        public Builder mountPath(@Nullable Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        public AppImageConfigKernelGatewayImageConfigFileSystemConfigArgs build() {
            return $;
        }
    }

}
