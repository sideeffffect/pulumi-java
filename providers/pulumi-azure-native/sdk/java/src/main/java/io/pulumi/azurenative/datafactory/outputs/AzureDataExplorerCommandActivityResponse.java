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
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureDataExplorerCommandActivityResponse {
    /**
     * A control command, according to the Azure Data Explorer command syntax. Type: string (or Expression with resultType string).
     * 
     */
    private final Object command;
    /**
     * Control command timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..)
     * 
     */
    private final @Nullable Object commandTimeout;
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
     * Type of activity.
     * Expected value is 'AzureDataExplorerCommand'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"command","commandTimeout","dependsOn","description","linkedServiceName","name","policy","type","userProperties"})
    private AzureDataExplorerCommandActivityResponse(
        Object command,
        @Nullable Object commandTimeout,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.command = command;
        this.commandTimeout = commandTimeout;
        this.dependsOn = dependsOn;
        this.description = description;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.policy = policy;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * A control command, according to the Azure Data Explorer command syntax. Type: string (or Expression with resultType string).
     * 
    */
    public Object getCommand() {
        return this.command;
    }
    /**
     * Control command timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..)
     * 
    */
    public Optional<Object> getCommandTimeout() {
        return Optional.ofNullable(this.commandTimeout);
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
     * Type of activity.
     * Expected value is 'AzureDataExplorerCommand'.
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

    public static Builder builder(AzureDataExplorerCommandActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object command;
        private @Nullable Object commandTimeout;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerCommandActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.commandTimeout = defaults.commandTimeout;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setCommand(Object command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setCommandTimeout(@Nullable Object commandTimeout) {
            this.commandTimeout = commandTimeout;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public AzureDataExplorerCommandActivityResponse build() {
            return new AzureDataExplorerCommandActivityResponse(command, commandTimeout, dependsOn, description, linkedServiceName, name, policy, type, userProperties);
        }
    }
}
