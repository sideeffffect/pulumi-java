// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.AppendVariableActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ControlActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.CopyActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.CustomActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DeleteActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExpressionResponse;
import io.pulumi.azurenative.datafactory.inputs.FailActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ForEachActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.IfConditionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SwitchActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WebActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityResponse;
import io.pulumi.core.annotations.InputImport;
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
public final class UntilActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final UntilActivityResponse Empty = new UntilActivityResponse();

    /**
     * List of activities to execute.
     * 
     */
    @InputImport(name="activities", required=true)
      private final List<Object> activities;

    public List<Object> getActivities() {
        return this.activities;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * An expression that would evaluate to Boolean. The loop will continue until this expression evaluates to true
     * 
     */
    @InputImport(name="expression", required=true)
      private final ExpressionResponse expression;

    public ExpressionResponse getExpression() {
        return this.expression;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Object timeout;

    public Optional<Object> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    /**
     * Type of activity.
     * Expected value is 'Until'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public UntilActivityResponse(
        List<Object> activities,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        ExpressionResponse expression,
        String name,
        @Nullable Object timeout,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.activities = Objects.requireNonNull(activities, "expected parameter 'activities' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private UntilActivityResponse() {
        this.activities = List.of();
        this.dependsOn = List.of();
        this.description = null;
        this.expression = null;
        this.name = null;
        this.timeout = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UntilActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> activities;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private ExpressionResponse expression;
        private String name;
        private @Nullable Object timeout;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(UntilActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.name = defaults.name;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder activities(List<Object> activities) {
            this.activities = Objects.requireNonNull(activities);
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder expression(ExpressionResponse expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder timeout(@Nullable Object timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public UntilActivityResponse build() {
            return new UntilActivityResponse(activities, dependsOn, description, expression, name, timeout, type, userProperties);
        }
    }
}
