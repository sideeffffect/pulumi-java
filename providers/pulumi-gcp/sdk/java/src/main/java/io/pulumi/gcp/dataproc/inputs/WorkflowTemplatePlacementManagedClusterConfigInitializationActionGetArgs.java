// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs();

    /**
     * Required. Cloud Storage URI of executable file.
     * 
     */
    @InputImport(name="executableFile")
      private final @Nullable Input<String> executableFile;

    public Input<String> getExecutableFile() {
        return this.executableFile == null ? Input.empty() : this.executableFile;
    }

    /**
     * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)). Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    @InputImport(name="executionTimeout")
      private final @Nullable Input<String> executionTimeout;

    public Input<String> getExecutionTimeout() {
        return this.executionTimeout == null ? Input.empty() : this.executionTimeout;
    }

    public WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs(
        @Nullable Input<String> executableFile,
        @Nullable Input<String> executionTimeout) {
        this.executableFile = executableFile;
        this.executionTimeout = executionTimeout;
    }

    private WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs() {
        this.executableFile = Input.empty();
        this.executionTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> executableFile;
        private @Nullable Input<String> executionTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableFile = defaults.executableFile;
    	      this.executionTimeout = defaults.executionTimeout;
        }

        public Builder executableFile(@Nullable Input<String> executableFile) {
            this.executableFile = executableFile;
            return this;
        }

        public Builder executableFile(@Nullable String executableFile) {
            this.executableFile = Input.ofNullable(executableFile);
            return this;
        }

        public Builder executionTimeout(@Nullable Input<String> executionTimeout) {
            this.executionTimeout = executionTimeout;
            return this;
        }

        public Builder executionTimeout(@Nullable String executionTimeout) {
            this.executionTimeout = Input.ofNullable(executionTimeout);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigInitializationActionGetArgs(executableFile, executionTimeout);
        }
    }
}
