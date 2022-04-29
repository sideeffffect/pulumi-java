// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsentStoreIamBindingState extends ResourceArgs {

    public static final ConsentStoreIamBindingState Empty = new ConsentStoreIamBindingState();

    @Import(name="condition")
    private @Nullable Output<ConsentStoreIamBindingConditionArgs> condition;

    public Optional<Output<ConsentStoreIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="consentStoreId")
    private @Nullable Output<String> consentStoreId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> consentStoreId() {
        return Optional.ofNullable(this.consentStoreId);
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="members")
    private @Nullable Output<List<String>> members;

    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private ConsentStoreIamBindingState() {}

    private ConsentStoreIamBindingState(ConsentStoreIamBindingState $) {
        this.condition = $.condition;
        this.consentStoreId = $.consentStoreId;
        this.dataset = $.dataset;
        this.etag = $.etag;
        this.members = $.members;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsentStoreIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsentStoreIamBindingState $;

        public Builder() {
            $ = new ConsentStoreIamBindingState();
        }

        public Builder(ConsentStoreIamBindingState defaults) {
            $ = new ConsentStoreIamBindingState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<ConsentStoreIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(ConsentStoreIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param consentStoreId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(@Nullable Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        /**
         * @param consentStoreId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ConsentStoreIamBindingState build() {
            return $;
        }
    }

}
