// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceExtendedInformationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeviceExtendedInformationArgs Empty = new GetDeviceExtendedInformationArgs();

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDeviceExtendedInformationArgs(
        String deviceName,
        String resourceGroupName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDeviceExtendedInformationArgs() {
        this.deviceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceExtendedInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceExtendedInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDeviceExtendedInformationArgs build() {
            return new GetDeviceExtendedInformationArgs(deviceName, resourceGroupName);
        }
    }
}
