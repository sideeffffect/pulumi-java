// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The details of the event associated with a prefix.
 * 
 */
public final class PeeringServicePrefixEventResponse extends com.pulumi.resources.InvokeArgs {

    public static final PeeringServicePrefixEventResponse Empty = new PeeringServicePrefixEventResponse();

    /**
     * The description of the event associated with a prefix.
     * 
     */
    @Import(name="eventDescription", required=true)
    private String eventDescription;

    public String eventDescription() {
        return this.eventDescription;
    }

    /**
     * The level of the event associated with a prefix.
     * 
     */
    @Import(name="eventLevel", required=true)
    private String eventLevel;

    public String eventLevel() {
        return this.eventLevel;
    }

    /**
     * The summary of the event associated with a prefix.
     * 
     */
    @Import(name="eventSummary", required=true)
    private String eventSummary;

    public String eventSummary() {
        return this.eventSummary;
    }

    /**
     * The timestamp of the event associated with a prefix.
     * 
     */
    @Import(name="eventTimestamp", required=true)
    private String eventTimestamp;

    public String eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * The type of the event associated with a prefix.
     * 
     */
    @Import(name="eventType", required=true)
    private String eventType;

    public String eventType() {
        return this.eventType;
    }

    private PeeringServicePrefixEventResponse() {}

    private PeeringServicePrefixEventResponse(PeeringServicePrefixEventResponse $) {
        this.eventDescription = $.eventDescription;
        this.eventLevel = $.eventLevel;
        this.eventSummary = $.eventSummary;
        this.eventTimestamp = $.eventTimestamp;
        this.eventType = $.eventType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringServicePrefixEventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringServicePrefixEventResponse $;

        public Builder() {
            $ = new PeeringServicePrefixEventResponse();
        }

        public Builder(PeeringServicePrefixEventResponse defaults) {
            $ = new PeeringServicePrefixEventResponse(Objects.requireNonNull(defaults));
        }

        public Builder eventDescription(String eventDescription) {
            $.eventDescription = eventDescription;
            return this;
        }

        public Builder eventLevel(String eventLevel) {
            $.eventLevel = eventLevel;
            return this;
        }

        public Builder eventSummary(String eventSummary) {
            $.eventSummary = eventSummary;
            return this;
        }

        public Builder eventTimestamp(String eventTimestamp) {
            $.eventTimestamp = eventTimestamp;
            return this;
        }

        public Builder eventType(String eventType) {
            $.eventType = eventType;
            return this;
        }

        public PeeringServicePrefixEventResponse build() {
            $.eventDescription = Objects.requireNonNull($.eventDescription, "expected parameter 'eventDescription' to be non-null");
            $.eventLevel = Objects.requireNonNull($.eventLevel, "expected parameter 'eventLevel' to be non-null");
            $.eventSummary = Objects.requireNonNull($.eventSummary, "expected parameter 'eventSummary' to be non-null");
            $.eventTimestamp = Objects.requireNonNull($.eventTimestamp, "expected parameter 'eventTimestamp' to be non-null");
            $.eventType = Objects.requireNonNull($.eventType, "expected parameter 'eventType' to be non-null");
            return $;
        }
    }

}
