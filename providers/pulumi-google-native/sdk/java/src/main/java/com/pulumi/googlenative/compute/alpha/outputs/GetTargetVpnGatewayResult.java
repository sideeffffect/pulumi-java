// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTargetVpnGatewayResult {
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return A list of URLs to the ForwardingRule resources. ForwardingRules are created using compute.forwardingRules.insert and associated with a VPN gateway.
     * 
     */
    private final List<String> forwardingRules;
    /**
     * @return Type of resource. Always compute#targetVpnGateway for target VPN gateways.
     * 
     */
    private final String kind;
    /**
     * @return A fingerprint for the labels being applied to this TargetVpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a TargetVpnGateway.
     * 
     */
    private final String labelFingerprint;
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    private final String network;
    /**
     * @return URL of the region where the target VPN gateway resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return The status of the VPN gateway, which can be one of the following: CREATING, READY, FAILED, or DELETING.
     * 
     */
    private final String status;
    /**
     * @return A list of URLs to VpnTunnel resources. VpnTunnels are created using the compute.vpntunnels.insert method and associated with a VPN gateway.
     * 
     */
    private final List<String> tunnels;

    @CustomType.Constructor
    private GetTargetVpnGatewayResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("forwardingRules") List<String> forwardingRules,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tunnels") List<String> tunnels) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.forwardingRules = forwardingRules;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.region = region;
        this.selfLink = selfLink;
        this.status = status;
        this.tunnels = tunnels;
    }

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A list of URLs to the ForwardingRule resources. ForwardingRules are created using compute.forwardingRules.insert and associated with a VPN gateway.
     * 
     */
    public List<String> forwardingRules() {
        return this.forwardingRules;
    }
    /**
     * @return Type of resource. Always compute#targetVpnGateway for target VPN gateways.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A fingerprint for the labels being applied to this TargetVpnGateway, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a TargetVpnGateway.
     * 
     */
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return URL of the region where the target VPN gateway resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The status of the VPN gateway, which can be one of the following: CREATING, READY, FAILED, or DELETING.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A list of URLs to VpnTunnel resources. VpnTunnels are created using the compute.vpntunnels.insert method and associated with a VPN gateway.
     * 
     */
    public List<String> tunnels() {
        return this.tunnels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetVpnGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private List<String> forwardingRules;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String network;
        private String region;
        private String selfLink;
        private String status;
        private List<String> tunnels;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.forwardingRules = defaults.forwardingRules;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.tunnels = defaults.tunnels;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder forwardingRules(List<String> forwardingRules) {
            this.forwardingRules = Objects.requireNonNull(forwardingRules);
            return this;
        }
        public Builder forwardingRules(String... forwardingRules) {
            return forwardingRules(List.of(forwardingRules));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tunnels(List<String> tunnels) {
            this.tunnels = Objects.requireNonNull(tunnels);
            return this;
        }
        public Builder tunnels(String... tunnels) {
            return tunnels(List.of(tunnels));
        }        public GetTargetVpnGatewayResult build() {
            return new GetTargetVpnGatewayResult(creationTimestamp, description, forwardingRules, kind, labelFingerprint, labels, name, network, region, selfLink, status, tunnels);
        }
    }
}
