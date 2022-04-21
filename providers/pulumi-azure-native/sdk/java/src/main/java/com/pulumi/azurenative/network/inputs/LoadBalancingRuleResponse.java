// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A load balancing rule for a load balancer.
 * 
 */
public final class LoadBalancingRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoadBalancingRuleResponse Empty = new LoadBalancingRuleResponse();

    /**
     * A reference to a pool of DIPs. Inbound traffic is randomly load balanced across IPs in the backend IPs.
     * 
     */
    @Import(name="backendAddressPool")
    private @Nullable SubResourceResponse backendAddressPool;

    public Optional<SubResourceResponse> backendAddressPool() {
        return Optional.ofNullable(this.backendAddressPool);
    }

    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 0 and 65535. Note that value 0 enables &#34;Any Port&#34;.
     * 
     */
    @Import(name="backendPort")
    private @Nullable Integer backendPort;

    public Optional<Integer> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }

    /**
     * Configures SNAT for the VMs in the backend pool to use the publicIP address specified in the frontend of the load balancing rule.
     * 
     */
    @Import(name="disableOutboundSnat")
    private @Nullable Boolean disableOutboundSnat;

    public Optional<Boolean> disableOutboundSnat() {
        return Optional.ofNullable(this.disableOutboundSnat);
    }

    /**
     * Configures a virtual machine&#39;s endpoint for the floating IP capability required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn Availability Groups in SQL server. This setting can&#39;t be changed after you create the endpoint.
     * 
     */
    @Import(name="enableFloatingIP")
    private @Nullable Boolean enableFloatingIP;

    public Optional<Boolean> enableFloatingIP() {
        return Optional.ofNullable(this.enableFloatingIP);
    }

    /**
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected connection termination. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="enableTcpReset")
    private @Nullable Boolean enableTcpReset;

    public Optional<Boolean> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * A reference to frontend IP addresses.
     * 
     */
    @Import(name="frontendIPConfiguration")
    private @Nullable SubResourceResponse frontendIPConfiguration;

    public Optional<SubResourceResponse> frontendIPConfiguration() {
        return Optional.ofNullable(this.frontendIPConfiguration);
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables &#34;Any Port&#34;.
     * 
     */
    @Import(name="frontendPort", required=true)
    private Integer frontendPort;

    public Integer frontendPort() {
        return this.frontendPort;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The timeout for the TCP idle connection. The value can be set between 4 and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The load distribution policy for this rule.
     * 
     */
    @Import(name="loadDistribution")
    private @Nullable String loadDistribution;

    public Optional<String> loadDistribution() {
        return Optional.ofNullable(this.loadDistribution);
    }

    /**
     * The name of the resource that is unique within the set of load balancing rules used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The reference to the load balancer probe used by the load balancing rule.
     * 
     */
    @Import(name="probe")
    private @Nullable SubResourceResponse probe;

    public Optional<SubResourceResponse> probe() {
        return Optional.ofNullable(this.probe);
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @Import(name="protocol", required=true)
    private String protocol;

    public String protocol() {
        return this.protocol;
    }

    /**
     * The provisioning state of the load balancing rule resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private LoadBalancingRuleResponse() {}

    private LoadBalancingRuleResponse(LoadBalancingRuleResponse $) {
        this.backendAddressPool = $.backendAddressPool;
        this.backendPort = $.backendPort;
        this.disableOutboundSnat = $.disableOutboundSnat;
        this.enableFloatingIP = $.enableFloatingIP;
        this.enableTcpReset = $.enableTcpReset;
        this.etag = $.etag;
        this.frontendIPConfiguration = $.frontendIPConfiguration;
        this.frontendPort = $.frontendPort;
        this.id = $.id;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.loadDistribution = $.loadDistribution;
        this.name = $.name;
        this.probe = $.probe;
        this.protocol = $.protocol;
        this.provisioningState = $.provisioningState;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancingRuleResponse $;

        public Builder() {
            $ = new LoadBalancingRuleResponse();
        }

        public Builder(LoadBalancingRuleResponse defaults) {
            $ = new LoadBalancingRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder backendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            $.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder backendPort(@Nullable Integer backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        public Builder disableOutboundSnat(@Nullable Boolean disableOutboundSnat) {
            $.disableOutboundSnat = disableOutboundSnat;
            return this;
        }

        public Builder enableFloatingIP(@Nullable Boolean enableFloatingIP) {
            $.enableFloatingIP = enableFloatingIP;
            return this;
        }

        public Builder enableTcpReset(@Nullable Boolean enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder frontendIPConfiguration(@Nullable SubResourceResponse frontendIPConfiguration) {
            $.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        public Builder frontendPort(Integer frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder loadDistribution(@Nullable String loadDistribution) {
            $.loadDistribution = loadDistribution;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder probe(@Nullable SubResourceResponse probe) {
            $.probe = probe;
            return this;
        }

        public Builder protocol(String protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public LoadBalancingRuleResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.frontendPort = Objects.requireNonNull($.frontendPort, "expected parameter 'frontendPort' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
