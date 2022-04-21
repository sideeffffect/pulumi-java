// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.AksNetworkingConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.SslConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.SystemServiceResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AKS properties
 * 
 */
public final class AKSResponseProperties extends com.pulumi.resources.InvokeArgs {

    public static final AKSResponseProperties Empty = new AKSResponseProperties();

    /**
     * Number of agents
     * 
     */
    @Import(name="agentCount")
    private @Nullable Integer agentCount;

    public Optional<Integer> agentCount() {
        return Optional.ofNullable(this.agentCount);
    }

    /**
     * Agent virtual machine size
     * 
     */
    @Import(name="agentVmSize")
    private @Nullable String agentVmSize;

    public Optional<String> agentVmSize() {
        return Optional.ofNullable(this.agentVmSize);
    }

    /**
     * AKS networking configuration for vnet
     * 
     */
    @Import(name="aksNetworkingConfiguration")
    private @Nullable AksNetworkingConfigurationResponse aksNetworkingConfiguration;

    public Optional<AksNetworkingConfigurationResponse> aksNetworkingConfiguration() {
        return Optional.ofNullable(this.aksNetworkingConfiguration);
    }

    /**
     * Cluster full qualified domain name
     * 
     */
    @Import(name="clusterFqdn")
    private @Nullable String clusterFqdn;

    public Optional<String> clusterFqdn() {
        return Optional.ofNullable(this.clusterFqdn);
    }

    /**
     * Intended usage of the cluster
     * 
     */
    @Import(name="clusterPurpose")
    private @Nullable String clusterPurpose;

    public Optional<String> clusterPurpose() {
        return Optional.ofNullable(this.clusterPurpose);
    }

    /**
     * SSL configuration
     * 
     */
    @Import(name="sslConfiguration")
    private @Nullable SslConfigurationResponse sslConfiguration;

    public Optional<SslConfigurationResponse> sslConfiguration() {
        return Optional.ofNullable(this.sslConfiguration);
    }

    /**
     * System services
     * 
     */
    @Import(name="systemServices", required=true)
    private List<SystemServiceResponse> systemServices;

    public List<SystemServiceResponse> systemServices() {
        return this.systemServices;
    }

    private AKSResponseProperties() {}

    private AKSResponseProperties(AKSResponseProperties $) {
        this.agentCount = $.agentCount;
        this.agentVmSize = $.agentVmSize;
        this.aksNetworkingConfiguration = $.aksNetworkingConfiguration;
        this.clusterFqdn = $.clusterFqdn;
        this.clusterPurpose = $.clusterPurpose;
        this.sslConfiguration = $.sslConfiguration;
        this.systemServices = $.systemServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AKSResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AKSResponseProperties $;

        public Builder() {
            $ = new AKSResponseProperties();
        }

        public Builder(AKSResponseProperties defaults) {
            $ = new AKSResponseProperties(Objects.requireNonNull(defaults));
        }

        public Builder agentCount(@Nullable Integer agentCount) {
            $.agentCount = agentCount;
            return this;
        }

        public Builder agentVmSize(@Nullable String agentVmSize) {
            $.agentVmSize = agentVmSize;
            return this;
        }

        public Builder aksNetworkingConfiguration(@Nullable AksNetworkingConfigurationResponse aksNetworkingConfiguration) {
            $.aksNetworkingConfiguration = aksNetworkingConfiguration;
            return this;
        }

        public Builder clusterFqdn(@Nullable String clusterFqdn) {
            $.clusterFqdn = clusterFqdn;
            return this;
        }

        public Builder clusterPurpose(@Nullable String clusterPurpose) {
            $.clusterPurpose = clusterPurpose;
            return this;
        }

        public Builder sslConfiguration(@Nullable SslConfigurationResponse sslConfiguration) {
            $.sslConfiguration = sslConfiguration;
            return this;
        }

        public Builder systemServices(List<SystemServiceResponse> systemServices) {
            $.systemServices = systemServices;
            return this;
        }

        public Builder systemServices(SystemServiceResponse... systemServices) {
            return systemServices(List.of(systemServices));
        }

        public AKSResponseProperties build() {
            $.clusterPurpose = Codegen.stringProp("clusterPurpose").arg($.clusterPurpose).def("FastProd").getNullable();
            $.systemServices = Objects.requireNonNull($.systemServices, "expected parameter 'systemServices' to be non-null");
            return $;
        }
    }

}
