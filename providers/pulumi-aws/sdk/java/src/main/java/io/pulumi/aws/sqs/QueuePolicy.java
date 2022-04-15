// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sqs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sqs.QueuePolicyArgs;
import io.pulumi.aws.sqs.inputs.QueuePolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows you to set a policy of an SQS Queue
 * while referencing ARN of the queue within the policy.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SQS Queue Policies can be imported using the queue URL, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sqs/queuePolicy:QueuePolicy test https://queue.amazonaws.com/0123456789012/myqueue
 * ```
 * 
 */
@ResourceType(type="aws:sqs/queuePolicy:QueuePolicy")
public class QueuePolicy extends io.pulumi.resources.CustomResource {
    /**
     * The JSON policy for the SQS queue.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The JSON policy for the SQS queue.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The URL of the SQS Queue to which to attach the policy
     * 
     */
    @Export(name="queueUrl", type=String.class, parameters={})
    private Output<String> queueUrl;

    /**
     * @return The URL of the SQS Queue to which to attach the policy
     * 
     */
    public Output<String> queueUrl() {
        return this.queueUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QueuePolicy(String name) {
        this(name, QueuePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QueuePolicy(String name, QueuePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QueuePolicy(String name, QueuePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sqs/queuePolicy:QueuePolicy", name, args == null ? QueuePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private QueuePolicy(String name, Output<String> id, @Nullable QueuePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sqs/queuePolicy:QueuePolicy", name, state, makeResourceOptions(options, id));
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
    public static QueuePolicy get(String name, Output<String> id, @Nullable QueuePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new QueuePolicy(name, id, state, options);
    }
}
