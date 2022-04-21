// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.AppendVariableActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ControlActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.CopyActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.CustomActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DeleteActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecutionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExpressionArgs;
import com.pulumi.azurenative.datafactory.inputs.FailActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.FilterActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ForEachActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.GetMetadataActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.IfConditionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.LookupActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.SetVariableActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.SwitchActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.azurenative.datafactory.inputs.ValidationActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.WaitActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.WebActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.WebHookActivityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This activity executes inner activities until the specified boolean expression results to true or timeout is reached, whichever is earlier.
 * 
 */
public final class UntilActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final UntilActivityArgs Empty = new UntilActivityArgs();

    /**
     * List of activities to execute.
     * 
     */
    @Import(name="activities", required=true)
    private Output<List<Object>> activities;

    public Output<List<Object>> activities() {
        return this.activities;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An expression that would evaluate to Boolean. The loop will continue until this expression evaluates to true
     * 
     */
    @Import(name="expression", required=true)
    private Output<ExpressionArgs> expression;

    public Output<ExpressionArgs> expression() {
        return this.expression;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Object> timeout;

    public Optional<Output<Object>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Type of activity.
     * Expected value is &#39;Until&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private UntilActivityArgs() {}

    private UntilActivityArgs(UntilActivityArgs $) {
        this.activities = $.activities;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.expression = $.expression;
        this.name = $.name;
        this.timeout = $.timeout;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UntilActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UntilActivityArgs $;

        public Builder() {
            $ = new UntilActivityArgs();
        }

        public Builder(UntilActivityArgs defaults) {
            $ = new UntilActivityArgs(Objects.requireNonNull(defaults));
        }

        public Builder activities(Output<List<Object>> activities) {
            $.activities = activities;
            return this;
        }

        public Builder activities(List<Object> activities) {
            return activities(Output.of(activities));
        }

        public Builder activities(Object... activities) {
            return activities(List.of(activities));
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder expression(Output<ExpressionArgs> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(ExpressionArgs expression) {
            return expression(Output.of(expression));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder timeout(@Nullable Output<Object> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(Object timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public UntilActivityArgs build() {
            $.activities = Objects.requireNonNull($.activities, "expected parameter 'activities' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
