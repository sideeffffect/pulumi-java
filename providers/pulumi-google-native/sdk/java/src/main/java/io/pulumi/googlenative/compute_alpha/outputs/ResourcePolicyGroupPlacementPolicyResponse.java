// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicyGroupPlacementPolicyResponse {
    /**
     * The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    private final Integer availabilityDomainCount;
    /**
     * Specifies network collocation
     * 
     */
    private final String collocation;
    /**
     * Specifies network locality
     * 
     */
    private final String locality;
    /**
     * Scope specifies the availability domain to which the VMs should be spread.
     * 
     */
    private final String scope;
    /**
     * Specifies instances to hosts placement relationship
     * 
     */
    private final String style;
    /**
     * Number of vms in this placement group
     * 
     */
    private final Integer vmCount;

    @OutputCustomType.Constructor
    private ResourcePolicyGroupPlacementPolicyResponse(
        @OutputCustomType.Parameter("availabilityDomainCount") Integer availabilityDomainCount,
        @OutputCustomType.Parameter("collocation") String collocation,
        @OutputCustomType.Parameter("locality") String locality,
        @OutputCustomType.Parameter("scope") String scope,
        @OutputCustomType.Parameter("style") String style,
        @OutputCustomType.Parameter("vmCount") Integer vmCount) {
        this.availabilityDomainCount = availabilityDomainCount;
        this.collocation = collocation;
        this.locality = locality;
        this.scope = scope;
        this.style = style;
        this.vmCount = vmCount;
    }

    /**
     * The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
    */
    public Integer getAvailabilityDomainCount() {
        return this.availabilityDomainCount;
    }
    /**
     * Specifies network collocation
     * 
    */
    public String getCollocation() {
        return this.collocation;
    }
    /**
     * Specifies network locality
     * 
    */
    public String getLocality() {
        return this.locality;
    }
    /**
     * Scope specifies the availability domain to which the VMs should be spread.
     * 
    */
    public String getScope() {
        return this.scope;
    }
    /**
     * Specifies instances to hosts placement relationship
     * 
    */
    public String getStyle() {
        return this.style;
    }
    /**
     * Number of vms in this placement group
     * 
    */
    public Integer getVmCount() {
        return this.vmCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyGroupPlacementPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availabilityDomainCount;
        private String collocation;
        private String locality;
        private String scope;
        private String style;
        private Integer vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyGroupPlacementPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.locality = defaults.locality;
    	      this.scope = defaults.scope;
    	      this.style = defaults.style;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder availabilityDomainCount(Integer availabilityDomainCount) {
            this.availabilityDomainCount = Objects.requireNonNull(availabilityDomainCount);
            return this;
        }

        public Builder collocation(String collocation) {
            this.collocation = Objects.requireNonNull(collocation);
            return this;
        }

        public Builder locality(String locality) {
            this.locality = Objects.requireNonNull(locality);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder style(String style) {
            this.style = Objects.requireNonNull(style);
            return this;
        }

        public Builder vmCount(Integer vmCount) {
            this.vmCount = Objects.requireNonNull(vmCount);
            return this;
        }
        public ResourcePolicyGroupPlacementPolicyResponse build() {
            return new ResourcePolicyGroupPlacementPolicyResponse(availabilityDomainCount, collocation, locality, scope, style, vmCount);
        }
    }
}
