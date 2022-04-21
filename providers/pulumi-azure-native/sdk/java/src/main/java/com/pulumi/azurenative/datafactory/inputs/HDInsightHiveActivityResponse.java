// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
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
public final class HDInsightHiveActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final HDInsightHiveActivityResponse Empty = new HDInsightHiveActivityResponse();

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    @Import(name="arguments")
    private @Nullable List<Object> arguments;

    public Optional<List<Object>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * Allows user to specify defines for Hive job request.
     * 
     */
    @Import(name="defines")
    private @Nullable Map<String,Object> defines;

    public Optional<Map<String,Object>> defines() {
        return Optional.ofNullable(this.defines);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable List<ActivityDependencyResponse> dependsOn;

    public Optional<List<ActivityDependencyResponse>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Debug info option.
     * 
     */
    @Import(name="getDebugInfo")
    private @Nullable String getDebugInfo;

    public Optional<String> getDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Query timeout value (in minutes).  Effective when the HDInsight cluster is with ESP (Enterprise Security Package)
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Integer queryTimeout;

    public Optional<Integer> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Script linked service reference.
     * 
     */
    @Import(name="scriptLinkedService")
    private @Nullable LinkedServiceReferenceResponse scriptLinkedService;

    public Optional<LinkedServiceReferenceResponse> scriptLinkedService() {
        return Optional.ofNullable(this.scriptLinkedService);
    }

    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="scriptPath")
    private @Nullable Object scriptPath;

    public Optional<Object> scriptPath() {
        return Optional.ofNullable(this.scriptPath);
    }

    /**
     * Storage linked service references.
     * 
     */
    @Import(name="storageLinkedServices")
    private @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;

    public Optional<List<LinkedServiceReferenceResponse>> storageLinkedServices() {
        return Optional.ofNullable(this.storageLinkedServices);
    }

    /**
     * Type of activity.
     * Expected value is &#39;HDInsightHive&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable List<UserPropertyResponse> userProperties;

    public Optional<List<UserPropertyResponse>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    /**
     * User specified arguments under hivevar namespace.
     * 
     */
    @Import(name="variables")
    private @Nullable List<Object> variables;

    public Optional<List<Object>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private HDInsightHiveActivityResponse() {}

    private HDInsightHiveActivityResponse(HDInsightHiveActivityResponse $) {
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
    public static Builder builder(HDInsightHiveActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightHiveActivityResponse $;

        public Builder() {
            $ = new HDInsightHiveActivityResponse();
        }

        public Builder(HDInsightHiveActivityResponse defaults) {
            $ = new HDInsightHiveActivityResponse(Objects.requireNonNull(defaults));
        }

        public Builder arguments(@Nullable List<Object> arguments) {
            $.arguments = arguments;
            return this;
        }

        public Builder arguments(Object... arguments) {
            return arguments(List.of(arguments));
        }

        public Builder defines(@Nullable Map<String,Object> defines) {
            $.defines = defines;
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder getDebugInfo(@Nullable String getDebugInfo) {
            $.getDebugInfo = getDebugInfo;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            $.policy = policy;
            return this;
        }

        public Builder queryTimeout(@Nullable Integer queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        public Builder scriptLinkedService(@Nullable LinkedServiceReferenceResponse scriptLinkedService) {
            $.scriptLinkedService = scriptLinkedService;
            return this;
        }

        public Builder scriptPath(@Nullable Object scriptPath) {
            $.scriptPath = scriptPath;
            return this;
        }

        public Builder storageLinkedServices(@Nullable List<LinkedServiceReferenceResponse> storageLinkedServices) {
            $.storageLinkedServices = storageLinkedServices;
            return this;
        }

        public Builder storageLinkedServices(LinkedServiceReferenceResponse... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public Builder variables(@Nullable List<Object> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(Object... variables) {
            return variables(List.of(variables));
        }

        public HDInsightHiveActivityResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
