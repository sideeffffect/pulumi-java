// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventSourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventSourceArgs Empty = new GetEventSourceArgs();

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
    private Output<String> environmentName;

    /**
     * @return The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    public Output<String> environmentName() {
        return this.environmentName;
    }

    /**
     * The name of the Time Series Insights event source associated with the specified environment.
     * 
     */
    @Import(name="eventSourceName", required=true)
    private Output<String> eventSourceName;

    /**
     * @return The name of the Time Series Insights event source associated with the specified environment.
     * 
     */
    public Output<String> eventSourceName() {
        return this.eventSourceName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetEventSourceArgs() {}

    private GetEventSourceArgs(GetEventSourceArgs $) {
        this.environmentName = $.environmentName;
        this.eventSourceName = $.eventSourceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventSourceArgs $;

        public Builder() {
            $ = new GetEventSourceArgs();
        }

        public Builder(GetEventSourceArgs defaults) {
            $ = new GetEventSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        /**
         * @param eventSourceName The name of the Time Series Insights event source associated with the specified environment.
         * 
         * @return builder
         * 
         */
        public Builder eventSourceName(Output<String> eventSourceName) {
            $.eventSourceName = eventSourceName;
            return this;
        }

        /**
         * @param eventSourceName The name of the Time Series Insights event source associated with the specified environment.
         * 
         * @return builder
         * 
         */
        public Builder eventSourceName(String eventSourceName) {
            return eventSourceName(Output.of(eventSourceName));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetEventSourceArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.eventSourceName = Objects.requireNonNull($.eventSourceName, "expected parameter 'eventSourceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
