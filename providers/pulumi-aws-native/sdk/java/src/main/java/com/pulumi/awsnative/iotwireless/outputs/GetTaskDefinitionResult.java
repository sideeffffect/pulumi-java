// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.outputs;

import com.pulumi.awsnative.iotwireless.enums.TaskDefinitionType;
import com.pulumi.awsnative.iotwireless.outputs.TaskDefinitionLoRaWANUpdateGatewayTaskEntry;
import com.pulumi.awsnative.iotwireless.outputs.TaskDefinitionTag;
import com.pulumi.awsnative.iotwireless.outputs.TaskDefinitionUpdateWirelessGatewayTaskCreate;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTaskDefinitionResult {
    /**
     * TaskDefinition arn. Returned after successful create.
     * 
     */
    private final @Nullable String arn;
    /**
     * Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
     * 
     */
    private final @Nullable Boolean autoCreateTasks;
    /**
     * The ID of the new wireless gateway task definition
     * 
     */
    private final @Nullable String id;
    /**
     * The list of task definitions.
     * 
     */
    private final @Nullable TaskDefinitionLoRaWANUpdateGatewayTaskEntry loRaWANUpdateGatewayTaskEntry;
    /**
     * The name of the new resource.
     * 
     */
    private final @Nullable String name;
    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    private final @Nullable List<TaskDefinitionTag> tags;
    /**
     * A filter to list only the wireless gateway task definitions that use this task definition type
     * 
     */
    private final @Nullable TaskDefinitionType taskDefinitionType;
    /**
     * Information about the gateways to update.
     * 
     */
    private final @Nullable TaskDefinitionUpdateWirelessGatewayTaskCreate update;

    @CustomType.Constructor
    private GetTaskDefinitionResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("autoCreateTasks") @Nullable Boolean autoCreateTasks,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("loRaWANUpdateGatewayTaskEntry") @Nullable TaskDefinitionLoRaWANUpdateGatewayTaskEntry loRaWANUpdateGatewayTaskEntry,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<TaskDefinitionTag> tags,
        @CustomType.Parameter("taskDefinitionType") @Nullable TaskDefinitionType taskDefinitionType,
        @CustomType.Parameter("update") @Nullable TaskDefinitionUpdateWirelessGatewayTaskCreate update) {
        this.arn = arn;
        this.autoCreateTasks = autoCreateTasks;
        this.id = id;
        this.loRaWANUpdateGatewayTaskEntry = loRaWANUpdateGatewayTaskEntry;
        this.name = name;
        this.tags = tags;
        this.taskDefinitionType = taskDefinitionType;
        this.update = update;
    }

    /**
     * TaskDefinition arn. Returned after successful create.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
     * 
    */
    public Optional<Boolean> autoCreateTasks() {
        return Optional.ofNullable(this.autoCreateTasks);
    }
    /**
     * The ID of the new wireless gateway task definition
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The list of task definitions.
     * 
    */
    public Optional<TaskDefinitionLoRaWANUpdateGatewayTaskEntry> loRaWANUpdateGatewayTaskEntry() {
        return Optional.ofNullable(this.loRaWANUpdateGatewayTaskEntry);
    }
    /**
     * The name of the new resource.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
    */
    public List<TaskDefinitionTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * A filter to list only the wireless gateway task definitions that use this task definition type
     * 
    */
    public Optional<TaskDefinitionType> taskDefinitionType() {
        return Optional.ofNullable(this.taskDefinitionType);
    }
    /**
     * Information about the gateways to update.
     * 
    */
    public Optional<TaskDefinitionUpdateWirelessGatewayTaskCreate> update() {
        return Optional.ofNullable(this.update);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean autoCreateTasks;
        private @Nullable String id;
        private @Nullable TaskDefinitionLoRaWANUpdateGatewayTaskEntry loRaWANUpdateGatewayTaskEntry;
        private @Nullable String name;
        private @Nullable List<TaskDefinitionTag> tags;
        private @Nullable TaskDefinitionType taskDefinitionType;
        private @Nullable TaskDefinitionUpdateWirelessGatewayTaskCreate update;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoCreateTasks = defaults.autoCreateTasks;
    	      this.id = defaults.id;
    	      this.loRaWANUpdateGatewayTaskEntry = defaults.loRaWANUpdateGatewayTaskEntry;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.taskDefinitionType = defaults.taskDefinitionType;
    	      this.update = defaults.update;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder autoCreateTasks(@Nullable Boolean autoCreateTasks) {
            this.autoCreateTasks = autoCreateTasks;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder loRaWANUpdateGatewayTaskEntry(@Nullable TaskDefinitionLoRaWANUpdateGatewayTaskEntry loRaWANUpdateGatewayTaskEntry) {
            this.loRaWANUpdateGatewayTaskEntry = loRaWANUpdateGatewayTaskEntry;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(@Nullable List<TaskDefinitionTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TaskDefinitionTag... tags) {
            return tags(List.of(tags));
        }
        public Builder taskDefinitionType(@Nullable TaskDefinitionType taskDefinitionType) {
            this.taskDefinitionType = taskDefinitionType;
            return this;
        }
        public Builder update(@Nullable TaskDefinitionUpdateWirelessGatewayTaskCreate update) {
            this.update = update;
            return this;
        }        public GetTaskDefinitionResult build() {
            return new GetTaskDefinitionResult(arn, autoCreateTasks, id, loRaWANUpdateGatewayTaskEntry, name, tags, taskDefinitionType, update);
        }
    }
}
