// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Data Explorer command activity.
 * 
 */
public final class AzureDataExplorerCommandActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDataExplorerCommandActivityArgs Empty = new AzureDataExplorerCommandActivityArgs();

    /**
     * A control command, according to the Azure Data Explorer command syntax. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="command", required=true)
      private final Input<Object> command;

    public Input<Object> getCommand() {
        return this.command;
    }

    /**
     * Control command timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..)
     * 
     */
    @InputImport(name="commandTimeout")
      private final @Nullable Input<Object> commandTimeout;

    public Input<Object> getCommandTimeout() {
        return this.commandTimeout == null ? Input.empty() : this.commandTimeout;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
      private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Type of activity.
     * Expected value is 'AzureDataExplorerCommand'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public AzureDataExplorerCommandActivityArgs(
        Input<Object> command,
        @Nullable Input<Object> commandTimeout,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.commandTimeout = commandTimeout;
        this.dependsOn = dependsOn;
        this.description = description;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private AzureDataExplorerCommandActivityArgs() {
        this.command = Input.empty();
        this.commandTimeout = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.linkedServiceName = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerCommandActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> command;
        private @Nullable Input<Object> commandTimeout;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerCommandActivityArgs defaults) {
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

        public Builder command(Input<Object> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder command(Object command) {
            this.command = Input.of(Objects.requireNonNull(command));
            return this;
        }

        public Builder commandTimeout(@Nullable Input<Object> commandTimeout) {
            this.commandTimeout = commandTimeout;
            return this;
        }

        public Builder commandTimeout(@Nullable Object commandTimeout) {
            this.commandTimeout = Input.ofNullable(commandTimeout);
            return this;
        }

        public Builder dependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder linkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder policy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder userProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }
        public AzureDataExplorerCommandActivityArgs build() {
            return new AzureDataExplorerCommandActivityArgs(command, commandTimeout, dependsOn, description, linkedServiceName, name, policy, type, userProperties);
        }
    }
}
