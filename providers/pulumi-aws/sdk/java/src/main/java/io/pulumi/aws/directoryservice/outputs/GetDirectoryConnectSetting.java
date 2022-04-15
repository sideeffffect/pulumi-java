// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directoryservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDirectoryConnectSetting {
    private final List<String> availabilityZones;
    /**
     * The IP addresses of the AD Connector servers.
     * 
     */
    private final List<String> connectIps;
    /**
     * The DNS IP addresses of the domain to connect to.
     * 
     */
    private final List<String> customerDnsIps;
    /**
     * The username corresponding to the password provided.
     * 
     */
    private final String customerUsername;
    /**
     * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
     * 
     */
    private final List<String> subnetIds;
    /**
     * The ID of the VPC that the connector is in.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetDirectoryConnectSetting(
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("connectIps") List<String> connectIps,
        @CustomType.Parameter("customerDnsIps") List<String> customerDnsIps,
        @CustomType.Parameter("customerUsername") String customerUsername,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.availabilityZones = availabilityZones;
        this.connectIps = connectIps;
        this.customerDnsIps = customerDnsIps;
        this.customerUsername = customerUsername;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The IP addresses of the AD Connector servers.
     * 
    */
    public List<String> connectIps() {
        return this.connectIps;
    }
    /**
     * The DNS IP addresses of the domain to connect to.
     * 
    */
    public List<String> customerDnsIps() {
        return this.customerDnsIps;
    }
    /**
     * The username corresponding to the password provided.
     * 
    */
    public String customerUsername() {
        return this.customerUsername;
    }
    /**
     * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
     * 
    */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * The ID of the VPC that the connector is in.
     * 
    */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryConnectSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availabilityZones;
        private List<String> connectIps;
        private List<String> customerDnsIps;
        private String customerUsername;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectoryConnectSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectIps = defaults.connectIps;
    	      this.customerDnsIps = defaults.customerDnsIps;
    	      this.customerUsername = defaults.customerUsername;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder connectIps(List<String> connectIps) {
            this.connectIps = Objects.requireNonNull(connectIps);
            return this;
        }
        public Builder connectIps(String... connectIps) {
            return connectIps(List.of(connectIps));
        }
        public Builder customerDnsIps(List<String> customerDnsIps) {
            this.customerDnsIps = Objects.requireNonNull(customerDnsIps);
            return this;
        }
        public Builder customerDnsIps(String... customerDnsIps) {
            return customerDnsIps(List.of(customerDnsIps));
        }
        public Builder customerUsername(String customerUsername) {
            this.customerUsername = Objects.requireNonNull(customerUsername);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetDirectoryConnectSetting build() {
            return new GetDirectoryConnectSetting(availabilityZones, connectIps, customerDnsIps, customerUsername, subnetIds, vpcId);
        }
    }
}
