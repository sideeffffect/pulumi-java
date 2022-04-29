// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena;

import com.pulumi.awsnative.athena.enums.WorkGroupState;
import com.pulumi.awsnative.athena.inputs.WorkGroupConfigurationArgs;
import com.pulumi.awsnative.athena.inputs.WorkGroupConfigurationUpdatesArgs;
import com.pulumi.awsnative.athena.inputs.WorkGroupTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkGroupArgs extends ResourceArgs {

    public static final WorkGroupArgs Empty = new WorkGroupArgs();

    /**
     * The workgroup description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The workgroup description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The workGroup name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The workGroup name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    @Import(name="recursiveDeleteOption")
    private @Nullable Output<Boolean> recursiveDeleteOption;

    /**
     * @return The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    public Optional<Output<Boolean>> recursiveDeleteOption() {
        return Optional.ofNullable(this.recursiveDeleteOption);
    }

    /**
     * The state of the workgroup: ENABLED or DISABLED.
     * 
     */
    @Import(name="state")
    private @Nullable Output<WorkGroupState> state;

    /**
     * @return The state of the workgroup: ENABLED or DISABLED.
     * 
     */
    public Optional<Output<WorkGroupState>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * One or more tags, separated by commas, that you want to attach to the workgroup as you create it
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<WorkGroupTagArgs>> tags;

    /**
     * @return One or more tags, separated by commas, that you want to attach to the workgroup as you create it
     * 
     */
    public Optional<Output<List<WorkGroupTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The workgroup configuration
     * 
     */
    @Import(name="workGroupConfiguration")
    private @Nullable Output<WorkGroupConfigurationArgs> workGroupConfiguration;

    /**
     * @return The workgroup configuration
     * 
     */
    public Optional<Output<WorkGroupConfigurationArgs>> workGroupConfiguration() {
        return Optional.ofNullable(this.workGroupConfiguration);
    }

    /**
     * The workgroup configuration update object
     * 
     */
    @Import(name="workGroupConfigurationUpdates")
    private @Nullable Output<WorkGroupConfigurationUpdatesArgs> workGroupConfigurationUpdates;

    /**
     * @return The workgroup configuration update object
     * 
     */
    public Optional<Output<WorkGroupConfigurationUpdatesArgs>> workGroupConfigurationUpdates() {
        return Optional.ofNullable(this.workGroupConfigurationUpdates);
    }

    private WorkGroupArgs() {}

    private WorkGroupArgs(WorkGroupArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.recursiveDeleteOption = $.recursiveDeleteOption;
        this.state = $.state;
        this.tags = $.tags;
        this.workGroupConfiguration = $.workGroupConfiguration;
        this.workGroupConfigurationUpdates = $.workGroupConfigurationUpdates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkGroupArgs $;

        public Builder() {
            $ = new WorkGroupArgs();
        }

        public Builder(WorkGroupArgs defaults) {
            $ = new WorkGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The workgroup description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The workgroup description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The workGroup name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The workGroup name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recursiveDeleteOption The option to delete the workgroup and its contents even if the workgroup contains any named queries.
         * 
         * @return builder
         * 
         */
        public Builder recursiveDeleteOption(@Nullable Output<Boolean> recursiveDeleteOption) {
            $.recursiveDeleteOption = recursiveDeleteOption;
            return this;
        }

        /**
         * @param recursiveDeleteOption The option to delete the workgroup and its contents even if the workgroup contains any named queries.
         * 
         * @return builder
         * 
         */
        public Builder recursiveDeleteOption(Boolean recursiveDeleteOption) {
            return recursiveDeleteOption(Output.of(recursiveDeleteOption));
        }

        /**
         * @param state The state of the workgroup: ENABLED or DISABLED.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<WorkGroupState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the workgroup: ENABLED or DISABLED.
         * 
         * @return builder
         * 
         */
        public Builder state(WorkGroupState state) {
            return state(Output.of(state));
        }

        /**
         * @param tags One or more tags, separated by commas, that you want to attach to the workgroup as you create it
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<WorkGroupTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags One or more tags, separated by commas, that you want to attach to the workgroup as you create it
         * 
         * @return builder
         * 
         */
        public Builder tags(List<WorkGroupTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags One or more tags, separated by commas, that you want to attach to the workgroup as you create it
         * 
         * @return builder
         * 
         */
        public Builder tags(WorkGroupTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param workGroupConfiguration The workgroup configuration
         * 
         * @return builder
         * 
         */
        public Builder workGroupConfiguration(@Nullable Output<WorkGroupConfigurationArgs> workGroupConfiguration) {
            $.workGroupConfiguration = workGroupConfiguration;
            return this;
        }

        /**
         * @param workGroupConfiguration The workgroup configuration
         * 
         * @return builder
         * 
         */
        public Builder workGroupConfiguration(WorkGroupConfigurationArgs workGroupConfiguration) {
            return workGroupConfiguration(Output.of(workGroupConfiguration));
        }

        /**
         * @param workGroupConfigurationUpdates The workgroup configuration update object
         * 
         * @return builder
         * 
         */
        public Builder workGroupConfigurationUpdates(@Nullable Output<WorkGroupConfigurationUpdatesArgs> workGroupConfigurationUpdates) {
            $.workGroupConfigurationUpdates = workGroupConfigurationUpdates;
            return this;
        }

        /**
         * @param workGroupConfigurationUpdates The workgroup configuration update object
         * 
         * @return builder
         * 
         */
        public Builder workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesArgs workGroupConfigurationUpdates) {
            return workGroupConfigurationUpdates(Output.of(workGroupConfigurationUpdates));
        }

        public WorkGroupArgs build() {
            return $;
        }
    }

}
