// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * Policy that grants an entity permission to assume the role.
     * 
     */
    @Import(name="assumeRolePolicy", required=true)
    private Output<String> assumeRolePolicy;

    public Output<String> assumeRolePolicy() {
        return this.assumeRolePolicy;
    }

    /**
     * Description of the role.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
     * 
     */
    @Import(name="forceDetachPolicies")
    private @Nullable Output<Boolean> forceDetachPolicies;

    public Optional<Output<Boolean>> forceDetachPolicies() {
        return Optional.ofNullable(this.forceDetachPolicies);
    }

    /**
     * Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, this provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inline_policy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
     * 
     */
    @Import(name="inlinePolicies")
    private @Nullable Output<List<RoleInlinePolicyArgs>> inlinePolicies;

    public Optional<Output<List<RoleInlinePolicyArgs>>> inlinePolicies() {
        return Optional.ofNullable(this.inlinePolicies);
    }

    /**
     * Set of exclusive IAM managed policy ARNs to attach to the IAM role. If this attribute is not configured, this provider will ignore policy attachments to this resource. When configured, the provider will align the role&#39;s managed policy attachments with this set by attaching or detaching managed policies. Configuring an empty set (i.e., `managed_policy_arns = []`) will cause the provider to remove _all_ managed policy attachments.
     * 
     */
    @Import(name="managedPolicyArns")
    private @Nullable Output<List<String>> managedPolicyArns;

    public Optional<Output<List<String>>> managedPolicyArns() {
        return Optional.ofNullable(this.managedPolicyArns);
    }

    /**
     * Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * 
     */
    @Import(name="maxSessionDuration")
    private @Nullable Output<Integer> maxSessionDuration;

    public Optional<Output<Integer>> maxSessionDuration() {
        return Optional.ofNullable(this.maxSessionDuration);
    }

    /**
     * Name of the role policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * ARN of the policy that is used to set the permissions boundary for the role.
     * 
     */
    @Import(name="permissionsBoundary")
    private @Nullable Output<String> permissionsBoundary;

    public Optional<Output<String>> permissionsBoundary() {
        return Optional.ofNullable(this.permissionsBoundary);
    }

    /**
     * Key-value mapping of tags for the IAM role. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RoleArgs() {}

    private RoleArgs(RoleArgs $) {
        this.assumeRolePolicy = $.assumeRolePolicy;
        this.description = $.description;
        this.forceDetachPolicies = $.forceDetachPolicies;
        this.inlinePolicies = $.inlinePolicies;
        this.managedPolicyArns = $.managedPolicyArns;
        this.maxSessionDuration = $.maxSessionDuration;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.path = $.path;
        this.permissionsBoundary = $.permissionsBoundary;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleArgs $;

        public Builder() {
            $ = new RoleArgs();
        }

        public Builder(RoleArgs defaults) {
            $ = new RoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder assumeRolePolicy(Output<String> assumeRolePolicy) {
            $.assumeRolePolicy = assumeRolePolicy;
            return this;
        }

        public Builder assumeRolePolicy(String assumeRolePolicy) {
            return assumeRolePolicy(Output.of(assumeRolePolicy));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder forceDetachPolicies(@Nullable Output<Boolean> forceDetachPolicies) {
            $.forceDetachPolicies = forceDetachPolicies;
            return this;
        }

        public Builder forceDetachPolicies(Boolean forceDetachPolicies) {
            return forceDetachPolicies(Output.of(forceDetachPolicies));
        }

        public Builder inlinePolicies(@Nullable Output<List<RoleInlinePolicyArgs>> inlinePolicies) {
            $.inlinePolicies = inlinePolicies;
            return this;
        }

        public Builder inlinePolicies(List<RoleInlinePolicyArgs> inlinePolicies) {
            return inlinePolicies(Output.of(inlinePolicies));
        }

        public Builder inlinePolicies(RoleInlinePolicyArgs... inlinePolicies) {
            return inlinePolicies(List.of(inlinePolicies));
        }

        public Builder managedPolicyArns(@Nullable Output<List<String>> managedPolicyArns) {
            $.managedPolicyArns = managedPolicyArns;
            return this;
        }

        public Builder managedPolicyArns(List<String> managedPolicyArns) {
            return managedPolicyArns(Output.of(managedPolicyArns));
        }

        public Builder managedPolicyArns(String... managedPolicyArns) {
            return managedPolicyArns(List.of(managedPolicyArns));
        }

        public Builder maxSessionDuration(@Nullable Output<Integer> maxSessionDuration) {
            $.maxSessionDuration = maxSessionDuration;
            return this;
        }

        public Builder maxSessionDuration(Integer maxSessionDuration) {
            return maxSessionDuration(Output.of(maxSessionDuration));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder permissionsBoundary(@Nullable Output<String> permissionsBoundary) {
            $.permissionsBoundary = permissionsBoundary;
            return this;
        }

        public Builder permissionsBoundary(String permissionsBoundary) {
            return permissionsBoundary(Output.of(permissionsBoundary));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RoleArgs build() {
            $.assumeRolePolicy = Objects.requireNonNull($.assumeRolePolicy, "expected parameter 'assumeRolePolicy' to be non-null");
            return $;
        }
    }

}
