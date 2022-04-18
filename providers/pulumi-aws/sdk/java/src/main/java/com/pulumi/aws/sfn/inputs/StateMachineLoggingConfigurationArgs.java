// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineLoggingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StateMachineLoggingConfigurationArgs Empty = new StateMachineLoggingConfigurationArgs();

    /**
     * Determines whether execution data is included in your log. When set to `false`, data is excluded.
     * 
     */
    @Import(name="includeExecutionData")
      private final @Nullable Output<Boolean> includeExecutionData;

    public Output<Boolean> includeExecutionData() {
        return this.includeExecutionData == null ? Codegen.empty() : this.includeExecutionData;
    }

    /**
     * Defines which category of execution history events are logged. Valid values: `ALL`, `ERROR`, `FATAL`, `OFF`
     * 
     */
    @Import(name="level")
      private final @Nullable Output<String> level;

    public Output<String> level() {
        return this.level == null ? Codegen.empty() : this.level;
    }

    /**
     * Amazon Resource Name (ARN) of a CloudWatch log group. Make sure the State Machine has the correct IAM policies for logging. The ARN must end with `:*`
     * 
     */
    @Import(name="logDestination")
      private final @Nullable Output<String> logDestination;

    public Output<String> logDestination() {
        return this.logDestination == null ? Codegen.empty() : this.logDestination;
    }

    public StateMachineLoggingConfigurationArgs(
        @Nullable Output<Boolean> includeExecutionData,
        @Nullable Output<String> level,
        @Nullable Output<String> logDestination) {
        this.includeExecutionData = includeExecutionData;
        this.level = level;
        this.logDestination = logDestination;
    }

    private StateMachineLoggingConfigurationArgs() {
        this.includeExecutionData = Codegen.empty();
        this.level = Codegen.empty();
        this.logDestination = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> includeExecutionData;
        private @Nullable Output<String> level;
        private @Nullable Output<String> logDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeExecutionData = defaults.includeExecutionData;
    	      this.level = defaults.level;
    	      this.logDestination = defaults.logDestination;
        }

        public Builder includeExecutionData(@Nullable Output<Boolean> includeExecutionData) {
            this.includeExecutionData = includeExecutionData;
            return this;
        }
        public Builder includeExecutionData(@Nullable Boolean includeExecutionData) {
            this.includeExecutionData = Codegen.ofNullable(includeExecutionData);
            return this;
        }
        public Builder level(@Nullable Output<String> level) {
            this.level = level;
            return this;
        }
        public Builder level(@Nullable String level) {
            this.level = Codegen.ofNullable(level);
            return this;
        }
        public Builder logDestination(@Nullable Output<String> logDestination) {
            this.logDestination = logDestination;
            return this;
        }
        public Builder logDestination(@Nullable String logDestination) {
            this.logDestination = Codegen.ofNullable(logDestination);
            return this;
        }        public StateMachineLoggingConfigurationArgs build() {
            return new StateMachineLoggingConfigurationArgs(includeExecutionData, level, logDestination);
        }
    }
}
