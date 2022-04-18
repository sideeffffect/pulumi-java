// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Private Endpoint resource.
 * 
 */
public final class PrivateEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointResponse Empty = new PrivateEndpointResponse();

    /**
     * The ARM identifier for Private Endpoint
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The ARM identifier for Subnet resource that private endpoint links to
     * 
     */
    @Import(name="subnetArmId", required=true)
      private final String subnetArmId;

    public String subnetArmId() {
        return this.subnetArmId;
    }

    public PrivateEndpointResponse(
        String id,
        String subnetArmId) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.subnetArmId = Objects.requireNonNull(subnetArmId, "expected parameter 'subnetArmId' to be non-null");
    }

    private PrivateEndpointResponse() {
        this.id = null;
        this.subnetArmId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String subnetArmId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnetArmId = defaults.subnetArmId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder subnetArmId(String subnetArmId) {
            this.subnetArmId = Objects.requireNonNull(subnetArmId);
            return this;
        }        public PrivateEndpointResponse build() {
            return new PrivateEndpointResponse(id, subnetArmId);
        }
    }
}
