// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ConnectToTargetSqlMITaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure SQL Database Managed Instance
 * 
 */
public final class ConnectToTargetSqlMITaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlMITaskPropertiesArgs Empty = new ConnectToTargetSqlMITaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
      private final @Nullable Input<ConnectToTargetSqlMITaskInputArgs> input;

    public Input<ConnectToTargetSqlMITaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ConnectToTarget.AzureSqlDbMI'.
     * 
     */
    @InputImport(name="taskType", required=true)
      private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public ConnectToTargetSqlMITaskPropertiesArgs(
        @Nullable Input<ConnectToTargetSqlMITaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ConnectToTargetSqlMITaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMITaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectToTargetSqlMITaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMITaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Input<ConnectToTargetSqlMITaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable ConnectToTargetSqlMITaskInputArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder taskType(Input<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder taskType(String taskType) {
            this.taskType = Input.of(Objects.requireNonNull(taskType));
            return this;
        }
        public ConnectToTargetSqlMITaskPropertiesArgs build() {
            return new ConnectToTargetSqlMITaskPropertiesArgs(input, taskType);
        }
    }
}
