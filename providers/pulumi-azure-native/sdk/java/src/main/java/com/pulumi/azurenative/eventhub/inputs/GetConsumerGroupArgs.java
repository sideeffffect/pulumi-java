// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConsumerGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsumerGroupArgs Empty = new GetConsumerGroupArgs();

    /**
     * The consumer group name
     * 
     */
    @Import(name="consumerGroupName", required=true)
    private String consumerGroupName;

    public String consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * The Event Hub name
     * 
     */
    @Import(name="eventHubName", required=true)
    private String eventHubName;

    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetConsumerGroupArgs() {}

    private GetConsumerGroupArgs(GetConsumerGroupArgs $) {
        this.consumerGroupName = $.consumerGroupName;
        this.eventHubName = $.eventHubName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsumerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsumerGroupArgs $;

        public Builder() {
            $ = new GetConsumerGroupArgs();
        }

        public Builder(GetConsumerGroupArgs defaults) {
            $ = new GetConsumerGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder consumerGroupName(String consumerGroupName) {
            $.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder eventHubName(String eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetConsumerGroupArgs build() {
            $.consumerGroupName = Objects.requireNonNull($.consumerGroupName, "expected parameter 'consumerGroupName' to be non-null");
            $.eventHubName = Objects.requireNonNull($.eventHubName, "expected parameter 'eventHubName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
