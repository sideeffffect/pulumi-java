// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceFleetArgs extends InvokeArgs {

    public static final GetDeviceFleetArgs Empty = new GetDeviceFleetArgs();

    /**
     * The name of the edge device fleet
     * 
     */
    @Import(name="deviceFleetName", required=true)
    private String deviceFleetName;

    /**
     * @return The name of the edge device fleet
     * 
     */
    public String deviceFleetName() {
        return this.deviceFleetName;
    }

    private GetDeviceFleetArgs() {}

    private GetDeviceFleetArgs(GetDeviceFleetArgs $) {
        this.deviceFleetName = $.deviceFleetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceFleetArgs $;

        public Builder() {
            $ = new GetDeviceFleetArgs();
        }

        public Builder(GetDeviceFleetArgs defaults) {
            $ = new GetDeviceFleetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceFleetName The name of the edge device fleet
         * 
         * @return builder
         * 
         */
        public Builder deviceFleetName(String deviceFleetName) {
            $.deviceFleetName = deviceFleetName;
            return this;
        }

        public GetDeviceFleetArgs build() {
            $.deviceFleetName = Objects.requireNonNull($.deviceFleetName, "expected parameter 'deviceFleetName' to be non-null");
            return $;
        }
    }

}
