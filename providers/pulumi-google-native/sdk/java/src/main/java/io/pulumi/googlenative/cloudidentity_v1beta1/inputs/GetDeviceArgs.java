// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeviceArgs Empty = new GetDeviceArgs();

    @InputImport(name="deviceId", required=true)
      private final String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceArgs(String deviceId) {
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
    }

    private GetDeviceArgs() {
        this.deviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        public GetDeviceArgs build() {
            return new GetDeviceArgs(deviceId);
        }
    }
}
