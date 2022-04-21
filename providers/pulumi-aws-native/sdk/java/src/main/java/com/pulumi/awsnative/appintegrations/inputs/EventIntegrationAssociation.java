// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appintegrations.inputs;

import com.pulumi.awsnative.appintegrations.inputs.EventIntegrationMetadata;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventIntegrationAssociation extends com.pulumi.resources.InvokeArgs {

    public static final EventIntegrationAssociation Empty = new EventIntegrationAssociation();

    /**
     * The metadata associated with the client.
     * 
     */
    @Import(name="clientAssociationMetadata")
    private @Nullable List<EventIntegrationMetadata> clientAssociationMetadata;

    public Optional<List<EventIntegrationMetadata>> clientAssociationMetadata() {
        return Optional.ofNullable(this.clientAssociationMetadata);
    }

    /**
     * The identifier for the client that is associated with the event integration.
     * 
     */
    @Import(name="clientId")
    private @Nullable String clientId;

    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The name of the Eventbridge rule.
     * 
     */
    @Import(name="eventBridgeRuleName")
    private @Nullable String eventBridgeRuleName;

    public Optional<String> eventBridgeRuleName() {
        return Optional.ofNullable(this.eventBridgeRuleName);
    }

    /**
     * The Amazon Resource Name (ARN) for the event integration association.
     * 
     */
    @Import(name="eventIntegrationAssociationArn")
    private @Nullable String eventIntegrationAssociationArn;

    public Optional<String> eventIntegrationAssociationArn() {
        return Optional.ofNullable(this.eventIntegrationAssociationArn);
    }

    /**
     * The identifier for the event integration association.
     * 
     */
    @Import(name="eventIntegrationAssociationId")
    private @Nullable String eventIntegrationAssociationId;

    public Optional<String> eventIntegrationAssociationId() {
        return Optional.ofNullable(this.eventIntegrationAssociationId);
    }

    private EventIntegrationAssociation() {}

    private EventIntegrationAssociation(EventIntegrationAssociation $) {
        this.clientAssociationMetadata = $.clientAssociationMetadata;
        this.clientId = $.clientId;
        this.eventBridgeRuleName = $.eventBridgeRuleName;
        this.eventIntegrationAssociationArn = $.eventIntegrationAssociationArn;
        this.eventIntegrationAssociationId = $.eventIntegrationAssociationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventIntegrationAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventIntegrationAssociation $;

        public Builder() {
            $ = new EventIntegrationAssociation();
        }

        public Builder(EventIntegrationAssociation defaults) {
            $ = new EventIntegrationAssociation(Objects.requireNonNull(defaults));
        }

        public Builder clientAssociationMetadata(@Nullable List<EventIntegrationMetadata> clientAssociationMetadata) {
            $.clientAssociationMetadata = clientAssociationMetadata;
            return this;
        }

        public Builder clientAssociationMetadata(EventIntegrationMetadata... clientAssociationMetadata) {
            return clientAssociationMetadata(List.of(clientAssociationMetadata));
        }

        public Builder clientId(@Nullable String clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder eventBridgeRuleName(@Nullable String eventBridgeRuleName) {
            $.eventBridgeRuleName = eventBridgeRuleName;
            return this;
        }

        public Builder eventIntegrationAssociationArn(@Nullable String eventIntegrationAssociationArn) {
            $.eventIntegrationAssociationArn = eventIntegrationAssociationArn;
            return this;
        }

        public Builder eventIntegrationAssociationId(@Nullable String eventIntegrationAssociationId) {
            $.eventIntegrationAssociationId = eventIntegrationAssociationId;
            return this;
        }

        public EventIntegrationAssociation build() {
            return $;
        }
    }

}
