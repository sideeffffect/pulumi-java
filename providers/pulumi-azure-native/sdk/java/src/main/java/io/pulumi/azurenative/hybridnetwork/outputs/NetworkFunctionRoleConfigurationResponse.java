// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.azurenative.hybridnetwork.outputs.CustomProfileResponse;
import io.pulumi.azurenative.hybridnetwork.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.hybridnetwork.outputs.OsProfileResponse;
import io.pulumi.azurenative.hybridnetwork.outputs.StorageProfileResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkFunctionRoleConfigurationResponse {
    /**
     * Specifies the custom settings for the virtual machine.
     * 
     */
    private final @Nullable CustomProfileResponse customProfile;
    /**
     * The network interface configurations.
     * 
     */
    private final @Nullable List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * Specifies the operating system settings for the role instance. This value can be updated during the deployment of network function.
     * 
     */
    private final @Nullable OsProfileResponse osProfile;
    /**
     * The name of the network function role.
     * 
     */
    private final @Nullable String roleName;
    /**
     * Role type.
     * 
     */
    private final @Nullable String roleType;
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    private final @Nullable StorageProfileResponse storageProfile;
    /**
     * The user parameters for customers. The format of user data parameters has to be matched with the provided user data template.
     * 
     */
    private final @Nullable Object userDataParameters;
    /**
     * The user data template for customers. This is a json schema template describing the format and data type of user data parameters.
     * 
     */
    private final @Nullable Object userDataTemplate;
    /**
     * The size of the virtual machine.
     * 
     */
    private final @Nullable String virtualMachineSize;

    @OutputCustomType.Constructor
    private NetworkFunctionRoleConfigurationResponse(
        @OutputCustomType.Parameter("customProfile") @Nullable CustomProfileResponse customProfile,
        @OutputCustomType.Parameter("networkInterfaces") @Nullable List<NetworkInterfaceResponse> networkInterfaces,
        @OutputCustomType.Parameter("osProfile") @Nullable OsProfileResponse osProfile,
        @OutputCustomType.Parameter("roleName") @Nullable String roleName,
        @OutputCustomType.Parameter("roleType") @Nullable String roleType,
        @OutputCustomType.Parameter("storageProfile") @Nullable StorageProfileResponse storageProfile,
        @OutputCustomType.Parameter("userDataParameters") @Nullable Object userDataParameters,
        @OutputCustomType.Parameter("userDataTemplate") @Nullable Object userDataTemplate,
        @OutputCustomType.Parameter("virtualMachineSize") @Nullable String virtualMachineSize) {
        this.customProfile = customProfile;
        this.networkInterfaces = networkInterfaces;
        this.osProfile = osProfile;
        this.roleName = roleName;
        this.roleType = roleType;
        this.storageProfile = storageProfile;
        this.userDataParameters = userDataParameters;
        this.userDataTemplate = userDataTemplate;
        this.virtualMachineSize = virtualMachineSize;
    }

    /**
     * Specifies the custom settings for the virtual machine.
     * 
    */
    public Optional<CustomProfileResponse> getCustomProfile() {
        return Optional.ofNullable(this.customProfile);
    }
    /**
     * The network interface configurations.
     * 
    */
    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }
    /**
     * Specifies the operating system settings for the role instance. This value can be updated during the deployment of network function.
     * 
    */
    public Optional<OsProfileResponse> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * The name of the network function role.
     * 
    */
    public Optional<String> getRoleName() {
        return Optional.ofNullable(this.roleName);
    }
    /**
     * Role type.
     * 
    */
    public Optional<String> getRoleType() {
        return Optional.ofNullable(this.roleType);
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
    */
    public Optional<StorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * The user parameters for customers. The format of user data parameters has to be matched with the provided user data template.
     * 
    */
    public Optional<Object> getUserDataParameters() {
        return Optional.ofNullable(this.userDataParameters);
    }
    /**
     * The user data template for customers. This is a json schema template describing the format and data type of user data parameters.
     * 
    */
    public Optional<Object> getUserDataTemplate() {
        return Optional.ofNullable(this.userDataTemplate);
    }
    /**
     * The size of the virtual machine.
     * 
    */
    public Optional<String> getVirtualMachineSize() {
        return Optional.ofNullable(this.virtualMachineSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionRoleConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomProfileResponse customProfile;
        private @Nullable List<NetworkInterfaceResponse> networkInterfaces;
        private @Nullable OsProfileResponse osProfile;
        private @Nullable String roleName;
        private @Nullable String roleType;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable Object userDataParameters;
        private @Nullable Object userDataTemplate;
        private @Nullable String virtualMachineSize;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionRoleConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customProfile = defaults.customProfile;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.osProfile = defaults.osProfile;
    	      this.roleName = defaults.roleName;
    	      this.roleType = defaults.roleType;
    	      this.storageProfile = defaults.storageProfile;
    	      this.userDataParameters = defaults.userDataParameters;
    	      this.userDataTemplate = defaults.userDataTemplate;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        public Builder customProfile(@Nullable CustomProfileResponse customProfile) {
            this.customProfile = customProfile;
            return this;
        }

        public Builder networkInterfaces(@Nullable List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder osProfile(@Nullable OsProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder roleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder roleType(@Nullable String roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder storageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder userDataParameters(@Nullable Object userDataParameters) {
            this.userDataParameters = userDataParameters;
            return this;
        }

        public Builder userDataTemplate(@Nullable Object userDataTemplate) {
            this.userDataTemplate = userDataTemplate;
            return this;
        }

        public Builder virtualMachineSize(@Nullable String virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }
        public NetworkFunctionRoleConfigurationResponse build() {
            return new NetworkFunctionRoleConfigurationResponse(customProfile, networkInterfaces, osProfile, roleName, roleType, storageProfile, userDataParameters, userDataTemplate, virtualMachineSize);
        }
    }
}
