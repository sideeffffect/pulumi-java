// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_v2.inputs.ExprResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Associates `members`, or principals, with a `role`.
 * 
 */
public final class BindingResponse extends com.pulumi.resources.InvokeArgs {

    public static final BindingResponse Empty = new BindingResponse();

    /**
     * The condition that is associated with this binding. If the condition evaluates to `true`, then this binding applies to the current request. If the condition evaluates to `false`, then this binding does not apply to the current request. However, a different role binding might grant the same role to one or more of the principals in this binding. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @Import(name="condition", required=true)
    private ExprResponse condition;

    public ExprResponse condition() {
        return this.condition;
    }

    /**
     * Specifies the principals requesting access for a Cloud Platform resource. `members` can have the following values: * `allUsers`: A special identifier that represents anyone who is on the internet; with or without a Google account. * `allAuthenticatedUsers`: A special identifier that represents anyone who is authenticated with a Google account or a service account. * `user:{emailid}`: An email address that represents a specific Google account. For example, `alice@example.com` . * `serviceAccount:{emailid}`: An email address that represents a service account. For example, `my-other-app@appspot.gserviceaccount.com`. * `group:{emailid}`: An email address that represents a Google group. For example, `admins@example.com`. * `deleted:user:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a user that has been recently deleted. For example, `alice@example.com?uid=123456789012345678901`. If the user is recovered, this value reverts to `user:{emailid}` and the recovered user retains the role in the binding. * `deleted:serviceAccount:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a service account that has been recently deleted. For example, `my-other-app@appspot.gserviceaccount.com?uid=123456789012345678901`. If the service account is undeleted, this value reverts to `serviceAccount:{emailid}` and the undeleted service account retains the role in the binding. * `deleted:group:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a Google group that has been recently deleted. For example, `admins@example.com?uid=123456789012345678901`. If the group is recovered, this value reverts to `group:{emailid}` and the recovered group retains the role in the binding. * `domain:{domain}`: The G Suite domain (primary) that represents all the users of that domain. For example, `google.com` or `example.com`.
     * 
     */
    @Import(name="members", required=true)
    private List<String> members;

    public List<String> members() {
        return this.members;
    }

    /**
     * Role that is assigned to the list of `members`, or principals. For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * 
     */
    @Import(name="role", required=true)
    private String role;

    public String role() {
        return this.role;
    }

    private BindingResponse() {}

    private BindingResponse(BindingResponse $) {
        this.condition = $.condition;
        this.members = $.members;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BindingResponse $;

        public Builder() {
            $ = new BindingResponse();
        }

        public Builder(BindingResponse defaults) {
            $ = new BindingResponse(Objects.requireNonNull(defaults));
        }

        public Builder condition(ExprResponse condition) {
            $.condition = condition;
            return this;
        }

        public Builder members(List<String> members) {
            $.members = members;
            return this;
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        public Builder role(String role) {
            $.role = role;
            return this;
        }

        public BindingResponse build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
