// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HDInsightMapReduceActivityResponse {
    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    private final @Nullable List<Object> arguments;
    /**
     * Class name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object className;
    /**
     * Allows user to specify defines for the MapReduce job request.
     * 
     */
    private final @Nullable Map<String,Object> defines;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Debug info option.
     * 
     */
    private final @Nullable String getDebugInfo;
    /**
     * Jar path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object jarFilePath;
    /**
     * Jar libs.
     * 
     */
    private final @Nullable List<Object> jarLibs;
    /**
     * Jar linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse jarLinkedService;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Storage linked service references.
     * 
     */
    private final @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
    /**
     * Type of activity.
     * Expected value is 'HDInsightMapReduce'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor
    private HDInsightMapReduceActivityResponse(
        @OutputCustomType.Parameter("arguments") @Nullable List<Object> arguments,
        @OutputCustomType.Parameter("className") Object className,
        @OutputCustomType.Parameter("defines") @Nullable Map<String,Object> defines,
        @OutputCustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("getDebugInfo") @Nullable String getDebugInfo,
        @OutputCustomType.Parameter("jarFilePath") Object jarFilePath,
        @OutputCustomType.Parameter("jarLibs") @Nullable List<Object> jarLibs,
        @OutputCustomType.Parameter("jarLinkedService") @Nullable LinkedServiceReferenceResponse jarLinkedService,
        @OutputCustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @OutputCustomType.Parameter("storageLinkedServices") @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.arguments = arguments;
        this.className = className;
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.jarFilePath = jarFilePath;
        this.jarLibs = jarLibs;
        this.jarLinkedService = jarLinkedService;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.policy = policy;
        this.storageLinkedServices = storageLinkedServices;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * User specified arguments to HDInsightActivity.
     * 
    */
    public List<Object> getArguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }
    /**
     * Class name. Type: string (or Expression with resultType string).
     * 
    */
    public Object getClassName() {
        return this.className;
    }
    /**
     * Allows user to specify defines for the MapReduce job request.
     * 
    */
    public Map<String,Object> getDefines() {
        return this.defines == null ? Map.of() : this.defines;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Debug info option.
     * 
    */
    public Optional<String> getGetDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }
    /**
     * Jar path. Type: string (or Expression with resultType string).
     * 
    */
    public Object getJarFilePath() {
        return this.jarFilePath;
    }
    /**
     * Jar libs.
     * 
    */
    public List<Object> getJarLibs() {
        return this.jarLibs == null ? List.of() : this.jarLibs;
    }
    /**
     * Jar linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getJarLinkedService() {
        return Optional.ofNullable(this.jarLinkedService);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Storage linked service references.
     * 
    */
    public List<LinkedServiceReferenceResponse> getStorageLinkedServices() {
        return this.storageLinkedServices == null ? List.of() : this.storageLinkedServices;
    }
    /**
     * Type of activity.
     * Expected value is 'HDInsightMapReduce'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightMapReduceActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> arguments;
        private Object className;
        private @Nullable Map<String,Object> defines;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable String getDebugInfo;
        private Object jarFilePath;
        private @Nullable List<Object> jarLibs;
        private @Nullable LinkedServiceReferenceResponse jarLinkedService;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable List<LinkedServiceReferenceResponse> storageLinkedServices;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightMapReduceActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.className = defaults.className;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.jarFilePath = defaults.jarFilePath;
    	      this.jarLibs = defaults.jarLibs;
    	      this.jarLinkedService = defaults.jarLinkedService;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder arguments(@Nullable List<Object> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder className(Object className) {
            this.className = Objects.requireNonNull(className);
            return this;
        }

        public Builder defines(@Nullable Map<String,Object> defines) {
            this.defines = defines;
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

        public Builder getDebugInfo(@Nullable String getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }

        public Builder jarFilePath(Object jarFilePath) {
            this.jarFilePath = Objects.requireNonNull(jarFilePath);
            return this;
        }

        public Builder jarLibs(@Nullable List<Object> jarLibs) {
            this.jarLibs = jarLibs;
            return this;
        }

        public Builder jarLinkedService(@Nullable LinkedServiceReferenceResponse jarLinkedService) {
            this.jarLinkedService = jarLinkedService;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder storageLinkedServices(@Nullable List<LinkedServiceReferenceResponse> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
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
        public HDInsightMapReduceActivityResponse build() {
            return new HDInsightMapReduceActivityResponse(arguments, className, defines, dependsOn, description, getDebugInfo, jarFilePath, jarLibs, jarLinkedService, linkedServiceName, name, policy, storageLinkedServices, type, userProperties);
        }
    }
}
