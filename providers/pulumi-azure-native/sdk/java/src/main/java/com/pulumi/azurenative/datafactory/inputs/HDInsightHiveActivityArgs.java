// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.HDInsightActivityDebugInfoOption;
import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HDInsight Hive activity type.
 * 
 */
public final class HDInsightHiveActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final HDInsightHiveActivityArgs Empty = new HDInsightHiveActivityArgs();

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<List<Object>> arguments;

    public Optional<Output<List<Object>>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * Allows user to specify defines for Hive job request.
     * 
     */
    @Import(name="defines")
    private @Nullable Output<Map<String,Object>> defines;

    public Optional<Output<Map<String,Object>>> defines() {
        return Optional.ofNullable(this.defines);
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
     * Debug info option.
     * 
     */
    @Import(name="getDebugInfo")
    private @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;

    public Optional<Output<Either<String,HDInsightActivityDebugInfoOption>>> getDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
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
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Query timeout value (in minutes).  Effective when the HDInsight cluster is with ESP (Enterprise Security Package)
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Output<Integer> queryTimeout;

    public Optional<Output<Integer>> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Script linked service reference.
     * 
     */
    @Import(name="scriptLinkedService")
    private @Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService;

    public Optional<Output<LinkedServiceReferenceArgs>> scriptLinkedService() {
        return Optional.ofNullable(this.scriptLinkedService);
    }

    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="scriptPath")
    private @Nullable Output<Object> scriptPath;

    public Optional<Output<Object>> scriptPath() {
        return Optional.ofNullable(this.scriptPath);
    }

    /**
     * Storage linked service references.
     * 
     */
    @Import(name="storageLinkedServices")
    private @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices;

    public Optional<Output<List<LinkedServiceReferenceArgs>>> storageLinkedServices() {
        return Optional.ofNullable(this.storageLinkedServices);
    }

    /**
     * Type of activity.
     * Expected value is &#39;HDInsightHive&#39;.
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

    /**
     * User specified arguments under hivevar namespace.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<Object>> variables;

    public Optional<Output<List<Object>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private HDInsightHiveActivityArgs() {}

    private HDInsightHiveActivityArgs(HDInsightHiveActivityArgs $) {
        this.arguments = $.arguments;
        this.defines = $.defines;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.getDebugInfo = $.getDebugInfo;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.queryTimeout = $.queryTimeout;
        this.scriptLinkedService = $.scriptLinkedService;
        this.scriptPath = $.scriptPath;
        this.storageLinkedServices = $.storageLinkedServices;
        this.type = $.type;
        this.userProperties = $.userProperties;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HDInsightHiveActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightHiveActivityArgs $;

        public Builder() {
            $ = new HDInsightHiveActivityArgs();
        }

        public Builder(HDInsightHiveActivityArgs defaults) {
            $ = new HDInsightHiveActivityArgs(Objects.requireNonNull(defaults));
        }

        public Builder arguments(@Nullable Output<List<Object>> arguments) {
            $.arguments = arguments;
            return this;
        }

        public Builder arguments(List<Object> arguments) {
            return arguments(Output.of(arguments));
        }

        public Builder arguments(Object... arguments) {
            return arguments(List.of(arguments));
        }

        public Builder defines(@Nullable Output<Map<String,Object>> defines) {
            $.defines = defines;
            return this;
        }

        public Builder defines(Map<String,Object> defines) {
            return defines(Output.of(defines));
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

        public Builder getDebugInfo(@Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo) {
            $.getDebugInfo = getDebugInfo;
            return this;
        }

        public Builder getDebugInfo(Either<String,HDInsightActivityDebugInfoOption> getDebugInfo) {
            return getDebugInfo(Output.of(getDebugInfo));
        }

        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        public Builder queryTimeout(@Nullable Output<Integer> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        public Builder queryTimeout(Integer queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        public Builder scriptLinkedService(@Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService) {
            $.scriptLinkedService = scriptLinkedService;
            return this;
        }

        public Builder scriptLinkedService(LinkedServiceReferenceArgs scriptLinkedService) {
            return scriptLinkedService(Output.of(scriptLinkedService));
        }

        public Builder scriptPath(@Nullable Output<Object> scriptPath) {
            $.scriptPath = scriptPath;
            return this;
        }

        public Builder scriptPath(Object scriptPath) {
            return scriptPath(Output.of(scriptPath));
        }

        public Builder storageLinkedServices(@Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices) {
            $.storageLinkedServices = storageLinkedServices;
            return this;
        }

        public Builder storageLinkedServices(List<LinkedServiceReferenceArgs> storageLinkedServices) {
            return storageLinkedServices(Output.of(storageLinkedServices));
        }

        public Builder storageLinkedServices(LinkedServiceReferenceArgs... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
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

        public Builder variables(@Nullable Output<List<Object>> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(List<Object> variables) {
            return variables(Output.of(variables));
        }

        public Builder variables(Object... variables) {
            return variables(List.of(variables));
        }

        public HDInsightHiveActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
