// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudChannelV1AssociationInfoResponse {
    /**
     * The name of the base entitlement, for which this entitlement is an add-on.
     * 
     */
    private final String baseEntitlement;

    @OutputCustomType.Constructor
    private GoogleCloudChannelV1AssociationInfoResponse(@OutputCustomType.Parameter("baseEntitlement") String baseEntitlement) {
        this.baseEntitlement = baseEntitlement;
    }

    /**
     * The name of the base entitlement, for which this entitlement is an add-on.
     * 
    */
    public String getBaseEntitlement() {
        return this.baseEntitlement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1AssociationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseEntitlement;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1AssociationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEntitlement = defaults.baseEntitlement;
        }

        public Builder baseEntitlement(String baseEntitlement) {
            this.baseEntitlement = Objects.requireNonNull(baseEntitlement);
            return this;
        }
        public GoogleCloudChannelV1AssociationInfoResponse build() {
            return new GoogleCloudChannelV1AssociationInfoResponse(baseEntitlement);
        }
    }
}
