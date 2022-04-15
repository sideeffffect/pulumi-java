// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamMemberArgs Empty = new FhirStoreIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<FhirStoreIamMemberConditionArgs> condition;

    public Output<FhirStoreIamMemberConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="fhirStoreId", required=true)
      private final Output<String> fhirStoreId;

    public Output<String> fhirStoreId() {
        return this.fhirStoreId;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    public FhirStoreIamMemberArgs(
        @Nullable Output<FhirStoreIamMemberConditionArgs> condition,
        Output<String> fhirStoreId,
        Output<String> member,
        Output<String> role) {
        this.condition = condition;
        this.fhirStoreId = Objects.requireNonNull(fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private FhirStoreIamMemberArgs() {
        this.condition = Codegen.empty();
        this.fhirStoreId = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FhirStoreIamMemberConditionArgs> condition;
        private Output<String> fhirStoreId;
        private Output<String> member;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<FhirStoreIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable FhirStoreIamMemberConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder fhirStoreId(Output<String> fhirStoreId) {
            this.fhirStoreId = Objects.requireNonNull(fhirStoreId);
            return this;
        }
        public Builder fhirStoreId(String fhirStoreId) {
            this.fhirStoreId = Output.of(Objects.requireNonNull(fhirStoreId));
            return this;
        }
        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }
        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public FhirStoreIamMemberArgs build() {
            return new FhirStoreIamMemberArgs(condition, fhirStoreId, member, role);
        }
    }
}
