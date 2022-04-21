// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
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
 * Azure Data Explorer command activity.
 * 
 */
public final class AzureDataExplorerCommandActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureDataExplorerCommandActivityArgs Empty = new AzureDataExplorerCommandActivityArgs();

    /**
     * A control command, according to the Azure Data Explorer command syntax. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="command", required=true)
    private Output<Object> command;

    public Output<Object> command() {
        return this.command;
    }

    /**
     * Control command timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..)
     * 
     */
    @Import(name="commandTimeout")
    private @Nullable Output<Object> commandTimeout;

    public Optional<Output<Object>> commandTimeout() {
        return Optional.ofNullable(this.commandTimeout);
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
     * Type of activity.
     * Expected value is &#39;AzureDataExplorerCommand&#39;.
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

    private AzureDataExplorerCommandActivityArgs() {}

    private AzureDataExplorerCommandActivityArgs(AzureDataExplorerCommandActivityArgs $) {
        this.command = $.command;
        this.commandTimeout = $.commandTimeout;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDataExplorerCommandActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDataExplorerCommandActivityArgs $;

        public Builder() {
            $ = new AzureDataExplorerCommandActivityArgs();
        }

        public Builder(AzureDataExplorerCommandActivityArgs defaults) {
            $ = new AzureDataExplorerCommandActivityArgs(Objects.requireNonNull(defaults));
        }

        public Builder command(Output<Object> command) {
            $.command = command;
            return this;
        }

        public Builder command(Object command) {
            return command(Output.of(command));
        }

        public Builder commandTimeout(@Nullable Output<Object> commandTimeout) {
            $.commandTimeout = commandTimeout;
            return this;
        }

        public Builder commandTimeout(Object commandTimeout) {
            return commandTimeout(Output.of(commandTimeout));
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

        public AzureDataExplorerCommandActivityArgs build() {
            $.command = Objects.requireNonNull($.command, "expected parameter 'command' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
