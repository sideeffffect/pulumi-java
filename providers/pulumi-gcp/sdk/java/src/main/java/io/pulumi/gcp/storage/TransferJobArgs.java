// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.TransferJobScheduleArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobArgs Empty = new TransferJobArgs();

    /**
     * Unique description to identify the Transfer Job.
     * 
     */
    @InputImport(name="description", required=true)
      private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<TransferJobScheduleArgs> schedule;

    public Input<TransferJobScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Status of the job. Default: `ENABLED`. **NOTE: The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.**
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Transfer specification. Structure documented below.
     * 
     */
    @InputImport(name="transferSpec", required=true)
      private final Input<TransferJobTransferSpecArgs> transferSpec;

    public Input<TransferJobTransferSpecArgs> getTransferSpec() {
        return this.transferSpec;
    }

    public TransferJobArgs(
        Input<String> description,
        @Nullable Input<String> project,
        @Nullable Input<TransferJobScheduleArgs> schedule,
        @Nullable Input<String> status,
        Input<TransferJobTransferSpecArgs> transferSpec) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.project = project;
        this.schedule = schedule;
        this.status = status;
        this.transferSpec = Objects.requireNonNull(transferSpec, "expected parameter 'transferSpec' to be non-null");
    }

    private TransferJobArgs() {
        this.description = Input.empty();
        this.project = Input.empty();
        this.schedule = Input.empty();
        this.status = Input.empty();
        this.transferSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> description;
        private @Nullable Input<String> project;
        private @Nullable Input<TransferJobScheduleArgs> schedule;
        private @Nullable Input<String> status;
        private Input<TransferJobTransferSpecArgs> transferSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.transferSpec = defaults.transferSpec;
        }

        public Builder description(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder description(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder schedule(@Nullable Input<TransferJobScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable TransferJobScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder transferSpec(Input<TransferJobTransferSpecArgs> transferSpec) {
            this.transferSpec = Objects.requireNonNull(transferSpec);
            return this;
        }

        public Builder transferSpec(TransferJobTransferSpecArgs transferSpec) {
            this.transferSpec = Input.of(Objects.requireNonNull(transferSpec));
            return this;
        }
        public TransferJobArgs build() {
            return new TransferJobArgs(description, project, schedule, status, transferSpec);
        }
    }
}
