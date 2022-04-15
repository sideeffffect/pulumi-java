// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelConditionDevicePolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Allows configuring a single access level condition to be appended to an access level's conditions.
 * This resource is intended to be used in cases where it is not possible to compile a full list
 * of conditions to include in a `gcp.accesscontextmanager.AccessLevel` resource,
 * to enable them to be added separately.
 * 
 * > **Note:** If this resource is used alongside a `gcp.accesscontextmanager.AccessLevel` resource,
 * the access level resource must have a `lifecycle` block with `ignore_changes = [basic[0].conditions]` so
 * they don't fight over which service accounts should be included.
 * 
 * To get more information about AccessLevelCondition, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * > **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition")
public class AccessLevelCondition extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Access Level to add this condition to.
     * 
     */
    @Export(name="accessLevel", type=String.class, parameters={})
    private Output<String> accessLevel;

    /**
     * @return The name of the Access Level to add this condition to.
     * 
     */
    public Output<String> accessLevel() {
        return this.accessLevel;
    }
    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    @Export(name="devicePolicy", type=AccessLevelConditionDevicePolicy.class, parameters={})
    private Output</* @Nullable */ AccessLevelConditionDevicePolicy> devicePolicy;

    /**
     * @return Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AccessLevelConditionDevicePolicy> devicePolicy() {
        return this.devicePolicy;
    }
    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    @Export(name="ipSubnetworks", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipSubnetworks;

    /**
     * @return A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    public Output</* @Nullable */ List<String>> ipSubnetworks() {
        return this.ipSubnetworks;
    }
    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    @Export(name="members", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> members;

    /**
     * @return An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    public Output</* @Nullable */ List<String>> members() {
        return this.members;
    }
    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    @Export(name="negate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> negate;

    /**
     * @return Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    public Output</* @Nullable */ Boolean> negate() {
        return this.negate;
    }
    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    @Export(name="regions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> regions;

    /**
     * @return The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    public Output</* @Nullable */ List<String>> regions() {
        return this.regions;
    }
    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    @Export(name="requiredAccessLevels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> requiredAccessLevels;

    /**
     * @return A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    public Output</* @Nullable */ List<String>> requiredAccessLevels() {
        return this.requiredAccessLevels;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevelCondition(String name) {
        this(name, AccessLevelConditionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevelCondition(String name, AccessLevelConditionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevelCondition(String name, AccessLevelConditionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition", name, args == null ? AccessLevelConditionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessLevelCondition(String name, Output<String> id, @Nullable AccessLevelConditionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition", name, state, makeResourceOptions(options, id));
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
    public static AccessLevelCondition get(String name, Output<String> id, @Nullable AccessLevelConditionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevelCondition(name, id, state, options);
    }
}
