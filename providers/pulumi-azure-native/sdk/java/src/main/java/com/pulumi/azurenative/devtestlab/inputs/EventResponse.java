// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An event to be notified for.
 * 
 */
public final class EventResponse extends com.pulumi.resources.InvokeArgs {

    public static final EventResponse Empty = new EventResponse();

    /**
     * The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
     * 
     */
    @Import(name="eventName")
      private final @Nullable String eventName;

    public Optional<String> eventName() {
        return this.eventName == null ? Optional.empty() : Optional.ofNullable(this.eventName);
    }

    public EventResponse(@Nullable String eventName) {
        this.eventName = eventName;
    }

    private EventResponse() {
        this.eventName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventName = defaults.eventName;
        }

        public Builder eventName(@Nullable String eventName) {
            this.eventName = eventName;
            return this;
        }        public EventResponse build() {
            return new EventResponse(eventName);
        }
    }
}
