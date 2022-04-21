// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRulesEngineArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRulesEngineArgs Empty = new GetRulesEngineArgs();

    /**
     * Name of the Front Door which is globally unique.
     * 
     */
    @Import(name="frontDoorName", required=true)
    private String frontDoorName;

    public String frontDoorName() {
        return this.frontDoorName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Rules Engine which is unique within the Front Door.
     * 
     */
    @Import(name="rulesEngineName", required=true)
    private String rulesEngineName;

    public String rulesEngineName() {
        return this.rulesEngineName;
    }

    private GetRulesEngineArgs() {}

    private GetRulesEngineArgs(GetRulesEngineArgs $) {
        this.frontDoorName = $.frontDoorName;
        this.resourceGroupName = $.resourceGroupName;
        this.rulesEngineName = $.rulesEngineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRulesEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRulesEngineArgs $;

        public Builder() {
            $ = new GetRulesEngineArgs();
        }

        public Builder(GetRulesEngineArgs defaults) {
            $ = new GetRulesEngineArgs(Objects.requireNonNull(defaults));
        }

        public Builder frontDoorName(String frontDoorName) {
            $.frontDoorName = frontDoorName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder rulesEngineName(String rulesEngineName) {
            $.rulesEngineName = rulesEngineName;
            return this;
        }

        public GetRulesEngineArgs build() {
            $.frontDoorName = Objects.requireNonNull($.frontDoorName, "expected parameter 'frontDoorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.rulesEngineName = Objects.requireNonNull($.rulesEngineName, "expected parameter 'rulesEngineName' to be non-null");
            return $;
        }
    }

}
