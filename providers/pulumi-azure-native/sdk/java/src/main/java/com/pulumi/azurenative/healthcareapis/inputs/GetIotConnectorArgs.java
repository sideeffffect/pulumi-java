// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIotConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIotConnectorArgs Empty = new GetIotConnectorArgs();

    /**
     * The name of IoT Connector resource.
     * 
     */
    @Import(name="iotConnectorName", required=true)
    private String iotConnectorName;

    public String iotConnectorName() {
        return this.iotConnectorName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of workspace resource.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    public String workspaceName() {
        return this.workspaceName;
    }

    private GetIotConnectorArgs() {}

    private GetIotConnectorArgs(GetIotConnectorArgs $) {
        this.iotConnectorName = $.iotConnectorName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIotConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIotConnectorArgs $;

        public Builder() {
            $ = new GetIotConnectorArgs();
        }

        public Builder(GetIotConnectorArgs defaults) {
            $ = new GetIotConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder iotConnectorName(String iotConnectorName) {
            $.iotConnectorName = iotConnectorName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetIotConnectorArgs build() {
            $.iotConnectorName = Objects.requireNonNull($.iotConnectorName, "expected parameter 'iotConnectorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
