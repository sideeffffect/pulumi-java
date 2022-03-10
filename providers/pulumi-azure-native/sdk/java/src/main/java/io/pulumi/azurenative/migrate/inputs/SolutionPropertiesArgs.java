// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.SolutionDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class for solution properties.
 * 
 */
public final class SolutionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionPropertiesArgs Empty = new SolutionPropertiesArgs();

    /**
     * Gets or sets the cleanup state of the solution.
     * 
     */
    @InputImport(name="cleanupState")
      private final @Nullable Input<String> cleanupState;

    public Input<String> getCleanupState() {
        return this.cleanupState == null ? Input.empty() : this.cleanupState;
    }

    /**
     * Gets or sets the details of the solution.
     * 
     */
    @InputImport(name="details")
      private final @Nullable Input<SolutionDetailsArgs> details;

    public Input<SolutionDetailsArgs> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    /**
     * Gets or sets the goal of the solution.
     * 
     */
    @InputImport(name="goal")
      private final @Nullable Input<String> goal;

    public Input<String> getGoal() {
        return this.goal == null ? Input.empty() : this.goal;
    }

    /**
     * Gets or sets the purpose of the solution.
     * 
     */
    @InputImport(name="purpose")
      private final @Nullable Input<String> purpose;

    public Input<String> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    /**
     * Gets or sets the current status of the solution.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Gets or sets the tool being used in the solution.
     * 
     */
    @InputImport(name="tool")
      private final @Nullable Input<String> tool;

    public Input<String> getTool() {
        return this.tool == null ? Input.empty() : this.tool;
    }

    public SolutionPropertiesArgs(
        @Nullable Input<String> cleanupState,
        @Nullable Input<SolutionDetailsArgs> details,
        @Nullable Input<String> goal,
        @Nullable Input<String> purpose,
        @Nullable Input<String> status,
        @Nullable Input<String> tool) {
        this.cleanupState = cleanupState;
        this.details = details;
        this.goal = goal;
        this.purpose = purpose;
        this.status = status;
        this.tool = tool;
    }

    private SolutionPropertiesArgs() {
        this.cleanupState = Input.empty();
        this.details = Input.empty();
        this.goal = Input.empty();
        this.purpose = Input.empty();
        this.status = Input.empty();
        this.tool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cleanupState;
        private @Nullable Input<SolutionDetailsArgs> details;
        private @Nullable Input<String> goal;
        private @Nullable Input<String> purpose;
        private @Nullable Input<String> status;
        private @Nullable Input<String> tool;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cleanupState = defaults.cleanupState;
    	      this.details = defaults.details;
    	      this.goal = defaults.goal;
    	      this.purpose = defaults.purpose;
    	      this.status = defaults.status;
    	      this.tool = defaults.tool;
        }

        public Builder cleanupState(@Nullable Input<String> cleanupState) {
            this.cleanupState = cleanupState;
            return this;
        }

        public Builder cleanupState(@Nullable String cleanupState) {
            this.cleanupState = Input.ofNullable(cleanupState);
            return this;
        }

        public Builder details(@Nullable Input<SolutionDetailsArgs> details) {
            this.details = details;
            return this;
        }

        public Builder details(@Nullable SolutionDetailsArgs details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder goal(@Nullable Input<String> goal) {
            this.goal = goal;
            return this;
        }

        public Builder goal(@Nullable String goal) {
            this.goal = Input.ofNullable(goal);
            return this;
        }

        public Builder purpose(@Nullable Input<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder purpose(@Nullable String purpose) {
            this.purpose = Input.ofNullable(purpose);
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

        public Builder tool(@Nullable Input<String> tool) {
            this.tool = tool;
            return this;
        }

        public Builder tool(@Nullable String tool) {
            this.tool = Input.ofNullable(tool);
            return this;
        }
        public SolutionPropertiesArgs build() {
            return new SolutionPropertiesArgs(cleanupState, details, goal, purpose, status, tool);
        }
    }
}
