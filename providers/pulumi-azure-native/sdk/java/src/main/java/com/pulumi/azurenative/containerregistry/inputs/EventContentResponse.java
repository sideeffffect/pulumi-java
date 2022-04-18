// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.ActorResponse;
import com.pulumi.azurenative.containerregistry.inputs.RequestResponse;
import com.pulumi.azurenative.containerregistry.inputs.SourceResponse;
import com.pulumi.azurenative.containerregistry.inputs.TargetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The content of the event request message.
 * 
 */
public final class EventContentResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventContentResponse Empty = new EventContentResponse();

    /**
     * The action that encompasses the provided event.
     * 
     */
    @Import(name="action")
      private final @Nullable String action;

    public Optional<String> action() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * The agent that initiated the event. For most situations, this could be from the authorization context of the request.
     * 
     */
    @Import(name="actor")
      private final @Nullable ActorResponse actor;

    public Optional<ActorResponse> actor() {
        return this.actor == null ? Optional.empty() : Optional.ofNullable(this.actor);
    }

    /**
     * The event ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The request that generated the event.
     * 
     */
    @Import(name="request")
      private final @Nullable RequestResponse request;

    public Optional<RequestResponse> request() {
        return this.request == null ? Optional.empty() : Optional.ofNullable(this.request);
    }

    /**
     * The registry node that generated the event. Put differently, while the actor initiates the event, the source generates it.
     * 
     */
    @Import(name="source")
      private final @Nullable SourceResponse source;

    public Optional<SourceResponse> source() {
        return this.source == null ? Optional.empty() : Optional.ofNullable(this.source);
    }

    /**
     * The target of the event.
     * 
     */
    @Import(name="target")
      private final @Nullable TargetResponse target;

    public Optional<TargetResponse> target() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    /**
     * The time at which the event occurred.
     * 
     */
    @Import(name="timestamp")
      private final @Nullable String timestamp;

    public Optional<String> timestamp() {
        return this.timestamp == null ? Optional.empty() : Optional.ofNullable(this.timestamp);
    }

    public EventContentResponse(
        @Nullable String action,
        @Nullable ActorResponse actor,
        @Nullable String id,
        @Nullable RequestResponse request,
        @Nullable SourceResponse source,
        @Nullable TargetResponse target,
        @Nullable String timestamp) {
        this.action = action;
        this.actor = actor;
        this.id = id;
        this.request = request;
        this.source = source;
        this.target = target;
        this.timestamp = timestamp;
    }

    private EventContentResponse() {
        this.action = null;
        this.actor = null;
        this.id = null;
        this.request = null;
        this.source = null;
        this.target = null;
        this.timestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable ActorResponse actor;
        private @Nullable String id;
        private @Nullable RequestResponse request;
        private @Nullable SourceResponse source;
        private @Nullable TargetResponse target;
        private @Nullable String timestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(EventContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actor = defaults.actor;
    	      this.id = defaults.id;
    	      this.request = defaults.request;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.timestamp = defaults.timestamp;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder actor(@Nullable ActorResponse actor) {
            this.actor = actor;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder request(@Nullable RequestResponse request) {
            this.request = request;
            return this;
        }
        public Builder source(@Nullable SourceResponse source) {
            this.source = source;
            return this;
        }
        public Builder target(@Nullable TargetResponse target) {
            this.target = target;
            return this;
        }
        public Builder timestamp(@Nullable String timestamp) {
            this.timestamp = timestamp;
            return this;
        }        public EventContentResponse build() {
            return new EventContentResponse(action, actor, id, request, source, target, timestamp);
        }
    }
}
