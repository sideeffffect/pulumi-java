// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.inputs;

import io.pulumi.aws.cloudtrail.inputs.TrailEventSelectorDataResourceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailEventSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailEventSelectorGetArgs Empty = new TrailEventSelectorGetArgs();

    /**
     * Configuration block for data events. See details below.
     * 
     */
    @Import(name="dataResources")
      private final @Nullable Output<List<TrailEventSelectorDataResourceGetArgs>> dataResources;

    public Output<List<TrailEventSelectorDataResourceGetArgs>> dataResources() {
        return this.dataResources == null ? Codegen.empty() : this.dataResources;
    }

    /**
     * A set of event sources to exclude. Valid values include: `kms.amazonaws.com` and `rdsdata.amazonaws.com`. `include_management_events` must be set to`true` to allow this.
     * 
     */
    @Import(name="excludeManagementEventSources")
      private final @Nullable Output<List<String>> excludeManagementEventSources;

    public Output<List<String>> excludeManagementEventSources() {
        return this.excludeManagementEventSources == null ? Codegen.empty() : this.excludeManagementEventSources;
    }

    /**
     * Whether to include management events for your trail. Defaults to `true`.
     * 
     */
    @Import(name="includeManagementEvents")
      private final @Nullable Output<Boolean> includeManagementEvents;

    public Output<Boolean> includeManagementEvents() {
        return this.includeManagementEvents == null ? Codegen.empty() : this.includeManagementEvents;
    }

    /**
     * Type of events to log. Valid values are `ReadOnly`, `WriteOnly`, `All`. Default value is `All`.
     * 
     */
    @Import(name="readWriteType")
      private final @Nullable Output<String> readWriteType;

    public Output<String> readWriteType() {
        return this.readWriteType == null ? Codegen.empty() : this.readWriteType;
    }

    public TrailEventSelectorGetArgs(
        @Nullable Output<List<TrailEventSelectorDataResourceGetArgs>> dataResources,
        @Nullable Output<List<String>> excludeManagementEventSources,
        @Nullable Output<Boolean> includeManagementEvents,
        @Nullable Output<String> readWriteType) {
        this.dataResources = dataResources;
        this.excludeManagementEventSources = excludeManagementEventSources;
        this.includeManagementEvents = includeManagementEvents;
        this.readWriteType = readWriteType;
    }

    private TrailEventSelectorGetArgs() {
        this.dataResources = Codegen.empty();
        this.excludeManagementEventSources = Codegen.empty();
        this.includeManagementEvents = Codegen.empty();
        this.readWriteType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TrailEventSelectorDataResourceGetArgs>> dataResources;
        private @Nullable Output<List<String>> excludeManagementEventSources;
        private @Nullable Output<Boolean> includeManagementEvents;
        private @Nullable Output<String> readWriteType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailEventSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataResources = defaults.dataResources;
    	      this.excludeManagementEventSources = defaults.excludeManagementEventSources;
    	      this.includeManagementEvents = defaults.includeManagementEvents;
    	      this.readWriteType = defaults.readWriteType;
        }

        public Builder dataResources(@Nullable Output<List<TrailEventSelectorDataResourceGetArgs>> dataResources) {
            this.dataResources = dataResources;
            return this;
        }
        public Builder dataResources(@Nullable List<TrailEventSelectorDataResourceGetArgs> dataResources) {
            this.dataResources = Codegen.ofNullable(dataResources);
            return this;
        }
        public Builder dataResources(TrailEventSelectorDataResourceGetArgs... dataResources) {
            return dataResources(List.of(dataResources));
        }
        public Builder excludeManagementEventSources(@Nullable Output<List<String>> excludeManagementEventSources) {
            this.excludeManagementEventSources = excludeManagementEventSources;
            return this;
        }
        public Builder excludeManagementEventSources(@Nullable List<String> excludeManagementEventSources) {
            this.excludeManagementEventSources = Codegen.ofNullable(excludeManagementEventSources);
            return this;
        }
        public Builder excludeManagementEventSources(String... excludeManagementEventSources) {
            return excludeManagementEventSources(List.of(excludeManagementEventSources));
        }
        public Builder includeManagementEvents(@Nullable Output<Boolean> includeManagementEvents) {
            this.includeManagementEvents = includeManagementEvents;
            return this;
        }
        public Builder includeManagementEvents(@Nullable Boolean includeManagementEvents) {
            this.includeManagementEvents = Codegen.ofNullable(includeManagementEvents);
            return this;
        }
        public Builder readWriteType(@Nullable Output<String> readWriteType) {
            this.readWriteType = readWriteType;
            return this;
        }
        public Builder readWriteType(@Nullable String readWriteType) {
            this.readWriteType = Codegen.ofNullable(readWriteType);
            return this;
        }        public TrailEventSelectorGetArgs build() {
            return new TrailEventSelectorGetArgs(dataResources, excludeManagementEventSources, includeManagementEvents, readWriteType);
        }
    }
}
