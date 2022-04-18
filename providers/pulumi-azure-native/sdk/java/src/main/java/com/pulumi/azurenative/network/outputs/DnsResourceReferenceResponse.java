// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DnsResourceReferenceResponse {
    /**
     * A list of dns Records
     * 
     */
    private final @Nullable List<SubResourceResponse> dnsResources;
    /**
     * A reference to an azure resource from where the dns resource value is taken.
     * 
     */
    private final @Nullable SubResourceResponse targetResource;

    @CustomType.Constructor
    private DnsResourceReferenceResponse(
        @CustomType.Parameter("dnsResources") @Nullable List<SubResourceResponse> dnsResources,
        @CustomType.Parameter("targetResource") @Nullable SubResourceResponse targetResource) {
        this.dnsResources = dnsResources;
        this.targetResource = targetResource;
    }

    /**
     * A list of dns Records
     * 
    */
    public List<SubResourceResponse> dnsResources() {
        return this.dnsResources == null ? List.of() : this.dnsResources;
    }
    /**
     * A reference to an azure resource from where the dns resource value is taken.
     * 
    */
    public Optional<SubResourceResponse> targetResource() {
        return Optional.ofNullable(this.targetResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsResourceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubResourceResponse> dnsResources;
        private @Nullable SubResourceResponse targetResource;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsResourceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsResources = defaults.dnsResources;
    	      this.targetResource = defaults.targetResource;
        }

        public Builder dnsResources(@Nullable List<SubResourceResponse> dnsResources) {
            this.dnsResources = dnsResources;
            return this;
        }
        public Builder dnsResources(SubResourceResponse... dnsResources) {
            return dnsResources(List.of(dnsResources));
        }
        public Builder targetResource(@Nullable SubResourceResponse targetResource) {
            this.targetResource = targetResource;
            return this;
        }        public DnsResourceReferenceResponse build() {
            return new DnsResourceReferenceResponse(dnsResources, targetResource);
        }
    }
}
