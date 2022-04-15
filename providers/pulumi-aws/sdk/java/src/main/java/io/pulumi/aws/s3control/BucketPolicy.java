// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3control.BucketPolicyArgs;
import io.pulumi.aws.s3control.inputs.BucketPolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an S3 Control Bucket Policy.
 * 
 * > This functionality is for managing [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html). To manage S3 Bucket Policies in an AWS Partition, see the `aws.s3.BucketPolicy` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * S3 Control Bucket Policies can be imported using the Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3control/bucketPolicy:BucketPolicy example arn:aws:s3-outposts:us-east-1:123456789012:outpost/op-12345678/bucket/example
 * ```
 * 
 */
@ResourceType(type="aws:s3control/bucketPolicy:BucketPolicy")
public class BucketPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return Amazon Resource Name (ARN) of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * JSON string of the resource policy.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return JSON string of the resource policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketPolicy(String name) {
        this(name, BucketPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketPolicy(String name, BucketPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketPolicy(String name, BucketPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/bucketPolicy:BucketPolicy", name, args == null ? BucketPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketPolicy(String name, Output<String> id, @Nullable BucketPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3control/bucketPolicy:BucketPolicy", name, state, makeResourceOptions(options, id));
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
    public static BucketPolicy get(String name, Output<String> id, @Nullable BucketPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketPolicy(name, id, state, options);
    }
}
