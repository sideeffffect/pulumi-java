// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.transfer.inputs;

import com.pulumi.awsnative.transfer.enums.WorkflowStepCopyStepDetailsPropertiesOverwriteExisting;
import com.pulumi.awsnative.transfer.inputs.WorkflowInputFileLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details for a step that performs a file copy.
 * 
 */
public final class WorkflowStepCopyStepDetailsPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowStepCopyStepDetailsPropertiesArgs Empty = new WorkflowStepCopyStepDetailsPropertiesArgs();

    @Import(name="destinationFileLocation")
    private @Nullable Output<WorkflowInputFileLocationArgs> destinationFileLocation;

    public Optional<Output<WorkflowInputFileLocationArgs>> destinationFileLocation() {
        return Optional.ofNullable(this.destinationFileLocation);
    }

    /**
     * The name of the step, used as an identifier.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
     * 
     */
    @Import(name="overwriteExisting")
    private @Nullable Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> overwriteExisting;

    /**
     * @return A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
     * 
     */
    public Optional<Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting>> overwriteExisting() {
        return Optional.ofNullable(this.overwriteExisting);
    }

    /**
     * Specifies which file to use as input to the workflow step.
     * 
     */
    @Import(name="sourceFileLocation")
    private @Nullable Output<String> sourceFileLocation;

    /**
     * @return Specifies which file to use as input to the workflow step.
     * 
     */
    public Optional<Output<String>> sourceFileLocation() {
        return Optional.ofNullable(this.sourceFileLocation);
    }

    private WorkflowStepCopyStepDetailsPropertiesArgs() {}

    private WorkflowStepCopyStepDetailsPropertiesArgs(WorkflowStepCopyStepDetailsPropertiesArgs $) {
        this.destinationFileLocation = $.destinationFileLocation;
        this.name = $.name;
        this.overwriteExisting = $.overwriteExisting;
        this.sourceFileLocation = $.sourceFileLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowStepCopyStepDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowStepCopyStepDetailsPropertiesArgs $;

        public Builder() {
            $ = new WorkflowStepCopyStepDetailsPropertiesArgs();
        }

        public Builder(WorkflowStepCopyStepDetailsPropertiesArgs defaults) {
            $ = new WorkflowStepCopyStepDetailsPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationFileLocation(@Nullable Output<WorkflowInputFileLocationArgs> destinationFileLocation) {
            $.destinationFileLocation = destinationFileLocation;
            return this;
        }

        public Builder destinationFileLocation(WorkflowInputFileLocationArgs destinationFileLocation) {
            return destinationFileLocation(Output.of(destinationFileLocation));
        }

        /**
         * @param name The name of the step, used as an identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the step, used as an identifier.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param overwriteExisting A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
         * 
         * @return builder
         * 
         */
        public Builder overwriteExisting(@Nullable Output<WorkflowStepCopyStepDetailsPropertiesOverwriteExisting> overwriteExisting) {
            $.overwriteExisting = overwriteExisting;
            return this;
        }

        /**
         * @param overwriteExisting A flag that indicates whether or not to overwrite an existing file of the same name. The default is FALSE.
         * 
         * @return builder
         * 
         */
        public Builder overwriteExisting(WorkflowStepCopyStepDetailsPropertiesOverwriteExisting overwriteExisting) {
            return overwriteExisting(Output.of(overwriteExisting));
        }

        /**
         * @param sourceFileLocation Specifies which file to use as input to the workflow step.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileLocation(@Nullable Output<String> sourceFileLocation) {
            $.sourceFileLocation = sourceFileLocation;
            return this;
        }

        /**
         * @param sourceFileLocation Specifies which file to use as input to the workflow step.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileLocation(String sourceFileLocation) {
            return sourceFileLocation(Output.of(sourceFileLocation));
        }

        public WorkflowStepCopyStepDetailsPropertiesArgs build() {
            return $;
        }
    }

}
