// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.databoxedge.enums.RoleTypes;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Role type.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,RoleTypes>> kind;

    public Output<Either<String,RoleTypes>> kind() {
        return this.kind;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public RoleArgs(
        Output<String> deviceName,
        Output<Either<String,RoleTypes>> kind,
        @Nullable Output<String> name,
        Output<String> resourceGroupName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private RoleArgs() {
        this.deviceName = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceName;
        private Output<Either<String,RoleTypes>> kind;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder kind(Output<Either<String,RoleTypes>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,RoleTypes> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public RoleArgs build() {
            return new RoleArgs(deviceName, kind, name, resourceGroupName);
        }
    }
}
