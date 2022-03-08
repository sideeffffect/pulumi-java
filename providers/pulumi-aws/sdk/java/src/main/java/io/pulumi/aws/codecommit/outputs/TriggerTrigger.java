// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerTrigger {
    /**
     * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
     * 
     */
    private final @Nullable List<String> branches;
    /**
     * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
     * 
     */
    private final @Nullable String customData;
    /**
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
     * 
     */
    private final String destinationArn;
    /**
     * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
     * 
     */
    private final List<String> events;
    /**
     * The name of the trigger.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"branches","customData","destinationArn","events","name"})
    private TriggerTrigger(
        @Nullable List<String> branches,
        @Nullable String customData,
        String destinationArn,
        List<String> events,
        String name) {
        this.branches = branches;
        this.customData = customData;
        this.destinationArn = destinationArn;
        this.events = events;
        this.name = name;
    }

    /**
     * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
     * 
    */
    public List<String> getBranches() {
        return this.branches == null ? List.of() : this.branches;
    }
    /**
     * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
     * 
    */
    public Optional<String> getCustomData() {
        return Optional.ofNullable(this.customData);
    }
    /**
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
     * 
    */
    public String getDestinationArn() {
        return this.destinationArn;
    }
    /**
     * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
     * 
    */
    public List<String> getEvents() {
        return this.events;
    }
    /**
     * The name of the trigger.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> branches;
        private @Nullable String customData;
        private String destinationArn;
        private List<String> events;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branches = defaults.branches;
    	      this.customData = defaults.customData;
    	      this.destinationArn = defaults.destinationArn;
    	      this.events = defaults.events;
    	      this.name = defaults.name;
        }

        public Builder setBranches(@Nullable List<String> branches) {
            this.branches = branches;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }

        public Builder setDestinationArn(String destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder setEvents(List<String> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public TriggerTrigger build() {
            return new TriggerTrigger(branches, customData, destinationArn, events, name);
        }
    }
}
