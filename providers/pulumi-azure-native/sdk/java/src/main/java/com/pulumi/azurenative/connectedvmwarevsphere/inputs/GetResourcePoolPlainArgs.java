// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePoolPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePoolPlainArgs Empty = new GetResourcePoolPlainArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the resourcePool.
     * 
     */
    @Import(name="resourcePoolName", required=true)
    private String resourcePoolName;

    /**
     * @return Name of the resourcePool.
     * 
     */
    public String resourcePoolName() {
        return this.resourcePoolName;
    }

    private GetResourcePoolPlainArgs() {}

    private GetResourcePoolPlainArgs(GetResourcePoolPlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourcePoolName = $.resourcePoolName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcePoolPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcePoolPlainArgs $;

        public Builder() {
            $ = new GetResourcePoolPlainArgs();
        }

        public Builder(GetResourcePoolPlainArgs defaults) {
            $ = new GetResourcePoolPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourcePoolName Name of the resourcePool.
         * 
         * @return builder
         * 
         */
        public Builder resourcePoolName(String resourcePoolName) {
            $.resourcePoolName = resourcePoolName;
            return this;
        }

        public GetResourcePoolPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourcePoolName = Objects.requireNonNull($.resourcePoolName, "expected parameter 'resourcePoolName' to be non-null");
            return $;
        }
    }

}
