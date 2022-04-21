// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHubArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHubArgs Empty = new GetHubArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private String hubName;

    public String hubName() {
        return this.hubName;
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

    private GetHubArgs() {}

    private GetHubArgs(GetHubArgs $) {
        this.hubName = $.hubName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHubArgs $;

        public Builder() {
            $ = new GetHubArgs();
        }

        public Builder(GetHubArgs defaults) {
            $ = new GetHubArgs(Objects.requireNonNull(defaults));
        }

        public Builder hubName(String hubName) {
            $.hubName = hubName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetHubArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
