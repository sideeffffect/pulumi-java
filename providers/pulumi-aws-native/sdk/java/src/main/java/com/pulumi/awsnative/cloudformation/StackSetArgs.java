// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation;

import com.pulumi.awsnative.cloudformation.enums.StackSetCallAs;
import com.pulumi.awsnative.cloudformation.enums.StackSetCapability;
import com.pulumi.awsnative.cloudformation.enums.StackSetPermissionModel;
import com.pulumi.awsnative.cloudformation.inputs.ManagedExecutionPropertiesArgs;
import com.pulumi.awsnative.cloudformation.inputs.StackSetAutoDeploymentArgs;
import com.pulumi.awsnative.cloudformation.inputs.StackSetOperationPreferencesArgs;
import com.pulumi.awsnative.cloudformation.inputs.StackSetParameterArgs;
import com.pulumi.awsnative.cloudformation.inputs.StackSetStackInstancesArgs;
import com.pulumi.awsnative.cloudformation.inputs.StackSetTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackSetArgs Empty = new StackSetArgs();

    /**
     * The Amazon Resource Number (ARN) of the IAM role to use to create this stack set. Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account.
     * 
     */
    @Import(name="administrationRoleARN")
    private @Nullable Output<String> administrationRoleARN;

    public Optional<Output<String>> administrationRoleARN() {
        return Optional.ofNullable(this.administrationRoleARN);
    }

    /**
     * Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to the target organization or organizational unit (OU). Specify only if PermissionModel is SERVICE_MANAGED.
     * 
     */
    @Import(name="autoDeployment")
    private @Nullable Output<StackSetAutoDeploymentArgs> autoDeployment;

    public Optional<Output<StackSetAutoDeploymentArgs>> autoDeployment() {
        return Optional.ofNullable(this.autoDeployment);
    }

    /**
     * Specifies the AWS account that you are acting from. By default, SELF is specified. For self-managed permissions, specify SELF; for service-managed permissions, if you are signed in to the organization&#39;s management account, specify SELF. If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN.
     * 
     */
    @Import(name="callAs")
    private @Nullable Output<StackSetCallAs> callAs;

    public Optional<Output<StackSetCallAs>> callAs() {
        return Optional.ofNullable(this.callAs);
    }

    /**
     * In some cases, you must explicitly acknowledge that your stack set template contains certain capabilities in order for AWS CloudFormation to create the stack set and related stack instances.
     * 
     */
    @Import(name="capabilities")
    private @Nullable Output<List<StackSetCapability>> capabilities;

    public Optional<Output<List<StackSetCapability>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    /**
     * A description of the stack set. You can use the description to identify the stack set&#39;s purpose or other important information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the IAM execution role to use to create the stack set. If you do not specify an execution role, AWS CloudFormation uses the AWSCloudFormationStackSetExecutionRole role for the stack set operation.
     * 
     */
    @Import(name="executionRoleName")
    private @Nullable Output<String> executionRoleName;

    public Optional<Output<String>> executionRoleName() {
        return Optional.ofNullable(this.executionRoleName);
    }

    /**
     * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
     * 
     */
    @Import(name="managedExecution")
    private @Nullable Output<ManagedExecutionPropertiesArgs> managedExecution;

    public Optional<Output<ManagedExecutionPropertiesArgs>> managedExecution() {
        return Optional.ofNullable(this.managedExecution);
    }

    @Import(name="operationPreferences")
    private @Nullable Output<StackSetOperationPreferencesArgs> operationPreferences;

    public Optional<Output<StackSetOperationPreferencesArgs>> operationPreferences() {
        return Optional.ofNullable(this.operationPreferences);
    }

    /**
     * The input parameters for the stack set template.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<StackSetParameterArgs>> parameters;

    public Optional<Output<List<StackSetParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Describes how the IAM roles required for stack set operations are created. By default, SELF-MANAGED is specified.
     * 
     */
    @Import(name="permissionModel", required=true)
    private Output<StackSetPermissionModel> permissionModel;

    public Output<StackSetPermissionModel> permissionModel() {
        return this.permissionModel;
    }

    /**
     * A group of stack instances with parameters in some specific accounts and regions.
     * 
     */
    @Import(name="stackInstancesGroup")
    private @Nullable Output<List<StackSetStackInstancesArgs>> stackInstancesGroup;

    public Optional<Output<List<StackSetStackInstancesArgs>>> stackInstancesGroup() {
        return Optional.ofNullable(this.stackInstancesGroup);
    }

    /**
     * The name to associate with the stack set. The name must be unique in the Region where you create your stack set.
     * 
     */
    @Import(name="stackSetName")
    private @Nullable Output<String> stackSetName;

    public Optional<Output<String>> stackSetName() {
        return Optional.ofNullable(this.stackSetName);
    }

    /**
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be specified.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<StackSetTagArgs>> tags;

    public Optional<Output<List<StackSetTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200 bytes.
     * 
     */
    @Import(name="templateBody")
    private @Nullable Output<String> templateBody;

    public Optional<Output<String>> templateBody() {
        return Optional.ofNullable(this.templateBody);
    }

    /**
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket.
     * 
     */
    @Import(name="templateURL")
    private @Nullable Output<String> templateURL;

    public Optional<Output<String>> templateURL() {
        return Optional.ofNullable(this.templateURL);
    }

    private StackSetArgs() {}

    private StackSetArgs(StackSetArgs $) {
        this.administrationRoleARN = $.administrationRoleARN;
        this.autoDeployment = $.autoDeployment;
        this.callAs = $.callAs;
        this.capabilities = $.capabilities;
        this.description = $.description;
        this.executionRoleName = $.executionRoleName;
        this.managedExecution = $.managedExecution;
        this.operationPreferences = $.operationPreferences;
        this.parameters = $.parameters;
        this.permissionModel = $.permissionModel;
        this.stackInstancesGroup = $.stackInstancesGroup;
        this.stackSetName = $.stackSetName;
        this.tags = $.tags;
        this.templateBody = $.templateBody;
        this.templateURL = $.templateURL;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackSetArgs $;

        public Builder() {
            $ = new StackSetArgs();
        }

        public Builder(StackSetArgs defaults) {
            $ = new StackSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder administrationRoleARN(@Nullable Output<String> administrationRoleARN) {
            $.administrationRoleARN = administrationRoleARN;
            return this;
        }

        public Builder administrationRoleARN(String administrationRoleARN) {
            return administrationRoleARN(Output.of(administrationRoleARN));
        }

        public Builder autoDeployment(@Nullable Output<StackSetAutoDeploymentArgs> autoDeployment) {
            $.autoDeployment = autoDeployment;
            return this;
        }

        public Builder autoDeployment(StackSetAutoDeploymentArgs autoDeployment) {
            return autoDeployment(Output.of(autoDeployment));
        }

        public Builder callAs(@Nullable Output<StackSetCallAs> callAs) {
            $.callAs = callAs;
            return this;
        }

        public Builder callAs(StackSetCallAs callAs) {
            return callAs(Output.of(callAs));
        }

        public Builder capabilities(@Nullable Output<List<StackSetCapability>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        public Builder capabilities(List<StackSetCapability> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        public Builder capabilities(StackSetCapability... capabilities) {
            return capabilities(List.of(capabilities));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder executionRoleName(@Nullable Output<String> executionRoleName) {
            $.executionRoleName = executionRoleName;
            return this;
        }

        public Builder executionRoleName(String executionRoleName) {
            return executionRoleName(Output.of(executionRoleName));
        }

        public Builder managedExecution(@Nullable Output<ManagedExecutionPropertiesArgs> managedExecution) {
            $.managedExecution = managedExecution;
            return this;
        }

        public Builder managedExecution(ManagedExecutionPropertiesArgs managedExecution) {
            return managedExecution(Output.of(managedExecution));
        }

        public Builder operationPreferences(@Nullable Output<StackSetOperationPreferencesArgs> operationPreferences) {
            $.operationPreferences = operationPreferences;
            return this;
        }

        public Builder operationPreferences(StackSetOperationPreferencesArgs operationPreferences) {
            return operationPreferences(Output.of(operationPreferences));
        }

        public Builder parameters(@Nullable Output<List<StackSetParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<StackSetParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(StackSetParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder permissionModel(Output<StackSetPermissionModel> permissionModel) {
            $.permissionModel = permissionModel;
            return this;
        }

        public Builder permissionModel(StackSetPermissionModel permissionModel) {
            return permissionModel(Output.of(permissionModel));
        }

        public Builder stackInstancesGroup(@Nullable Output<List<StackSetStackInstancesArgs>> stackInstancesGroup) {
            $.stackInstancesGroup = stackInstancesGroup;
            return this;
        }

        public Builder stackInstancesGroup(List<StackSetStackInstancesArgs> stackInstancesGroup) {
            return stackInstancesGroup(Output.of(stackInstancesGroup));
        }

        public Builder stackInstancesGroup(StackSetStackInstancesArgs... stackInstancesGroup) {
            return stackInstancesGroup(List.of(stackInstancesGroup));
        }

        public Builder stackSetName(@Nullable Output<String> stackSetName) {
            $.stackSetName = stackSetName;
            return this;
        }

        public Builder stackSetName(String stackSetName) {
            return stackSetName(Output.of(stackSetName));
        }

        public Builder tags(@Nullable Output<List<StackSetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<StackSetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(StackSetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder templateBody(@Nullable Output<String> templateBody) {
            $.templateBody = templateBody;
            return this;
        }

        public Builder templateBody(String templateBody) {
            return templateBody(Output.of(templateBody));
        }

        public Builder templateURL(@Nullable Output<String> templateURL) {
            $.templateURL = templateURL;
            return this;
        }

        public Builder templateURL(String templateURL) {
            return templateURL(Output.of(templateURL));
        }

        public StackSetArgs build() {
            $.permissionModel = Objects.requireNonNull($.permissionModel, "expected parameter 'permissionModel' to be non-null");
            return $;
        }
    }

}
