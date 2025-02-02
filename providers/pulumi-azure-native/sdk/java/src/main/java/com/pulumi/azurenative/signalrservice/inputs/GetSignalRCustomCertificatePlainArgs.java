// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSignalRCustomCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSignalRCustomCertificatePlainArgs Empty = new GetSignalRCustomCertificatePlainArgs();

    /**
     * Custom certificate name
     * 
     */
    @Import(name="certificateName", required=true)
    private String certificateName;

    /**
     * @return Custom certificate name
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetSignalRCustomCertificatePlainArgs() {}

    private GetSignalRCustomCertificatePlainArgs(GetSignalRCustomCertificatePlainArgs $) {
        this.certificateName = $.certificateName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSignalRCustomCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSignalRCustomCertificatePlainArgs $;

        public Builder() {
            $ = new GetSignalRCustomCertificatePlainArgs();
        }

        public Builder(GetSignalRCustomCertificatePlainArgs defaults) {
            $ = new GetSignalRCustomCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName Custom certificate name
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetSignalRCustomCertificatePlainArgs build() {
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
