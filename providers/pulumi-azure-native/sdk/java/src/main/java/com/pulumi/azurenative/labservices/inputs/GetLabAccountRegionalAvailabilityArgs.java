// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLabAccountRegionalAvailabilityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLabAccountRegionalAvailabilityArgs Empty = new GetLabAccountRegionalAvailabilityArgs();

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
    private String labAccountName;

    public String labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLabAccountRegionalAvailabilityArgs() {}

    private GetLabAccountRegionalAvailabilityArgs(GetLabAccountRegionalAvailabilityArgs $) {
        this.labAccountName = $.labAccountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLabAccountRegionalAvailabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLabAccountRegionalAvailabilityArgs $;

        public Builder() {
            $ = new GetLabAccountRegionalAvailabilityArgs();
        }

        public Builder(GetLabAccountRegionalAvailabilityArgs defaults) {
            $ = new GetLabAccountRegionalAvailabilityArgs(Objects.requireNonNull(defaults));
        }

        public Builder labAccountName(String labAccountName) {
            $.labAccountName = labAccountName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetLabAccountRegionalAvailabilityArgs build() {
            $.labAccountName = Objects.requireNonNull($.labAccountName, "expected parameter 'labAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
