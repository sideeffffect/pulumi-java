// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentStoreIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreIamBindingArgs Empty = new ConsentStoreIamBindingArgs();

    @InputImport(name="condition")
      private final @Nullable Input<ConsentStoreIamBindingConditionArgs> condition;

    public Input<ConsentStoreIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="consentStoreId", required=true)
      private final Input<String> consentStoreId;

    public Input<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="dataset", required=true)
      private final Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset;
    }

    @InputImport(name="members", required=true)
      private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ConsentStoreIamBindingArgs(
        @Nullable Input<ConsentStoreIamBindingConditionArgs> condition,
        Input<String> consentStoreId,
        Input<String> dataset,
        Input<List<String>> members,
        Input<String> role) {
        this.condition = condition;
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ConsentStoreIamBindingArgs() {
        this.condition = Input.empty();
        this.consentStoreId = Input.empty();
        this.dataset = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConsentStoreIamBindingConditionArgs> condition;
        private Input<String> consentStoreId;
        private Input<String> dataset;
        private Input<List<String>> members;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.dataset = defaults.dataset;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Input<ConsentStoreIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable ConsentStoreIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder consentStoreId(Input<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Input.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder dataset(Input<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder dataset(String dataset) {
            this.dataset = Input.of(Objects.requireNonNull(dataset));
            return this;
        }

        public Builder members(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder members(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder role(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public ConsentStoreIamBindingArgs build() {
            return new ConsentStoreIamBindingArgs(condition, consentStoreId, dataset, members, role);
        }
    }
}
