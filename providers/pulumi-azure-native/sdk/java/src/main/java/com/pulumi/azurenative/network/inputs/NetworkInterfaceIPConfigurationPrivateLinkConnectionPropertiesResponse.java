// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * PrivateLinkConnection properties for the network interface.
 * 
 */
public final class NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse Empty = new NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse();

    /**
     * List of FQDNs for current private link connection.
     * 
     */
    @Import(name="fqdns", required=true)
    private List<String> fqdns;

    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * The group ID for current private link connection.
     * 
     */
    @Import(name="groupId", required=true)
    private String groupId;

    public String groupId() {
        return this.groupId;
    }

    /**
     * The required member name for current private link connection.
     * 
     */
    @Import(name="requiredMemberName", required=true)
    private String requiredMemberName;

    public String requiredMemberName() {
        return this.requiredMemberName;
    }

    private NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse() {}

    private NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse(NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse $) {
        this.fqdns = $.fqdns;
        this.groupId = $.groupId;
        this.requiredMemberName = $.requiredMemberName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse $;

        public Builder() {
            $ = new NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse();
        }

        public Builder(NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse defaults) {
            $ = new NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder fqdns(List<String> fqdns) {
            $.fqdns = fqdns;
            return this;
        }

        public Builder fqdns(String... fqdns) {
            return fqdns(List.of(fqdns));
        }

        public Builder groupId(String groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder requiredMemberName(String requiredMemberName) {
            $.requiredMemberName = requiredMemberName;
            return this;
        }

        public NetworkInterfaceIPConfigurationPrivateLinkConnectionPropertiesResponse build() {
            $.fqdns = Objects.requireNonNull($.fqdns, "expected parameter 'fqdns' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.requiredMemberName = Objects.requireNonNull($.requiredMemberName, "expected parameter 'requiredMemberName' to be non-null");
            return $;
        }
    }

}
