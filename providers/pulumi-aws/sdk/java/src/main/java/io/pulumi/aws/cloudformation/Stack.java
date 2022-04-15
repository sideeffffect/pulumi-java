// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudformation.StackArgs;
import io.pulumi.aws.cloudformation.inputs.StackState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CloudFormation Stack resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cloudformation Stacks can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudformation/stack:Stack stack networking-stack
 * ```
 * 
 */
@ResourceType(type="aws:cloudformation/stack:Stack")
public class Stack extends io.pulumi.resources.CustomResource {
    /**
     * A list of capabilities.
     * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
     * 
     */
    @Export(name="capabilities", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> capabilities;

    /**
     * @return A list of capabilities.
     * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
     * 
     */
    public Output</* @Nullable */ List<String>> capabilities() {
        return this.capabilities;
    }
    /**
     * Set to true to disable rollback of the stack if stack creation failed.
     * Conflicts with `on_failure`.
     * 
     */
    @Export(name="disableRollback", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableRollback;

    /**
     * @return Set to true to disable rollback of the stack if stack creation failed.
     * Conflicts with `on_failure`.
     * 
     */
    public Output</* @Nullable */ Boolean> disableRollback() {
        return this.disableRollback;
    }
    /**
     * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * 
     */
    @Export(name="iamRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamRoleArn;

    /**
     * @return The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * 
     */
    public Output</* @Nullable */ String> iamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * Stack name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Stack name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of SNS topic ARNs to publish stack related events.
     * 
     */
    @Export(name="notificationArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> notificationArns;

    /**
     * @return A list of SNS topic ARNs to publish stack related events.
     * 
     */
    public Output</* @Nullable */ List<String>> notificationArns() {
        return this.notificationArns;
    }
    /**
     * Action to be taken if stack creation fails. This must be
     * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disable_rollback`.
     * 
     */
    @Export(name="onFailure", type=String.class, parameters={})
    private Output</* @Nullable */ String> onFailure;

    /**
     * @return Action to be taken if stack creation fails. This must be
     * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disable_rollback`.
     * 
     */
    public Output</* @Nullable */ String> onFailure() {
        return this.onFailure;
    }
    /**
     * A map of outputs from the stack.
     * 
     */
    @Export(name="outputs", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> outputs;

    /**
     * @return A map of outputs from the stack.
     * 
     */
    public Output<Map<String,String>> outputs() {
        return this.outputs;
    }
    /**
     * A map of Parameter structures that specify input parameters for the stack.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> parameters;

    /**
     * @return A map of Parameter structures that specify input parameters for the stack.
     * 
     */
    public Output<Map<String,String>> parameters() {
        return this.parameters;
    }
    /**
     * Structure containing the stack policy body.
     * Conflicts w/ `policy_url`.
     * 
     */
    @Export(name="policyBody", type=String.class, parameters={})
    private Output<String> policyBody;

    /**
     * @return Structure containing the stack policy body.
     * Conflicts w/ `policy_url`.
     * 
     */
    public Output<String> policyBody() {
        return this.policyBody;
    }
    /**
     * Location of a file containing the stack policy.
     * Conflicts w/ `policy_body`.
     * 
     */
    @Export(name="policyUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyUrl;

    /**
     * @return Location of a file containing the stack policy.
     * Conflicts w/ `policy_body`.
     * 
     */
    public Output</* @Nullable */ String> policyUrl() {
        return this.policyUrl;
    }
    /**
     * Map of resource tags to associate with this stack. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags to associate with this stack. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Structure containing the template body (max size: 51,200 bytes).
     * 
     */
    @Export(name="templateBody", type=String.class, parameters={})
    private Output<String> templateBody;

    /**
     * @return Structure containing the template body (max size: 51,200 bytes).
     * 
     */
    public Output<String> templateBody() {
        return this.templateBody;
    }
    /**
     * Location of a file containing the template body (max size: 460,800 bytes).
     * 
     */
    @Export(name="templateUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateUrl;

    /**
     * @return Location of a file containing the template body (max size: 460,800 bytes).
     * 
     */
    public Output</* @Nullable */ String> templateUrl() {
        return this.templateUrl;
    }
    /**
     * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
     * 
     */
    @Export(name="timeoutInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutInMinutes;

    /**
     * @return The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
     * 
     */
    public Output</* @Nullable */ Integer> timeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stack(String name) {
        this(name, StackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stack(String name, @Nullable StackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stack(String name, @Nullable StackArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/stack:Stack", name, args == null ? StackArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stack(String name, Output<String> id, @Nullable StackState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudformation/stack:Stack", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Stack get(String name, Output<String> id, @Nullable StackState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stack(name, id, state, options);
    }
}
