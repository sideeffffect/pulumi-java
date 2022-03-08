// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.AccountResponse;
import io.pulumi.googlenative.testing_v1.outputs.ApkResponse;
import io.pulumi.googlenative.testing_v1.outputs.DeviceFileResponse;
import io.pulumi.googlenative.testing_v1.outputs.EnvironmentVariableResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TestSetupResponse {
    /**
     * The device will be logged in on this account for the duration of the test.
     * 
     */
    private final AccountResponse account;
    /**
     * APKs to install in addition to those being directly tested. Currently capped at 100.
     * 
     */
    private final List<ApkResponse> additionalApks;
    /**
     * List of directories on the device to upload to GCS at the end of the test; they must be absolute paths under /sdcard, /storage or /data/local/tmp. Path names are restricted to characters a-z A-Z 0-9 _ - . + and / Note: The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device.
     * 
     */
    private final List<String> directoriesToPull;
    /**
     * Whether to prevent all runtime permissions to be granted at app install
     * 
     */
    private final Boolean dontAutograntPermissions;
    /**
     * Environment variables to set for the test (only applicable for instrumentation tests).
     * 
     */
    private final List<EnvironmentVariableResponse> environmentVariables;
    /**
     * List of files to push to the device before starting the test.
     * 
     */
    private final List<DeviceFileResponse> filesToPush;
    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
     */
    private final String networkProfile;

    @OutputCustomType.Constructor({"account","additionalApks","directoriesToPull","dontAutograntPermissions","environmentVariables","filesToPush","networkProfile"})
    private TestSetupResponse(
        AccountResponse account,
        List<ApkResponse> additionalApks,
        List<String> directoriesToPull,
        Boolean dontAutograntPermissions,
        List<EnvironmentVariableResponse> environmentVariables,
        List<DeviceFileResponse> filesToPush,
        String networkProfile) {
        this.account = account;
        this.additionalApks = additionalApks;
        this.directoriesToPull = directoriesToPull;
        this.dontAutograntPermissions = dontAutograntPermissions;
        this.environmentVariables = environmentVariables;
        this.filesToPush = filesToPush;
        this.networkProfile = networkProfile;
    }

    /**
     * The device will be logged in on this account for the duration of the test.
     * 
    */
    public AccountResponse getAccount() {
        return this.account;
    }
    /**
     * APKs to install in addition to those being directly tested. Currently capped at 100.
     * 
    */
    public List<ApkResponse> getAdditionalApks() {
        return this.additionalApks;
    }
    /**
     * List of directories on the device to upload to GCS at the end of the test; they must be absolute paths under /sdcard, /storage or /data/local/tmp. Path names are restricted to characters a-z A-Z 0-9 _ - . + and / Note: The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device.
     * 
    */
    public List<String> getDirectoriesToPull() {
        return this.directoriesToPull;
    }
    /**
     * Whether to prevent all runtime permissions to be granted at app install
     * 
    */
    public Boolean getDontAutograntPermissions() {
        return this.dontAutograntPermissions;
    }
    /**
     * Environment variables to set for the test (only applicable for instrumentation tests).
     * 
    */
    public List<EnvironmentVariableResponse> getEnvironmentVariables() {
        return this.environmentVariables;
    }
    /**
     * List of files to push to the device before starting the test.
     * 
    */
    public List<DeviceFileResponse> getFilesToPush() {
        return this.filesToPush;
    }
    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
    */
    public String getNetworkProfile() {
        return this.networkProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountResponse account;
        private List<ApkResponse> additionalApks;
        private List<String> directoriesToPull;
        private Boolean dontAutograntPermissions;
        private List<EnvironmentVariableResponse> environmentVariables;
        private List<DeviceFileResponse> filesToPush;
        private String networkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(TestSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.additionalApks = defaults.additionalApks;
    	      this.directoriesToPull = defaults.directoriesToPull;
    	      this.dontAutograntPermissions = defaults.dontAutograntPermissions;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.filesToPush = defaults.filesToPush;
    	      this.networkProfile = defaults.networkProfile;
        }

        public Builder setAccount(AccountResponse account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }

        public Builder setAdditionalApks(List<ApkResponse> additionalApks) {
            this.additionalApks = Objects.requireNonNull(additionalApks);
            return this;
        }

        public Builder setDirectoriesToPull(List<String> directoriesToPull) {
            this.directoriesToPull = Objects.requireNonNull(directoriesToPull);
            return this;
        }

        public Builder setDontAutograntPermissions(Boolean dontAutograntPermissions) {
            this.dontAutograntPermissions = Objects.requireNonNull(dontAutograntPermissions);
            return this;
        }

        public Builder setEnvironmentVariables(List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = Objects.requireNonNull(environmentVariables);
            return this;
        }

        public Builder setFilesToPush(List<DeviceFileResponse> filesToPush) {
            this.filesToPush = Objects.requireNonNull(filesToPush);
            return this;
        }

        public Builder setNetworkProfile(String networkProfile) {
            this.networkProfile = Objects.requireNonNull(networkProfile);
            return this;
        }
        public TestSetupResponse build() {
            return new TestSetupResponse(account, additionalApks, directoriesToPull, dontAutograntPermissions, environmentVariables, filesToPush, networkProfile);
        }
    }
}
