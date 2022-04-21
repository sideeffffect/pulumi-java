// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A class that contains virtual network definition.
 * 
 */
public final class VirtualNetworkConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkConfigurationResponse Empty = new VirtualNetworkConfigurationResponse();

    /**
     * Data management&#39;s service public IP address resource id.
     * 
     */
    @Import(name="dataManagementPublicIpId", required=true)
    private String dataManagementPublicIpId;

    public String dataManagementPublicIpId() {
        return this.dataManagementPublicIpId;
    }

    /**
     * Engine service&#39;s public IP address resource id.
     * 
     */
    @Import(name="enginePublicIpId", required=true)
    private String enginePublicIpId;

    public String enginePublicIpId() {
        return this.enginePublicIpId;
    }

    /**
     * The subnet resource id.
     * 
     */
    @Import(name="subnetId", required=true)
    private String subnetId;

    public String subnetId() {
        return this.subnetId;
    }

    private VirtualNetworkConfigurationResponse() {}

    private VirtualNetworkConfigurationResponse(VirtualNetworkConfigurationResponse $) {
        this.dataManagementPublicIpId = $.dataManagementPublicIpId;
        this.enginePublicIpId = $.enginePublicIpId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkConfigurationResponse $;

        public Builder() {
            $ = new VirtualNetworkConfigurationResponse();
        }

        public Builder(VirtualNetworkConfigurationResponse defaults) {
            $ = new VirtualNetworkConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataManagementPublicIpId(String dataManagementPublicIpId) {
            $.dataManagementPublicIpId = dataManagementPublicIpId;
            return this;
        }

        public Builder enginePublicIpId(String enginePublicIpId) {
            $.enginePublicIpId = enginePublicIpId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public VirtualNetworkConfigurationResponse build() {
            $.dataManagementPublicIpId = Objects.requireNonNull($.dataManagementPublicIpId, "expected parameter 'dataManagementPublicIpId' to be non-null");
            $.enginePublicIpId = Objects.requireNonNull($.enginePublicIpId, "expected parameter 'enginePublicIpId' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
