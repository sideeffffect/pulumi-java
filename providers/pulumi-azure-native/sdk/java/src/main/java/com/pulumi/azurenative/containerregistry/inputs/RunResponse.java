// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.AgentPropertiesResponse;
import com.pulumi.azurenative.containerregistry.inputs.ImageDescriptorResponse;
import com.pulumi.azurenative.containerregistry.inputs.ImageUpdateTriggerResponse;
import com.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesResponse;
import com.pulumi.azurenative.containerregistry.inputs.SourceTriggerDescriptorResponse;
import com.pulumi.azurenative.containerregistry.inputs.SystemDataResponse;
import com.pulumi.azurenative.containerregistry.inputs.TimerTriggerDescriptorResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Run resource properties
 * 
 */
public final class RunResponse extends com.pulumi.resources.InvokeArgs {

    public static final RunResponse Empty = new RunResponse();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @Import(name="agentConfiguration")
      private final @Nullable AgentPropertiesResponse agentConfiguration;

    public Optional<AgentPropertiesResponse> agentConfiguration() {
        return this.agentConfiguration == null ? Optional.empty() : Optional.ofNullable(this.agentConfiguration);
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @Import(name="agentPoolName")
      private final @Nullable String agentPoolName;

    public Optional<String> agentPoolName() {
        return this.agentPoolName == null ? Optional.empty() : Optional.ofNullable(this.agentPoolName);
    }

    /**
     * The time the run was scheduled.
     * 
     */
    @Import(name="createTime")
      private final @Nullable String createTime;

    public Optional<String> createTime() {
        return this.createTime == null ? Optional.empty() : Optional.ofNullable(this.createTime);
    }

    /**
     * The list of custom registries that were logged in during this run.
     * 
     */
    @Import(name="customRegistries")
      private final @Nullable List<String> customRegistries;

    public List<String> customRegistries() {
        return this.customRegistries == null ? List.of() : this.customRegistries;
    }

    /**
     * The time the run finished.
     * 
     */
    @Import(name="finishTime")
      private final @Nullable String finishTime;

    public Optional<String> finishTime() {
        return this.finishTime == null ? Optional.empty() : Optional.ofNullable(this.finishTime);
    }

    /**
     * The resource ID.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The image update trigger that caused the run. This is applicable if the task has base image trigger configured.
     * 
     */
    @Import(name="imageUpdateTrigger")
      private final @Nullable ImageUpdateTriggerResponse imageUpdateTrigger;

    public Optional<ImageUpdateTriggerResponse> imageUpdateTrigger() {
        return this.imageUpdateTrigger == null ? Optional.empty() : Optional.ofNullable(this.imageUpdateTrigger);
    }

    /**
     * The value that indicates whether archiving is enabled or not.
     * 
     */
    @Import(name="isArchiveEnabled")
      private final @Nullable Boolean isArchiveEnabled;

    public Optional<Boolean> isArchiveEnabled() {
        return this.isArchiveEnabled == null ? Optional.empty() : Optional.ofNullable(this.isArchiveEnabled);
    }

    /**
     * The last updated time for the run.
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable String lastUpdatedTime;

    public Optional<String> lastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    /**
     * The image description for the log artifact.
     * 
     */
    @Import(name="logArtifact", required=true)
      private final ImageDescriptorResponse logArtifact;

    public ImageDescriptorResponse logArtifact() {
        return this.logArtifact;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The list of all images that were generated from the run. This is applicable if the run generates base image dependencies.
     * 
     */
    @Import(name="outputImages")
      private final @Nullable List<ImageDescriptorResponse> outputImages;

    public List<ImageDescriptorResponse> outputImages() {
        return this.outputImages == null ? List.of() : this.outputImages;
    }

    /**
     * The platform properties against which the run will happen.
     * 
     */
    @Import(name="platform")
      private final @Nullable PlatformPropertiesResponse platform;

    public Optional<PlatformPropertiesResponse> platform() {
        return this.platform == null ? Optional.empty() : Optional.ofNullable(this.platform);
    }

    /**
     * The provisioning state of a run.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * The error message received from backend systems after the run is scheduled.
     * 
     */
    @Import(name="runErrorMessage", required=true)
      private final String runErrorMessage;

    public String runErrorMessage() {
        return this.runErrorMessage;
    }

    /**
     * The unique identifier for the run.
     * 
     */
    @Import(name="runId")
      private final @Nullable String runId;

    public Optional<String> runId() {
        return this.runId == null ? Optional.empty() : Optional.ofNullable(this.runId);
    }

    /**
     * The type of run.
     * 
     */
    @Import(name="runType")
      private final @Nullable String runType;

    public Optional<String> runType() {
        return this.runType == null ? Optional.empty() : Optional.ofNullable(this.runType);
    }

    /**
     * The scope of the credentials that were used to login to the source registry during this run.
     * 
     */
    @Import(name="sourceRegistryAuth")
      private final @Nullable String sourceRegistryAuth;

    public Optional<String> sourceRegistryAuth() {
        return this.sourceRegistryAuth == null ? Optional.empty() : Optional.ofNullable(this.sourceRegistryAuth);
    }

    /**
     * The source trigger that caused the run.
     * 
     */
    @Import(name="sourceTrigger")
      private final @Nullable SourceTriggerDescriptorResponse sourceTrigger;

    public Optional<SourceTriggerDescriptorResponse> sourceTrigger() {
        return this.sourceTrigger == null ? Optional.empty() : Optional.ofNullable(this.sourceTrigger);
    }

    /**
     * The time the run started.
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> startTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * The current status of the run.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Import(name="systemData", required=true)
      private final SystemDataResponse systemData;

    public SystemDataResponse systemData() {
        return this.systemData;
    }

    /**
     * The task against which run was scheduled.
     * 
     */
    @Import(name="task")
      private final @Nullable String task;

    public Optional<String> task() {
        return this.task == null ? Optional.empty() : Optional.ofNullable(this.task);
    }

    /**
     * The timer trigger that caused the run.
     * 
     */
    @Import(name="timerTrigger")
      private final @Nullable TimerTriggerDescriptorResponse timerTrigger;

    public Optional<TimerTriggerDescriptorResponse> timerTrigger() {
        return this.timerTrigger == null ? Optional.empty() : Optional.ofNullable(this.timerTrigger);
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The update trigger token passed for the Run.
     * 
     */
    @Import(name="updateTriggerToken")
      private final @Nullable String updateTriggerToken;

    public Optional<String> updateTriggerToken() {
        return this.updateTriggerToken == null ? Optional.empty() : Optional.ofNullable(this.updateTriggerToken);
    }

    public RunResponse(
        @Nullable AgentPropertiesResponse agentConfiguration,
        @Nullable String agentPoolName,
        @Nullable String createTime,
        @Nullable List<String> customRegistries,
        @Nullable String finishTime,
        String id,
        @Nullable ImageUpdateTriggerResponse imageUpdateTrigger,
        @Nullable Boolean isArchiveEnabled,
        @Nullable String lastUpdatedTime,
        ImageDescriptorResponse logArtifact,
        String name,
        @Nullable List<ImageDescriptorResponse> outputImages,
        @Nullable PlatformPropertiesResponse platform,
        @Nullable String provisioningState,
        String runErrorMessage,
        @Nullable String runId,
        @Nullable String runType,
        @Nullable String sourceRegistryAuth,
        @Nullable SourceTriggerDescriptorResponse sourceTrigger,
        @Nullable String startTime,
        @Nullable String status,
        SystemDataResponse systemData,
        @Nullable String task,
        @Nullable TimerTriggerDescriptorResponse timerTrigger,
        String type,
        @Nullable String updateTriggerToken) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.createTime = createTime;
        this.customRegistries = customRegistries;
        this.finishTime = finishTime;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.imageUpdateTrigger = imageUpdateTrigger;
        this.isArchiveEnabled = isArchiveEnabled == null ? false : isArchiveEnabled;
        this.lastUpdatedTime = lastUpdatedTime;
        this.logArtifact = Objects.requireNonNull(logArtifact, "expected parameter 'logArtifact' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputImages = outputImages;
        this.platform = platform;
        this.provisioningState = provisioningState;
        this.runErrorMessage = Objects.requireNonNull(runErrorMessage, "expected parameter 'runErrorMessage' to be non-null");
        this.runId = runId;
        this.runType = runType;
        this.sourceRegistryAuth = sourceRegistryAuth;
        this.sourceTrigger = sourceTrigger;
        this.startTime = startTime;
        this.status = status;
        this.systemData = Objects.requireNonNull(systemData, "expected parameter 'systemData' to be non-null");
        this.task = task;
        this.timerTrigger = timerTrigger;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.updateTriggerToken = updateTriggerToken;
    }

    private RunResponse() {
        this.agentConfiguration = null;
        this.agentPoolName = null;
        this.createTime = null;
        this.customRegistries = List.of();
        this.finishTime = null;
        this.id = null;
        this.imageUpdateTrigger = null;
        this.isArchiveEnabled = null;
        this.lastUpdatedTime = null;
        this.logArtifact = null;
        this.name = null;
        this.outputImages = List.of();
        this.platform = null;
        this.provisioningState = null;
        this.runErrorMessage = null;
        this.runId = null;
        this.runType = null;
        this.sourceRegistryAuth = null;
        this.sourceTrigger = null;
        this.startTime = null;
        this.status = null;
        this.systemData = null;
        this.task = null;
        this.timerTrigger = null;
        this.type = null;
        this.updateTriggerToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable String createTime;
        private @Nullable List<String> customRegistries;
        private @Nullable String finishTime;
        private String id;
        private @Nullable ImageUpdateTriggerResponse imageUpdateTrigger;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String lastUpdatedTime;
        private ImageDescriptorResponse logArtifact;
        private String name;
        private @Nullable List<ImageDescriptorResponse> outputImages;
        private @Nullable PlatformPropertiesResponse platform;
        private @Nullable String provisioningState;
        private String runErrorMessage;
        private @Nullable String runId;
        private @Nullable String runType;
        private @Nullable String sourceRegistryAuth;
        private @Nullable SourceTriggerDescriptorResponse sourceTrigger;
        private @Nullable String startTime;
        private @Nullable String status;
        private SystemDataResponse systemData;
        private @Nullable String task;
        private @Nullable TimerTriggerDescriptorResponse timerTrigger;
        private String type;
        private @Nullable String updateTriggerToken;

        public Builder() {
    	      // Empty
        }

        public Builder(RunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.createTime = defaults.createTime;
    	      this.customRegistries = defaults.customRegistries;
    	      this.finishTime = defaults.finishTime;
    	      this.id = defaults.id;
    	      this.imageUpdateTrigger = defaults.imageUpdateTrigger;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.logArtifact = defaults.logArtifact;
    	      this.name = defaults.name;
    	      this.outputImages = defaults.outputImages;
    	      this.platform = defaults.platform;
    	      this.provisioningState = defaults.provisioningState;
    	      this.runErrorMessage = defaults.runErrorMessage;
    	      this.runId = defaults.runId;
    	      this.runType = defaults.runType;
    	      this.sourceRegistryAuth = defaults.sourceRegistryAuth;
    	      this.sourceTrigger = defaults.sourceTrigger;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.task = defaults.task;
    	      this.timerTrigger = defaults.timerTrigger;
    	      this.type = defaults.type;
    	      this.updateTriggerToken = defaults.updateTriggerToken;
        }

        public Builder agentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }
        public Builder agentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder customRegistries(@Nullable List<String> customRegistries) {
            this.customRegistries = customRegistries;
            return this;
        }
        public Builder customRegistries(String... customRegistries) {
            return customRegistries(List.of(customRegistries));
        }
        public Builder finishTime(@Nullable String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageUpdateTrigger(@Nullable ImageUpdateTriggerResponse imageUpdateTrigger) {
            this.imageUpdateTrigger = imageUpdateTrigger;
            return this;
        }
        public Builder isArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder logArtifact(ImageDescriptorResponse logArtifact) {
            this.logArtifact = Objects.requireNonNull(logArtifact);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outputImages(@Nullable List<ImageDescriptorResponse> outputImages) {
            this.outputImages = outputImages;
            return this;
        }
        public Builder outputImages(ImageDescriptorResponse... outputImages) {
            return outputImages(List.of(outputImages));
        }
        public Builder platform(@Nullable PlatformPropertiesResponse platform) {
            this.platform = platform;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder runErrorMessage(String runErrorMessage) {
            this.runErrorMessage = Objects.requireNonNull(runErrorMessage);
            return this;
        }
        public Builder runId(@Nullable String runId) {
            this.runId = runId;
            return this;
        }
        public Builder runType(@Nullable String runType) {
            this.runType = runType;
            return this;
        }
        public Builder sourceRegistryAuth(@Nullable String sourceRegistryAuth) {
            this.sourceRegistryAuth = sourceRegistryAuth;
            return this;
        }
        public Builder sourceTrigger(@Nullable SourceTriggerDescriptorResponse sourceTrigger) {
            this.sourceTrigger = sourceTrigger;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder task(@Nullable String task) {
            this.task = task;
            return this;
        }
        public Builder timerTrigger(@Nullable TimerTriggerDescriptorResponse timerTrigger) {
            this.timerTrigger = timerTrigger;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTriggerToken(@Nullable String updateTriggerToken) {
            this.updateTriggerToken = updateTriggerToken;
            return this;
        }        public RunResponse build() {
            return new RunResponse(agentConfiguration, agentPoolName, createTime, customRegistries, finishTime, id, imageUpdateTrigger, isArchiveEnabled, lastUpdatedTime, logArtifact, name, outputImages, platform, provisioningState, runErrorMessage, runId, runType, sourceRegistryAuth, sourceTrigger, startTime, status, systemData, task, timerTrigger, type, updateTriggerToken);
        }
    }
}
