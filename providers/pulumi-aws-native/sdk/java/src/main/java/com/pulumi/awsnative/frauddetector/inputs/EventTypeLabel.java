// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector.inputs;

import com.pulumi.awsnative.frauddetector.inputs.EventTypeTag;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTypeLabel extends com.pulumi.resources.InvokeArgs {

    public static final EventTypeLabel Empty = new EventTypeLabel();

    @Import(name="arn")
    private @Nullable String arn;

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The time when the event type was created.
     * 
     */
    @Import(name="createdTime")
    private @Nullable String createdTime;

    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="inline")
    private @Nullable Boolean inline;

    public Optional<Boolean> inline() {
        return Optional.ofNullable(this.inline);
    }

    /**
     * The time when the event type was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
    private @Nullable String lastUpdatedTime;

    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this event type.
     * 
     */
    @Import(name="tags")
    private @Nullable List<EventTypeTag> tags;

    public Optional<List<EventTypeTag>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EventTypeLabel() {}

    private EventTypeLabel(EventTypeLabel $) {
        this.arn = $.arn;
        this.createdTime = $.createdTime;
        this.description = $.description;
        this.inline = $.inline;
        this.lastUpdatedTime = $.lastUpdatedTime;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTypeLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTypeLabel $;

        public Builder() {
            $ = new EventTypeLabel();
        }

        public Builder(EventTypeLabel defaults) {
            $ = new EventTypeLabel(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            $.createdTime = createdTime;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder inline(@Nullable Boolean inline) {
            $.inline = inline;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            $.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable List<EventTypeTag> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(EventTypeTag... tags) {
            return tags(List.of(tags));
        }

        public EventTypeLabel build() {
            return $;
        }
    }

}
