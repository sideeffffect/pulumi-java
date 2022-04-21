// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerDeviceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerDeviceGetArgs Empty = new ContainerDeviceGetArgs();

    @Import(name="containerPath")
    private @Nullable Output<String> containerPath;

    public Optional<Output<String>> containerPath() {
        return Optional.ofNullable(this.containerPath);
    }

    @Import(name="hostPath", required=true)
    private Output<String> hostPath;

    public Output<String> hostPath() {
        return this.hostPath;
    }

    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private ContainerDeviceGetArgs() {}

    private ContainerDeviceGetArgs(ContainerDeviceGetArgs $) {
        this.containerPath = $.containerPath;
        this.hostPath = $.hostPath;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerDeviceGetArgs $;

        public Builder() {
            $ = new ContainerDeviceGetArgs();
        }

        public Builder(ContainerDeviceGetArgs defaults) {
            $ = new ContainerDeviceGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerPath(@Nullable Output<String> containerPath) {
            $.containerPath = containerPath;
            return this;
        }

        public Builder containerPath(String containerPath) {
            return containerPath(Output.of(containerPath));
        }

        public Builder hostPath(Output<String> hostPath) {
            $.hostPath = hostPath;
            return this;
        }

        public Builder hostPath(String hostPath) {
            return hostPath(Output.of(hostPath));
        }

        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        public ContainerDeviceGetArgs build() {
            $.hostPath = Objects.requireNonNull($.hostPath, "expected parameter 'hostPath' to be non-null");
            return $;
        }
    }

}
