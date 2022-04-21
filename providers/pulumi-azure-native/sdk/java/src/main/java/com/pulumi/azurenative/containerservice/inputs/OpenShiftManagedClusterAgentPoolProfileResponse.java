// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the configuration of the OpenShift cluster VMs.
 * 
 */
public final class OpenShiftManagedClusterAgentPoolProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final OpenShiftManagedClusterAgentPoolProfileResponse Empty = new OpenShiftManagedClusterAgentPoolProfileResponse();

    /**
     * Number of agents (VMs) to host docker containers.
     * 
     */
    @Import(name="count", required=true)
    private Integer count;

    public Integer count() {
        return this.count;
    }

    /**
     * Unique name of the pool profile in the context of the subscription and resource group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @Import(name="osType")
    private @Nullable String osType;

    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * Define the role of the AgentPoolProfile.
     * 
     */
    @Import(name="role")
    private @Nullable String role;

    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Subnet CIDR for the peering.
     * 
     */
    @Import(name="subnetCidr")
    private @Nullable String subnetCidr;

    public Optional<String> subnetCidr() {
        return Optional.ofNullable(this.subnetCidr);
    }

    /**
     * Size of agent VMs.
     * 
     */
    @Import(name="vmSize", required=true)
    private String vmSize;

    public String vmSize() {
        return this.vmSize;
    }

    private OpenShiftManagedClusterAgentPoolProfileResponse() {}

    private OpenShiftManagedClusterAgentPoolProfileResponse(OpenShiftManagedClusterAgentPoolProfileResponse $) {
        this.count = $.count;
        this.name = $.name;
        this.osType = $.osType;
        this.role = $.role;
        this.subnetCidr = $.subnetCidr;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenShiftManagedClusterAgentPoolProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenShiftManagedClusterAgentPoolProfileResponse $;

        public Builder() {
            $ = new OpenShiftManagedClusterAgentPoolProfileResponse();
        }

        public Builder(OpenShiftManagedClusterAgentPoolProfileResponse defaults) {
            $ = new OpenShiftManagedClusterAgentPoolProfileResponse(Objects.requireNonNull(defaults));
        }

        public Builder count(Integer count) {
            $.count = count;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            $.osType = osType;
            return this;
        }

        public Builder role(@Nullable String role) {
            $.role = role;
            return this;
        }

        public Builder subnetCidr(@Nullable String subnetCidr) {
            $.subnetCidr = subnetCidr;
            return this;
        }

        public Builder vmSize(String vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        public OpenShiftManagedClusterAgentPoolProfileResponse build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.subnetCidr = Codegen.stringProp("subnetCidr").arg($.subnetCidr).def("10.0.0.0/24").getNullable();
            $.vmSize = Objects.requireNonNull($.vmSize, "expected parameter 'vmSize' to be non-null");
            return $;
        }
    }

}
