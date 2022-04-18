// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
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
      private final Integer count;

    public Integer count() {
        return this.count;
    }

    /**
     * Unique name of the pool profile in the context of the subscription and resource group.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> osType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Define the role of the AgentPoolProfile.
     * 
     */
    @Import(name="role")
      private final @Nullable String role;

    public Optional<String> role() {
        return this.role == null ? Optional.empty() : Optional.ofNullable(this.role);
    }

    /**
     * Subnet CIDR for the peering.
     * 
     */
    @Import(name="subnetCidr")
      private final @Nullable String subnetCidr;

    public Optional<String> subnetCidr() {
        return this.subnetCidr == null ? Optional.empty() : Optional.ofNullable(this.subnetCidr);
    }

    /**
     * Size of agent VMs.
     * 
     */
    @Import(name="vmSize", required=true)
      private final String vmSize;

    public String vmSize() {
        return this.vmSize;
    }

    public OpenShiftManagedClusterAgentPoolProfileResponse(
        Integer count,
        String name,
        @Nullable String osType,
        @Nullable String role,
        @Nullable String subnetCidr,
        String vmSize) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.osType = osType;
        this.role = role;
        this.subnetCidr = subnetCidr == null ? "10.0.0.0/24" : subnetCidr;
        this.vmSize = Objects.requireNonNull(vmSize, "expected parameter 'vmSize' to be non-null");
    }

    private OpenShiftManagedClusterAgentPoolProfileResponse() {
        this.count = null;
        this.name = null;
        this.osType = null;
        this.role = null;
        this.subnetCidr = null;
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAgentPoolProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String name;
        private @Nullable String osType;
        private @Nullable String role;
        private @Nullable String subnetCidr;
        private String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAgentPoolProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.role = defaults.role;
    	      this.subnetCidr = defaults.subnetCidr;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public Builder subnetCidr(@Nullable String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }
        public Builder vmSize(String vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }        public OpenShiftManagedClusterAgentPoolProfileResponse build() {
            return new OpenShiftManagedClusterAgentPoolProfileResponse(count, name, osType, role, subnetCidr, vmSize);
        }
    }
}
