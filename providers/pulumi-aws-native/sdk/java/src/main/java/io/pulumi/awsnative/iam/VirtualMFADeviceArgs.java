// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.iam.inputs.VirtualMFADeviceTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMFADeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMFADeviceArgs Empty = new VirtualMFADeviceArgs();

    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<VirtualMFADeviceTagArgs>> tags;

    public Input<List<VirtualMFADeviceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="users", required=true)
      private final Input<List<String>> users;

    public Input<List<String>> getUsers() {
        return this.users;
    }

    @InputImport(name="virtualMfaDeviceName")
      private final @Nullable Input<String> virtualMfaDeviceName;

    public Input<String> getVirtualMfaDeviceName() {
        return this.virtualMfaDeviceName == null ? Input.empty() : this.virtualMfaDeviceName;
    }

    public VirtualMFADeviceArgs(
        @Nullable Input<String> path,
        @Nullable Input<List<VirtualMFADeviceTagArgs>> tags,
        Input<List<String>> users,
        @Nullable Input<String> virtualMfaDeviceName) {
        this.path = path;
        this.tags = tags;
        this.users = Objects.requireNonNull(users, "expected parameter 'users' to be non-null");
        this.virtualMfaDeviceName = virtualMfaDeviceName;
    }

    private VirtualMFADeviceArgs() {
        this.path = Input.empty();
        this.tags = Input.empty();
        this.users = Input.empty();
        this.virtualMfaDeviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMFADeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> path;
        private @Nullable Input<List<VirtualMFADeviceTagArgs>> tags;
        private Input<List<String>> users;
        private @Nullable Input<String> virtualMfaDeviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMFADeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.tags = defaults.tags;
    	      this.users = defaults.users;
    	      this.virtualMfaDeviceName = defaults.virtualMfaDeviceName;
        }

        public Builder path(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder tags(@Nullable Input<List<VirtualMFADeviceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<VirtualMFADeviceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder users(Input<List<String>> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }

        public Builder users(List<String> users) {
            this.users = Input.of(Objects.requireNonNull(users));
            return this;
        }

        public Builder virtualMfaDeviceName(@Nullable Input<String> virtualMfaDeviceName) {
            this.virtualMfaDeviceName = virtualMfaDeviceName;
            return this;
        }

        public Builder virtualMfaDeviceName(@Nullable String virtualMfaDeviceName) {
            this.virtualMfaDeviceName = Input.ofNullable(virtualMfaDeviceName);
            return this;
        }
        public VirtualMFADeviceArgs build() {
            return new VirtualMFADeviceArgs(path, tags, users, virtualMfaDeviceName);
        }
    }
}
