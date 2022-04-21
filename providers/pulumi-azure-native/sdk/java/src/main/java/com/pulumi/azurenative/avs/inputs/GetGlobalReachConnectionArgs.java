// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalReachConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalReachConnectionArgs Empty = new GetGlobalReachConnectionArgs();

    /**
     * Name of the global reach connection in the private cloud
     * 
     */
    @Import(name="globalReachConnectionName", required=true)
    private String globalReachConnectionName;

    public String globalReachConnectionName() {
        return this.globalReachConnectionName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private String privateCloudName;

    public String privateCloudName() {
        return this.privateCloudName;
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

    private GetGlobalReachConnectionArgs() {}

    private GetGlobalReachConnectionArgs(GetGlobalReachConnectionArgs $) {
        this.globalReachConnectionName = $.globalReachConnectionName;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalReachConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalReachConnectionArgs $;

        public Builder() {
            $ = new GetGlobalReachConnectionArgs();
        }

        public Builder(GetGlobalReachConnectionArgs defaults) {
            $ = new GetGlobalReachConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder globalReachConnectionName(String globalReachConnectionName) {
            $.globalReachConnectionName = globalReachConnectionName;
            return this;
        }

        public Builder privateCloudName(String privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetGlobalReachConnectionArgs build() {
            $.globalReachConnectionName = Objects.requireNonNull($.globalReachConnectionName, "expected parameter 'globalReachConnectionName' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
