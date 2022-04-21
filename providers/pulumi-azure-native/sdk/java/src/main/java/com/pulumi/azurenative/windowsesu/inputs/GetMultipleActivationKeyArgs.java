// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.windowsesu.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMultipleActivationKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMultipleActivationKeyArgs Empty = new GetMultipleActivationKeyArgs();

    /**
     * The name of the MAK key.
     * 
     */
    @Import(name="multipleActivationKeyName", required=true)
    private String multipleActivationKeyName;

    public String multipleActivationKeyName() {
        return this.multipleActivationKeyName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMultipleActivationKeyArgs() {}

    private GetMultipleActivationKeyArgs(GetMultipleActivationKeyArgs $) {
        this.multipleActivationKeyName = $.multipleActivationKeyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMultipleActivationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMultipleActivationKeyArgs $;

        public Builder() {
            $ = new GetMultipleActivationKeyArgs();
        }

        public Builder(GetMultipleActivationKeyArgs defaults) {
            $ = new GetMultipleActivationKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder multipleActivationKeyName(String multipleActivationKeyName) {
            $.multipleActivationKeyName = multipleActivationKeyName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetMultipleActivationKeyArgs build() {
            $.multipleActivationKeyName = Objects.requireNonNull($.multipleActivationKeyName, "expected parameter 'multipleActivationKeyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
