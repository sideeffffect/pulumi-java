// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.iap_v1.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class V1IamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final V1IamPolicyArgs Empty = new V1IamPolicyArgs();

    /**
     * Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.
     * 
     */
    @InputImport(name="bindings")
      private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="v1Id", required=true)
      private final Input<String> v1Id;

    public Input<String> getV1Id() {
        return this.v1Id;
    }

    /**
     * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public V1IamPolicyArgs(
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        Input<String> v1Id,
        @Nullable Input<Integer> version) {
        this.bindings = bindings;
        this.etag = etag;
        this.v1Id = Objects.requireNonNull(v1Id, "expected parameter 'v1Id' to be non-null");
        this.version = version;
    }

    private V1IamPolicyArgs() {
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.v1Id = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V1IamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private Input<String> v1Id;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(V1IamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.v1Id = defaults.v1Id;
    	      this.version = defaults.version;
        }

        public Builder bindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder bindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder v1Id(Input<String> v1Id) {
            this.v1Id = Objects.requireNonNull(v1Id);
            return this;
        }

        public Builder v1Id(String v1Id) {
            this.v1Id = Input.of(Objects.requireNonNull(v1Id));
            return this;
        }

        public Builder version(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public V1IamPolicyArgs build() {
            return new V1IamPolicyArgs(bindings, etag, v1Id, version);
        }
    }
}
