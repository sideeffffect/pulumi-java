// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationNonMasterAccount {
    /**
     * ARN of the root
     * 
     */
    private final String arn;
    /**
     * Email of the account
     * 
     */
    private final String email;
    /**
     * Identifier of the root
     * 
     */
    private final String id;
    /**
     * The name of the policy type
     * 
     */
    private final String name;
    /**
     * The status of the policy type as it relates to the associated root
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"arn","email","id","name","status"})
    private GetOrganizationNonMasterAccount(
        String arn,
        String email,
        String id,
        String name,
        String status) {
        this.arn = arn;
        this.email = email;
        this.id = id;
        this.name = name;
        this.status = status;
    }

    /**
     * ARN of the root
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Email of the account
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * Identifier of the root
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the policy type
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The status of the policy type as it relates to the associated root
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationNonMasterAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String email;
        private String id;
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationNonMasterAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetOrganizationNonMasterAccount build() {
            return new GetOrganizationNonMasterAccount(arn, email, id, name, status);
        }
    }
}
