// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.binaryauthorization.PolicyArgs;
import io.pulumi.gcp.binaryauthorization.inputs.PolicyState;
import io.pulumi.gcp.binaryauthorization.outputs.PolicyAdmissionWhitelistPattern;
import io.pulumi.gcp.binaryauthorization.outputs.PolicyClusterAdmissionRule;
import io.pulumi.gcp.binaryauthorization.outputs.PolicyDefaultAdmissionRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A policy for container image binary authorization.
 * 
 * To get more information about Policy, see:
 * 
 * * [API documentation](https://cloud.google.com/binary-authorization/docs/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/binary-authorization/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Policy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/policy:Policy default projects/{{project}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:binaryauthorization/policy:Policy default {{project}}
 * ```
 * 
 */
@ResourceType(type="gcp:binaryauthorization/policy:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * A whitelist of image patterns to exclude from admission rules. If an
     * image's name matches a whitelist pattern, the image's admission
     * requests will always be permitted regardless of your admission rules.
     * Structure is documented below.
     * 
     */
    @Export(name="admissionWhitelistPatterns", type=List.class, parameters={PolicyAdmissionWhitelistPattern.class})
    private Output</* @Nullable */ List<PolicyAdmissionWhitelistPattern>> admissionWhitelistPatterns;

    /**
     * @return A whitelist of image patterns to exclude from admission rules. If an
     * image's name matches a whitelist pattern, the image's admission
     * requests will always be permitted regardless of your admission rules.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<PolicyAdmissionWhitelistPattern>> admissionWhitelistPatterns() {
        return this.admissionWhitelistPatterns;
    }
    /**
     * Per-cluster admission rules. An admission rule specifies either that
     * all container images used in a pod creation request must be attested
     * to by one or more attestors, that all pod creations will be allowed,
     * or that all pod creations will be denied. There can be at most one
     * admission rule per cluster spec.
     * 
     */
    @Export(name="clusterAdmissionRules", type=List.class, parameters={PolicyClusterAdmissionRule.class})
    private Output</* @Nullable */ List<PolicyClusterAdmissionRule>> clusterAdmissionRules;

    /**
     * @return Per-cluster admission rules. An admission rule specifies either that
     * all container images used in a pod creation request must be attested
     * to by one or more attestors, that all pod creations will be allowed,
     * or that all pod creations will be denied. There can be at most one
     * admission rule per cluster spec.
     * 
     */
    public Output</* @Nullable */ List<PolicyClusterAdmissionRule>> clusterAdmissionRules() {
        return this.clusterAdmissionRules;
    }
    /**
     * Default admission rule for a cluster without a per-cluster admission
     * rule.
     * Structure is documented below.
     * 
     */
    @Export(name="defaultAdmissionRule", type=PolicyDefaultAdmissionRule.class, parameters={})
    private Output<PolicyDefaultAdmissionRule> defaultAdmissionRule;

    /**
     * @return Default admission rule for a cluster without a per-cluster admission
     * rule.
     * Structure is documented below.
     * 
     */
    public Output<PolicyDefaultAdmissionRule> defaultAdmissionRule() {
        return this.defaultAdmissionRule;
    }
    /**
     * A descriptive comment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A descriptive comment.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Controls the evaluation of a Google-maintained global admission policy
     * for common system-level images. Images not covered by the global
     * policy will be subject to the project admission policy.
     * Possible values are `ENABLE` and `DISABLE`.
     * 
     */
    @Export(name="globalPolicyEvaluationMode", type=String.class, parameters={})
    private Output<String> globalPolicyEvaluationMode;

    /**
     * @return Controls the evaluation of a Google-maintained global admission policy
     * for common system-level images. Images not covered by the global
     * policy will be subject to the project admission policy.
     * Possible values are `ENABLE` and `DISABLE`.
     * 
     */
    public Output<String> globalPolicyEvaluationMode() {
        return this.globalPolicyEvaluationMode;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Policy(String name, Output<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:binaryauthorization/policy:Policy", name, state, makeResourceOptions(options, id));
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
    public static Policy get(String name, Output<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
