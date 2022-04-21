// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ManagementAssociation properties supported by the OperationsManagement resource provider.
 * 
 */
public final class ManagementAssociationPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagementAssociationPropertiesResponse Empty = new ManagementAssociationPropertiesResponse();

    /**
     * The applicationId of the appliance for this association.
     * 
     */
    @Import(name="applicationId", required=true)
    private String applicationId;

    public String applicationId() {
        return this.applicationId;
    }

    private ManagementAssociationPropertiesResponse() {}

    private ManagementAssociationPropertiesResponse(ManagementAssociationPropertiesResponse $) {
        this.applicationId = $.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementAssociationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementAssociationPropertiesResponse $;

        public Builder() {
            $ = new ManagementAssociationPropertiesResponse();
        }

        public Builder(ManagementAssociationPropertiesResponse defaults) {
            $ = new ManagementAssociationPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder applicationId(String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public ManagementAssociationPropertiesResponse build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            return $;
        }
    }

}
