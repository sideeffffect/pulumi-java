// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.outputs;

import com.pulumi.azurenative.hybridnetwork.outputs.LinuxConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsProfileResponse {
    /**
     * Specifies the name of the administrator account. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters  <br><br><li> For root access to the Linux VM, see [Using root privileges on Linux virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)<br><li> For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for Linux on Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     * 
     */
    private final @Nullable String adminUsername;
    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array is 65535 bytes. <br><br> **Note: Do not pass any secrets or passwords in customData property** <br><br> This property cannot be updated after the VM is created. <br><br> customData is passed to the VM to be saved as a file. For more information see [Custom Data on Azure VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) <br><br> For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * 
     */
    private final @Nullable String customData;
    /**
     * Indicates if custom data is required to deploy this role.
     * 
     */
    private final @Nullable Boolean customDataRequired;
    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json) <br><br> For running non-endorsed distributions, see [Information for Non-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     * 
     */
    private final @Nullable LinuxConfigurationResponse linuxConfiguration;

    @CustomType.Constructor
    private OsProfileResponse(
        @CustomType.Parameter("adminUsername") @Nullable String adminUsername,
        @CustomType.Parameter("customData") @Nullable String customData,
        @CustomType.Parameter("customDataRequired") @Nullable Boolean customDataRequired,
        @CustomType.Parameter("linuxConfiguration") @Nullable LinuxConfigurationResponse linuxConfiguration) {
        this.adminUsername = adminUsername;
        this.customData = customData;
        this.customDataRequired = customDataRequired;
        this.linuxConfiguration = linuxConfiguration;
    }

    /**
     * Specifies the name of the administrator account. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters  <br><br><li> For root access to the Linux VM, see [Using root privileges on Linux virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-use-root-privileges?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)<br><li> For a list of built-in system users on Linux that should not be used in this field, see [Selecting User Names for Linux on Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-usernames?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     * 
    */
    public Optional<String> adminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }
    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the virtual machine. The maximum length of the binary array is 65535 bytes. <br><br> **Note: Do not pass any secrets or passwords in customData property** <br><br> This property cannot be updated after the VM is created. <br><br> customData is passed to the VM to be saved as a file. For more information see [Custom Data on Azure VMs](https://azure.microsoft.com/en-us/blog/custom-data-and-cloud-init-on-windows-azure/) <br><br> For using cloud-init for your Linux VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-using-cloud-init?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
     * 
    */
    public Optional<String> customData() {
        return Optional.ofNullable(this.customData);
    }
    /**
     * Indicates if custom data is required to deploy this role.
     * 
    */
    public Optional<Boolean> customDataRequired() {
        return Optional.ofNullable(this.customDataRequired);
    }
    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json) <br><br> For running non-endorsed distributions, see [Information for Non-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     * 
    */
    public Optional<LinuxConfigurationResponse> linuxConfiguration() {
        return Optional.ofNullable(this.linuxConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminUsername;
        private @Nullable String customData;
        private @Nullable Boolean customDataRequired;
        private @Nullable LinuxConfigurationResponse linuxConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
    	      this.customData = defaults.customData;
    	      this.customDataRequired = defaults.customDataRequired;
    	      this.linuxConfiguration = defaults.linuxConfiguration;
        }

        public Builder adminUsername(@Nullable String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }
        public Builder customData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }
        public Builder customDataRequired(@Nullable Boolean customDataRequired) {
            this.customDataRequired = customDataRequired;
            return this;
        }
        public Builder linuxConfiguration(@Nullable LinuxConfigurationResponse linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }        public OsProfileResponse build() {
            return new OsProfileResponse(adminUsername, customData, customDataRequired, linuxConfiguration);
        }
    }
}
