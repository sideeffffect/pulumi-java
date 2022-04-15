// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.aws.organizations.inputs.GetOrganizationRootPolicyType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetOrganizationRoot extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationRoot Empty = new GetOrganizationRoot();

    /**
     * ARN of the root
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    /**
     * Identifier of the root
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The name of the policy type
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * List of policy types enabled for this root. All elements have these attributes:
     * 
     */
    @Import(name="policyTypes", required=true)
      private final List<GetOrganizationRootPolicyType> policyTypes;

    public List<GetOrganizationRootPolicyType> policyTypes() {
        return this.policyTypes;
    }

    public GetOrganizationRoot(
        String arn,
        String id,
        String name,
        List<GetOrganizationRootPolicyType> policyTypes) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policyTypes = Objects.requireNonNull(policyTypes, "expected parameter 'policyTypes' to be non-null");
    }

    private GetOrganizationRoot() {
        this.arn = null;
        this.id = null;
        this.name = null;
        this.policyTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationRoot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private List<GetOrganizationRootPolicyType> policyTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationRoot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.policyTypes = defaults.policyTypes;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policyTypes(List<GetOrganizationRootPolicyType> policyTypes) {
            this.policyTypes = Objects.requireNonNull(policyTypes);
            return this;
        }
        public Builder policyTypes(GetOrganizationRootPolicyType... policyTypes) {
            return policyTypes(List.of(policyTypes));
        }        public GetOrganizationRoot build() {
            return new GetOrganizationRoot(arn, id, name, policyTypes);
        }
    }
}
