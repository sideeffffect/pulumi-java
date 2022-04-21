// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache;

import com.pulumi.azurenative.cache.inputs.ScheduleEntryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchScheduleArgs Empty = new PatchScheduleArgs();

    /**
     * Default string modeled as parameter for auto generation to work correctly.
     * 
     */
    @Import(name="default")
    private @Nullable Output<String> default_;

    public Optional<Output<String>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * The name of the Redis cache.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * List of patch schedules for a Redis cache.
     * 
     */
    @Import(name="scheduleEntries", required=true)
    private Output<List<ScheduleEntryArgs>> scheduleEntries;

    public Output<List<ScheduleEntryArgs>> scheduleEntries() {
        return this.scheduleEntries;
    }

    private PatchScheduleArgs() {}

    private PatchScheduleArgs(PatchScheduleArgs $) {
        this.default_ = $.default_;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scheduleEntries = $.scheduleEntries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchScheduleArgs $;

        public Builder() {
            $ = new PatchScheduleArgs();
        }

        public Builder(PatchScheduleArgs defaults) {
            $ = new PatchScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder scheduleEntries(Output<List<ScheduleEntryArgs>> scheduleEntries) {
            $.scheduleEntries = scheduleEntries;
            return this;
        }

        public Builder scheduleEntries(List<ScheduleEntryArgs> scheduleEntries) {
            return scheduleEntries(Output.of(scheduleEntries));
        }

        public Builder scheduleEntries(ScheduleEntryArgs... scheduleEntries) {
            return scheduleEntries(List.of(scheduleEntries));
        }

        public PatchScheduleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scheduleEntries = Objects.requireNonNull($.scheduleEntries, "expected parameter 'scheduleEntries' to be non-null");
            return $;
        }
    }

}
