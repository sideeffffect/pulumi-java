// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentArgs Empty = new PatchDeploymentArgs();

    /**
     * Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> duration() {
        return this.duration == null ? Codegen.empty() : this.duration;
    }

    /**
     * VM instances to patch.
     * Structure is documented below.
     * 
     */
    @Import(name="instanceFilter", required=true)
      private final Output<PatchDeploymentInstanceFilterArgs> instanceFilter;

    public Output<PatchDeploymentInstanceFilterArgs> instanceFilter() {
        return this.instanceFilter;
    }

    /**
     * Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    @Import(name="oneTimeSchedule")
      private final @Nullable Output<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule;

    public Output<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule() {
        return this.oneTimeSchedule == null ? Codegen.empty() : this.oneTimeSchedule;
    }

    /**
     * Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    @Import(name="patchConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigArgs> patchConfig;

    public Output<PatchDeploymentPatchConfigArgs> patchConfig() {
        return this.patchConfig == null ? Codegen.empty() : this.patchConfig;
    }

    /**
     * A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @Import(name="patchDeploymentId", required=true)
      private final Output<String> patchDeploymentId;

    public Output<String> patchDeploymentId() {
        return this.patchDeploymentId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    @Import(name="recurringSchedule")
      private final @Nullable Output<PatchDeploymentRecurringScheduleArgs> recurringSchedule;

    public Output<PatchDeploymentRecurringScheduleArgs> recurringSchedule() {
        return this.recurringSchedule == null ? Codegen.empty() : this.recurringSchedule;
    }

    /**
     * Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    @Import(name="rollout")
      private final @Nullable Output<PatchDeploymentRolloutArgs> rollout;

    public Output<PatchDeploymentRolloutArgs> rollout() {
        return this.rollout == null ? Codegen.empty() : this.rollout;
    }

    public PatchDeploymentArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> duration,
        Output<PatchDeploymentInstanceFilterArgs> instanceFilter,
        @Nullable Output<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule,
        @Nullable Output<PatchDeploymentPatchConfigArgs> patchConfig,
        Output<String> patchDeploymentId,
        @Nullable Output<String> project,
        @Nullable Output<PatchDeploymentRecurringScheduleArgs> recurringSchedule,
        @Nullable Output<PatchDeploymentRolloutArgs> rollout) {
        this.description = description;
        this.duration = duration;
        this.instanceFilter = Objects.requireNonNull(instanceFilter, "expected parameter 'instanceFilter' to be non-null");
        this.oneTimeSchedule = oneTimeSchedule;
        this.patchConfig = patchConfig;
        this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId, "expected parameter 'patchDeploymentId' to be non-null");
        this.project = project;
        this.recurringSchedule = recurringSchedule;
        this.rollout = rollout;
    }

    private PatchDeploymentArgs() {
        this.description = Codegen.empty();
        this.duration = Codegen.empty();
        this.instanceFilter = Codegen.empty();
        this.oneTimeSchedule = Codegen.empty();
        this.patchConfig = Codegen.empty();
        this.patchDeploymentId = Codegen.empty();
        this.project = Codegen.empty();
        this.recurringSchedule = Codegen.empty();
        this.rollout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> duration;
        private Output<PatchDeploymentInstanceFilterArgs> instanceFilter;
        private @Nullable Output<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule;
        private @Nullable Output<PatchDeploymentPatchConfigArgs> patchConfig;
        private Output<String> patchDeploymentId;
        private @Nullable Output<String> project;
        private @Nullable Output<PatchDeploymentRecurringScheduleArgs> recurringSchedule;
        private @Nullable Output<PatchDeploymentRolloutArgs> rollout;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.duration = defaults.duration;
    	      this.instanceFilter = defaults.instanceFilter;
    	      this.oneTimeSchedule = defaults.oneTimeSchedule;
    	      this.patchConfig = defaults.patchConfig;
    	      this.patchDeploymentId = defaults.patchDeploymentId;
    	      this.project = defaults.project;
    	      this.recurringSchedule = defaults.recurringSchedule;
    	      this.rollout = defaults.rollout;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = Codegen.ofNullable(duration);
            return this;
        }
        public Builder instanceFilter(Output<PatchDeploymentInstanceFilterArgs> instanceFilter) {
            this.instanceFilter = Objects.requireNonNull(instanceFilter);
            return this;
        }
        public Builder instanceFilter(PatchDeploymentInstanceFilterArgs instanceFilter) {
            this.instanceFilter = Output.of(Objects.requireNonNull(instanceFilter));
            return this;
        }
        public Builder oneTimeSchedule(@Nullable Output<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule) {
            this.oneTimeSchedule = oneTimeSchedule;
            return this;
        }
        public Builder oneTimeSchedule(@Nullable PatchDeploymentOneTimeScheduleArgs oneTimeSchedule) {
            this.oneTimeSchedule = Codegen.ofNullable(oneTimeSchedule);
            return this;
        }
        public Builder patchConfig(@Nullable Output<PatchDeploymentPatchConfigArgs> patchConfig) {
            this.patchConfig = patchConfig;
            return this;
        }
        public Builder patchConfig(@Nullable PatchDeploymentPatchConfigArgs patchConfig) {
            this.patchConfig = Codegen.ofNullable(patchConfig);
            return this;
        }
        public Builder patchDeploymentId(Output<String> patchDeploymentId) {
            this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId);
            return this;
        }
        public Builder patchDeploymentId(String patchDeploymentId) {
            this.patchDeploymentId = Output.of(Objects.requireNonNull(patchDeploymentId));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder recurringSchedule(@Nullable Output<PatchDeploymentRecurringScheduleArgs> recurringSchedule) {
            this.recurringSchedule = recurringSchedule;
            return this;
        }
        public Builder recurringSchedule(@Nullable PatchDeploymentRecurringScheduleArgs recurringSchedule) {
            this.recurringSchedule = Codegen.ofNullable(recurringSchedule);
            return this;
        }
        public Builder rollout(@Nullable Output<PatchDeploymentRolloutArgs> rollout) {
            this.rollout = rollout;
            return this;
        }
        public Builder rollout(@Nullable PatchDeploymentRolloutArgs rollout) {
            this.rollout = Codegen.ofNullable(rollout);
            return this;
        }        public PatchDeploymentArgs build() {
            return new PatchDeploymentArgs(description, duration, instanceFilter, oneTimeSchedule, patchConfig, patchDeploymentId, project, recurringSchedule, rollout);
        }
    }
}
