// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceActionAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceActionAssociationArgs Empty = new GetServiceActionAssociationArgs();

    @Import(name="productId", required=true)
    private String productId;

    public String productId() {
        return this.productId;
    }

    @Import(name="provisioningArtifactId", required=true)
    private String provisioningArtifactId;

    public String provisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    @Import(name="serviceActionId", required=true)
    private String serviceActionId;

    public String serviceActionId() {
        return this.serviceActionId;
    }

    private GetServiceActionAssociationArgs() {}

    private GetServiceActionAssociationArgs(GetServiceActionAssociationArgs $) {
        this.productId = $.productId;
        this.provisioningArtifactId = $.provisioningArtifactId;
        this.serviceActionId = $.serviceActionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceActionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceActionAssociationArgs $;

        public Builder() {
            $ = new GetServiceActionAssociationArgs();
        }

        public Builder(GetServiceActionAssociationArgs defaults) {
            $ = new GetServiceActionAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder productId(String productId) {
            $.productId = productId;
            return this;
        }

        public Builder provisioningArtifactId(String provisioningArtifactId) {
            $.provisioningArtifactId = provisioningArtifactId;
            return this;
        }

        public Builder serviceActionId(String serviceActionId) {
            $.serviceActionId = serviceActionId;
            return this;
        }

        public GetServiceActionAssociationArgs build() {
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            $.provisioningArtifactId = Objects.requireNonNull($.provisioningArtifactId, "expected parameter 'provisioningArtifactId' to be non-null");
            $.serviceActionId = Objects.requireNonNull($.serviceActionId, "expected parameter 'serviceActionId' to be non-null");
            return $;
        }
    }

}
