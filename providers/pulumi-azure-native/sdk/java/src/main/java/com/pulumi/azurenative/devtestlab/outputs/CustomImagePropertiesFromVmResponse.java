// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.outputs;

import com.pulumi.azurenative.devtestlab.outputs.LinuxOsInfoResponse;
import com.pulumi.azurenative.devtestlab.outputs.WindowsOsInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomImagePropertiesFromVmResponse {
    /**
     * The Linux OS information of the VM.
     * 
     */
    private final @Nullable LinuxOsInfoResponse linuxOsInfo;
    /**
     * The source vm identifier.
     * 
     */
    private final @Nullable String sourceVmId;
    /**
     * The Windows OS information of the VM.
     * 
     */
    private final @Nullable WindowsOsInfoResponse windowsOsInfo;

    @CustomType.Constructor
    private CustomImagePropertiesFromVmResponse(
        @CustomType.Parameter("linuxOsInfo") @Nullable LinuxOsInfoResponse linuxOsInfo,
        @CustomType.Parameter("sourceVmId") @Nullable String sourceVmId,
        @CustomType.Parameter("windowsOsInfo") @Nullable WindowsOsInfoResponse windowsOsInfo) {
        this.linuxOsInfo = linuxOsInfo;
        this.sourceVmId = sourceVmId;
        this.windowsOsInfo = windowsOsInfo;
    }

    /**
     * The Linux OS information of the VM.
     * 
    */
    public Optional<LinuxOsInfoResponse> linuxOsInfo() {
        return Optional.ofNullable(this.linuxOsInfo);
    }
    /**
     * The source vm identifier.
     * 
    */
    public Optional<String> sourceVmId() {
        return Optional.ofNullable(this.sourceVmId);
    }
    /**
     * The Windows OS information of the VM.
     * 
    */
    public Optional<WindowsOsInfoResponse> windowsOsInfo() {
        return Optional.ofNullable(this.windowsOsInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesFromVmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxOsInfoResponse linuxOsInfo;
        private @Nullable String sourceVmId;
        private @Nullable WindowsOsInfoResponse windowsOsInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesFromVmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxOsInfo = defaults.linuxOsInfo;
    	      this.sourceVmId = defaults.sourceVmId;
    	      this.windowsOsInfo = defaults.windowsOsInfo;
        }

        public Builder linuxOsInfo(@Nullable LinuxOsInfoResponse linuxOsInfo) {
            this.linuxOsInfo = linuxOsInfo;
            return this;
        }
        public Builder sourceVmId(@Nullable String sourceVmId) {
            this.sourceVmId = sourceVmId;
            return this;
        }
        public Builder windowsOsInfo(@Nullable WindowsOsInfoResponse windowsOsInfo) {
            this.windowsOsInfo = windowsOsInfo;
            return this;
        }        public CustomImagePropertiesFromVmResponse build() {
            return new CustomImagePropertiesFromVmResponse(linuxOsInfo, sourceVmId, windowsOsInfo);
        }
    }
}
