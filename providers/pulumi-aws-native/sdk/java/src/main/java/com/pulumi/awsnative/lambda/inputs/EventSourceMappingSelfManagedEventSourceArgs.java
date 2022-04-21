// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.awsnative.lambda.inputs.EventSourceMappingEndpointsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration used by AWS Lambda to access a self-managed event source.
 * 
 */
public final class EventSourceMappingSelfManagedEventSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingSelfManagedEventSourceArgs Empty = new EventSourceMappingSelfManagedEventSourceArgs();

    /**
     * The endpoints for a self-managed event source.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<EventSourceMappingEndpointsArgs> endpoints;

    public Optional<Output<EventSourceMappingEndpointsArgs>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    private EventSourceMappingSelfManagedEventSourceArgs() {}

    private EventSourceMappingSelfManagedEventSourceArgs(EventSourceMappingSelfManagedEventSourceArgs $) {
        this.endpoints = $.endpoints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSourceMappingSelfManagedEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSourceMappingSelfManagedEventSourceArgs $;

        public Builder() {
            $ = new EventSourceMappingSelfManagedEventSourceArgs();
        }

        public Builder(EventSourceMappingSelfManagedEventSourceArgs defaults) {
            $ = new EventSourceMappingSelfManagedEventSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpoints(@Nullable Output<EventSourceMappingEndpointsArgs> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(EventSourceMappingEndpointsArgs endpoints) {
            return endpoints(Output.of(endpoints));
        }

        public EventSourceMappingSelfManagedEventSourceArgs build() {
            return $;
        }
    }

}
