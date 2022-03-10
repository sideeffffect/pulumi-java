// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.outputs.EventTypeTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTypeEntityType {
    private final @Nullable String arn;
    /**
     * The time when the event type was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    private final @Nullable Boolean inline;
    /**
     * The time when the event type was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    private final @Nullable String name;
    /**
     * Tags associated with this event type.
     * 
     */
    private final @Nullable List<EventTypeTag> tags;

    @OutputCustomType.Constructor
    private EventTypeEntityType(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("createdTime") @Nullable String createdTime,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("inline") @Nullable Boolean inline,
        @OutputCustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("tags") @Nullable List<EventTypeTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.inline = inline;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The time when the event type was created.
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> getInline() {
        return Optional.ofNullable(this.inline);
    }
    /**
     * The time when the event type was last updated.
     * 
    */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Tags associated with this event type.
     * 
    */
    public List<EventTypeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTypeEntityType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable Boolean inline;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<EventTypeTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTypeEntityType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.inline = defaults.inline;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder inline(@Nullable Boolean inline) {
            this.inline = inline;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tags(@Nullable List<EventTypeTag> tags) {
            this.tags = tags;
            return this;
        }
        public EventTypeEntityType build() {
            return new EventTypeEntityType(arn, createdTime, description, inline, lastUpdatedTime, name, tags);
        }
    }
}
